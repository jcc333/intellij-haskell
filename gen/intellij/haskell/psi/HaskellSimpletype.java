// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import scala.collection.Seq;

public interface HaskellSimpletype extends HaskellCompositeElement {

  @Nullable
  HaskellGconSym getGconSym();

  @Nullable
  HaskellQcon getQcon();

  @Nullable
  HaskellQconOp getQconOp();

  @Nullable
  HaskellQvarOp getQvarOp();

  @Nullable
  HaskellTtype getTtype();

  @NotNull
  List<HaskellTypeSignature> getTypeSignatureList();

  @NotNull
  List<HaskellVarId> getVarIdList();

  Seq<HaskellNamedElement> getIdentifierElements();

}
