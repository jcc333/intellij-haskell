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

public class HaskellIdeclImpl extends HaskellCompositeElementImpl implements HaskellIdecl {

  public HaskellIdeclImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HaskellVisitor visitor) {
    visitor.visitIdecl(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HaskellVisitor) accept((HaskellVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public HaskellDataDeclaration getDataDeclaration() {
    return findChildByClass(HaskellDataDeclaration.class);
  }

  @Override
  @Nullable
  public HaskellDefaultDeclaration getDefaultDeclaration() {
    return findChildByClass(HaskellDefaultDeclaration.class);
  }

  @Override
  @Nullable
  public HaskellInlinePragma getInlinePragma() {
    return findChildByClass(HaskellInlinePragma.class);
  }

  @Override
  @Nullable
  public HaskellInstanceDeclaration getInstanceDeclaration() {
    return findChildByClass(HaskellInstanceDeclaration.class);
  }

  @Override
  @Nullable
  public HaskellNewtypeDeclaration getNewtypeDeclaration() {
    return findChildByClass(HaskellNewtypeDeclaration.class);
  }

  @Override
  @Nullable
  public HaskellNoinlinePragma getNoinlinePragma() {
    return findChildByClass(HaskellNoinlinePragma.class);
  }

  @Override
  @Nullable
  public HaskellSpecializePragma getSpecializePragma() {
    return findChildByClass(HaskellSpecializePragma.class);
  }

  @Override
  @Nullable
  public HaskellTypeDeclaration getTypeDeclaration() {
    return findChildByClass(HaskellTypeDeclaration.class);
  }

}
