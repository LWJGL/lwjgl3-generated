/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/primitive_restart.txt">NV_primitive_restart</a> extension.
 * 
 * <p>This extension allows applications to easily and inexpensively restart a primitive in its middle. A "primitive restart" is simply the same as an End
 * command, followed by another Begin command with the same mode as the original. The typical expected use of this feature is to draw a mesh with many
 * triangle strips, though primitive restarts are legal for all primitive types, even for points (where they are not useful).</p>
 * 
 * <p>Although the EXT_multi_draw_arrays extension did reduce the overhead of such drawing techniques, they still remain more expensive than one would like.</p>
 * 
 * <p>This extension provides an extremely lightweight primitive restart, which is accomplished by allowing the application to choose a special index number
 * that signals that a primitive restart should occur, rather than a vertex being provoked. This index can be an arbitrary 32-bit integer for maximum
 * application convenience.</p>
 * 
 * <p>In addition, for full orthogonality, a special OpenGL command is provided to restart primitives when in immediate mode. This command is not likely to
 * increase performance in any significant fashion, but providing it greatly simplifies the specification and implementation of display list compilation
 * and indirect rendering.</p>
 */
public final class NVPrimitiveRestart {

	/**
	 * Accepted by the {@code array} parameter of EnableClientState and DisableClientState, by the {@code cap} parameter of IsEnabled, and by the {@code pname}
	 * parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.
	 */
	public static final int GL_PRIMITIVE_RESTART_NV = 0x8558;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int GL_PRIMITIVE_RESTART_INDEX_NV = 0x8559;

	/** Function address. */
	@JavadocExclude
	public final long
		PrimitiveRestartNV,
		PrimitiveRestartIndexNV;

	@JavadocExclude
	public NVPrimitiveRestart(FunctionProvider provider) {
		PrimitiveRestartNV = provider.getFunctionAddress("glPrimitiveRestartNV");
		PrimitiveRestartIndexNV = provider.getFunctionAddress("glPrimitiveRestartIndexNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVPrimitiveRestart} instance for the current context. */
	public static NVPrimitiveRestart getInstance() {
		return checkFunctionality(GL.getCapabilities().__NVPrimitiveRestart);
	}

	static NVPrimitiveRestart create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_primitive_restart") ) return null;

		NVPrimitiveRestart funcs = new NVPrimitiveRestart(provider);

		boolean supported = checkFunctions(
			funcs.PrimitiveRestartNV, funcs.PrimitiveRestartIndexNV
		);

		return GL.checkExtension("GL_NV_primitive_restart", funcs, supported);
	}

	// --- [ glPrimitiveRestartNV ] ---

	public static void glPrimitiveRestartNV() {
		long __functionAddress = getInstance().PrimitiveRestartNV;
		callV(__functionAddress);
	}

	// --- [ glPrimitiveRestartIndexNV ] ---

	public static void glPrimitiveRestartIndexNV(int index) {
		long __functionAddress = getInstance().PrimitiveRestartIndexNV;
		callIV(__functionAddress, index);
	}

}