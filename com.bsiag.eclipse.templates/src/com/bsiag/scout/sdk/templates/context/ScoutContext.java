package com.bsiag.scout.sdk.templates.context;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateBuffer;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateContextType;
import org.eclipse.jface.text.templates.TemplateException;

public class ScoutContext extends TemplateContext {

	protected ScoutContext(TemplateContextType contextType) {
		super(contextType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public TemplateBuffer evaluate(Template template)
			throws BadLocationException, TemplateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean canEvaluate(Template template) {
		// TODO Auto-generated method stub
		return false;
	}

}
