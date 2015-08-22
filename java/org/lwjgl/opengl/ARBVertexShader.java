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
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/vertex_shader.txt">ARB_vertex_shader</a> extension.
 * 
 * <p>This extension adds programmable vertex level processing to OpenGL. The application can write vertex shaders in a high level language as defined in the
 * OpenGL Shading Language specification. A vertex shader replaces the transformation, texture coordinate generation and lighting parts of OpenGL, and it
 * also adds texture access at the vertex level. Furthermore, management of vertex shader objects and loading generic attributes are discussed. A vertex
 * shader object, attached to a program object, can be compiled and linked to produce an executable that runs on the vertex processor in OpenGL.
 * This extension also defines how such an executable interacts with the fixed functionality vertex processing of OpenGL 1.4.</p>
 * 
 * <p>Promoted to core in {@link GL20 OpenGL 2.0}.</p>
 */
public final class ARBVertexShader {

	/** Accepted by the {@code shaderType} argument of CreateShaderObjectARB and returned by the {@code params} parameter of GetObjectParameter{if}vARB. */
	public static final int GL_VERTEX_SHADER_ARB = 0x8B31;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_MAX_VERTEX_UNIFORM_COMPONENTS_ARB    = 0x8B4A,
		GL_MAX_VARYING_FLOATS_ARB               = 0x8B4B,
		GL_MAX_VERTEX_ATTRIBS_ARB               = 0x8869,
		GL_MAX_TEXTURE_IMAGE_UNITS_ARB          = 0x8872,
		GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS_ARB   = 0x8B4C,
		GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS_ARB = 0x8B4D,
		GL_MAX_TEXTURE_COORDS_ARB               = 0x8871;

	/**
	 * Accepted by the {@code cap} parameter of Disable, Enable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev.
	 */
	public static final int
		GL_VERTEX_PROGRAM_POINT_SIZE_ARB = 0x8642,
		GL_VERTEX_PROGRAM_TWO_SIDE_ARB   = 0x8643;

	/** Accepted by the {@code pname} parameter GetObjectParameter{if}vARB. */
	public static final int
		GL_OBJECT_ACTIVE_ATTRIBUTES_ARB           = 0x8B89,
		GL_OBJECT_ACTIVE_ATTRIBUTE_MAX_LENGTH_ARB = 0x8B8A;

	/** Accepted by the {@code pname} parameter of GetVertexAttrib{dfi}vARB. */
	public static final int
		GL_VERTEX_ATTRIB_ARRAY_ENABLED_ARB    = 0x8622,
		GL_VERTEX_ATTRIB_ARRAY_SIZE_ARB       = 0x8623,
		GL_VERTEX_ATTRIB_ARRAY_STRIDE_ARB     = 0x8624,
		GL_VERTEX_ATTRIB_ARRAY_TYPE_ARB       = 0x8625,
		GL_VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB = 0x886A,
		GL_CURRENT_VERTEX_ATTRIB_ARB          = 0x8626;

	/** Accepted by the {@code pname} parameter of GetVertexAttribPointervARB. */
	public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER_ARB = 0x8645;

	/** Returned by the {@code type} parameter of GetActiveAttribARB. */
	public static final int
		GL_FLOAT_VEC2_ARB = 0x8B50,
		GL_FLOAT_VEC3_ARB = 0x8B51,
		GL_FLOAT_VEC4_ARB = 0x8B52,
		GL_FLOAT_MAT2_ARB = 0x8B5A,
		GL_FLOAT_MAT3_ARB = 0x8B5B,
		GL_FLOAT_MAT4_ARB = 0x8B5C;

	/** Function address. */
	@JavadocExclude
	public final long
		VertexAttrib1fARB,
		VertexAttrib1sARB,
		VertexAttrib1dARB,
		VertexAttrib2fARB,
		VertexAttrib2sARB,
		VertexAttrib2dARB,
		VertexAttrib3fARB,
		VertexAttrib3sARB,
		VertexAttrib3dARB,
		VertexAttrib4fARB,
		VertexAttrib4sARB,
		VertexAttrib4dARB,
		VertexAttrib4NubARB,
		VertexAttrib1fvARB,
		VertexAttrib1svARB,
		VertexAttrib1dvARB,
		VertexAttrib2fvARB,
		VertexAttrib2svARB,
		VertexAttrib2dvARB,
		VertexAttrib3fvARB,
		VertexAttrib3svARB,
		VertexAttrib3dvARB,
		VertexAttrib4fvARB,
		VertexAttrib4svARB,
		VertexAttrib4dvARB,
		VertexAttrib4ivARB,
		VertexAttrib4bvARB,
		VertexAttrib4ubvARB,
		VertexAttrib4usvARB,
		VertexAttrib4uivARB,
		VertexAttrib4NbvARB,
		VertexAttrib4NsvARB,
		VertexAttrib4NivARB,
		VertexAttrib4NubvARB,
		VertexAttrib4NusvARB,
		VertexAttrib4NuivARB,
		VertexAttribPointerARB,
		EnableVertexAttribArrayARB,
		DisableVertexAttribArrayARB,
		BindAttribLocationARB,
		GetActiveAttribARB,
		GetAttribLocationARB,
		GetVertexAttribivARB,
		GetVertexAttribfvARB,
		GetVertexAttribdvARB,
		GetVertexAttribPointervARB;

