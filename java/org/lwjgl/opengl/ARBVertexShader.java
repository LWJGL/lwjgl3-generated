/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

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
public class ARBVertexShader {

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

	protected ARBVertexShader() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glVertexAttrib1fARB, caps.glVertexAttrib1sARB, caps.glVertexAttrib1dARB, caps.glVertexAttrib2fARB, caps.glVertexAttrib2sARB, 
			caps.glVertexAttrib2dARB, caps.glVertexAttrib3fARB, caps.glVertexAttrib3sARB, caps.glVertexAttrib3dARB, caps.glVertexAttrib4fARB, 
			caps.glVertexAttrib4sARB, caps.glVertexAttrib4dARB, caps.glVertexAttrib4NubARB, caps.glVertexAttrib1fvARB, caps.glVertexAttrib1svARB, 
			caps.glVertexAttrib1dvARB, caps.glVertexAttrib2fvARB, caps.glVertexAttrib2svARB, caps.glVertexAttrib2dvARB, caps.glVertexAttrib3fvARB, 
			caps.glVertexAttrib3svARB, caps.glVertexAttrib3dvARB, caps.glVertexAttrib4fvARB, caps.glVertexAttrib4svARB, caps.glVertexAttrib4dvARB, 
			caps.glVertexAttrib4ivARB, caps.glVertexAttrib4bvARB, caps.glVertexAttrib4ubvARB, caps.glVertexAttrib4usvARB, caps.glVertexAttrib4uivARB, 
			caps.glVertexAttrib4NbvARB, caps.glVertexAttrib4NsvARB, caps.glVertexAttrib4NivARB, caps.glVertexAttrib4NubvARB, caps.glVertexAttrib4NusvARB, 
			caps.glVertexAttrib4NuivARB, caps.glVertexAttribPointerARB, caps.glEnableVertexAttribArrayARB, caps.glDisableVertexAttribArrayARB, 
			caps.glBindAttribLocationARB, caps.glGetActiveAttribARB, caps.glGetAttribLocationARB, caps.glGetVertexAttribivARB, caps.glGetVertexAttribfvARB, 
			caps.glGetVertexAttribdvARB, caps.glGetVertexAttribPointervARB
		);
	}

	// --- [ glVertexAttrib1fARB ] ---

	/**
	 * Specifies the value of a generic vertex attribute. The y and z components are implicitly set to 0.0f and w to 1.0f.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 */
	public static void glVertexAttrib1fARB(int index, float v0) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib1fARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, v0);
	}

	// --- [ glVertexAttrib1sARB ] ---

	/**
	 * Short version of {@link #glVertexAttrib1fARB VertexAttrib1fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 */
	public static void glVertexAttrib1sARB(int index, short v0) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib1sARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, v0);
	}

	// --- [ glVertexAttrib1dARB ] ---

	/**
	 * Double version of {@link #glVertexAttrib1fARB VertexAttrib1fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v0    the vertex attribute x component
	 */
	public static void glVertexAttrib1dARB(int index, double v0) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib1dARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, v0);
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
		long __functionAddress = GL.getCapabilities().glVertexAttrib2fARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, v0, v1);
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
		long __functionAddress = GL.getCapabilities().glVertexAttrib2sARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, v0, v1);
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
		long __functionAddress = GL.getCapabilities().glVertexAttrib2dARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, v0, v1);
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
		long __functionAddress = GL.getCapabilities().glVertexAttrib3fARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, v0, v1, v2);
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
		long __functionAddress = GL.getCapabilities().glVertexAttrib3sARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, v0, v1, v2);
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
		long __functionAddress = GL.getCapabilities().glVertexAttrib3dARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, v0, v1, v2);
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
		long __functionAddress = GL.getCapabilities().glVertexAttrib4fARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, v0, v1, v2, v3);
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
		long __functionAddress = GL.getCapabilities().glVertexAttrib4sARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, v0, v1, v2, v3);
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
		long __functionAddress = GL.getCapabilities().glVertexAttrib4dARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, v0, v1, v2, v3);
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
		long __functionAddress = GL.getCapabilities().glVertexAttrib4NubARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x, y, z, w);
	}

	// --- [ glVertexAttrib1fvARB ] ---

	/**
	 * Pointer version of {@link #glVertexAttrib1fARB VertexAttrib1fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void nglVertexAttrib1fvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib1fvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib1fARB VertexAttrib1fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib1fvARB(int index, FloatBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 1);
		nglVertexAttrib1fvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib1svARB ] ---

	/**
	 * Pointer version of {@link #glVertexAttrib1sARB VertexAttrib1sARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void nglVertexAttrib1svARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib1svARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib1sARB VertexAttrib1sARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib1svARB(int index, ShortBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 1);
		nglVertexAttrib1svARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib1dvARB ] ---

	/**
	 * Pointer version of {@link #glVertexAttrib1dARB VertexAttrib1dARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void nglVertexAttrib1dvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib1dvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib1dARB VertexAttrib1dARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib1dvARB(int index, DoubleBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 1);
		nglVertexAttrib1dvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib2fvARB ] ---

	/**
	 * Pointer version of {@link #glVertexAttrib2fARB VertexAttrib2fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void nglVertexAttrib2fvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib2fvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib2fARB VertexAttrib2fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib2fvARB(int index, FloatBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 2);
		nglVertexAttrib2fvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib2svARB ] ---

	/**
	 * Pointer version of {@link #glVertexAttrib2sARB VertexAttrib2sARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void nglVertexAttrib2svARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib2svARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib2sARB VertexAttrib2sARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib2svARB(int index, ShortBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 2);
		nglVertexAttrib2svARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib2dvARB ] ---

	/**
	 * Pointer version of {@link #glVertexAttrib2dARB VertexAttrib2dARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void nglVertexAttrib2dvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib2dvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib2dARB VertexAttrib2dARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib2dvARB(int index, DoubleBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 2);
		nglVertexAttrib2dvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib3fvARB ] ---

	/**
	 * Pointer version of {@link #glVertexAttrib3fARB VertexAttrib3fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void nglVertexAttrib3fvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib3fvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib3fARB VertexAttrib3fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib3fvARB(int index, FloatBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglVertexAttrib3fvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib3svARB ] ---

	/**
	 * Pointer version of {@link #glVertexAttrib3sARB VertexAttrib3sARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void nglVertexAttrib3svARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib3svARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib3sARB VertexAttrib3sARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib3svARB(int index, ShortBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglVertexAttrib3svARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib3dvARB ] ---

	/**
	 * Pointer version of {@link #glVertexAttrib3dARB VertexAttrib3dARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void nglVertexAttrib3dvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib3dvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib3dARB VertexAttrib3dARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib3dvARB(int index, DoubleBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglVertexAttrib3dvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4fvARB ] ---

	/**
	 * Pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void nglVertexAttrib4fvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4fvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4fvARB(int index, FloatBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4fvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4svARB ] ---

	/**
	 * Pointer version of {@link #glVertexAttrib4sARB VertexAttrib4sARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void nglVertexAttrib4svARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4svARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib4sARB VertexAttrib4sARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4svARB(int index, ShortBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4svARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4dvARB ] ---

	/**
	 * Pointer version of {@link #glVertexAttrib4dARB VertexAttrib4dARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void nglVertexAttrib4dvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4dvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib4dARB VertexAttrib4dARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4dvARB(int index, DoubleBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4dvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4ivARB ] ---

	/**
	 * Integer pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void nglVertexAttrib4ivARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4ivARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Integer pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4ivARB(int index, IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4ivARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4bvARB ] ---

	/**
	 * Byte pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void nglVertexAttrib4bvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4bvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Byte pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4bvARB(int index, ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4bvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4ubvARB ] ---

	/**
	 * Pointer version of {@link #glVertexAttrib4NubARB VertexAttrib4NubARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void nglVertexAttrib4ubvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4ubvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib4NubARB VertexAttrib4NubARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4ubvARB(int index, ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4ubvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4usvARB ] ---

	/**
	 * Unsigned short pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void nglVertexAttrib4usvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4usvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Unsigned short pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4usvARB(int index, ShortBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4usvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4uivARB ] ---

	/**
	 * Unsigned int pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void nglVertexAttrib4uivARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4uivARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Unsigned int pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4uivARB(int index, IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4uivARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4NbvARB ] ---

	/**
	 * Normalized byte pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void nglVertexAttrib4NbvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4NbvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Normalized byte pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4NbvARB(int index, ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4NbvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4NsvARB ] ---

	/**
	 * Normalized short pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void nglVertexAttrib4NsvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4NsvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Normalized short pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4NsvARB(int index, ShortBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4NsvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4NivARB ] ---

	/**
	 * Normalized int pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void nglVertexAttrib4NivARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4NivARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Normalized int pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4NivARB(int index, IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4NivARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4NubvARB ] ---

	/**
	 * Normalized unsigned byte pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void nglVertexAttrib4NubvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4NubvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Normalized unsigned byte pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4NubvARB(int index, ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4NubvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4NusvARB ] ---

	/**
	 * Normalized unsigned short pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void nglVertexAttrib4NusvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4NusvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Normalized unsigned short pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4NusvARB(int index, ShortBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4NusvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4NuivARB ] ---

	/**
	 * Normalized unsigned int pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void nglVertexAttrib4NuivARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4NuivARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Normalized unsigned int pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttrib4NuivARB(int index, IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4NuivARB(index, memAddress(v));
	}

	// --- [ glVertexAttribPointerARB ] ---

	/**
	 * Specifies the location and organization of a vertex attribute array.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param size       the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
	 * @param type       the data type of each component in the array. The initial value is GL_FLOAT. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL41#GL_FIXED FIXED}</td></tr></table>
	 * @param normalized whether fixed-point data values should be normalized or converted directly as fixed-point values when they are accessed
	 * @param stride     the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
	 *                   the array. The initial value is 0.
	 * @param pointer    the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
	 *                   currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
	 */
	public static void nglVertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, long pointer) {
		long __functionAddress = GL.getCapabilities().glVertexAttribPointerARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, size, type, normalized, stride, pointer);
	}

	/**
	 * Specifies the location and organization of a vertex attribute array.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param size       the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
	 * @param type       the data type of each component in the array. The initial value is GL_FLOAT. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL41#GL_FIXED FIXED}</td></tr></table>
	 * @param normalized whether fixed-point data values should be normalized or converted directly as fixed-point values when they are accessed
	 * @param stride     the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
	 *                   the array. The initial value is 0.
	 * @param pointer    the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
	 *                   currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
	 */
	public static void glVertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, ByteBuffer pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribPointerARB(index, size, type, normalized, stride, memAddress(pointer));
	}

	/**
	 * Specifies the location and organization of a vertex attribute array.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param size       the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
	 * @param type       the data type of each component in the array. The initial value is GL_FLOAT. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL41#GL_FIXED FIXED}</td></tr></table>
	 * @param normalized whether fixed-point data values should be normalized or converted directly as fixed-point values when they are accessed
	 * @param stride     the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
	 *                   the array. The initial value is 0.
	 * @param pointer    the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
	 *                   currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
	 */
	public static void glVertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, long pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, true);
		nglVertexAttribPointerARB(index, size, type, normalized, stride, pointer);
	}

	/** ShortBuffer version of: {@link #glVertexAttribPointerARB VertexAttribPointerARB} */
	public static void glVertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, ShortBuffer pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribPointerARB(index, size, type, normalized, stride, memAddress(pointer));
	}

	/** IntBuffer version of: {@link #glVertexAttribPointerARB VertexAttribPointerARB} */
	public static void glVertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, IntBuffer pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribPointerARB(index, size, type, normalized, stride, memAddress(pointer));
	}

	/** FloatBuffer version of: {@link #glVertexAttribPointerARB VertexAttribPointerARB} */
	public static void glVertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, FloatBuffer pointer) {
		if ( CHECKS )
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
		long __functionAddress = GL.getCapabilities().glEnableVertexAttribArrayARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index);
	}

	// --- [ glDisableVertexAttribArrayARB ] ---

	/**
	 * Disables a generic vertex attribute array.
	 *
	 * @param index the index of the generic vertex attribute to be disabled
	 */
	public static void glDisableVertexAttribArrayARB(int index) {
		long __functionAddress = GL.getCapabilities().glDisableVertexAttribArrayARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index);
	}

	// --- [ glBindAttribLocationARB ] ---

	/**
	 * Associates a generic vertex attribute index with a named attribute variable.
	 *
	 * @param programObj the handle of the program object in which the association is to be made
	 * @param index      the index of the generic vertex attribute to be bound
	 * @param name       a null terminated string containing the name of the vertex shader attribute variable to which {@code index} is to be bound
	 */
	public static void nglBindAttribLocationARB(int programObj, int index, long name) {
		long __functionAddress = GL.getCapabilities().glBindAttribLocationARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, programObj, index, name);
	}

	/**
	 * Associates a generic vertex attribute index with a named attribute variable.
	 *
	 * @param programObj the handle of the program object in which the association is to be made
	 * @param index      the index of the generic vertex attribute to be bound
	 * @param name       a null terminated string containing the name of the vertex shader attribute variable to which {@code index} is to be bound
	 */
	public static void glBindAttribLocationARB(int programObj, int index, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		nglBindAttribLocationARB(programObj, index, memAddress(name));
	}

	/**
	 * Associates a generic vertex attribute index with a named attribute variable.
	 *
	 * @param programObj the handle of the program object in which the association is to be made
	 * @param index      the index of the generic vertex attribute to be bound
	 * @param name       a null terminated string containing the name of the vertex shader attribute variable to which {@code index} is to be bound
	 */
	public static void glBindAttribLocationARB(int programObj, int index, CharSequence name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.ASCII(name);
			nglBindAttribLocationARB(programObj, index, memAddress(nameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetActiveAttribARB ] ---

	/**
	 * Returns information about an active attribute variable for the specified program object.
	 *
	 * @param programObj the program object to be queried
	 * @param index      the index of the attribute variable to be queried
	 * @param maxLength  the maximum number of characters OpenGL is allowed to write in the character buffer indicated by {@code name}
	 * @param length     the number of characters actually written by OpenGL in the string indicated by {@code name} (excluding the null terminator) if a value other than
	 *                   {@code NULL} is passed
	 * @param size       the size of the attribute variable
	 * @param type       the data type of the attribute variable
	 * @param name       a null terminated string containing the name of the attribute variable
	 */
	public static void nglGetActiveAttribARB(int programObj, int index, int maxLength, long length, long size, long type, long name) {
		long __functionAddress = GL.getCapabilities().glGetActiveAttribARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPPV(__functionAddress, programObj, index, maxLength, length, size, type, name);
	}

	/**
	 * Returns information about an active attribute variable for the specified program object.
	 *
	 * @param programObj the program object to be queried
	 * @param index      the index of the attribute variable to be queried
	 * @param length     the number of characters actually written by OpenGL in the string indicated by {@code name} (excluding the null terminator) if a value other than
	 *                   {@code NULL} is passed
	 * @param size       the size of the attribute variable
	 * @param type       the data type of the attribute variable
	 * @param name       a null terminated string containing the name of the attribute variable
	 */
	public static void glGetActiveAttribARB(int programObj, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
		if ( CHECKS ) {
			if ( length != null ) checkBuffer(length, 1);
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		nglGetActiveAttribARB(programObj, index, name.remaining(), memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
	}

	/**
	 * Returns information about an active attribute variable for the specified program object.
	 *
	 * @param programObj the program object to be queried
	 * @param index      the index of the attribute variable to be queried
	 * @param maxLength  the maximum number of characters OpenGL is allowed to write in the character buffer indicated by {@code name}
	 * @param size       the size of the attribute variable
	 * @param type       the data type of the attribute variable
	 */
	public static String glGetActiveAttribARB(int programObj, int index, int maxLength, IntBuffer size, IntBuffer type) {
		if ( CHECKS ) {
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer name = stack.malloc(maxLength);
			nglGetActiveAttribARB(programObj, index, maxLength, memAddress(length), memAddress(size), memAddress(type), memAddress(name));
			return memASCII(name, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/**
	 * Returns information about an active attribute variable for the specified program object.
	 *
	 * @param programObj the program object to be queried
	 * @param index      the index of the attribute variable to be queried
	 * @param size       the size of the attribute variable
	 * @param type       the data type of the attribute variable
	 */
	public static String glGetActiveAttribARB(int programObj, int index, IntBuffer size, IntBuffer type) {
		int maxLength = ARBShaderObjects.glGetObjectParameteriARB(programObj, GL_OBJECT_ACTIVE_ATTRIBUTE_MAX_LENGTH_ARB);
		if ( CHECKS ) {
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer length = stack.ints(0);
			ByteBuffer name = stack.malloc(maxLength);
			nglGetActiveAttribARB(programObj, index, maxLength, memAddress(length), memAddress(size), memAddress(type), memAddress(name));
			return memASCII(name, length.get(0));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetAttribLocationARB ] ---

	/**
	 * Returns the location of an attribute variable.
	 *
	 * @param programObj the program object to be queried
	 * @param name       a null terminated string containing the name of the attribute variable whose location is to be queried
	 */
	public static int nglGetAttribLocationARB(int programObj, long name) {
		long __functionAddress = GL.getCapabilities().glGetAttribLocationARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPI(__functionAddress, programObj, name);
	}

	/**
	 * Returns the location of an attribute variable.
	 *
	 * @param programObj the program object to be queried
	 * @param name       a null terminated string containing the name of the attribute variable whose location is to be queried
	 */
	public static int glGetAttribLocationARB(int programObj, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nglGetAttribLocationARB(programObj, memAddress(name));
	}

	/**
	 * Returns the location of an attribute variable.
	 *
	 * @param programObj the program object to be queried
	 * @param name       a null terminated string containing the name of the attribute variable whose location is to be queried
	 */
	public static int glGetAttribLocationARB(int programObj, CharSequence name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.ASCII(name);
			return nglGetAttribLocationARB(programObj, memAddress(nameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetVertexAttribivARB ] ---

	/**
	 * Returns the integer value of a generic vertex attribute parameter.
	 *
	 * @param index  the generic vertex attribute parameter to be queried
	 * @param pname  the symbolic name of the vertex attribute parameter to be queried. One of:<br><table><tr><td>{@link GL15#GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING VERTEX_ATTRIB_ARRAY_BUFFER_BINDING}</td><td>{@link #GL_VERTEX_ATTRIB_ARRAY_ENABLED_ARB VERTEX_ATTRIB_ARRAY_ENABLED_ARB}</td></tr><tr><td>{@link #GL_VERTEX_ATTRIB_ARRAY_SIZE_ARB VERTEX_ATTRIB_ARRAY_SIZE_ARB}</td><td>{@link #GL_VERTEX_ATTRIB_ARRAY_STRIDE_ARB VERTEX_ATTRIB_ARRAY_STRIDE_ARB}</td></tr><tr><td>{@link #GL_VERTEX_ATTRIB_ARRAY_TYPE_ARB VERTEX_ATTRIB_ARRAY_TYPE_ARB}</td><td>{@link #GL_VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB}</td></tr><tr><td>{@link #GL_CURRENT_VERTEX_ATTRIB_ARB CURRENT_VERTEX_ATTRIB_ARB}</td><td>{@link GL30#GL_VERTEX_ATTRIB_ARRAY_INTEGER VERTEX_ATTRIB_ARRAY_INTEGER}</td></tr><tr><td>{@link GL33#GL_VERTEX_ATTRIB_ARRAY_DIVISOR VERTEX_ATTRIB_ARRAY_DIVISOR}</td></tr></table>
	 * @param params returns the requested data
	 */
	public static void nglGetVertexAttribivARB(int index, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetVertexAttribivARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, pname, params);
	}

	/**
	 * Returns the integer value of a generic vertex attribute parameter.
	 *
	 * @param index  the generic vertex attribute parameter to be queried
	 * @param pname  the symbolic name of the vertex attribute parameter to be queried. One of:<br><table><tr><td>{@link GL15#GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING VERTEX_ATTRIB_ARRAY_BUFFER_BINDING}</td><td>{@link #GL_VERTEX_ATTRIB_ARRAY_ENABLED_ARB VERTEX_ATTRIB_ARRAY_ENABLED_ARB}</td></tr><tr><td>{@link #GL_VERTEX_ATTRIB_ARRAY_SIZE_ARB VERTEX_ATTRIB_ARRAY_SIZE_ARB}</td><td>{@link #GL_VERTEX_ATTRIB_ARRAY_STRIDE_ARB VERTEX_ATTRIB_ARRAY_STRIDE_ARB}</td></tr><tr><td>{@link #GL_VERTEX_ATTRIB_ARRAY_TYPE_ARB VERTEX_ATTRIB_ARRAY_TYPE_ARB}</td><td>{@link #GL_VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB}</td></tr><tr><td>{@link #GL_CURRENT_VERTEX_ATTRIB_ARB CURRENT_VERTEX_ATTRIB_ARB}</td><td>{@link GL30#GL_VERTEX_ATTRIB_ARRAY_INTEGER VERTEX_ATTRIB_ARRAY_INTEGER}</td></tr><tr><td>{@link GL33#GL_VERTEX_ATTRIB_ARRAY_DIVISOR VERTEX_ATTRIB_ARRAY_DIVISOR}</td></tr></table>
	 * @param params returns the requested data
	 */
	public static void glGetVertexAttribivARB(int index, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetVertexAttribivARB(index, pname, memAddress(params));
	}

	/**
	 * Returns the integer value of a generic vertex attribute parameter.
	 *
	 * @param index the generic vertex attribute parameter to be queried
	 * @param pname the symbolic name of the vertex attribute parameter to be queried. One of:<br><table><tr><td>{@link GL15#GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING VERTEX_ATTRIB_ARRAY_BUFFER_BINDING}</td><td>{@link #GL_VERTEX_ATTRIB_ARRAY_ENABLED_ARB VERTEX_ATTRIB_ARRAY_ENABLED_ARB}</td></tr><tr><td>{@link #GL_VERTEX_ATTRIB_ARRAY_SIZE_ARB VERTEX_ATTRIB_ARRAY_SIZE_ARB}</td><td>{@link #GL_VERTEX_ATTRIB_ARRAY_STRIDE_ARB VERTEX_ATTRIB_ARRAY_STRIDE_ARB}</td></tr><tr><td>{@link #GL_VERTEX_ATTRIB_ARRAY_TYPE_ARB VERTEX_ATTRIB_ARRAY_TYPE_ARB}</td><td>{@link #GL_VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB}</td></tr><tr><td>{@link #GL_CURRENT_VERTEX_ATTRIB_ARB CURRENT_VERTEX_ATTRIB_ARB}</td><td>{@link GL30#GL_VERTEX_ATTRIB_ARRAY_INTEGER VERTEX_ATTRIB_ARRAY_INTEGER}</td></tr><tr><td>{@link GL33#GL_VERTEX_ATTRIB_ARRAY_DIVISOR VERTEX_ATTRIB_ARRAY_DIVISOR}</td></tr></table>
	 */
	public static int glGetVertexAttribiARB(int index, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetVertexAttribivARB(index, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetVertexAttribfvARB ] ---

	/**
	 * Float version of {@link #glGetVertexAttribivARB GetVertexAttribivARB}.
	 *
	 * @param index  the generic vertex attribute parameter to be queried
	 * @param pname  the symbolic name of the vertex attribute parameter to be queried
	 * @param params returns the requested data
	 */
	public static void nglGetVertexAttribfvARB(int index, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetVertexAttribfvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, pname, params);
	}

	/**
	 * Float version of {@link #glGetVertexAttribivARB GetVertexAttribivARB}.
	 *
	 * @param index  the generic vertex attribute parameter to be queried
	 * @param pname  the symbolic name of the vertex attribute parameter to be queried
	 * @param params returns the requested data
	 */
	public static void glGetVertexAttribfvARB(int index, int pname, FloatBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 4);
		nglGetVertexAttribfvARB(index, pname, memAddress(params));
	}

	// --- [ glGetVertexAttribdvARB ] ---

	/**
	 * Double version of {@link #glGetVertexAttribivARB GetVertexAttribivARB}.
	 *
	 * @param index  the generic vertex attribute parameter to be queried
	 * @param pname  the symbolic name of the vertex attribute parameter to be queried
	 * @param params returns the requested data
	 */
	public static void nglGetVertexAttribdvARB(int index, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetVertexAttribdvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, pname, params);
	}

	/**
	 * Double version of {@link #glGetVertexAttribivARB GetVertexAttribivARB}.
	 *
	 * @param index  the generic vertex attribute parameter to be queried
	 * @param pname  the symbolic name of the vertex attribute parameter to be queried
	 * @param params returns the requested data
	 */
	public static void glGetVertexAttribdvARB(int index, int pname, DoubleBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 4);
		nglGetVertexAttribdvARB(index, pname, memAddress(params));
	}

	// --- [ glGetVertexAttribPointervARB ] ---

	/**
	 * Returns the address of the specified generic vertex attribute pointer.
	 *
	 * @param index   the generic vertex attribute parameter to be queried
	 * @param pname   the symbolic name of the generic vertex attribute parameter to be returned. Must be:<br><table><tr><td>{@link #GL_VERTEX_ATTRIB_ARRAY_POINTER_ARB VERTEX_ATTRIB_ARRAY_POINTER_ARB}</td></tr></table>
	 * @param pointer the pointer value
	 */
	public static void nglGetVertexAttribPointervARB(int index, int pname, long pointer) {
		long __functionAddress = GL.getCapabilities().glGetVertexAttribPointervARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, pname, pointer);
	}

	/**
	 * Returns the address of the specified generic vertex attribute pointer.
	 *
	 * @param index   the generic vertex attribute parameter to be queried
	 * @param pname   the symbolic name of the generic vertex attribute parameter to be returned. Must be:<br><table><tr><td>{@link #GL_VERTEX_ATTRIB_ARRAY_POINTER_ARB VERTEX_ATTRIB_ARRAY_POINTER_ARB}</td></tr></table>
	 * @param pointer the pointer value
	 */
	public static void glGetVertexAttribPointervARB(int index, int pname, PointerBuffer pointer) {
		if ( CHECKS )
			checkBuffer(pointer, 1);
		nglGetVertexAttribPointervARB(index, pname, memAddress(pointer));
	}

	/**
	 * Returns the address of the specified generic vertex attribute pointer.
	 *
	 * @param index the generic vertex attribute parameter to be queried
	 * @param pname the symbolic name of the generic vertex attribute parameter to be returned. Must be:<br><table><tr><td>{@link #GL_VERTEX_ATTRIB_ARRAY_POINTER_ARB VERTEX_ATTRIB_ARRAY_POINTER_ARB}</td></tr></table>
	 */
	public static long glGetVertexAttribPointerARB(int index, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			PointerBuffer pointer = stack.callocPointer(1);
			nglGetVertexAttribPointervARB(index, pname, memAddress(pointer));
			return pointer.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #glVertexAttrib1fvARB VertexAttrib1fvARB} */
	public static void glVertexAttrib1fvARB(int index, float[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib1fvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttrib1svARB VertexAttrib1svARB} */
	public static void glVertexAttrib1svARB(int index, short[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib1svARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttrib1dvARB VertexAttrib1dvARB} */
	public static void glVertexAttrib1dvARB(int index, double[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib1dvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttrib2fvARB VertexAttrib2fvARB} */
	public static void glVertexAttrib2fvARB(int index, float[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib2fvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttrib2svARB VertexAttrib2svARB} */
	public static void glVertexAttrib2svARB(int index, short[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib2svARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttrib2dvARB VertexAttrib2dvARB} */
	public static void glVertexAttrib2dvARB(int index, double[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib2dvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttrib3fvARB VertexAttrib3fvARB} */
	public static void glVertexAttrib3fvARB(int index, float[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib3fvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttrib3svARB VertexAttrib3svARB} */
	public static void glVertexAttrib3svARB(int index, short[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib3svARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttrib3dvARB VertexAttrib3dvARB} */
	public static void glVertexAttrib3dvARB(int index, double[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib3dvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttrib4fvARB VertexAttrib4fvARB} */
	public static void glVertexAttrib4fvARB(int index, float[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4fvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttrib4svARB VertexAttrib4svARB} */
	public static void glVertexAttrib4svARB(int index, short[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4svARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttrib4dvARB VertexAttrib4dvARB} */
	public static void glVertexAttrib4dvARB(int index, double[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4dvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttrib4ivARB VertexAttrib4ivARB} */
	public static void glVertexAttrib4ivARB(int index, int[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4ivARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttrib4usvARB VertexAttrib4usvARB} */
	public static void glVertexAttrib4usvARB(int index, short[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4usvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttrib4uivARB VertexAttrib4uivARB} */
	public static void glVertexAttrib4uivARB(int index, int[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4uivARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttrib4NsvARB VertexAttrib4NsvARB} */
	public static void glVertexAttrib4NsvARB(int index, short[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4NsvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttrib4NivARB VertexAttrib4NivARB} */
	public static void glVertexAttrib4NivARB(int index, int[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4NivARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttrib4NusvARB VertexAttrib4NusvARB} */
	public static void glVertexAttrib4NusvARB(int index, short[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4NusvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttrib4NuivARB VertexAttrib4NuivARB} */
	public static void glVertexAttrib4NuivARB(int index, int[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4NuivARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		callPV(__functionAddress, index, v);
	}

	/** short[] version of: {@link #glVertexAttribPointerARB VertexAttribPointerARB} */
	public static void glVertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, short[] pointer) {
		long __functionAddress = GL.getCapabilities().glVertexAttribPointerARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, index, size, type, normalized, stride, pointer);
	}

	/** int[] version of: {@link #glVertexAttribPointerARB VertexAttribPointerARB} */
	public static void glVertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, int[] pointer) {
		long __functionAddress = GL.getCapabilities().glVertexAttribPointerARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, index, size, type, normalized, stride, pointer);
	}

	/** float[] version of: {@link #glVertexAttribPointerARB VertexAttribPointerARB} */
	public static void glVertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, float[] pointer) {
		long __functionAddress = GL.getCapabilities().glVertexAttribPointerARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, index, size, type, normalized, stride, pointer);
	}

	/** Array version of: {@link #glGetActiveAttribARB GetActiveAttribARB} */
	public static void glGetActiveAttribARB(int programObj, int index, int[] length, int[] size, int[] type, ByteBuffer name) {
		long __functionAddress = GL.getCapabilities().glGetActiveAttribARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( length != null ) checkBuffer(length, 1);
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		callPPPPV(__functionAddress, programObj, index, name.remaining(), length, size, type, memAddress(name));
	}

	/** Array version of: {@link #glGetVertexAttribivARB GetVertexAttribivARB} */
	public static void glGetVertexAttribivARB(int index, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetVertexAttribivARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, index, pname, params);
	}

	/** Array version of: {@link #glGetVertexAttribfvARB GetVertexAttribfvARB} */
	public static void glGetVertexAttribfvARB(int index, int pname, float[] params) {
		long __functionAddress = GL.getCapabilities().glGetVertexAttribfvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		callPV(__functionAddress, index, pname, params);
	}

	/** Array version of: {@link #glGetVertexAttribdvARB GetVertexAttribdvARB} */
	public static void glGetVertexAttribdvARB(int index, int pname, double[] params) {
		long __functionAddress = GL.getCapabilities().glGetVertexAttribdvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		callPV(__functionAddress, index, pname, params);
	}

}