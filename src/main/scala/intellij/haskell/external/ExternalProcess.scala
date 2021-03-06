/*
 * Copyright 2016 Rik van der Kleij

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

package intellij.haskell.external

import java.io.File

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.configurations.GeneralCommandLine.ParentEnvironmentType
import com.intellij.execution.process.{CapturingProcessHandler, ProcessOutput}

import scala.collection.JavaConversions._

object ExternalProcess {
  val StandardTimeout = 3000

  def getProcessOutput(workDir: String, commandPath: String, arguments: Seq[String], timeout: Int = StandardTimeout): ProcessOutput = {
    if (!new File(workDir).isDirectory || !new File(commandPath).canExecute) {
      new ProcessOutput
    }
    val cmd: GeneralCommandLine = new GeneralCommandLine
    cmd.withWorkDirectory(workDir)
    cmd.setExePath(commandPath)
    cmd.addParameters(arguments)
    cmd.withParentEnvironmentType(ParentEnvironmentType.CONSOLE)
    execute(cmd, timeout)
  }

  def execute(cmd: GeneralCommandLine): ProcessOutput = {
    execute(cmd, StandardTimeout)
  }

  def execute(cmd: GeneralCommandLine, timeout: Int): ProcessOutput = {
    val processHandler: CapturingProcessHandler = new CapturingProcessHandler(cmd)
    if (timeout < 0) processHandler.runProcess else processHandler.runProcess(timeout, false)
  }
}