	@JavadocExclude
	public ARBVertexShader(FunctionProvider provider) {
		VertexAttrib1fARB = provider.getFunctionAddress("glVertexAttrib1fARB");
		VertexAttrib1sARB = provider.getFunctionAddress("glVertexAttrib1sARB");
		VertexAttrib1dARB = provider.getFunctionAddress("glVertexAttrib1dARB");
		VertexAttrib2fARB = provider.getFunctionAddress("glVertexAttrib2fARB");
		VertexAttrib2sARB = provider.getFunctionAddress("glVertexAttrib2sARB");
		VertexAttrib2dARB = provider.getFunctionAddress("glVertexAttrib2dARB");
		VertexAttrib3fARB = provider.getFunctionAddress("glVertexAttrib3fARB");
		VertexAttrib3sARB = provider.getFunctionAddress("glVertexAttrib3sARB");
		VertexAttrib3dARB = provider.getFunctionAddress("glVertexAttrib3dARB");
		VertexAttrib4fARB = provider.getFunctionAddress("glVertexAttrib4fARB");
		VertexAttrib4sARB = provider.getFunctionAddress("glVertexAttrib4sARB");
		VertexAttrib4dARB = provider.getFunctionAddress("glVertexAttrib4dARB");
		VertexAttrib4NubARB = provider.getFunctionAddress("glVertexAttrib4NubARB");
		VertexAttrib1fvARB = provider.getFunctionAddress("glVertexAttrib1fvARB");
		VertexAttrib1svARB = provider.getFunctionAddress("glVertexAttrib1svARB");
		VertexAttrib1dvARB = provider.getFunctionAddress("glVertexAttrib1dvARB");
		VertexAttrib2fvARB = provider.getFunctionAddress("glVertexAttrib2fvARB");
		VertexAttrib2svARB = provider.getFunctionAddress("glVertexAttrib2svARB");
		VertexAttrib2dvARB = provider.getFunctionAddress("glVertexAttrib2dvARB");
		VertexAttrib3fvARB = provider.getFunctionAddress("glVertexAttrib3fvARB");
		VertexAttrib3svARB = provider.getFunctionAddress("glVertexAttrib3svARB");
		VertexAttrib3dvARB = provider.getFunctionAddress("glVertexAttrib3dvARB");
		VertexAttrib4fvARB = provider.getFunctionAddress("glVertexAttrib4fvARB");
		VertexAttrib4svARB = provider.getFunctionAddress("glVertexAttrib4svARB");
		VertexAttrib4dvARB = provider.getFunctionAddress("glVertexAttrib4dvARB");
		VertexAttrib4ivARB = provider.getFunctionAddress("glVertexAttrib4ivARB");
		VertexAttrib4bvARB = provider.getFunctionAddress("glVertexAttrib4bvARB");
		VertexAttrib4ubvARB = provider.getFunctionAddress("glVertexAttrib4ubvARB");
		VertexAttrib4usvARB = provider.getFunctionAddress("glVertexAttrib4usvARB");
		VertexAttrib4uivARB = provider.getFunctionAddress("glVertexAttrib4uivARB");
		VertexAttrib4NbvARB = provider.getFunctionAddress("glVertexAttrib4NbvARB");
		VertexAttrib4NsvARB = provider.getFunctionAddress("glVertexAttrib4NsvARB");
		VertexAttrib4NivARB = provider.getFunctionAddress("glVertexAttrib4NivARB");
		VertexAttrib4NubvARB = provider.getFunctionAddress("glVertexAttrib4NubvARB");
		VertexAttrib4NusvARB = provider.getFunctionAddress("glVertexAttrib4NusvARB");
		VertexAttrib4NuivARB = provider.getFunctionAddress("glVertexAttrib4NuivARB");
		VertexAttribPointerARB = provider.getFunctionAddress("glVertexAttribPointerARB");
		EnableVertexAttribArrayARB = provider.getFunctionAddress("glEnableVertexAttribArrayARB");
		DisableVertexAttribArrayARB = provider.getFunctionAddress("glDisableVertexAttribArrayARB");
		BindAttribLocationARB = provider.getFunctionAddress("glBindAttribLocationARB");
		GetActiveAttribARB = provider.getFunctionAddress("glGetActiveAttribARB");
		GetAttribLocationARB = provider.getFunctionAddress("glGetAttribLocationARB");
		GetVertexAttribivARB = provider.getFunctionAddress("glGetVertexAttribivARB");
		GetVertexAttribfvARB = provider.getFunctionAddress("glGetVertexAttribfvARB");
		GetVertexAttribdvARB = provider.getFunctionAddress("glGetVertexAttribdvARB");
		GetVertexAttribPointervARB = provider.getFunctionAddress("glGetVertexAttribPointervARB");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBVertexShader} instance for the current context. */
	public static ARBVertexShader getInstance() {
		return checkFunctionality(GL.getCapabilities().__ARBVertexShader);
	}

	static ARBVertexShader create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_vertex_shader") ) return null;

		ARBVertexShader funcs = new ARBVertexShader(provider);

