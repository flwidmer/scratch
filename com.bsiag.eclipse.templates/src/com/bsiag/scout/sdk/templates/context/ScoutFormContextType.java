package com.bsiag.scout.sdk.templates.context;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.internal.corext.template.java.JavaContext;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateContextType;
import org.eclipse.jface.text.templates.TemplateVariable;
import org.eclipse.jface.text.templates.TemplateVariableResolver;

public class ScoutFormContextType extends JavaContext {

	public ScoutFormContextType(TemplateContextType type, IDocument document,
			int completionOffset, int completionLength,
			ICompilationUnit compilationUnit) {
		super(type, document, completionOffset, completionLength, compilationUnit);
		// TODO Auto-generated constructor stub
	}
}
