// This is a generated file. Not intended for manual editing.
package org.mule.tooling.lang.dw.parser.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;
import com.intellij.psi.NavigatablePsiElement;

public class WeaveVisitor extends PsiElementVisitor {

  public void visitAdditionSubtractionExpression(@NotNull WeaveAdditionSubtractionExpression o) {
    visitExpression(o);
  }

  public void visitAndExpression(@NotNull WeaveAndExpression o) {
    visitExpression(o);
  }

  public void visitAnyDateLiteral(@NotNull WeaveAnyDateLiteral o) {
    visitExpression(o);
  }

  public void visitAnyRegexLiteral(@NotNull WeaveAnyRegexLiteral o) {
    visitExpression(o);
  }

  public void visitArrayDeconstructPattern(@NotNull WeaveArrayDeconstructPattern o) {
    visitPattern(o);
  }

  public void visitArrayExpression(@NotNull WeaveArrayExpression o) {
    visitExpression(o);
    // visitNavigatablePsiElement(o);
  }

  public void visitAsExpression(@NotNull WeaveAsExpression o) {
    visitExpression(o);
  }

  public void visitAttribute(@NotNull WeaveAttribute o) {
    visitPsiElement(o);
  }

  public void visitAttributeElement(@NotNull WeaveAttributeElement o) {
    visitPsiElement(o);
  }

  public void visitAttributeSelector(@NotNull WeaveAttributeSelector o) {
    visitPsiElement(o);
  }

  public void visitAttributes(@NotNull WeaveAttributes o) {
    visitPsiElement(o);
  }

  public void visitAttributesType(@NotNull WeaveAttributesType o) {
    visitType(o);
  }

  public void visitBinaryExpression(@NotNull WeaveBinaryExpression o) {
    visitExpression(o);
    // visitNamedElement(o);
  }

  public void visitBody(@NotNull WeaveBody o) {
    visitPsiElement(o);
  }

  public void visitBooleanLiteral(@NotNull WeaveBooleanLiteral o) {
    visitExpression(o);
  }

  public void visitBracketSelectorExpression(@NotNull WeaveBracketSelectorExpression o) {
    visitExpression(o);
  }

  public void visitCloseObjectType(@NotNull WeaveCloseObjectType o) {
    visitType(o);
  }

  public void visitCloseOrderedObjectType(@NotNull WeaveCloseOrderedObjectType o) {
    visitType(o);
  }

  public void visitConditionalAttribute(@NotNull WeaveConditionalAttribute o) {
    visitPsiElement(o);
  }

  public void visitConditionalExpression(@NotNull WeaveConditionalExpression o) {
    visitExpression(o);
  }

  public void visitConditionalKeyValuePair(@NotNull WeaveConditionalKeyValuePair o) {
    visitPsiElement(o);
  }

  public void visitCustomInterpolatorExpression(@NotNull WeaveCustomInterpolatorExpression o) {
    visitExpression(o);
    // visitNamedElement(o);
  }

  public void visitCustomLoader(@NotNull WeaveCustomLoader o) {
    visitPsiElement(o);
  }

  public void visitDataFormat(@NotNull WeaveDataFormat o) {
    visitPsiElement(o);
  }

  public void visitDeclaredNamespace(@NotNull WeaveDeclaredNamespace o) {
    visitPsiElement(o);
  }

  public void visitDefaultPattern(@NotNull WeaveDefaultPattern o) {
    visitPattern(o);
  }

  public void visitDefaultValueExpression(@NotNull WeaveDefaultValueExpression o) {
    visitExpression(o);
  }

  public void visitDirective(@NotNull WeaveDirective o) {
    visitPsiElement(o);
  }

  public void visitDoExpression(@NotNull WeaveDoExpression o) {
    visitExpression(o);
  }

  public void visitDocument(@NotNull WeaveDocument o) {
    visitNavigatablePsiElement(o);
  }

  public void visitDotSelectorExpression(@NotNull WeaveDotSelectorExpression o) {
    visitExpression(o);
  }

  public void visitDynamicKeyValuePair(@NotNull WeaveDynamicKeyValuePair o) {
    visitPsiElement(o);
  }

  public void visitDynamicReturn(@NotNull WeaveDynamicReturn o) {
    visitPsiElement(o);
  }

  public void visitEmptyArrayPattern(@NotNull WeaveEmptyArrayPattern o) {
    visitPattern(o);
  }

  public void visitEmptyObjectPattern(@NotNull WeaveEmptyObjectPattern o) {
    visitPattern(o);
  }

  public void visitEnclosedExpression(@NotNull WeaveEnclosedExpression o) {
    visitExpression(o);
  }

