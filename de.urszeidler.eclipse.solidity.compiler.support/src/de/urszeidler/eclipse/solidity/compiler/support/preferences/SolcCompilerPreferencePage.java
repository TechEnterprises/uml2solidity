package de.urszeidler.eclipse.solidity.compiler.support.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.urszeidler.eclipse.solidity.compiler.support.Activator;

public class SolcCompilerPreferencePage extends AbstractProjectPreferencesPage implements IWorkbenchPreferencePage {

	/**
	 * Create the preference page.
	 */
	public SolcCompilerPreferencePage() {
		super(GRID);
		setDescription("The solidity compiler preferences.");
	}

	/**
	 * Create contents of the preference page.
	 */
	@Override
	protected void createFieldEditors() {
		// Create the field editors
		addField(new BooleanFieldEditor(PreferenceConstants.COMPILE_CONTRACTS, "Compile generated solidity code.",
				BooleanFieldEditor.DEFAULT, getFieldEditorParent()));
		addField(new StringFieldEditor(PreferenceConstants.COMPILER_PROGRAMM, "Compiler path", -1,
				StringFieldEditor.VALIDATE_ON_KEY_STROKE, getFieldEditorParent()));
		addField(new StringFieldEditor(PreferenceConstants.COMPILER_TARGET, "target directory", -1,
				StringFieldEditor.VALIDATE_ON_KEY_STROKE, getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.COMPILER_OPTIMIZE, "optimize", BooleanFieldEditor.DEFAULT,
				getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.COMPILER_BIN, "generate bin", BooleanFieldEditor.DEFAULT,
				getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.COMPILER_BIN_RUNTIME, "generate bin runtime", BooleanFieldEditor.DEFAULT,
				getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.COMPILER_ABI, "generate abi", BooleanFieldEditor.DEFAULT,
				getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.COMPILER_INTERFACT, "generate interface", BooleanFieldEditor.DEFAULT,
				getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.COMPILER_ASM, "generate asm", BooleanFieldEditor.DEFAULT,
				getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.COMPILER_ASM_JSON, "generate asm json", BooleanFieldEditor.DEFAULT,
				getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.COMPILER_AST, "generate ast", BooleanFieldEditor.DEFAULT,
				getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.COMPILER_AST_JSON, "generate ast json", BooleanFieldEditor.DEFAULT,
				getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.COMPILER_USERDOC, "generate user doc", BooleanFieldEditor.DEFAULT,
				getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.COMPILER_DEVDOC, "generate dev doc", BooleanFieldEditor.DEFAULT,
				getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.COMPILER_OPCODE, "generate optcode", BooleanFieldEditor.DEFAULT,
				getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.COMPILER_FORMAL, "generate formal", BooleanFieldEditor.DEFAULT,
				getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.COMPILER_HASHES, "generate hashes", BooleanFieldEditor.DEFAULT,
				getFieldEditorParent()));
	}

	/**
	 * Initialize the preference page.
	 */
	public void init(IWorkbench workbench) {
		// Initialize the preference page
	}


	@Override
	protected String preferencesId() {
		return Activator.PLUGIN_ID;
	}

	@Override
	protected String useProjectSettingsPreferenceName() {
		return PreferenceConstants.COMPILER_PROJECT_SETTINGS;
	}

	@Override
	protected String preferencesPageId() {
		return "de.urszeidler.eclipse.solidity.ui.preferences.SolcCompilerPreferencePage";
	}

}
