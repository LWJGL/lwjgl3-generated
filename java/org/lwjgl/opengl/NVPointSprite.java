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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/point_sprite.txt">NV_point_sprite</a> extension.
 * 
 * <p>Applications such as particle systems usually must use OpenGL quads rather than points to render their geometry, since they would like to use a
 * custom-drawn texture for each particle, rather than the traditional OpenGL round antialiased points, and each fragment in a point has the same texture
 * coordinates as every other fragment.</p>
 * 
 * <p>Unfortunately, specifying the geometry for these quads can be quite expensive, since it quadruples the amount of geometry required, and it may also
 * require the application to do extra processing to compute the location of each vertex.</p>
 * 
 * <p>The goal of this extension is to allow such apps to use points rather than quads. When {@link #GL_POINT_SPRITE_NV POINT_SPRITE_NV} is enabled, the state of point antialiasing
 * is ignored. For each texture unit, the app can then specify whether to replace the existing texture coordinates with point sprite texture coordinates,
 * which are interpolated across the point. Finally, the app can set a global parameter for the way to generate the R coordinate for point sprites; the R
 * coordinate can either be zero, the input S coordinate, or the input R coordinate. This allows applications to use a 3D texture to represent a point
 * sprite that goes through an animation, with filtering between frames, for example.</p>
 * 
 * <p>Requires <a href="http://www.opengl.org/registry/specs/EXT/point_parameters.txt">EXT_point_parameters</a></p>
 */
public final class NVPointSprite {

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
	public NVPointSprite(FunctionProvider provider) {
		PointParameteriNV = provider.getFunctionAddress("glPointParameteriNV");
		PointParameterivNV = provider.getFunctionAddress("glPointParameterivNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVPointSprite} instance for the current context. */
	public static NVPointSprite getInstance() {
		return checkFunctionality(GL.getCapabilities().__NVPointSprite);
	}

	static NVPointSprite create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_point_sprite") ) return null;

		NVPointSprite funcs = new NVPointSprite(provider);

		boolean supported = checkFunctions(
			funcs.PointParameteriNV, funcs.PointParameterivNV
		);

		return GL.checkExtension("GL_NV_point_sprite", funcs, supported);
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