  public void visitEqualityExpression(@NotNull WeaveEqualityExpression o) {
    visitExpression(o);
  }

  public void visitExpression(@NotNull WeaveExpression o) {
    visitPsiElement(o);
  }

  public void visitExpressionPattern(@NotNull WeaveExpressionPattern o) {
    visitPattern(o);
    // visitNamedElement(o);
  }

  public void visitFqnIdentifier(@NotNull WeaveFqnIdentifier o) {
    visitNamedElement(o);
  }

  public void visitFunctionCallExpression(@NotNull WeaveFunctionCallExpression o) {
    visitExpression(o);
  }

  public void visitFunctionDefinition(@NotNull WeaveFunctionDefinition o) {
    visitNamedElement(o);
  }

  public void visitFunctionDirective(@NotNull WeaveFunctionDirective o) {
    visitDirective(o);
  }

  public void visitFunctionParameter(@NotNull WeaveFunctionParameter o) {
    visitVariable(o);
  }

  public void visitGreaterThanExpression(@NotNull WeaveGreaterThanExpression o) {
    visitExpression(o);
  }

  public void visitHeader(@NotNull WeaveHeader o) {
    visitPsiElement(o);
  }

  public void visitIdentifier(@NotNull WeaveIdentifier o) {
    visitPsiElement(o);
  }

  public void visitIdentifierPackage(@NotNull WeaveIdentifierPackage o) {
    visitPsiElement(o);
  }

  public void visitImportDirective(@NotNull WeaveImportDirective o) {
    visitDirective(o);
  }

  public void visitImportedElement(@NotNull WeaveImportedElement o) {
    visitPsiElement(o);
  }

  public void visitInputDirective(@NotNull WeaveInputDirective o) {
    visitDirective(o);
  }

  public void visitIntersectionType(@NotNull WeaveIntersectionType o) {
    visitType(o);
  }

  public void visitIsExpression(@NotNull WeaveIsExpression o) {
    visitExpression(o);
  }

  public void visitKey(@NotNull WeaveKey o) {
    visitPsiElement(o);
  }

  public void visitKeyExpression(@NotNull WeaveKeyExpression o) {
    visitExpression(o);
  }

  public void visitKeyType(@NotNull WeaveKeyType o) {
    visitType(o);
  }

  public void visitKeyValuePair(@NotNull WeaveKeyValuePair o) {
    visitPsiElement(o);
  }

  public void visitKeyValuePairType(@NotNull WeaveKeyValuePairType o) {
    visitType(o);
  }

  public void visitLambdaLiteral(@NotNull WeaveLambdaLiteral o) {
    visitExpression(o);
  }

  public void visitLambdaType(@NotNull WeaveLambdaType o) {
    visitType(o);
  }

  public void visitLambdaTypeParameter(@NotNull WeaveLambdaTypeParameter o) {
    visitPsiElement(o);
  }

  public void visitLeftShiftExpression(@NotNull WeaveLeftShiftExpression o) {
    visitExpression(o);
  }

  public void visitLiteralExpression(@NotNull WeaveLiteralExpression o) {
    visitExpression(o);
  }

  public void visitLiteralPattern(@NotNull WeaveLiteralPattern o) {
    visitPattern(o);
  }

  public void visitMatchExpression(@NotNull WeaveMatchExpression o) {
    visitExpression(o);
  }

  public void visitModuleReference(@NotNull WeaveModuleReference o) {
    visitPsiElement(o);
  }

  public void visitMultiValueSelector(@NotNull WeaveMultiValueSelector o) {
    visitPsiElement(o);
  }

  public void visitMultipleKeyValuePairObj(@NotNull WeaveMultipleKeyValuePairObj o) {
    visitPsiElement(o);
  }

  public void visitMultiplicationDivisionExpression(@NotNull WeaveMultiplicationDivisionExpression o) {
    visitExpression(o);
  }

  public void visitNameType(@NotNull WeaveNameType o) {
    visitType(o);
  }

  public void visitNamedLiteralPattern(@NotNull WeaveNamedLiteralPattern o) {
    visitPattern(o);
    // visitNamedElement(o);
  }

  public void visitNamedRegexPattern(@NotNull WeaveNamedRegexPattern o) {
    visitPattern(o);
    // visitNamedElement(o);
  }

  public void visitNamedTypePattern(@NotNull WeaveNamedTypePattern o) {
    visitPattern(o);
    // visitNamedElement(o);
  }

  public void visitNamespaceDirective(@NotNull WeaveNamespaceDirective o) {
    visitDirective(o);
  }

  public void visitNamespaceSelector(@NotNull WeaveNamespaceSelector o) {
    visitPsiElement(o);
  }

