// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HaskellSubConstr2 extends HaskellCompositeElement {

  @NotNull
  List<HaskellCname> getCnameList();

  @NotNull
  List<HaskellGtycon> getGtyconList();

  @NotNull
  List<HaskellQvar> getQvarList();

  @Nullable
  HaskellQvarOp getQvarOp();

  @NotNull
  List<HaskellTtype> getTtypeList();

  @NotNull
  List<HaskellTypeSignature> getTypeSignatureList();

}
