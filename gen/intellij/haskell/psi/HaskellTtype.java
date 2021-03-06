// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HaskellTtype extends HaskellCompositeElement {

  @NotNull
  List<HaskellGtycon> getGtyconList();

  @Nullable
  HaskellListType getListType();

  @NotNull
  List<HaskellQvar> getQvarList();

  @NotNull
  List<HaskellTtype> getTtypeList();

  @NotNull
  List<HaskellTypeSignature> getTypeSignatureList();

  @NotNull
  List<HaskellVarId> getVarIdList();

  @NotNull
  List<HaskellVarSym> getVarSymList();

}