  public void visitNotExpression(@NotNull WeaveNotExpression o) {
    visitExpression(o);
  }

  public void visitNullLiteral(@NotNull WeaveNullLiteral o) {
    visitExpression(o);
  }

  public void visitNumberLiteral(@NotNull WeaveNumberLiteral o) {
    visitExpression(o);
  }

  public void visitObjectDeconstructExpression(@NotNull WeaveObjectDeconstructExpression o) {
    visitExpression(o);
  }

  public void visitObjectDeconstructPattern(@NotNull WeaveObjectDeconstructPattern o) {
    visitPattern(o);
  }

  public void visitObjectExpression(@NotNull WeaveObjectExpression o) {
    visitExpression(o);
    // visitNavigatablePsiElement(o);
  }

  public void visitObjectSelector(@NotNull WeaveObjectSelector o) {
    visitPsiElement(o);
  }

  public void visitObjectType(@NotNull WeaveObjectType o) {
    visitType(o);
  }

  public void visitOptionElement(@NotNull WeaveOptionElement o) {
    visitPsiElement(o);
  }

  public void visitOptions(@NotNull WeaveOptions o) {
    visitPsiElement(o);
  }

  public void visitOrExpression(@NotNull WeaveOrExpression o) {
    visitExpression(o);
  }

  public void visitOrderedObjectType(@NotNull WeaveOrderedObjectType o) {
    visitType(o);
  }

  public void visitOutputDirective(@NotNull WeaveOutputDirective o) {
    visitDirective(o);
  }

  public void visitPattern(@NotNull WeavePattern o) {
    visitPsiElement(o);
  }

  public void visitPatternMatcherExpression(@NotNull WeavePatternMatcherExpression o) {
    visitExpression(o);
  }

  public void visitReferenceType(@NotNull WeaveReferenceType o) {
    visitType(o);
  }

  public void visitRegexPattern(@NotNull WeaveRegexPattern o) {
    visitPattern(o);
  }

  public void visitRightShiftExpression(@NotNull WeaveRightShiftExpression o) {
    visitExpression(o);
  }

  public void visitSchema(@NotNull WeaveSchema o) {
    visitPsiElement(o);
  }

  public void visitSchemaElement(@NotNull WeaveSchemaElement o) {
    visitPsiElement(o);
  }

  public void visitSchemaSelector(@NotNull WeaveSchemaSelector o) {
    visitPsiElement(o);
  }

  public void visitSelector(@NotNull WeaveSelector o) {
    visitPsiElement(o);
  }

  public void visitSimpleKeyValuePair(@NotNull WeaveSimpleKeyValuePair o) {
    visitNavigatablePsiElement(o);
  }

  public void visitSingleKeyValuePairObj(@NotNull WeaveSingleKeyValuePairObj o) {
    visitPsiElement(o);
  }

  public void visitStringLiteral(@NotNull WeaveStringLiteral o) {
    visitExpression(o);
  }

  public void visitType(@NotNull WeaveType o) {
    visitPsiElement(o);
  }

  public void visitTypeDirective(@NotNull WeaveTypeDirective o) {
    visitDirective(o);
    // visitNamedElement(o);
  }

  public void visitTypeParameter(@NotNull WeaveTypeParameter o) {
    visitPsiElement(o);
  }

  public void visitTypePattern(@NotNull WeaveTypePattern o) {
    visitPattern(o);
  }

  public void visitUnaryMinusExpression(@NotNull WeaveUnaryMinusExpression o) {
    visitExpression(o);
  }

  public void visitUndefinedLiteral(@NotNull WeaveUndefinedLiteral o) {
    visitExpression(o);
  }

  public void visitUnionType(@NotNull WeaveUnionType o) {
    visitType(o);
  }

  public void visitUsingExpression(@NotNull WeaveUsingExpression o) {
    visitExpression(o);
  }

  public void visitValueSelector(@NotNull WeaveValueSelector o) {
    visitPsiElement(o);
  }

  public void visitVariableDefinition(@NotNull WeaveVariableDefinition o) {
    visitVariable(o);
  }

  public void visitVariableDirective(@NotNull WeaveVariableDirective o) {
    visitDirective(o);
  }

  public void visitVariableReferenceExpression(@NotNull WeaveVariableReferenceExpression o) {
    visitExpression(o);
  }

  public void visitVersionDirective(@NotNull WeaveVersionDirective o) {
    visitDirective(o);
  }

  public void visitNavigatablePsiElement(@NotNull NavigatablePsiElement o) {
    visitElement(o);
  }

  public void visitNamedElement(@NotNull WeaveNamedElement o) {
    visitPsiElement(o);
  }

  public void visitVariable(@NotNull WeaveVariable o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