		boolean supported = checkFunctions(
			funcs.VertexAttrib1fARB, funcs.VertexAttrib1sARB, funcs.VertexAttrib1dARB, funcs.VertexAttrib2fARB, funcs.VertexAttrib2sARB, 
			funcs.VertexAttrib2dARB, funcs.VertexAttrib3fARB, funcs.VertexAttrib3sARB, funcs.VertexAttrib3dARB, funcs.VertexAttrib4fARB, 
			funcs.VertexAttrib4sARB, funcs.VertexAttrib4dARB, funcs.VertexAttrib4NubARB, funcs.VertexAttrib1fvARB, funcs.VertexAttrib1svARB, 
			funcs.VertexAttrib1dvARB, funcs.VertexAttrib2fvARB, funcs.VertexAttrib2svARB, funcs.VertexAttrib2dvARB, funcs.VertexAttrib3fvARB, 
			funcs.VertexAttrib3svARB, funcs.VertexAttrib3dvARB, funcs.VertexAttrib4fvARB, funcs.VertexAttrib4svARB, funcs.VertexAttrib4dvARB, 
			funcs.VertexAttrib4ivARB, funcs.VertexAttrib4bvARB, funcs.VertexAttrib4ubvARB, funcs.VertexAttrib4usvARB, funcs.VertexAttrib4uivARB, 
			funcs.VertexAttrib4NbvARB, funcs.VertexAttrib4NsvARB, funcs.VertexAttrib4NivARB, funcs.VertexAttrib4NubvARB, funcs.VertexAttrib4NusvARB, 
			funcs.VertexAttrib4NuivARB, funcs.VertexAttribPointerARB, funcs.EnableVertexAttribArrayARB, funcs.DisableVertexAttribArrayARB, 
			funcs.BindAttribLocationARB, funcs.GetActiveAttribARB, funcs.GetAttribLocationARB, funcs.GetVertexAttribivARB, funcs.GetVertexAttribfvARB, 
			funcs.GetVertexAttribdvARB, funcs.GetVertexAttribPointervARB
		);

