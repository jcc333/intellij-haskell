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

public class HaskellQqExpressionImpl extends HaskellCompositeElementImpl implements HaskellQqExpression {

  public HaskellQqExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HaskellVisitor visitor) {
    visitor.visitQqExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HaskellVisitor) accept((HaskellVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<HaskellFixity> getFixityList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellFixity.class);
  }

  @Override
  @NotNull
  public List<HaskellLiteral> getLiteralList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellLiteral.class);
  }

  @Override
  @NotNull
  public List<HaskellQcon> getQconList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellQcon.class);
  }

  @Override
  @NotNull
  public List<HaskellQconOp> getQconOpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellQconOp.class);
  }

  @Override
  @NotNull
  public HaskellQuasiQuote getQuasiQuote() {
    return findNotNullChildByClass(HaskellQuasiQuote.class);
  }

  @Override
  @NotNull
  public List<HaskellQvar> getQvarList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellQvar.class);
  }

  @Override
  @NotNull
  public List<HaskellQvarOp> getQvarOpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellQvarOp.class);
  }

}
