// This is a generated file. Not intended for manual editing.
package intellij.haskell.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static intellij.haskell.psi.HaskellTypes.*;
import intellij.haskell.psi.*;

public class HaskellFielddeclImpl extends HaskellCompositeElementImpl implements HaskellFielddecl {

  public HaskellFielddeclImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HaskellVisitor visitor) {
    visitor.visitFielddecl(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HaskellVisitor) accept((HaskellVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HaskellCname getCname() {
    return findChildByClass(HaskellCname.class);
  }

  @Override
  @Nullable
  public HaskellGtycon getGtycon() {
    return findChildByClass(HaskellGtycon.class);
  }

  @Override
  @NotNull
  public List<HaskellQvar> getQvarList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellQvar.class);
  }

  @Override
  @Nullable
  public HaskellQvarOp getQvarOp() {
    return findChildByClass(HaskellQvarOp.class);
  }

  @Override
  @NotNull
  public List<HaskellTtype> getTtypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellTtype.class);
  }

  @Override
  @NotNull
  public List<HaskellTypeSignature> getTypeSignatureList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellTypeSignature.class);
  }

  @Override
  @Nullable
  public HaskellUnpackNounpackPragma getUnpackNounpackPragma() {
    return findChildByClass(HaskellUnpackNounpackPragma.class);
  }

  @Override
  @NotNull
  public HaskellVars getVars() {
    return findNotNullChildByClass(HaskellVars.class);
  }

}
