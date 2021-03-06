/*
 * Copyright 2016 Rik van der Kleij
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package intellij.haskell.sdk

import java.io.File
import javax.swing.Icon

import com.intellij.openapi.projectRoots._
import com.intellij.openapi.roots.OrderRootType
import com.intellij.openapi.util.io.FileUtil
import intellij.haskell.HaskellIcons
import intellij.haskell.external.ExternalProcess
import org.jdom.Element

/**
  * Created GHC SDK because inspection tool forces to use a SDK.
  */
class HaskellSdkType extends SdkType("GHC SDK") {

  override def suggestHomePath(): String = "/usr/local/bin"

  override def suggestSdkName(currentSdkName: String, sdkHome: String): String = "GHC"

  override def createAdditionalDataConfigurable(sdkModel: SdkModel, sdkModificator: SdkModificator): AdditionalDataConfigurable = null

  override def isValidSdkHome(path: String): Boolean = {
    val ghcPath = new File(path)
    ghcPath.isDirectory && ghcPath.listFiles.map(f => FileUtil.getNameWithoutExtension(f)).contains("ghc")
  }

  override def getPresentableName: String = "GHC binaries"

  override def saveAdditionalData(additionalData: SdkAdditionalData, additional: Element): Unit = {}

  override def getIcon: Icon = HaskellIcons.HaskellLogo

  override def getIconForAddAction: Icon = getIcon

  override def isRootTypeApplicable(`type`: OrderRootType): Boolean = false

  override def setupSdkPaths(sdk: Sdk): Unit = {}

  override def getVersionString(sdkHome: String): String = HaskellSdkType.getNumericVersion(sdkHome)
}

object HaskellSdkType {
  def getInstance: HaskellSdkType = SdkType.findInstance(classOf[HaskellSdkType])

  def getNumericVersion(sdkHome: String) = {
    val output = ExternalProcess.getProcessOutput(
      sdkHome,
      sdkHome + File.separator + "ghc",
      Seq("--numeric-version")
    )
    output.getStdout
  }
}