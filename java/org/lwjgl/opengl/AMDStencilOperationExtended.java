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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/AMD/stencil_operation_extended.txt">AMD_stencil_operation_extended</a> extension.
 * 
 * <p>Stencil buffers are special buffers that allow tests to be made against an incoming value and action taken based on that value. The stencil buffer is
 * updated during rasterization, and the operation used to update the stencil buffer is chosen based on whether the fragment passes the stencil test, and
 * if it does, whether it passes the depth test. Traditional OpenGL includes support for several primitive operations, such as incrementing, or clearing
 * the content of the stencil buffer, or replacing it with a specified reference value.</p>
 * 
 * <p>This extension adds support for an additional set of operations that may be performed on the stencil buffer under each circumstance. Additionally, this
 * extension separates the value used as the source for stencil operations from the reference value, allowing different values to be used in the stencil
 * test, and in the update of the stencil buffer.</p>
 */
public final class AMDStencilOperationExtended {

	/** Accepted by the {@code sfail}, {@code dpfail} and {@code dppass} parameters of StencilOp and StencilOpSeparate. */
	public static final int
		GL_SET_AMD           = 0x874A,
		GL_REPLACE_VALUE_AMD = 0x874B;

	/** Accepted by the {@code param} parameter of GetIntegerv, GetFloatv, GetBooleanv GetDoublev and GetInteger64v. */
	public static final int
		GL_STENCIL_OP_VALUE_AMD      = 0x874C,
		GL_STENCIL_BACK_OP_VALUE_AMD = 0x874D;

	/** Function address. */
	@JavadocExclude
	public final long StencilOpValueAMD;

	@JavadocExclude
	public AMDStencilOperationExtended(FunctionProvider provider) {
		StencilOpValueAMD = provider.getFunctionAddress("glStencilOpValueAMD");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link AMDStencilOperationExtended} instance for the current context. */
	public static AMDStencilOperationExtended getInstance() {
		return checkFunctionality(GL.getCapabilities().__AMDStencilOperationExtended);
	}

	static AMDStencilOperationExtended create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_AMD_stencil_operation_extended") ) return null;

		AMDStencilOperationExtended funcs = new AMDStencilOperationExtended(provider);

		boolean supported = checkFunctions(
			funcs.StencilOpValueAMD
		);

		return GL.checkExtension("GL_AMD_stencil_operation_extended", funcs, supported);
	}

	// --- [ glStencilOpValueAMD ] ---

	public static void glStencilOpValueAMD(int face, int value) {
		long __functionAddress = getInstance().StencilOpValueAMD;
		callIIV(__functionAddress, face, value);
	}

}