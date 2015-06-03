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

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/path_rendering_shared_edge.txt">NV_path_rendering_shared_edge</a> extension.
 * 
 * <p>This extension introduces a new path command modifier to the
 * NV_path_rendering extension to indicate that a path command represents an
 * edge (either straight or curved) that is shared with another path.</p>
 * 
 * <p>Requires <a href="http://www.opengl.org/registry/specs/NV/path_rendering.txt">NV_path_rendering</a></p>
 */
public final class NVPathRenderingSharedEdge {

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev, and by the {@code target} parameter of TexEnvi, TexEnviv, TexEnvf, TexEnvfv, GetTexEnviv, and GetTexEnvfv.
	 */
	public static final int GL_POINT_SPRITE_NV = 0x8861;

	/**
	 * When the {@code target} parameter of TexEnvf, TexEnvfv, TexEnvi, TexEnviv, GetTexEnvfv, or GetTexEnviv is POINT_SPRITE_NV, then the value of
	 * {@code pname} may be.
	 */
	public static final int GL_COORD_REPLACE_NV = 0x8862;

	/**
	 * Accepted by the {@code pname} parameter of PointParameteriNV, PointParameterfEXT, PointParameterivNV, PointParameterfvEXT, GetBooleanv, GetIntegerv,
	 * GetFloatv, and GetDoublev.
	 */
	public static final int GL_POINT_SPRITE_R_MODE_NV = 0x8863;

	/** Function address. */
	@JavadocExclude
	public final long
		PointParameteriNV,
		PointParameterivNV;

	@JavadocExclude
	public NVPathRenderingSharedEdge(FunctionProvider provider) {
		PointParameteriNV = provider.getFunctionAddress("glPointParameteriNV");
		PointParameterivNV = provider.getFunctionAddress("glPointParameterivNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVPathRenderingSharedEdge} instance for the current context. */
	public static NVPathRenderingSharedEdge getInstance() {
		return checkFunctionality(GL.getCapabilities().__NVPathRenderingSharedEdge);
	}

	static NVPathRenderingSharedEdge create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_path_rendering_shared_edge") ) return null;

		NVPathRenderingSharedEdge funcs = new NVPathRenderingSharedEdge(provider);

		boolean supported = checkFunctions(
			funcs.PointParameteriNV, funcs.PointParameterivNV
		);

		return GL.checkExtension("GL_NV_path_rendering_shared_edge", funcs, supported);
	}

	// --- [ glPointParameteriNV ] ---

	/** JNI method for {@link #glPointParameteriNV PointParameteriNV} */
	@JavadocExclude
	public static native void nglPointParameteriNV(int pname, int param, long __functionAddress);

	/**
	 * 
	 *
	 * @param pname 
	 * @param param 
	 */
	public static void glPointParameteriNV(int pname, int param) {
		long __functionAddress = getInstance().PointParameteriNV;
		nglPointParameteriNV(pname, param, __functionAddress);
	}

	// --- [ glPointParameterivNV ] ---

	/** JNI method for {@link #glPointParameterivNV PointParameterivNV} */
	@JavadocExclude
	public static native void nglPointParameterivNV(int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glPointParameterivNV PointParameterivNV} */
	@JavadocExclude
	public static void nglPointParameterivNV(int pname, long params) {
		long __functionAddress = getInstance().PointParameterivNV;
		nglPointParameterivNV(pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param pname  
	 * @param params 
	 */
	public static void glPointParameterivNV(int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglPointParameterivNV(pname, memAddress(params));
	}

	/** Alternative version of: {@link #glPointParameterivNV PointParameterivNV} */
	public static void glPointParameterivNV(int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglPointParameterivNV(pname, memAddress(params));
	}

}