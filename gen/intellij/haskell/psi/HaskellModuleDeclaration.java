// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;
import scala.collection.Seq;

public interface HaskellModuleDeclaration extends HaskellDeclarationElement {

  @Nullable
  HaskellDeprecatedWarnPragma getDeprecatedWarnPragma();

  @Nullable
  HaskellExports getExports();

  @Nullable
  HaskellExpression getExpression();

  @NotNull
  HaskellModId getModId();

  String getName();

  ItemPresentation getPresentation();

  Seq<HaskellNamedElement> getIdentifierElements();

  String getModuleName();

}
