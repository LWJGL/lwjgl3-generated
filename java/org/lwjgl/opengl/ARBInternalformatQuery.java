/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/internalformat_query.txt">ARB_internalformat_query</a> extension.
 * 
 * <p>OpenGL 4.1 has a number of queries to indicate the maximum number of samples available for different formats. These give a coarse-grained query
 * mechanism e.g. an implementation can expose different sample counts for integer and floating-point formats, but not for different floating-point
 * formats. There is also no convenient way for the user to determine the granularity of sample counts available, only the maximum.</p>
 * 
 * <p>This extension adds a query mechanism that allows the user to determine which sample counts are available for a specific internal format.</p>
 * 
 * <p>Requires {@link GL30 OpenGL 3.0} or {@link ARBFramebufferObject ARB_framebuffer_object}. Promoted to core in {@link GL42 OpenGL 4.2}.</p>
 */
public final class ARBInternalformatQuery {

	/** Accepted by the {@code pname} parameter of GetInternalformativ. */
	public static final int GL_NUM_SAMPLE_COUNTS = 0x9380;

	/** Function address. */
	@JavadocExclude
	public final long GetInternalformativ;

	@JavadocExclude
	public ARBInternalformatQuery(FunctionProvider provider) {
		GetInternalformativ = provider.getFunctionAddress("glGetInternalformativ");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBInternalformatQuery} instance for the current context. */
	public static ARBInternalformatQuery getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBInternalformatQuery);
	}

	static ARBInternalformatQuery create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_internalformat_query") ) return null;

		ARBInternalformatQuery funcs = new ARBInternalformatQuery(provider);

		boolean supported = checkFunctions(
			funcs.GetInternalformativ
		);

		return GL.checkExtension("GL_ARB_internalformat_query", funcs, supported);
	}

	// --- [ glGetInternalformativ ] ---

	/** Unsafe version of {@link #glGetInternalformativ GetInternalformativ} */
	@JavadocExclude
	public static void nglGetInternalformativ(int target, int internalformat, int pname, int bufSize, long params) {
		long __functionAddress = getInstance().GetInternalformativ;
		GL42.nglGetInternalformativ(target, internalformat, pname, bufSize, params, __functionAddress);
	}

	/**
	 * Retrieves information about implementation-dependent support for internal formats.
	 *
	 * @param target         the usage of the internal format. One of:<br>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}, {@link GL11#GL_TEXTURE_2D TEXTURE_2D}, {@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}, {@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}, {@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}, {@link GL12#GL_TEXTURE_3D TEXTURE_3D}, {@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}, {@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}, {@link GL30#GL_RENDERBUFFER RENDERBUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL32#GL_TEXTURE_2D_MULTISAMPLE TEXTURE_2D_MULTISAMPLE}, {@link GL32#GL_TEXTURE_2D_MULTISAMPLE_ARRAY TEXTURE_2D_MULTISAMPLE_ARRAY}
	 * @param internalformat the internal format about which to retrieve information
	 * @param pname          the type of information to query
	 * @param bufSize        the maximum number of values that may be written to params by the function
	 * @param params         a variable into which to write the retrieved information
	 */
	public static void glGetInternalformativ(int target, int internalformat, int pname, int bufSize, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, bufSize << 2);
		nglGetInternalformativ(target, internalformat, pname, bufSize, memAddress(params));
	}

	/** Alternative version of: {@link #glGetInternalformativ GetInternalformativ} */
	public static void glGetInternalformativ(int target, int internalformat, int pname, IntBuffer params) {
		nglGetInternalformativ(target, internalformat, pname, params.remaining(), memAddress(params));
	}

	/** Single return value version of: {@link #glGetInternalformativ GetInternalformativ} */
	public static int glGetInternalformati(int target, int internalformat, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetInternalformativ(target, internalformat, pname, 1, __buffer.address(params));
		return __buffer.intValue(params);
	}

}