		return GL.checkExtension("GL_ARB_vertex_shader", funcs, supported);
	}

	// --- [ glVertexAttrib1fARB ] ---

	/**
	 * Specifies the value of a generic vertex attribute. The y and z components are implicitly set to 0.0f and w to 1.0f.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 */
	public static void glVertexAttrib1fARB(int index, float v0) {
		long __functionAddress = getInstance().VertexAttrib1fARB;
		callIFV(__functionAddress, index, v0);
	}

	// --- [ glVertexAttrib1sARB ] ---

	/**
	 * Short version of {@link #glVertexAttrib1fARB VertexAttrib1fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 */
	public static void glVertexAttrib1sARB(int index, short v0) {
		long __functionAddress = getInstance().VertexAttrib1sARB;
		callISV(__functionAddress, index, v0);
	}

	// --- [ glVertexAttrib1dARB ] ---

	/**
	 * Double version of {@link #glVertexAttrib1fARB VertexAttrib1fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 */
	public static void glVertexAttrib1dARB(int index, double v0) {
		long __functionAddress = getInstance().VertexAttrib1dARB;
		callIDV(__functionAddress, index, v0);
	}

	// --- [ glVertexAttrib2fARB ] ---

	/**
	 * Specifies the value of a generic vertex attribute. The y component is implicitly set to 0.0f and w to 1.0f.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 */
	public static void glVertexAttrib2fARB(int index, float v0, float v1) {
		long __functionAddress = getInstance().VertexAttrib2fARB;
		callIFFV(__functionAddress, index, v0, v1);
	}

	// --- [ glVertexAttrib2sARB ] ---

	/**
	 * Short version of {@link #glVertexAttrib2fARB VertexAttrib2fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 */
	public static void glVertexAttrib2sARB(int index, short v0, short v1) {
		long __functionAddress = getInstance().VertexAttrib2sARB;
		callISSV(__functionAddress, index, v0, v1);
	}

	// --- [ glVertexAttrib2dARB ] ---

	/**
	 * Double version of {@link #glVertexAttrib2fARB VertexAttrib2fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 */
	public static void glVertexAttrib2dARB(int index, double v0, double v1) {
		long __functionAddress = getInstance().VertexAttrib2dARB;
		callIDDV(__functionAddress, index, v0, v1);
	}

	// --- [ glVertexAttrib3fARB ] ---

	/**
	 * Specifies the value of a generic vertex attribute. The w is implicitly set to 1.0f.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 * @param v2    the vertex attribute z component
	 */
	public static void glVertexAttrib3fARB(int index, float v0, float v1, float v2) {
		long __functionAddress = getInstance().VertexAttrib3fARB;
		callIFFFV(__functionAddress, index, v0, v1, v2);
	}

	// --- [ glVertexAttrib3sARB ] ---

	/**
	 * Short version of {@link #glVertexAttrib3fARB VertexAttrib3fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 * @param v2    the vertex attribute z component
	 */
	public static void glVertexAttrib3sARB(int index, short v0, short v1, short v2) {
		long __functionAddress = getInstance().VertexAttrib3sARB;
		callISSSV(__functionAddress, index, v0, v1, v2);
	}

	// --- [ glVertexAttrib3dARB ] ---

	/**
	 * Double version of {@link #glVertexAttrib3fARB VertexAttrib3fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 * @param v2    the vertex attribute z component
	 */
	public static void glVertexAttrib3dARB(int index, double v0, double v1, double v2) {
		long __functionAddress = getInstance().VertexAttrib3dARB;
		callIDDDV(__functionAddress, index, v0, v1, v2);
	}

	// --- [ glVertexAttrib4fARB ] ---

	/**
	 * Specifies the value of a generic vertex attribute.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 * @param v2    the vertex attribute z component
	 * @param v3    the vertex attribute w component
	 */
	public static void glVertexAttrib4fARB(int index, float v0, float v1, float v2, float v3) {
		long __functionAddress = getInstance().VertexAttrib4fARB;
		callIFFFFV(__functionAddress, index, v0, v1, v2, v3);
	}

	// --- [ glVertexAttrib4sARB ] ---

	/**
	 * Short version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 * @param v2    the vertex attribute z component
	 * @param v3    the vertex attribute w component
	 */
	public static void glVertexAttrib4sARB(int index, short v0, short v1, short v2, short v3) {
		long __functionAddress = getInstance().VertexAttrib4sARB;
		callISSSSV(__functionAddress, index, v0, v1, v2, v3);
	}

	// --- [ glVertexAttrib4dARB ] ---

	/**
	 * Double version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 * @param v2    the vertex attribute z component
	 * @param v3    the vertex attribute w component
	 */
	public static void glVertexAttrib4dARB(int index, double v0, double v1, double v2, double v3) {
		long __functionAddress = getInstance().VertexAttrib4dARB;
		callIDDDDV(__functionAddress, index, v0, v1, v2, v3);
	}

	// --- [ glVertexAttrib4NubARB ] ---

	/**
	 * Normalized unsigned byte version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 * @param y     the vertex attribute y component
	 * @param z     the vertex attribute z component
	 * @param w     the vertex attribute w component
	 */
	public static void glVertexAttrib4NubARB(int index, byte x, byte y, byte z, byte w) {
		long __functionAddress = getInstance().VertexAttrib4NubARB;
		callIBBBBV(__functionAddress, index, x, y, z, w);
	}

	// --- [ glVertexAttrib1fvARB ] ---

	/** Unsafe version of {@link #glVertexAttrib1fvARB VertexAttrib1fvARB} */
	@JavadocExclude
	public static void nglVertexAttrib1fvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib1fvARB;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib1fARB VertexAttrib1fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib1fvARB(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1 << 2);
		nglVertexAttrib1fvARB(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib1fvARB VertexAttrib1fvARB} */
	public static void glVertexAttrib1fvARB(int index, FloatBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1);
		nglVertexAttrib1fvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib1svARB ] ---

	/** Unsafe version of {@link #glVertexAttrib1svARB VertexAttrib1svARB} */
	@JavadocExclude
	public static void nglVertexAttrib1svARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib1svARB;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib1sARB VertexAttrib1sARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib1svARB(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1 << 1);
		nglVertexAttrib1svARB(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib1svARB VertexAttrib1svARB} */
	public static void glVertexAttrib1svARB(int index, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1);
		nglVertexAttrib1svARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib1dvARB ] ---

	/** Unsafe version of {@link #glVertexAttrib1dvARB VertexAttrib1dvARB} */
	@JavadocExclude
	public static void nglVertexAttrib1dvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib1dvARB;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib1dARB VertexAttrib1dARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib1dvARB(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1 << 3);
		nglVertexAttrib1dvARB(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib1dvARB VertexAttrib1dvARB} */
	public static void glVertexAttrib1dvARB(int index, DoubleBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1);
		nglVertexAttrib1dvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib2fvARB ] ---

	/** Unsafe version of {@link #glVertexAttrib2fvARB VertexAttrib2fvARB} */
	@JavadocExclude
	public static void nglVertexAttrib2fvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib2fvARB;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib2fARB VertexAttrib2fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib2fvARB(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2 << 2);
		nglVertexAttrib2fvARB(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib2fvARB VertexAttrib2fvARB} */
	public static void glVertexAttrib2fvARB(int index, FloatBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2);
		nglVertexAttrib2fvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib2svARB ] ---

	/** Unsafe version of {@link #glVertexAttrib2svARB VertexAttrib2svARB} */
	@JavadocExclude
	public static void nglVertexAttrib2svARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib2svARB;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib2sARB VertexAttrib2sARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib2svARB(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2 << 1);
		nglVertexAttrib2svARB(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib2svARB VertexAttrib2svARB} */
	public static void glVertexAttrib2svARB(int index, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2);
		nglVertexAttrib2svARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib2dvARB ] ---

	/** Unsafe version of {@link #glVertexAttrib2dvARB VertexAttrib2dvARB} */
	@JavadocExclude
	public static void nglVertexAttrib2dvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib2dvARB;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib2dARB VertexAttrib2dARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib2dvARB(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2 << 3);
		nglVertexAttrib2dvARB(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib2dvARB VertexAttrib2dvARB} */
	public static void glVertexAttrib2dvARB(int index, DoubleBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2);
		nglVertexAttrib2dvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib3fvARB ] ---

	/** Unsafe version of {@link #glVertexAttrib3fvARB VertexAttrib3fvARB} */
	@JavadocExclude
	public static void nglVertexAttrib3fvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib3fvARB;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib3fARB VertexAttrib3fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib3fvARB(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 2);
		nglVertexAttrib3fvARB(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib3fvARB VertexAttrib3fvARB} */
	public static void glVertexAttrib3fvARB(int index, FloatBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglVertexAttrib3fvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib3svARB ] ---

	/** Unsafe version of {@link #glVertexAttrib3svARB VertexAttrib3svARB} */
	@JavadocExclude
	public static void nglVertexAttrib3svARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib3svARB;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib3sARB VertexAttrib3sARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib3svARB(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 1);
		nglVertexAttrib3svARB(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib3svARB VertexAttrib3svARB} */
	public static void glVertexAttrib3svARB(int index, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglVertexAttrib3svARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib3dvARB ] ---

	/** Unsafe version of {@link #glVertexAttrib3dvARB VertexAttrib3dvARB} */
	@JavadocExclude
	public static void nglVertexAttrib3dvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib3dvARB;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib3dARB VertexAttrib3dARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib3dvARB(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 3);
		nglVertexAttrib3dvARB(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib3dvARB VertexAttrib3dvARB} */
	public static void glVertexAttrib3dvARB(int index, DoubleBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglVertexAttrib3dvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4fvARB ] ---

	/** Unsafe version of {@link #glVertexAttrib4fvARB VertexAttrib4fvARB} */
	@JavadocExclude
	public static void nglVertexAttrib4fvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4fvARB;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4fvARB(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 2);
		nglVertexAttrib4fvARB(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib4fvARB VertexAttrib4fvARB} */
	public static void glVertexAttrib4fvARB(int index, FloatBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4fvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4svARB ] ---

	/** Unsafe version of {@link #glVertexAttrib4svARB VertexAttrib4svARB} */
	@JavadocExclude
	public static void nglVertexAttrib4svARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4svARB;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib4sARB VertexAttrib4sARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4svARB(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 1);
		nglVertexAttrib4svARB(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib4svARB VertexAttrib4svARB} */
	public static void glVertexAttrib4svARB(int index, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4svARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4dvARB ] ---

	/** Unsafe version of {@link #glVertexAttrib4dvARB VertexAttrib4dvARB} */
	@JavadocExclude
	public static void nglVertexAttrib4dvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4dvARB;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib4dARB VertexAttrib4dARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4dvARB(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 3);
		nglVertexAttrib4dvARB(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib4dvARB VertexAttrib4dvARB} */
	public static void glVertexAttrib4dvARB(int index, DoubleBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4dvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4ivARB ] ---

	/** Unsafe version of {@link #glVertexAttrib4ivARB VertexAttrib4ivARB} */
	@JavadocExclude
	public static void nglVertexAttrib4ivARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4ivARB;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Integer pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4ivARB(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 2);
		nglVertexAttrib4ivARB(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib4ivARB VertexAttrib4ivARB} */
	public static void glVertexAttrib4ivARB(int index, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4ivARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4bvARB ] ---

	/** Unsafe version of {@link #glVertexAttrib4bvARB VertexAttrib4bvARB} */
	@JavadocExclude
	public static void nglVertexAttrib4bvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4bvARB;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Byte pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4bvARB(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4bvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4ubvARB ] ---

	/** Unsafe version of {@link #glVertexAttrib4ubvARB VertexAttrib4ubvARB} */
	@JavadocExclude
	public static void nglVertexAttrib4ubvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4ubvARB;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib4NubARB VertexAttrib4NubARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4ubvARB(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4ubvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4usvARB ] ---

	/** Unsafe version of {@link #glVertexAttrib4usvARB VertexAttrib4usvARB} */
	@JavadocExclude
	public static void nglVertexAttrib4usvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4usvARB;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Unsigned short pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4usvARB(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 1);
		nglVertexAttrib4usvARB(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib4usvARB VertexAttrib4usvARB} */
	public static void glVertexAttrib4usvARB(int index, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4usvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4uivARB ] ---

	/** Unsafe version of {@link #glVertexAttrib4uivARB VertexAttrib4uivARB} */
	@JavadocExclude
	public static void nglVertexAttrib4uivARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4uivARB;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Unsigned int pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4uivARB(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 2);
		nglVertexAttrib4uivARB(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib4uivARB VertexAttrib4uivARB} */
	public static void glVertexAttrib4uivARB(int index, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4uivARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4NbvARB ] ---

	/** Unsafe version of {@link #glVertexAttrib4NbvARB VertexAttrib4NbvARB} */
	@JavadocExclude
	public static void nglVertexAttrib4NbvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4NbvARB;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Normalized byte pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4NbvARB(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4NbvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4NsvARB ] ---

	/** Unsafe version of {@link #glVertexAttrib4NsvARB VertexAttrib4NsvARB} */
	@JavadocExclude
	public static void nglVertexAttrib4NsvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4NsvARB;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Normalized short pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4NsvARB(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 1);
		nglVertexAttrib4NsvARB(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib4NsvARB VertexAttrib4NsvARB} */
	public static void glVertexAttrib4NsvARB(int index, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4NsvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4NivARB ] ---

	/** Unsafe version of {@link #glVertexAttrib4NivARB VertexAttrib4NivARB} */
	@JavadocExclude
	public static void nglVertexAttrib4NivARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4NivARB;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Normalized int pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4NivARB(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 2);
		nglVertexAttrib4NivARB(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib4NivARB VertexAttrib4NivARB} */
	public static void glVertexAttrib4NivARB(int index, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4NivARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4NubvARB ] ---

	/** Unsafe version of {@link #glVertexAttrib4NubvARB VertexAttrib4NubvARB} */
	@JavadocExclude
	public static void nglVertexAttrib4NubvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4NubvARB;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Normalized unsigned byte pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4NubvARB(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4NubvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4NusvARB ] ---

	/** Unsafe version of {@link #glVertexAttrib4NusvARB VertexAttrib4NusvARB} */
	@JavadocExclude
	public static void nglVertexAttrib4NusvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4NusvARB;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Normalized unsigned short pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4NusvARB(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 1);
		nglVertexAttrib4NusvARB(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib4NusvARB VertexAttrib4NusvARB} */
	public static void glVertexAttrib4NusvARB(int index, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4NusvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4NuivARB ] ---

	/** Unsafe version of {@link #glVertexAttrib4NuivARB VertexAttrib4NuivARB} */
	@JavadocExclude
	public static void nglVertexAttrib4NuivARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4NuivARB;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Normalized unsigned int pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4NuivARB(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 2);
		nglVertexAttrib4NuivARB(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttrib4NuivARB VertexAttrib4NuivARB} */
	public static void glVertexAttrib4NuivARB(int index, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4NuivARB(index, memAddress(v));
	}

	// --- [ glVertexAttribPointerARB ] ---

	/** Unsafe version of {@link #glVertexAttribPointerARB VertexAttribPointerARB} */
	@JavadocExclude
	public static void nglVertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, long pointer) {
		long __functionAddress = getInstance().VertexAttribPointerARB;
		callIIIZIPV(__functionAddress, index, size, type, normalized, stride, pointer);
	}

	/**
	 * Specifies the location and organization of a vertex attribute array.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param size       the number of values per vertex that are stored in the array. The initial value is 4. One of:<br>1, 2, 3, 4, {@link GL12#GL_BGRA BGRA}
	 * @param type       the data type of each component in the array. The initial value is GL_FLOAT. One of:<br>{@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_INT INT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}, {@link GL30#GL_HALF_FLOAT HALF_FLOAT}, {@link GL11#GL_FLOAT FLOAT}, {@link GL11#GL_DOUBLE DOUBLE}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}, {@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL41#GL_FIXED FIXED}
	 * @param normalized whether fixed-point data values should be normalized or converted directly as fixed-point values when they are accessed
	 * @param stride     the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
	 *                   the array. The initial value is 0.
	 * @param pointer    the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
	 *                   currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
	 */
	public static void glVertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, ByteBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribPointerARB(index, size, type, normalized, stride, memAddress(pointer));
	}

	/** Buffer object offset version of: {@link #glVertexAttribPointerARB VertexAttribPointerARB} */
	public static void glVertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, long pointerOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, true);
		nglVertexAttribPointerARB(index, size, type, normalized, stride, pointerOffset);
	}

	/** ShortBuffer version of: {@link #glVertexAttribPointerARB VertexAttribPointerARB} */
	public static void glVertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, ShortBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribPointerARB(index, size, type, normalized, stride, memAddress(pointer));
	}

	/** IntBuffer version of: {@link #glVertexAttribPointerARB VertexAttribPointerARB} */
	public static void glVertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, IntBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribPointerARB(index, size, type, normalized, stride, memAddress(pointer));
	}

	/** FloatBuffer version of: {@link #glVertexAttribPointerARB VertexAttribPointerARB} */
	public static void glVertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, FloatBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribPointerARB(index, size, type, normalized, stride, memAddress(pointer));
	}

	// --- [ glEnableVertexAttribArrayARB ] ---

	/**
	 * Enables a generic vertex attribute array.
	 *
	 * @param index the index of the generic vertex attribute to be enabled
	 */
	public static void glEnableVertexAttribArrayARB(int index) {
		long __functionAddress = getInstance().EnableVertexAttribArrayARB;
		callIV(__functionAddress, index);
	}

	// --- [ glDisableVertexAttribArrayARB ] ---

	/**
	 * Disables a generic vertex attribute array.
	 *
	 * @param index the index of the generic vertex attribute to be disabled
	 */
	public static void glDisableVertexAttribArrayARB(int index) {
		long __functionAddress = getInstance().DisableVertexAttribArrayARB;
		callIV(__functionAddress, index);
	}

	// --- [ glBindAttribLocationARB ] ---

	/** Unsafe version of {@link #glBindAttribLocationARB BindAttribLocationARB} */
	@JavadocExclude
	public static void nglBindAttribLocationARB(int programObj, int index, long name) {
		long __functionAddress = getInstance().BindAttribLocationARB;
		callIIPV(__functionAddress, programObj, index, name);
	}

	/**
	 * Associates a generic vertex attribute index with a named attribute variable.
	 *
	 * @param programObj the handle of the program object in which the association is to be made
	 * @param index      the index of the generic vertex attribute to be bound
	 * @param name       a null terminated string containing the name of the vertex shader attribute variable to which {@code index} is to be bound
	 */
	public static void glBindAttribLocationARB(int programObj, int index, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		nglBindAttribLocationARB(programObj, index, memAddress(name));
	}

	/** CharSequence version of: {@link #glBindAttribLocationARB BindAttribLocationARB} */
	public static void glBindAttribLocationARB(int programObj, int index, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		nglBindAttribLocationARB(programObj, index, __buffer.address(nameEncoded));
	}

	// --- [ glGetActiveAttribARB ] ---

	/** Unsafe version of {@link #glGetActiveAttribARB GetActiveAttribARB} */
	@JavadocExclude
	public static void nglGetActiveAttribARB(int programObj, int index, int maxLength, long length, long size, long type, long name) {
		long __functionAddress = getInstance().GetActiveAttribARB;
		callIIIPPPPV(__functionAddress, programObj, index, maxLength, length, size, type, name);
	}

	/**
	 * Returns information about an active attribute variable for the specified program object.
	 *
	 * @param programObj the program object to be queried
	 * @param index      the index of the attribute variable to be queried
	 * @param maxLength  the maximum number of characters OpenGL is allowed to write in the character buffer indicated by {@code name}
	 * @param length     the number of characters actually written by OpenGL in the string indicated by {@code name} (excluding the null terminator) if a value other than NULL is passed
	 * @param size       the size of the attribute variable
	 * @param type       the data type of the attribute variable
	 * @param name       a null terminated string containing the name of the attribute variable
	 */
	public static void glGetActiveAttribARB(int programObj, int index, int maxLength, ByteBuffer length, ByteBuffer size, ByteBuffer type, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(name, maxLength);
			if ( length != null ) checkBuffer(length, 1 << 2);
			checkBuffer(size, 1 << 2);
			checkBuffer(type, 1 << 2);
		}
		nglGetActiveAttribARB(programObj, index, maxLength, memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
	}

	/** Alternative version of: {@link #glGetActiveAttribARB GetActiveAttribARB} */
	public static void glGetActiveAttribARB(int programObj, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS ) {
			if ( length != null ) checkBuffer(length, 1);
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		nglGetActiveAttribARB(programObj, index, name.remaining(), memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
	}

	/** String return version of: {@link #glGetActiveAttribARB GetActiveAttribARB} */
	public static String glGetActiveAttribARB(int programObj, int index, int maxLength, IntBuffer size, IntBuffer type) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(maxLength);
		nglGetActiveAttribARB(programObj, index, maxLength, __buffer.address(length), memAddress(size), memAddress(type), __buffer.address(name));
		return memDecodeASCII(__buffer.buffer(), __buffer.intValue(length), name);
	}

	/** String return (w/ implicit max length) version of: {@link #glGetActiveAttribARB GetActiveAttribARB} */
	public static String glGetActiveAttribARB(int programObj, int index, IntBuffer size, IntBuffer type) {
		int maxLength = ARBShaderObjects.glGetObjectParameteriARB(programObj, GL_OBJECT_ACTIVE_ATTRIBUTE_MAX_LENGTH_ARB);
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(maxLength);
		nglGetActiveAttribARB(programObj, index, maxLength, __buffer.address(length), memAddress(size), memAddress(type), __buffer.address(name));
		return memDecodeASCII(__buffer.buffer(), __buffer.intValue(length), name);
	}

	// --- [ glGetAttribLocationARB ] ---

	/** Unsafe version of {@link #glGetAttribLocationARB GetAttribLocationARB} */
	@JavadocExclude
	public static int nglGetAttribLocationARB(int programObj, long name) {
		long __functionAddress = getInstance().GetAttribLocationARB;
		return callIPI(__functionAddress, programObj, name);
	}

	/**
	 * Returns the location of an attribute variable.
	 *
	 * @param programObj the program object to be queried
	 * @param name       a null terminated string containing the name of the attribute variable whose location is to be queried
	 */
	public static int glGetAttribLocationARB(int programObj, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		return nglGetAttribLocationARB(programObj, memAddress(name));
	}

	/** CharSequence version of: {@link #glGetAttribLocationARB GetAttribLocationARB} */
	public static int glGetAttribLocationARB(int programObj, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		return nglGetAttribLocationARB(programObj, __buffer.address(nameEncoded));
	}

	// --- [ glGetVertexAttribivARB ] ---

	/** Unsafe version of {@link #glGetVertexAttribivARB GetVertexAttribivARB} */
	@JavadocExclude
	public static void nglGetVertexAttribivARB(int index, int pname, long params) {
		long __functionAddress = getInstance().GetVertexAttribivARB;
		callIIPV(__functionAddress, index, pname, params);
	}

	/**
	 * Returns the integer value of a generic vertex attribute parameter.
	 *
	 * @param index  the generic vertex attribute parameter to be queried
	 * @param pname  the symbolic name of the vertex attribute parameter to be queried. One of:<br>{@link GL15#GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING VERTEX_ATTRIB_ARRAY_BUFFER_BINDING}, {@link #GL_VERTEX_ATTRIB_ARRAY_ENABLED_ARB VERTEX_ATTRIB_ARRAY_ENABLED_ARB}, {@link #GL_VERTEX_ATTRIB_ARRAY_SIZE_ARB VERTEX_ATTRIB_ARRAY_SIZE_ARB}, {@link #GL_VERTEX_ATTRIB_ARRAY_STRIDE_ARB VERTEX_ATTRIB_ARRAY_STRIDE_ARB}, {@link #GL_VERTEX_ATTRIB_ARRAY_TYPE_ARB VERTEX_ATTRIB_ARRAY_TYPE_ARB}, {@link #GL_VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB}, {@link #GL_CURRENT_VERTEX_ATTRIB_ARB CURRENT_VERTEX_ATTRIB_ARB}, {@link GL30#GL_VERTEX_ATTRIB_ARRAY_INTEGER VERTEX_ATTRIB_ARRAY_INTEGER}, {@link GL33#GL_VERTEX_ATTRIB_ARRAY_DIVISOR VERTEX_ATTRIB_ARRAY_DIVISOR}
	 * @param params returns the requested data
	 */
	public static void glGetVertexAttribivARB(int index, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetVertexAttribivARB(index, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetVertexAttribivARB GetVertexAttribivARB} */
	public static void glGetVertexAttribivARB(int index, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetVertexAttribivARB(index, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetVertexAttribivARB GetVertexAttribivARB} */
	public static int glGetVertexAttribiARB(int index, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetVertexAttribivARB(index, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetVertexAttribfvARB ] ---

	/** Unsafe version of {@link #glGetVertexAttribfvARB GetVertexAttribfvARB} */
	@JavadocExclude
	public static void nglGetVertexAttribfvARB(int index, int pname, long params) {
		long __functionAddress = getInstance().GetVertexAttribfvARB;
		callIIPV(__functionAddress, index, pname, params);
	}

	/**
	 * Float version of {@link #glGetVertexAttribivARB GetVertexAttribivARB}.
	 *
	 * @param index  the generic vertex attribute parameter to be queried
	 * @param pname  the symbolic name of the vertex attribute parameter to be queried
	 * @param params returns the requested data
	 */
	public static void glGetVertexAttribfvARB(int index, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglGetVertexAttribfvARB(index, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetVertexAttribfvARB GetVertexAttribfvARB} */
	public static void glGetVertexAttribfvARB(int index, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglGetVertexAttribfvARB(index, pname, memAddress(params));
	}

	// --- [ glGetVertexAttribdvARB ] ---

	/** Unsafe version of {@link #glGetVertexAttribdvARB GetVertexAttribdvARB} */
	@JavadocExclude
	public static void nglGetVertexAttribdvARB(int index, int pname, long params) {
		long __functionAddress = getInstance().GetVertexAttribdvARB;
		callIIPV(__functionAddress, index, pname, params);
	}

	/**
	 * Double version of {@link #glGetVertexAttribivARB GetVertexAttribivARB}.
	 *
	 * @param index  the generic vertex attribute parameter to be queried
	 * @param pname  the symbolic name of the vertex attribute parameter to be queried
	 * @param params returns the requested data
	 */
	public static void glGetVertexAttribdvARB(int index, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 3);
		nglGetVertexAttribdvARB(index, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetVertexAttribdvARB GetVertexAttribdvARB} */
	public static void glGetVertexAttribdvARB(int index, int pname, DoubleBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglGetVertexAttribdvARB(index, pname, memAddress(params));
	}

	// --- [ glGetVertexAttribPointervARB ] ---

	/** Unsafe version of {@link #glGetVertexAttribPointervARB GetVertexAttribPointervARB} */
	@JavadocExclude
	public static void nglGetVertexAttribPointervARB(int index, int pname, long pointer) {
		long __functionAddress = getInstance().GetVertexAttribPointervARB;
		callIIPV(__functionAddress, index, pname, pointer);
	}

	/**
	 * Returns the address of the specified generic vertex attribute pointer.
	 *
	 * @param index   the generic vertex attribute parameter to be queried
	 * @param pname   the symbolic name of the generic vertex attribute parameter to be returned. Must be:<br>{@link #GL_VERTEX_ATTRIB_ARRAY_POINTER_ARB VERTEX_ATTRIB_ARRAY_POINTER_ARB}
	 * @param pointer the pointer value
	 */
	public static void glGetVertexAttribPointervARB(int index, int pname, ByteBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(pointer, 1 << POINTER_SHIFT);
		nglGetVertexAttribPointervARB(index, pname, memAddress(pointer));
	}

	/** Alternative version of: {@link #glGetVertexAttribPointervARB GetVertexAttribPointervARB} */
	public static void glGetVertexAttribPointervARB(int index, int pname, PointerBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(pointer, 1);
		nglGetVertexAttribPointervARB(index, pname, memAddress(pointer));
	}

	/** Single return value version of: {@link #glGetVertexAttribPointervARB GetVertexAttribPointervARB} */
	public static long glGetVertexAttribPointerARB(int index, int pname) {
		APIBuffer __buffer = apiBuffer();
		int pointer = __buffer.pointerParam();
		nglGetVertexAttribPointervARB(index, pname, __buffer.address(pointer));
		return __buffer.pointerValue(pointer);
	}

}