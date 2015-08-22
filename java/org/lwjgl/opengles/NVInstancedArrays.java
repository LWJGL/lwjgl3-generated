/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/NV/NV_instanced_arrays.txt">NV_instanced_arrays</a> extension.
 * 
 * <p>A common use case in GL for some applications is to be able to draw the same object, or groups of similar objects that share vertex data, primitive
 * count and type, multiple times. This extension provides a means of accelerating such use cases while limiting the number of required API calls, and
 * keeping the amount of duplicate data to a minimum.</p>
 * 
 * <p>In particular, this extension specifies an alternative to the read-only shader variable introduced by NV_draw_instanced. It uses the same draw calls
 * introduced by that extension, but redefines them so that a vertex shader can instead use vertex array attributes as a source of instance data.</p>
 * 
 * <p>This extension introduces an array "divisor" for generic vertex array attributes, which when non-zero specifies that the attribute is "instanced." An
 * instanced attribute does not advance per-vertex as usual, but rather after every <divisor> conceptual draw calls.</p>
 * 
 * <p>(Attributes which aren't instanced are repeated in their entirety for every conceptual draw call.)</p>
 * 
 * <p>By specifying transform data in an instanced attribute or series of instanced attributes, vertex shaders can, in concert with the instancing draw
 * calls, draw multiple instances of an object with one draw call.</p>
 * 
 * <p>Requires {@link GLES20 GLES E.S}.</p>
 */
public final class NVInstancedArrays {

	/** Accepted by the {@code pname} parameters of GetVertexAttribfv, and GetVertexAttribiv. */
	public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR_NV = 0x88FE;

	/** Function address. */
	@JavadocExclude
	public final long VertexAttribDivisorNV;

	@JavadocExclude
	public NVInstancedArrays(FunctionProvider provider) {
		VertexAttribDivisorNV = provider.getFunctionAddress("glVertexAttribDivisorNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVInstancedArrays} instance for the current context. */
	public static NVInstancedArrays getInstance() {
		return checkFunctionality(GLES.getCapabilities().__NVInstancedArrays);
	}

	static NVInstancedArrays create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_instanced_arrays") ) return null;

		NVInstancedArrays funcs = new NVInstancedArrays(provider);
		boolean supported = checkFunctions(
			funcs.VertexAttribDivisorNV
		);

		return GLES.checkExtension("GL_NV_instanced_arrays", funcs, supported);
	}

	// --- [ glVertexAttribDivisorNV ] ---

	public static void glVertexAttribDivisorNV(int index, int divisor) {
		long __functionAddress = getInstance().VertexAttribDivisorNV;
		callIIV(__functionAddress, index, divisor);
	}

}