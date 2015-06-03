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
		GL_FLOAT          = 0x1406,
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

	/** JNI method for {@link #glVertexAttrib1fARB VertexAttrib1fARB} */
	@JavadocExclude
	public static native void nglVertexAttrib1fARB(int index, float v0, long __functionAddress);

	/**
	 * Specifies the value of a generic vertex attribute. The y and z components are implicitly set to 0.0f and w to 1.0f.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 */
	public static void glVertexAttrib1fARB(int index, float v0) {
		long __functionAddress = getInstance().VertexAttrib1fARB;
		nglVertexAttrib1fARB(index, v0, __functionAddress);
	}

	// --- [ glVertexAttrib1sARB ] ---

	/** JNI method for {@link #glVertexAttrib1sARB VertexAttrib1sARB} */
	@JavadocExclude
	public static native void nglVertexAttrib1sARB(int index, short v0, long __functionAddress);

	/**
	 * Short version of {@link #glVertexAttrib1fARB VertexAttrib1fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 */
	public static void glVertexAttrib1sARB(int index, short v0) {
		long __functionAddress = getInstance().VertexAttrib1sARB;
		nglVertexAttrib1sARB(index, v0, __functionAddress);
	}

	// --- [ glVertexAttrib1dARB ] ---

	/** JNI method for {@link #glVertexAttrib1dARB VertexAttrib1dARB} */
	@JavadocExclude
	public static native void nglVertexAttrib1dARB(int index, double v0, long __functionAddress);

	/**
	 * Double version of {@link #glVertexAttrib1fARB VertexAttrib1fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 */
	public static void glVertexAttrib1dARB(int index, double v0) {
		long __functionAddress = getInstance().VertexAttrib1dARB;
		nglVertexAttrib1dARB(index, v0, __functionAddress);
	}

	// --- [ glVertexAttrib2fARB ] ---

	/** JNI method for {@link #glVertexAttrib2fARB VertexAttrib2fARB} */
	@JavadocExclude
	public static native void nglVertexAttrib2fARB(int index, float v0, float v1, long __functionAddress);

	/**
	 * Specifies the value of a generic vertex attribute. The y component is implicitly set to 0.0f and w to 1.0f.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 */
	public static void glVertexAttrib2fARB(int index, float v0, float v1) {
		long __functionAddress = getInstance().VertexAttrib2fARB;
		nglVertexAttrib2fARB(index, v0, v1, __functionAddress);
	}

	// --- [ glVertexAttrib2sARB ] ---

	/** JNI method for {@link #glVertexAttrib2sARB VertexAttrib2sARB} */
	@JavadocExclude
	public static native void nglVertexAttrib2sARB(int index, short v0, short v1, long __functionAddress);

	/**
	 * Short version of {@link #glVertexAttrib2fARB VertexAttrib2fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 */
	public static void glVertexAttrib2sARB(int index, short v0, short v1) {
		long __functionAddress = getInstance().VertexAttrib2sARB;
		nglVertexAttrib2sARB(index, v0, v1, __functionAddress);
	}

	// --- [ glVertexAttrib2dARB ] ---

	/** JNI method for {@link #glVertexAttrib2dARB VertexAttrib2dARB} */
	@JavadocExclude
	public static native void nglVertexAttrib2dARB(int index, double v0, double v1, long __functionAddress);

	/**
	 * Double version of {@link #glVertexAttrib2fARB VertexAttrib2fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 * @param v1    the vertex attribute y component
	 */
	public static void glVertexAttrib2dARB(int index, double v0, double v1) {
		long __functionAddress = getInstance().VertexAttrib2dARB;
		nglVertexAttrib2dARB(index, v0, v1, __functionAddress);
	}

	// --- [ glVertexAttrib3fARB ] ---

	/** JNI method for {@link #glVertexAttrib3fARB VertexAttrib3fARB} */
	@JavadocExclude
	public static native void nglVertexAttrib3fARB(int index, float v0, float v1, float v2, long __functionAddress);

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
		nglVertexAttrib3fARB(index, v0, v1, v2, __functionAddress);
	}

	// --- [ glVertexAttrib3sARB ] ---

	/** JNI method for {@link #glVertexAttrib3sARB VertexAttrib3sARB} */
	@JavadocExclude
	public static native void nglVertexAttrib3sARB(int index, short v0, short v1, short v2, long __functionAddress);

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
		nglVertexAttrib3sARB(index, v0, v1, v2, __functionAddress);
	}

	// --- [ glVertexAttrib3dARB ] ---

	/** JNI method for {@link #glVertexAttrib3dARB VertexAttrib3dARB} */
	@JavadocExclude
	public static native void nglVertexAttrib3dARB(int index, double v0, double v1, double v2, long __functionAddress);

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
		nglVertexAttrib3dARB(index, v0, v1, v2, __functionAddress);
	}

	// --- [ glVertexAttrib4fARB ] ---

	/** JNI method for {@link #glVertexAttrib4fARB VertexAttrib4fARB} */
	@JavadocExclude
	public static native void nglVertexAttrib4fARB(int index, float v0, float v1, float v2, float v3, long __functionAddress);

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
		nglVertexAttrib4fARB(index, v0, v1, v2, v3, __functionAddress);
	}

	// --- [ glVertexAttrib4sARB ] ---

	/** JNI method for {@link #glVertexAttrib4sARB VertexAttrib4sARB} */
	@JavadocExclude
	public static native void nglVertexAttrib4sARB(int index, short v0, short v1, short v2, short v3, long __functionAddress);

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
		nglVertexAttrib4sARB(index, v0, v1, v2, v3, __functionAddress);
	}

	// --- [ glVertexAttrib4dARB ] ---

	/** JNI method for {@link #glVertexAttrib4dARB VertexAttrib4dARB} */
	@JavadocExclude
	public static native void nglVertexAttrib4dARB(int index, double v0, double v1, double v2, double v3, long __functionAddress);

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
		nglVertexAttrib4dARB(index, v0, v1, v2, v3, __functionAddress);
	}

	// --- [ glVertexAttrib4NubARB ] ---

	/** JNI method for {@link #glVertexAttrib4NubARB VertexAttrib4NubARB} */
	@JavadocExclude
	public static native void nglVertexAttrib4NubARB(int index, byte x, byte y, byte z, byte w, long __functionAddress);

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
		nglVertexAttrib4NubARB(index, x, y, z, w, __functionAddress);
	}

	// --- [ glVertexAttrib1fvARB ] ---

	/** JNI method for {@link #glVertexAttrib1fvARB VertexAttrib1fvARB} */
	@JavadocExclude
	public static native void nglVertexAttrib1fvARB(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib1fvARB VertexAttrib1fvARB} */
	@JavadocExclude
	public static void nglVertexAttrib1fvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib1fvARB;
		nglVertexAttrib1fvARB(index, v, __functionAddress);
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

	/** JNI method for {@link #glVertexAttrib1svARB VertexAttrib1svARB} */
	@JavadocExclude
	public static native void nglVertexAttrib1svARB(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib1svARB VertexAttrib1svARB} */
	@JavadocExclude
	public static void nglVertexAttrib1svARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib1svARB;
		nglVertexAttrib1svARB(index, v, __functionAddress);
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

	/** JNI method for {@link #glVertexAttrib1dvARB VertexAttrib1dvARB} */
	@JavadocExclude
	public static native void nglVertexAttrib1dvARB(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib1dvARB VertexAttrib1dvARB} */
	@JavadocExclude
	public static void nglVertexAttrib1dvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib1dvARB;
		nglVertexAttrib1dvARB(index, v, __functionAddress);
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

	/** JNI method for {@link #glVertexAttrib2fvARB VertexAttrib2fvARB} */
	@JavadocExclude
	public static native void nglVertexAttrib2fvARB(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib2fvARB VertexAttrib2fvARB} */
	@JavadocExclude
	public static void nglVertexAttrib2fvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib2fvARB;
		nglVertexAttrib2fvARB(index, v, __functionAddress);
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

	/** JNI method for {@link #glVertexAttrib2svARB VertexAttrib2svARB} */
	@JavadocExclude
	public static native void nglVertexAttrib2svARB(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib2svARB VertexAttrib2svARB} */
	@JavadocExclude
	public static void nglVertexAttrib2svARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib2svARB;
		nglVertexAttrib2svARB(index, v, __functionAddress);
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

	/** JNI method for {@link #glVertexAttrib2dvARB VertexAttrib2dvARB} */
	@JavadocExclude
	public static native void nglVertexAttrib2dvARB(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib2dvARB VertexAttrib2dvARB} */
	@JavadocExclude
	public static void nglVertexAttrib2dvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib2dvARB;
		nglVertexAttrib2dvARB(index, v, __functionAddress);
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

	/** JNI method for {@link #glVertexAttrib3fvARB VertexAttrib3fvARB} */
	@JavadocExclude
	public static native void nglVertexAttrib3fvARB(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib3fvARB VertexAttrib3fvARB} */
	@JavadocExclude
	public static void nglVertexAttrib3fvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib3fvARB;
		nglVertexAttrib3fvARB(index, v, __functionAddress);
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

	/** JNI method for {@link #glVertexAttrib3svARB VertexAttrib3svARB} */
	@JavadocExclude
	public static native void nglVertexAttrib3svARB(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib3svARB VertexAttrib3svARB} */
	@JavadocExclude
	public static void nglVertexAttrib3svARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib3svARB;
		nglVertexAttrib3svARB(index, v, __functionAddress);
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

	/** JNI method for {@link #glVertexAttrib3dvARB VertexAttrib3dvARB} */
	@JavadocExclude
	public static native void nglVertexAttrib3dvARB(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib3dvARB VertexAttrib3dvARB} */
	@JavadocExclude
	public static void nglVertexAttrib3dvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib3dvARB;
		nglVertexAttrib3dvARB(index, v, __functionAddress);
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

	/** JNI method for {@link #glVertexAttrib4fvARB VertexAttrib4fvARB} */
	@JavadocExclude
	public static native void nglVertexAttrib4fvARB(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib4fvARB VertexAttrib4fvARB} */
	@JavadocExclude
	public static void nglVertexAttrib4fvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4fvARB;
		nglVertexAttrib4fvARB(index, v, __functionAddress);
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

	/** JNI method for {@link #glVertexAttrib4svARB VertexAttrib4svARB} */
	@JavadocExclude
	public static native void nglVertexAttrib4svARB(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib4svARB VertexAttrib4svARB} */
	@JavadocExclude
	public static void nglVertexAttrib4svARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4svARB;
		nglVertexAttrib4svARB(index, v, __functionAddress);
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

	/** JNI method for {@link #glVertexAttrib4dvARB VertexAttrib4dvARB} */
	@JavadocExclude
	public static native void nglVertexAttrib4dvARB(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib4dvARB VertexAttrib4dvARB} */
	@JavadocExclude
	public static void nglVertexAttrib4dvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4dvARB;
		nglVertexAttrib4dvARB(index, v, __functionAddress);
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

	/** JNI method for {@link #glVertexAttrib4ivARB VertexAttrib4ivARB} */
	@JavadocExclude
	public static native void nglVertexAttrib4ivARB(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib4ivARB VertexAttrib4ivARB} */
	@JavadocExclude
	public static void nglVertexAttrib4ivARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4ivARB;
		nglVertexAttrib4ivARB(index, v, __functionAddress);
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

	/** JNI method for {@link #glVertexAttrib4bvARB VertexAttrib4bvARB} */
	@JavadocExclude
	public static native void nglVertexAttrib4bvARB(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib4bvARB VertexAttrib4bvARB} */
	@JavadocExclude
	public static void nglVertexAttrib4bvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4bvARB;
		nglVertexAttrib4bvARB(index, v, __functionAddress);
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

	/** JNI method for {@link #glVertexAttrib4ubvARB VertexAttrib4ubvARB} */
	@JavadocExclude
	public static native void nglVertexAttrib4ubvARB(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib4ubvARB VertexAttrib4ubvARB} */
	@JavadocExclude
	public static void nglVertexAttrib4ubvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4ubvARB;
		nglVertexAttrib4ubvARB(index, v, __functionAddress);
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

	/** JNI method for {@link #glVertexAttrib4usvARB VertexAttrib4usvARB} */
	@JavadocExclude
	public static native void nglVertexAttrib4usvARB(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib4usvARB VertexAttrib4usvARB} */
	@JavadocExclude
	public static void nglVertexAttrib4usvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4usvARB;
		nglVertexAttrib4usvARB(index, v, __functionAddress);
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

	/** JNI method for {@link #glVertexAttrib4uivARB VertexAttrib4uivARB} */
	@JavadocExclude
	public static native void nglVertexAttrib4uivARB(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib4uivARB VertexAttrib4uivARB} */
	@JavadocExclude
	public static void nglVertexAttrib4uivARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4uivARB;
		nglVertexAttrib4uivARB(index, v, __functionAddress);
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

	/** JNI method for {@link #glVertexAttrib4NbvARB VertexAttrib4NbvARB} */
	@JavadocExclude
	public static native void nglVertexAttrib4NbvARB(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib4NbvARB VertexAttrib4NbvARB} */
	@JavadocExclude
	public static void nglVertexAttrib4NbvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4NbvARB;
		nglVertexAttrib4NbvARB(index, v, __functionAddress);
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

	/** JNI method for {@link #glVertexAttrib4NsvARB VertexAttrib4NsvARB} */
	@JavadocExclude
	public static native void nglVertexAttrib4NsvARB(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib4NsvARB VertexAttrib4NsvARB} */
	@JavadocExclude
	public static void nglVertexAttrib4NsvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4NsvARB;
		nglVertexAttrib4NsvARB(index, v, __functionAddress);
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

	/** JNI method for {@link #glVertexAttrib4NivARB VertexAttrib4NivARB} */
	@JavadocExclude
	public static native void nglVertexAttrib4NivARB(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib4NivARB VertexAttrib4NivARB} */
	@JavadocExclude
	public static void nglVertexAttrib4NivARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4NivARB;
		nglVertexAttrib4NivARB(index, v, __functionAddress);
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

	/** JNI method for {@link #glVertexAttrib4NubvARB VertexAttrib4NubvARB} */
	@JavadocExclude
	public static native void nglVertexAttrib4NubvARB(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib4NubvARB VertexAttrib4NubvARB} */
	@JavadocExclude
	public static void nglVertexAttrib4NubvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4NubvARB;
		nglVertexAttrib4NubvARB(index, v, __functionAddress);
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

	/** JNI method for {@link #glVertexAttrib4NusvARB VertexAttrib4NusvARB} */
	@JavadocExclude
	public static native void nglVertexAttrib4NusvARB(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib4NusvARB VertexAttrib4NusvARB} */
	@JavadocExclude
	public static void nglVertexAttrib4NusvARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4NusvARB;
		nglVertexAttrib4NusvARB(index, v, __functionAddress);
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

	/** JNI method for {@link #glVertexAttrib4NuivARB VertexAttrib4NuivARB} */
	@JavadocExclude
	public static native void nglVertexAttrib4NuivARB(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttrib4NuivARB VertexAttrib4NuivARB} */
	@JavadocExclude
	public static void nglVertexAttrib4NuivARB(int index, long v) {
		long __functionAddress = getInstance().VertexAttrib4NuivARB;
		nglVertexAttrib4NuivARB(index, v, __functionAddress);
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

	/** JNI method for {@link #glVertexAttribPointerARB VertexAttribPointerARB} */
	@JavadocExclude
	public static native void nglVertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, long pointer, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttribPointerARB VertexAttribPointerARB} */
	@JavadocExclude
	public static void nglVertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, long pointer) {
		long __functionAddress = getInstance().VertexAttribPointerARB;
		nglVertexAttribPointerARB(index, size, type, normalized, stride, pointer, __functionAddress);
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

	/** GL_UNSIGNED_BYTE / GL_BYTE version of: {@link #glVertexAttribPointerARB VertexAttribPointerARB} */
	public static void glVertexAttribPointerARB(int index, int size, boolean unsigned, boolean normalized, int stride, ByteBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribPointerARB(index, size, unsigned ? GL11.GL_UNSIGNED_BYTE : GL11.GL_BYTE, normalized, stride, memAddress(pointer));
	}

	/** GL_UNSIGNED_SHORT / GL_SHORT version of: {@link #glVertexAttribPointerARB VertexAttribPointerARB} */
	public static void glVertexAttribPointerARB(int index, int size, boolean unsigned, boolean normalized, int stride, ShortBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribPointerARB(index, size, unsigned ? GL11.GL_UNSIGNED_SHORT : GL11.GL_SHORT, normalized, stride, memAddress(pointer));
	}

	/** GL_INT version of: {@link #glVertexAttribPointerARB VertexAttribPointerARB} */
	public static void glVertexAttribPointerARB(int index, int size, boolean normalized, int stride, IntBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribPointerARB(index, size, GL11.GL_INT, normalized, stride, memAddress(pointer));
	}

	/** GL_FLOAT version of: {@link #glVertexAttribPointerARB VertexAttribPointerARB} */
	public static void glVertexAttribPointerARB(int index, int size, boolean normalized, int stride, FloatBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribPointerARB(index, size, GL11.GL_FLOAT, normalized, stride, memAddress(pointer));
	}

	/** GL_DOUBLE version of: {@link #glVertexAttribPointerARB VertexAttribPointerARB} */
	public static void glVertexAttribPointerARB(int index, int size, boolean normalized, int stride, DoubleBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribPointerARB(index, size, GL11.GL_DOUBLE, normalized, stride, memAddress(pointer));
	}

	// --- [ glEnableVertexAttribArrayARB ] ---

	/** JNI method for {@link #glEnableVertexAttribArrayARB EnableVertexAttribArrayARB} */
	@JavadocExclude
	public static native void nglEnableVertexAttribArrayARB(int index, long __functionAddress);

	/**
	 * Enables a generic vertex attribute array.
	 *
	 * @param index the index of the generic vertex attribute to be enabled
	 */
	public static void glEnableVertexAttribArrayARB(int index) {
		long __functionAddress = getInstance().EnableVertexAttribArrayARB;
		nglEnableVertexAttribArrayARB(index, __functionAddress);
	}

	// --- [ glDisableVertexAttribArrayARB ] ---

	/** JNI method for {@link #glDisableVertexAttribArrayARB DisableVertexAttribArrayARB} */
	@JavadocExclude
	public static native void nglDisableVertexAttribArrayARB(int index, long __functionAddress);

	/**
	 * Disables a generic vertex attribute array.
	 *
	 * @param index the index of the generic vertex attribute to be disabled
	 */
	public static void glDisableVertexAttribArrayARB(int index) {
		long __functionAddress = getInstance().DisableVertexAttribArrayARB;
		nglDisableVertexAttribArrayARB(index, __functionAddress);
	}

	// --- [ glBindAttribLocationARB ] ---

	/** JNI method for {@link #glBindAttribLocationARB BindAttribLocationARB} */
	@JavadocExclude
	public static native void nglBindAttribLocationARB(int programObj, int index, long name, long __functionAddress);

	/** Unsafe version of {@link #glBindAttribLocationARB BindAttribLocationARB} */
	@JavadocExclude
	public static void nglBindAttribLocationARB(int programObj, int index, long name) {
		long __functionAddress = getInstance().BindAttribLocationARB;
		nglBindAttribLocationARB(programObj, index, name, __functionAddress);
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

	/** JNI method for {@link #glGetActiveAttribARB GetActiveAttribARB} */
	@JavadocExclude
	public static native void nglGetActiveAttribARB(int programObj, int index, int maxLength, long length, long size, long type, long name, long __functionAddress);

	/** Unsafe version of {@link #glGetActiveAttribARB GetActiveAttribARB} */
	@JavadocExclude
	public static void nglGetActiveAttribARB(int programObj, int index, int maxLength, long length, long size, long type, long name) {
		long __functionAddress = getInstance().GetActiveAttribARB;
		nglGetActiveAttribARB(programObj, index, maxLength, length, size, type, name, __functionAddress);
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
		if ( LWJGLUtil.CHECKS )
			checkBuffer(name, maxLength);
		nglGetActiveAttribARB(programObj, index, maxLength, memAddress(length), memAddress(size), memAddress(type), memAddress(name));
	}

	/** Alternative version of: {@link #glGetActiveAttribARB GetActiveAttribARB} */
	public static void glGetActiveAttribARB(int programObj, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
		nglGetActiveAttribARB(programObj, index, name.remaining(), memAddress(length), memAddress(size), memAddress(type), memAddress(name));
	}

	/** String return version of: {@link #glGetActiveAttribARB GetActiveAttribARB} */
	public static String glGetActiveAttribARB(int programObj, int index, int maxLength, IntBuffer size, IntBuffer type) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(maxLength);
		nglGetActiveAttribARB(programObj, index, maxLength, __buffer.address(length), memAddress(size), memAddress(type), __buffer.address(name));
		return memDecodeASCII(memByteBuffer(__buffer.address(name), __buffer.intValue(length)));
	}

	/** String return (w/ implicit max length) version of: {@link #glGetActiveAttribARB GetActiveAttribARB} */
	public static String glGetActiveAttribARB(int programObj, int index, IntBuffer size, IntBuffer type) {
		int maxLength = ARBShaderObjects.glGetObjectParameteriARB(programObj, GL_OBJECT_ACTIVE_ATTRIBUTE_MAX_LENGTH_ARB);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(maxLength);
		nglGetActiveAttribARB(programObj, index, maxLength, __buffer.address(length), memAddress(size), memAddress(type), __buffer.address(name));
		return memDecodeASCII(memByteBuffer(__buffer.address(name), __buffer.intValue(length)));
	}

	// --- [ glGetAttribLocationARB ] ---

	/** JNI method for {@link #glGetAttribLocationARB GetAttribLocationARB} */
	@JavadocExclude
	public static native int nglGetAttribLocationARB(int programObj, long name, long __functionAddress);

	/** Unsafe version of {@link #glGetAttribLocationARB GetAttribLocationARB} */
	@JavadocExclude
	public static int nglGetAttribLocationARB(int programObj, long name) {
		long __functionAddress = getInstance().GetAttribLocationARB;
		return nglGetAttribLocationARB(programObj, name, __functionAddress);
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

	/** JNI method for {@link #glGetVertexAttribivARB GetVertexAttribivARB} */
	@JavadocExclude
	public static native void nglGetVertexAttribivARB(int index, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetVertexAttribivARB GetVertexAttribivARB} */
	@JavadocExclude
	public static void nglGetVertexAttribivARB(int index, int pname, long params) {
		long __functionAddress = getInstance().GetVertexAttribivARB;
		nglGetVertexAttribivARB(index, pname, params, __functionAddress);
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

	/** JNI method for {@link #glGetVertexAttribfvARB GetVertexAttribfvARB} */
	@JavadocExclude
	public static native void nglGetVertexAttribfvARB(int index, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetVertexAttribfvARB GetVertexAttribfvARB} */
	@JavadocExclude
	public static void nglGetVertexAttribfvARB(int index, int pname, long params) {
		long __functionAddress = getInstance().GetVertexAttribfvARB;
		nglGetVertexAttribfvARB(index, pname, params, __functionAddress);
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

	/** JNI method for {@link #glGetVertexAttribdvARB GetVertexAttribdvARB} */
	@JavadocExclude
	public static native void nglGetVertexAttribdvARB(int index, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetVertexAttribdvARB GetVertexAttribdvARB} */
	@JavadocExclude
	public static void nglGetVertexAttribdvARB(int index, int pname, long params) {
		long __functionAddress = getInstance().GetVertexAttribdvARB;
		nglGetVertexAttribdvARB(index, pname, params, __functionAddress);
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

	/** JNI method for {@link #glGetVertexAttribPointervARB GetVertexAttribPointervARB} */
	@JavadocExclude
	public static native void nglGetVertexAttribPointervARB(int index, int pname, long pointer, long __functionAddress);

	/** Unsafe version of {@link #glGetVertexAttribPointervARB GetVertexAttribPointervARB} */
	@JavadocExclude
	public static void nglGetVertexAttribPointervARB(int index, int pname, long pointer) {
		long __functionAddress = getInstance().GetVertexAttribPointervARB;
		nglGetVertexAttribPointervARB(index, pname, pointer, __functionAddress);
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