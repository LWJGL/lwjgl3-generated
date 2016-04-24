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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/vertex_program.txt">ARB_vertex_program</a> extension.
 * 
 * <p>Unextended OpenGL mandates a certain set of configurable per-vertex computations defining vertex transformation, texture coordinate generation and
 * transformation, and lighting. Several extensions have added further per-vertex computations to OpenGL. For example, extensions have defined new texture
 * coordinate generation modes ({@link ARBTextureCubeMap ARB_texture_cube_map}, <a href="http://www.opengl.org/registry/specs/NV/texgen_reflection.txt">NV_texgen_reflection</a>, <a href="http://www.opengl.org/registry/specs/NV/texgen_emboss.txt">NV_texgen_emboss</a>),
 * new vertex transformation modes ({@link ARBVertexBlend ARB_vertex_blend}, <a href="http://www.opengl.org/registry/specs/EXT/vertex_weighting.txt">EXT_vertex_weighting</a>), new lighting modes (OpenGL 1.2's separate
 * specular and rescale normal functionality), several modes for fog distance generation (<a href="http://www.opengl.org/registry/specs/NV/fog_distance.txt">NV_fog_distance</a>), and eye-distance point
 * size attenuation ({@link ARBPointParameters ARB_point_parameters}).</p>
 * 
 * <p>Each such extension adds a small set of relatively inflexible per-vertex computations.</p>
 * 
 * <p>This inflexibility is in contrast to the typical flexibility provided by the underlying programmable floating point engines (whether micro-coded vertex
 * engines, DSPs, or CPUs) that are traditionally used to implement OpenGL's per-vertex computations. The purpose of this extension is to expose to the
 * OpenGL application writer a significant degree of per-vertex programmability for computing vertex parameters.</p>
 * 
 * <p>For the purposes of discussing this extension, a vertex program is a sequence of floating-point 4-component vector operations that determines how a set
 * of program parameters (defined outside of OpenGL's {@link GL11#glBegin Begin}/{@link GL11#glEnd End} pair) and an input set of per-vertex parameters are transformed to a set of
 * per-vertex result parameters.</p>
 * 
 * <p>The per-vertex computations for standard OpenGL given a particular set of lighting and texture coordinate generation modes (along with any state for
 * extensions defining per-vertex computations) is, in essence, a vertex program. However, the sequence of operations is defined implicitly by the current
 * OpenGL state settings rather than defined explicitly as a sequence of instructions.</p>
 * 
 * <p>This extension provides an explicit mechanism for defining vertex program instruction sequences for application-defined vertex programs. In order to
 * define such vertex programs, this extension defines a vertex programming model including a floating-point 4-component vector instruction set and a
 * relatively large set of floating-point 4-component registers.</p>
 * 
 * <p>The extension's vertex programming model is designed for efficient hardware implementation and to support a wide variety of vertex programs. By design,
 * the entire set of existing vertex programs defined by existing OpenGL per-vertex computation extensions can be implemented using the extension's vertex
 * programming model.</p>
 */
public class ARBVertexProgram {

	/**
	 * Accepted by the {@code cap} parameter of Disable, Enable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev, and by the {@code target} parameter of ProgramStringARB, BindProgramARB, ProgramEnvParameter4[df][v]ARB, ProgramLocalParameter4[df][v]ARB,
	 * GetProgramEnvParameter[df]vARB, GetProgramLocalParameter[df]vARB, GetProgramivARB, and GetProgramStringARB.
	 */
	public static final int GL_VERTEX_PROGRAM_ARB = 0x8620;

	/**
	 * Accepted by the {@code cap} parameter of Disable, Enable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetDoublev.
	 */
	public static final int
		GL_VERTEX_PROGRAM_POINT_SIZE_ARB = 0x8642,
		GL_VERTEX_PROGRAM_TWO_SIDE_ARB   = 0x8643,
		GL_COLOR_SUM_ARB                 = 0x8458;

	/** Accepted by the {@code format} parameter of ProgramStringARB. */
	public static final int GL_PROGRAM_FORMAT_ASCII_ARB = 0x8875;

	/** Accepted by the {@code pname} parameter of GetVertexAttrib[dfi]vARB. */
	public static final int
		GL_VERTEX_ATTRIB_ARRAY_ENABLED_ARB    = 0x8622,
		GL_VERTEX_ATTRIB_ARRAY_SIZE_ARB       = 0x8623,
		GL_VERTEX_ATTRIB_ARRAY_STRIDE_ARB     = 0x8624,
		GL_VERTEX_ATTRIB_ARRAY_TYPE_ARB       = 0x8625,
		GL_VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB = 0x886A,
		GL_CURRENT_VERTEX_ATTRIB_ARB          = 0x8626;

	/** Accepted by the {@code pname} parameter of GetVertexAttribPointervARB. */
	public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER_ARB = 0x8645;

	/** Accepted by the {@code pname} parameter of GetProgramivARB. */
	public static final int
		GL_PROGRAM_LENGTH_ARB                       = 0x8627,
		GL_PROGRAM_FORMAT_ARB                       = 0x8876,
		GL_PROGRAM_BINDING_ARB                      = 0x8677,
		GL_PROGRAM_INSTRUCTIONS_ARB                 = 0x88A0,
		GL_MAX_PROGRAM_INSTRUCTIONS_ARB             = 0x88A1,
		GL_PROGRAM_NATIVE_INSTRUCTIONS_ARB          = 0x88A2,
		GL_MAX_PROGRAM_NATIVE_INSTRUCTIONS_ARB      = 0x88A3,
		GL_PROGRAM_TEMPORARIES_ARB                  = 0x88A4,
		GL_MAX_PROGRAM_TEMPORARIES_ARB              = 0x88A5,
		GL_PROGRAM_NATIVE_TEMPORARIES_ARB           = 0x88A6,
		GL_MAX_PROGRAM_NATIVE_TEMPORARIES_ARB       = 0x88A7,
		GL_PROGRAM_PARAMETERS_ARB                   = 0x88A8,
		GL_MAX_PROGRAM_PARAMETERS_ARB               = 0x88A9,
		GL_PROGRAM_NATIVE_PARAMETERS_ARB            = 0x88AA,
		GL_MAX_PROGRAM_NATIVE_PARAMETERS_ARB        = 0x88AB,
		GL_PROGRAM_ATTRIBS_ARB                      = 0x88AC,
		GL_MAX_PROGRAM_ATTRIBS_ARB                  = 0x88AD,
		GL_PROGRAM_NATIVE_ATTRIBS_ARB               = 0x88AE,
		GL_MAX_PROGRAM_NATIVE_ATTRIBS_ARB           = 0x88AF,
		GL_PROGRAM_ADDRESS_REGISTERS_ARB            = 0x88B0,
		GL_MAX_PROGRAM_ADDRESS_REGISTERS_ARB        = 0x88B1,
		GL_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB     = 0x88B2,
		GL_MAX_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB = 0x88B3,
		GL_MAX_PROGRAM_LOCAL_PARAMETERS_ARB         = 0x88B4,
		GL_MAX_PROGRAM_ENV_PARAMETERS_ARB           = 0x88B5,
		GL_PROGRAM_UNDER_NATIVE_LIMITS_ARB          = 0x88B6;

	/** Accepted by the {@code pname} parameter of GetProgramStringARB. */
	public static final int GL_PROGRAM_STRING_ARB = 0x8628;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_PROGRAM_ERROR_POSITION_ARB         = 0x864B,
		GL_CURRENT_MATRIX_ARB                 = 0x8641,
		GL_TRANSPOSE_CURRENT_MATRIX_ARB       = 0x88B7,
		GL_CURRENT_MATRIX_STACK_DEPTH_ARB     = 0x8640,
		GL_MAX_VERTEX_ATTRIBS_ARB             = 0x8869,
		GL_MAX_PROGRAM_MATRICES_ARB           = 0x862F,
		GL_MAX_PROGRAM_MATRIX_STACK_DEPTH_ARB = 0x862E;

	/** Accepted by the {@code name} parameter of GetString. */
	public static final int GL_PROGRAM_ERROR_STRING_ARB = 0x8874;

	/** Accepted by the {@code mode} parameter of MatrixMode. */
	public static final int
		GL_MATRIX0_ARB  = 0x88C0,
		GL_MATRIX1_ARB  = 0x88C1,
		GL_MATRIX2_ARB  = 0x88C2,
		GL_MATRIX3_ARB  = 0x88C3,
		GL_MATRIX4_ARB  = 0x88C4,
		GL_MATRIX5_ARB  = 0x88C5,
		GL_MATRIX6_ARB  = 0x88C6,
		GL_MATRIX7_ARB  = 0x88C7,
		GL_MATRIX8_ARB  = 0x88C8,
		GL_MATRIX9_ARB  = 0x88C9,
		GL_MATRIX10_ARB = 0x88CA,
		GL_MATRIX11_ARB = 0x88CB,
		GL_MATRIX12_ARB = 0x88CC,
		GL_MATRIX13_ARB = 0x88CD,
		GL_MATRIX14_ARB = 0x88CE,
		GL_MATRIX15_ARB = 0x88CF,
		GL_MATRIX16_ARB = 0x88D0,
		GL_MATRIX17_ARB = 0x88D1,
		GL_MATRIX18_ARB = 0x88D2,
		GL_MATRIX19_ARB = 0x88D3,
		GL_MATRIX20_ARB = 0x88D4,
		GL_MATRIX21_ARB = 0x88D5,
		GL_MATRIX22_ARB = 0x88D6,
		GL_MATRIX23_ARB = 0x88D7,
		GL_MATRIX24_ARB = 0x88D8,
		GL_MATRIX25_ARB = 0x88D9,
		GL_MATRIX26_ARB = 0x88DA,
		GL_MATRIX27_ARB = 0x88DB,
		GL_MATRIX28_ARB = 0x88DC,
		GL_MATRIX29_ARB = 0x88DD,
		GL_MATRIX30_ARB = 0x88DE,
		GL_MATRIX31_ARB = 0x88DF;

	protected ARBVertexProgram() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glVertexAttrib1sARB, caps.glVertexAttrib1fARB, caps.glVertexAttrib1dARB, caps.glVertexAttrib2sARB, caps.glVertexAttrib2fARB, 
			caps.glVertexAttrib2dARB, caps.glVertexAttrib3sARB, caps.glVertexAttrib3fARB, caps.glVertexAttrib3dARB, caps.glVertexAttrib4sARB, 
			caps.glVertexAttrib4fARB, caps.glVertexAttrib4dARB, caps.glVertexAttrib4NubARB, caps.glVertexAttrib1svARB, caps.glVertexAttrib1fvARB, 
			caps.glVertexAttrib1dvARB, caps.glVertexAttrib2svARB, caps.glVertexAttrib2fvARB, caps.glVertexAttrib2dvARB, caps.glVertexAttrib3svARB, 
			caps.glVertexAttrib3fvARB, caps.glVertexAttrib3dvARB, caps.glVertexAttrib4fvARB, caps.glVertexAttrib4bvARB, caps.glVertexAttrib4svARB, 
			caps.glVertexAttrib4ivARB, caps.glVertexAttrib4ubvARB, caps.glVertexAttrib4usvARB, caps.glVertexAttrib4uivARB, caps.glVertexAttrib4dvARB, 
			caps.glVertexAttrib4NbvARB, caps.glVertexAttrib4NsvARB, caps.glVertexAttrib4NivARB, caps.glVertexAttrib4NubvARB, caps.glVertexAttrib4NusvARB, 
			caps.glVertexAttrib4NuivARB, caps.glVertexAttribPointerARB, caps.glEnableVertexAttribArrayARB, caps.glDisableVertexAttribArrayARB, 
			caps.glProgramStringARB, caps.glBindProgramARB, caps.glDeleteProgramsARB, caps.glGenProgramsARB, caps.glProgramEnvParameter4dARB, 
			caps.glProgramEnvParameter4dvARB, caps.glProgramEnvParameter4fARB, caps.glProgramEnvParameter4fvARB, caps.glProgramLocalParameter4dARB, 
			caps.glProgramLocalParameter4dvARB, caps.glProgramLocalParameter4fARB, caps.glProgramLocalParameter4fvARB, caps.glGetProgramEnvParameterfvARB, 
			caps.glGetProgramEnvParameterdvARB, caps.glGetProgramLocalParameterfvARB, caps.glGetProgramLocalParameterdvARB, caps.glGetProgramivARB, 
			caps.glGetProgramStringARB, caps.glGetVertexAttribfvARB, caps.glGetVertexAttribdvARB, caps.glGetVertexAttribivARB, 
			caps.glGetVertexAttribPointervARB, caps.glIsProgramARB
		);
	}

	// --- [ glVertexAttrib1sARB ] ---

	/**
	 * Short version of {@link #glVertexAttrib1fARB VertexAttrib1fARB}
	 *
	 * @param index the vertex attribute index
	 * @param x     the {@code x} attribute component
	 */
	public static void glVertexAttrib1sARB(int index, short x) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib1sARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x);
	}

	// --- [ glVertexAttrib1fARB ] ---

	/**
	 * Specifies the {@code x} component of the current vertex attribute numbered {@code index}. Components {@code y} and {@code z} are set to 0 and {@code w} to 1.
	 *
	 * @param index the vertex attribute index
	 * @param x     the {@code x} attribute component
	 */
	public static void glVertexAttrib1fARB(int index, float x) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib1fARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x);
	}

	// --- [ glVertexAttrib1dARB ] ---

	/**
	 * Double version of {@link #glVertexAttrib1fARB VertexAttrib1fARB}
	 *
	 * @param index the vertex attribute index
	 * @param x     the {@code x} attribute component
	 */
	public static void glVertexAttrib1dARB(int index, double x) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib1dARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x);
	}

	// --- [ glVertexAttrib2sARB ] ---

	/**
	 * Short version of {@link #glVertexAttrib2fARB VertexAttrib2fARB}
	 *
	 * @param index the vertex attribute index
	 * @param x     the {@code x} attribute component
	 * @param y     the {@code y} attribute component
	 */
	public static void glVertexAttrib2sARB(int index, short x, short y) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib2sARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x, y);
	}

	// --- [ glVertexAttrib2fARB ] ---

	/**
	 * Specifies the {@code x} and {@code y} components of the current vertex attribute numbered {@code index}. Component {@code z} is set to 0 and {@code w} to 1.
	 *
	 * @param index the vertex attribute index
	 * @param x     the {@code x} attribute component
	 * @param y     the {@code y} attribute component
	 */
	public static void glVertexAttrib2fARB(int index, float x, float y) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib2fARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x, y);
	}

	// --- [ glVertexAttrib2dARB ] ---

	/**
	 * Double version of {@link #glVertexAttrib2fARB VertexAttrib2fARB}
	 *
	 * @param index the vertex attribute index
	 * @param x     the {@code x} attribute component
	 * @param y     the {@code y} attribute component
	 */
	public static void glVertexAttrib2dARB(int index, double x, double y) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib2dARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x, y);
	}

	// --- [ glVertexAttrib3sARB ] ---

	/**
	 * Short version of {@link #glVertexAttrib3fARB VertexAttrib3fARB}
	 *
	 * @param index the vertex attribute index
	 * @param x     the {@code x} attribute component
	 * @param y     the {@code y} attribute component
	 * @param z     the {@code z} attribute component
	 */
	public static void glVertexAttrib3sARB(int index, short x, short y, short z) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib3sARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x, y, z);
	}

	// --- [ glVertexAttrib3fARB ] ---

	/**
	 * Specifies the {@code x}, {@code y} and {@code z} components of the current vertex attribute numbered {@code index}. Component {@code w} is set to 1.
	 *
	 * @param index the vertex attribute index
	 * @param x     the {@code x} attribute component
	 * @param y     the {@code y} attribute component
	 * @param z     the {@code z} attribute component
	 */
	public static void glVertexAttrib3fARB(int index, float x, float y, float z) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib3fARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x, y, z);
	}

	// --- [ glVertexAttrib3dARB ] ---

	/**
	 * Double version of {@link #glVertexAttrib3fARB VertexAttrib3fARB}
	 *
	 * @param index the vertex attribute index
	 * @param x     the {@code x} attribute component
	 * @param y     the {@code y} attribute component
	 * @param z     the {@code z} attribute component
	 */
	public static void glVertexAttrib3dARB(int index, double x, double y, double z) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib3dARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x, y, z);
	}

	// --- [ glVertexAttrib4sARB ] ---

	/**
	 * Short version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}
	 *
	 * @param index the vertex attribute index
	 * @param x     the {@code x} attribute component
	 * @param y     the {@code y} attribute component
	 * @param z     the {@code z} attribute component
	 * @param w     the {@code w} attribute component
	 */
	public static void glVertexAttrib4sARB(int index, short x, short y, short z, short w) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4sARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x, y, z, w);
	}

	// --- [ glVertexAttrib4fARB ] ---

	/**
	 * Specifies the current vertex attribute numbered {@code index}.
	 *
	 * @param index the vertex attribute index
	 * @param x     the {@code x} attribute component
	 * @param y     the {@code y} attribute component
	 * @param z     the {@code z} attribute component
	 * @param w     the {@code w} attribute component
	 */
	public static void glVertexAttrib4fARB(int index, float x, float y, float z, float w) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4fARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x, y, z, w);
	}

	// --- [ glVertexAttrib4dARB ] ---

	/**
	 * Double version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}
	 *
	 * @param index the vertex attribute index
	 * @param x     the {@code x} attribute component
	 * @param y     the {@code y} attribute component
	 * @param z     the {@code z} attribute component
	 * @param w     the {@code w} attribute component
	 */
	public static void glVertexAttrib4dARB(int index, double x, double y, double z, double w) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4dARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x, y, z, w);
	}

	// --- [ glVertexAttrib4NubARB ] ---

	/**
	 * Fixed-point unsigned byte version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}
	 *
	 * @param index the vertex attribute index
	 * @param x     the {@code x} attribute component
	 * @param y     the {@code y} attribute component
	 * @param z     the {@code z} attribute component
	 * @param w     the {@code w} attribute component
	 */
	public static void glVertexAttrib4NubARB(int index, byte x, byte y, byte z, byte w) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4NubARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x, y, z, w);
	}

	// --- [ glVertexAttrib1svARB ] ---

	/**
	 * Pointer version of {@link #glVertexAttrib1sARB VertexAttrib1sARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void nglVertexAttrib1svARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib1svARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib1sARB VertexAttrib1sARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void glVertexAttrib1svARB(int index, ShortBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 1);
		nglVertexAttrib1svARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib1fvARB ] ---

	/**
	 * Pointer version of {@link #glVertexAttrib1fARB VertexAttrib1fARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void nglVertexAttrib1fvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib1fvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib1fARB VertexAttrib1fARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void glVertexAttrib1fvARB(int index, FloatBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 1);
		nglVertexAttrib1fvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib1dvARB ] ---

	/**
	 * Pointer version of {@link #glVertexAttrib1dARB VertexAttrib1dARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void nglVertexAttrib1dvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib1dvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib1dARB VertexAttrib1dARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void glVertexAttrib1dvARB(int index, DoubleBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 1);
		nglVertexAttrib1dvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib2svARB ] ---

	/**
	 * Pointer version of {@link #glVertexAttrib2sARB VertexAttrib2sARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void nglVertexAttrib2svARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib2svARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib2sARB VertexAttrib2sARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void glVertexAttrib2svARB(int index, ShortBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 2);
		nglVertexAttrib2svARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib2fvARB ] ---

	/**
	 * Pointer version of {@link #glVertexAttrib2fARB VertexAttrib2fARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void nglVertexAttrib2fvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib2fvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib2fARB VertexAttrib2fARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void glVertexAttrib2fvARB(int index, FloatBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 2);
		nglVertexAttrib2fvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib2dvARB ] ---

	/**
	 * Pointer version of {@link #glVertexAttrib2dARB VertexAttrib2dARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void nglVertexAttrib2dvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib2dvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib2dARB VertexAttrib2dARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void glVertexAttrib2dvARB(int index, DoubleBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 2);
		nglVertexAttrib2dvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib3svARB ] ---

	/**
	 * Pointer version of {@link #glVertexAttrib3sARB VertexAttrib3sARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void nglVertexAttrib3svARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib3svARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib3sARB VertexAttrib3sARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void glVertexAttrib3svARB(int index, ShortBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglVertexAttrib3svARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib3fvARB ] ---

	/**
	 * Pointer version of {@link #glVertexAttrib3fARB VertexAttrib3fARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void nglVertexAttrib3fvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib3fvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib3fARB VertexAttrib3fARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void glVertexAttrib3fvARB(int index, FloatBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglVertexAttrib3fvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib3dvARB ] ---

	/**
	 * Pointer version of {@link #glVertexAttrib3dARB VertexAttrib3dARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void nglVertexAttrib3dvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib3dvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib3dARB VertexAttrib3dARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void glVertexAttrib3dvARB(int index, DoubleBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglVertexAttrib3dvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4fvARB ] ---

	/**
	 * Pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void nglVertexAttrib4fvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4fvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib4fARB VertexAttrib4fARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void glVertexAttrib4fvARB(int index, FloatBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4fvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4bvARB ] ---

	/**
	 * Byte version of {@link #glVertexAttrib4fvARB VertexAttrib4fvARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void nglVertexAttrib4bvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4bvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Byte version of {@link #glVertexAttrib4fvARB VertexAttrib4fvARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void glVertexAttrib4bvARB(int index, ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4bvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4svARB ] ---

	/**
	 * Pointer version of {@link #glVertexAttrib4sARB VertexAttrib4sARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void nglVertexAttrib4svARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4svARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib4sARB VertexAttrib4sARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void glVertexAttrib4svARB(int index, ShortBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4svARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4ivARB ] ---

	/**
	 * Integer version of {@link #glVertexAttrib4fvARB VertexAttrib4fvARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void nglVertexAttrib4ivARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4ivARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Integer version of {@link #glVertexAttrib4fvARB VertexAttrib4fvARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void glVertexAttrib4ivARB(int index, IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4ivARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4ubvARB ] ---

	/**
	 * Unsigned byte version of {@link #glVertexAttrib4fvARB VertexAttrib4fvARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void nglVertexAttrib4ubvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4ubvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Unsigned byte version of {@link #glVertexAttrib4fvARB VertexAttrib4fvARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void glVertexAttrib4ubvARB(int index, ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4ubvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4usvARB ] ---

	/**
	 * Unsigned short version of {@link #glVertexAttrib4fvARB VertexAttrib4fvARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void nglVertexAttrib4usvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4usvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Unsigned short version of {@link #glVertexAttrib4fvARB VertexAttrib4fvARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void glVertexAttrib4usvARB(int index, ShortBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4usvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4uivARB ] ---

	/**
	 * Unsigned integer version of {@link #glVertexAttrib4fvARB VertexAttrib4fvARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void nglVertexAttrib4uivARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4uivARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Unsigned integer version of {@link #glVertexAttrib4fvARB VertexAttrib4fvARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void glVertexAttrib4uivARB(int index, IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4uivARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4dvARB ] ---

	/**
	 * Pointer version of {@link #glVertexAttrib4dARB VertexAttrib4dARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void nglVertexAttrib4dvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4dvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttrib4dARB VertexAttrib4dARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void glVertexAttrib4dvARB(int index, DoubleBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4dvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4NbvARB ] ---

	/**
	 * Fixed-point version of {@link #glVertexAttrib4bvARB VertexAttrib4bvARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void nglVertexAttrib4NbvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4NbvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Fixed-point version of {@link #glVertexAttrib4bvARB VertexAttrib4bvARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void glVertexAttrib4NbvARB(int index, ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4NbvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4NsvARB ] ---

	/**
	 * Fixed-point version of {@link #glVertexAttrib4svARB VertexAttrib4svARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void nglVertexAttrib4NsvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4NsvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Fixed-point version of {@link #glVertexAttrib4svARB VertexAttrib4svARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void glVertexAttrib4NsvARB(int index, ShortBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4NsvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4NivARB ] ---

	/**
	 * Fixed-point version of {@link #glVertexAttrib4ivARB VertexAttrib4ivARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void nglVertexAttrib4NivARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4NivARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Fixed-point version of {@link #glVertexAttrib4ivARB VertexAttrib4ivARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void glVertexAttrib4NivARB(int index, IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4NivARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4NubvARB ] ---

	/**
	 * Fixed-point unsigned version of {@link #glVertexAttrib4bvARB VertexAttrib4bvARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void nglVertexAttrib4NubvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4NubvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Fixed-point unsigned version of {@link #glVertexAttrib4bvARB VertexAttrib4bvARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void glVertexAttrib4NubvARB(int index, ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4NubvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4NusvARB ] ---

	/**
	 * Fixed-point unsigned version of {@link #glVertexAttrib4svARB VertexAttrib4svARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void nglVertexAttrib4NusvARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4NusvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Fixed-point unsigned version of {@link #glVertexAttrib4svARB VertexAttrib4svARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void glVertexAttrib4NusvARB(int index, ShortBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttrib4NusvARB(index, memAddress(v));
	}

	// --- [ glVertexAttrib4NuivARB ] ---

	/**
	 * Fixed-point unsigned version of {@link #glVertexAttrib4ivARB VertexAttrib4ivARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
	 */
	public static void nglVertexAttrib4NuivARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4NuivARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Fixed-point unsigned version of {@link #glVertexAttrib4ivARB VertexAttrib4ivARB}
	 *
	 * @param index the vertex attribute index
	 * @param v     a buffer from which to read the attribute value
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
	 * @param index      the vertex attribute index
	 * @param size       the vertex attribute number of components. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>
	 * @param type       the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link NVHalfFloat#GL_HALF_FLOAT_NV HALF_FLOAT_NV}</td></tr><tr><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td></tr></table>
	 * @param normalized if {@link GL11#GL_TRUE TRUE}, fixed-point types are normalized when converted to floating-point
	 * @param stride     the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer    the vertex attribute array data
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
	 * @param index      the vertex attribute index
	 * @param size       the vertex attribute number of components. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>
	 * @param type       the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link NVHalfFloat#GL_HALF_FLOAT_NV HALF_FLOAT_NV}</td></tr><tr><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td></tr></table>
	 * @param normalized if {@link GL11#GL_TRUE TRUE}, fixed-point types are normalized when converted to floating-point
	 * @param stride     the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer    the vertex attribute array data
	 */
	public static void glVertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, ByteBuffer pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribPointerARB(index, size, type, normalized, stride, memAddress(pointer));
	}

	/**
	 * Specifies the location and organization of a vertex attribute array.
	 *
	 * @param index      the vertex attribute index
	 * @param size       the vertex attribute number of components. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td></tr></table>
	 * @param type       the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link NVHalfFloat#GL_HALF_FLOAT_NV HALF_FLOAT_NV}</td></tr><tr><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td></tr></table>
	 * @param normalized if {@link GL11#GL_TRUE TRUE}, fixed-point types are normalized when converted to floating-point
	 * @param stride     the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
	 * @param pointer    the vertex attribute array data
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
	 * Enables an individual generic vertex attribute array.
	 *
	 * @param index the vertex attribute index
	 */
	public static void glEnableVertexAttribArrayARB(int index) {
		long __functionAddress = GL.getCapabilities().glEnableVertexAttribArrayARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index);
	}

	// --- [ glDisableVertexAttribArrayARB ] ---

	/**
	 * Disables an individual generic vertex attribute array.
	 *
	 * @param index the vertex attribute index
	 */
	public static void glDisableVertexAttribArrayARB(int index) {
		long __functionAddress = GL.getCapabilities().glDisableVertexAttribArrayARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index);
	}

	// --- [ glProgramStringARB ] ---

	/**
	 * Updates the program string for the current program object for {@code target}.
	 * 
	 * <p>When a program string is loaded, it is interpreted according to syntactic and semantic rules corresponding to the program target specified by
	 * {@code target}. If a program violates the syntactic or semantic restrictions of the program target, ProgramStringARB generates the error
	 * {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION}.</p>
	 * 
	 * <p>Additionally, ProgramString will update the program error position ({@link #GL_PROGRAM_ERROR_POSITION_ARB PROGRAM_ERROR_POSITION_ARB}) and error string ({@link #GL_PROGRAM_ERROR_STRING_ARB PROGRAM_ERROR_STRING_ARB}). If a
	 * program fails to load, the value of the program error position is set to the ubyte offset into the specified program string indicating where the first
	 * program error was detected. If the program fails to load because of a semantic restriction that is not detected until the program is fully scanned, the
	 * error position is set to the value of {@code len}. If a program loads successfully, the error position is set to the value negative one. The
	 * implementation-dependent program error string contains one or more error or warning messages.  If a program loads succesfully, the error string may
	 * either contain warning messages or be empty.</p>
	 *
	 * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
	 * @param format the format of the program string. Must be:<br><table><tr><td>{@link #GL_PROGRAM_FORMAT_ASCII_ARB PROGRAM_FORMAT_ASCII_ARB}</td></tr></table>
	 * @param len    the length of the program string, excluding the null-terminator
	 * @param string an array of bytes representing the program string being loaded
	 */
	public static void nglProgramStringARB(int target, int format, int len, long string) {
		long __functionAddress = GL.getCapabilities().glProgramStringARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, format, len, string);
	}

	/**
	 * Updates the program string for the current program object for {@code target}.
	 * 
	 * <p>When a program string is loaded, it is interpreted according to syntactic and semantic rules corresponding to the program target specified by
	 * {@code target}. If a program violates the syntactic or semantic restrictions of the program target, ProgramStringARB generates the error
	 * {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION}.</p>
	 * 
	 * <p>Additionally, ProgramString will update the program error position ({@link #GL_PROGRAM_ERROR_POSITION_ARB PROGRAM_ERROR_POSITION_ARB}) and error string ({@link #GL_PROGRAM_ERROR_STRING_ARB PROGRAM_ERROR_STRING_ARB}). If a
	 * program fails to load, the value of the program error position is set to the ubyte offset into the specified program string indicating where the first
	 * program error was detected. If the program fails to load because of a semantic restriction that is not detected until the program is fully scanned, the
	 * error position is set to the value of {@code len}. If a program loads successfully, the error position is set to the value negative one. The
	 * implementation-dependent program error string contains one or more error or warning messages.  If a program loads succesfully, the error string may
	 * either contain warning messages or be empty.</p>
	 *
	 * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
	 * @param format the format of the program string. Must be:<br><table><tr><td>{@link #GL_PROGRAM_FORMAT_ASCII_ARB PROGRAM_FORMAT_ASCII_ARB}</td></tr></table>
	 * @param string an array of bytes representing the program string being loaded
	 */
	public static void glProgramStringARB(int target, int format, ByteBuffer string) {
		nglProgramStringARB(target, format, string.remaining(), memAddress(string));
	}

	// --- [ glBindProgramARB ] ---

	/**
	 * Creates a named program object by binding an unused program object name to a valid program target. Also can be used to bind an existing program object
	 * to a program target.
	 *
	 * @param target  the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
	 * @param program the program object to bind. If {@code program} is zero, the default program object for {@code target} is bound.  If {@code program} is the name of
	 *                an existing program object whose associated program target is {@code target}, the named program object is bound.
	 */
	public static void glBindProgramARB(int target, int program) {
		long __functionAddress = GL.getCapabilities().glBindProgramARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, program);
	}

	// --- [ glDeleteProgramsARB ] ---

	/**
	 * Deletes program objects.
	 *
	 * @param n        the number of program object to delete
	 * @param programs an array of {@code n} program objects to be deleted
	 */
	public static void nglDeleteProgramsARB(int n, long programs) {
		long __functionAddress = GL.getCapabilities().glDeleteProgramsARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, programs);
	}

	/**
	 * Deletes program objects.
	 *
	 * @param programs an array of {@code n} program objects to be deleted
	 */
	public static void glDeleteProgramsARB(IntBuffer programs) {
		nglDeleteProgramsARB(programs.remaining(), memAddress(programs));
	}

	// --- [ glGenProgramsARB ] ---

	/**
	 * Returns {@code n} currently unused program names in {@code programs}. These names are marked as used, for the purposes of GenProgramsARB only, but
	 * objects are created only when they are first bound using {@link #glBindProgramARB BindProgramARB}.
	 *
	 * @param n        the number of program names to genereate
	 * @param programs an array in which to return the generated program names
	 */
	public static void nglGenProgramsARB(int n, long programs) {
		long __functionAddress = GL.getCapabilities().glGenProgramsARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, n, programs);
	}

	/**
	 * Returns {@code n} currently unused program names in {@code programs}. These names are marked as used, for the purposes of GenProgramsARB only, but
	 * objects are created only when they are first bound using {@link #glBindProgramARB BindProgramARB}.
	 *
	 * @param programs an array in which to return the generated program names
	 */
	public static void glGenProgramsARB(IntBuffer programs) {
		nglGenProgramsARB(programs.remaining(), memAddress(programs));
	}

	/**
	 * Returns {@code n} currently unused program names in {@code programs}. These names are marked as used, for the purposes of GenProgramsARB only, but
	 * objects are created only when they are first bound using {@link #glBindProgramARB BindProgramARB}.
	 */
	public static int glGenProgramsARB() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer programs = stack.callocInt(1);
			nglGenProgramsARB(1, memAddress(programs));
			return programs.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glProgramEnvParameter4dARB ] ---

	/**
	 * Double version of {@link #glProgramEnvParameter4fARB ProgramEnvParameter4fARB}.
	 *
	 * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
	 * @param index  the environment parameter index
	 * @param x      the {@code x} parameter component
	 * @param y      the {@code y} parameter component
	 * @param z      the {@code z} parameter component
	 * @param w      the {@code w} parameter component
	 */
	public static void glProgramEnvParameter4dARB(int target, int index, double x, double y, double z, double w) {
		long __functionAddress = GL.getCapabilities().glProgramEnvParameter4dARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, index, x, y, z, w);
	}

	// --- [ glProgramEnvParameter4dvARB ] ---

	/**
	 * Pointer version of {@link #glProgramEnvParameter4dARB ProgramEnvParameter4dARB}
	 *
	 * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
	 * @param index  the environment parameter index
	 * @param params a buffer from which to read the parameter value
	 */
	public static void nglProgramEnvParameter4dvARB(int target, int index, long params) {
		long __functionAddress = GL.getCapabilities().glProgramEnvParameter4dvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, index, params);
	}

	/**
	 * Pointer version of {@link #glProgramEnvParameter4dARB ProgramEnvParameter4dARB}
	 *
	 * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
	 * @param index  the environment parameter index
	 * @param params a buffer from which to read the parameter value
	 */
	public static void glProgramEnvParameter4dvARB(int target, int index, DoubleBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 4);
		nglProgramEnvParameter4dvARB(target, index, memAddress(params));
	}

	// --- [ glProgramEnvParameter4fARB ] ---

	/**
	 * Updates the values of the program environment parameter numbered {@code index} for the specified program target {@code target}.
	 *
	 * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
	 * @param index  the environment parameter index
	 * @param x      the {@code x} parameter component
	 * @param y      the {@code y} parameter component
	 * @param z      the {@code z} parameter component
	 * @param w      the {@code w} parameter component
	 */
	public static void glProgramEnvParameter4fARB(int target, int index, float x, float y, float z, float w) {
		long __functionAddress = GL.getCapabilities().glProgramEnvParameter4fARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, index, x, y, z, w);
	}

	// --- [ glProgramEnvParameter4fvARB ] ---

	/**
	 * Pointer version of {@link #glProgramEnvParameter4fARB ProgramEnvParameter4fARB}.
	 *
	 * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
	 * @param index  the environment parameter index
	 * @param params a buffer from which to read the parameter value
	 */
	public static void nglProgramEnvParameter4fvARB(int target, int index, long params) {
		long __functionAddress = GL.getCapabilities().glProgramEnvParameter4fvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, index, params);
	}

	/**
	 * Pointer version of {@link #glProgramEnvParameter4fARB ProgramEnvParameter4fARB}.
	 *
	 * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
	 * @param index  the environment parameter index
	 * @param params a buffer from which to read the parameter value
	 */
	public static void glProgramEnvParameter4fvARB(int target, int index, FloatBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 4);
		nglProgramEnvParameter4fvARB(target, index, memAddress(params));
	}

	// --- [ glProgramLocalParameter4dARB ] ---

	/**
	 * Double version of {@link #glProgramLocalParameter4fARB ProgramLocalParameter4fARB}.
	 *
	 * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
	 * @param index  the environment parameter index
	 * @param x      the {@code x} parameter component
	 * @param y      the {@code y} parameter component
	 * @param z      the {@code z} parameter component
	 * @param w      the {@code w} parameter component
	 */
	public static void glProgramLocalParameter4dARB(int target, int index, double x, double y, double z, double w) {
		long __functionAddress = GL.getCapabilities().glProgramLocalParameter4dARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, index, x, y, z, w);
	}

	// --- [ glProgramLocalParameter4dvARB ] ---

	/**
	 * Pointer version of {@link #glProgramLocalParameter4dARB ProgramLocalParameter4dARB}.
	 *
	 * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
	 * @param index  the environment parameter index
	 * @param params a buffer from which to read the parameter value
	 */
	public static void nglProgramLocalParameter4dvARB(int target, int index, long params) {
		long __functionAddress = GL.getCapabilities().glProgramLocalParameter4dvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, index, params);
	}

	/**
	 * Pointer version of {@link #glProgramLocalParameter4dARB ProgramLocalParameter4dARB}.
	 *
	 * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
	 * @param index  the environment parameter index
	 * @param params a buffer from which to read the parameter value
	 */
	public static void glProgramLocalParameter4dvARB(int target, int index, DoubleBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 4);
		nglProgramLocalParameter4dvARB(target, index, memAddress(params));
	}

	// --- [ glProgramLocalParameter4fARB ] ---

	/**
	 * Updates the values of the program local parameter numbered {@code index} for the specified program target {@code target}.
	 *
	 * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
	 * @param index  the environment parameter index
	 * @param x      the {@code x} parameter component
	 * @param y      the {@code y} parameter component
	 * @param z      the {@code z} parameter component
	 * @param w      the {@code w} parameter component
	 */
	public static void glProgramLocalParameter4fARB(int target, int index, float x, float y, float z, float w) {
		long __functionAddress = GL.getCapabilities().glProgramLocalParameter4fARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, target, index, x, y, z, w);
	}

	// --- [ glProgramLocalParameter4fvARB ] ---

	/**
	 * Pointer version of {@link #glProgramLocalParameter4fARB ProgramLocalParameter4fARB}.
	 *
	 * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
	 * @param index  the environment parameter index
	 * @param params a buffer from which to read the parameter value
	 */
	public static void nglProgramLocalParameter4fvARB(int target, int index, long params) {
		long __functionAddress = GL.getCapabilities().glProgramLocalParameter4fvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, index, params);
	}

	/**
	 * Pointer version of {@link #glProgramLocalParameter4fARB ProgramLocalParameter4fARB}.
	 *
	 * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
	 * @param index  the environment parameter index
	 * @param params a buffer from which to read the parameter value
	 */
	public static void glProgramLocalParameter4fvARB(int target, int index, FloatBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 4);
		nglProgramLocalParameter4fvARB(target, index, memAddress(params));
	}

	// --- [ glGetProgramEnvParameterfvARB ] ---

	/**
	 * Obtain the current value for the program environment parameter numbered {@code index} for the specified program target {@code target}, and places the
	 * information in the array {@code params}.
	 *
	 * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
	 * @param index  the environment parameter index
	 * @param params a buffer in which to place the current parameter value
	 */
	public static void nglGetProgramEnvParameterfvARB(int target, int index, long params) {
		long __functionAddress = GL.getCapabilities().glGetProgramEnvParameterfvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, index, params);
	}

	/**
	 * Obtain the current value for the program environment parameter numbered {@code index} for the specified program target {@code target}, and places the
	 * information in the array {@code params}.
	 *
	 * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
	 * @param index  the environment parameter index
	 * @param params a buffer in which to place the current parameter value
	 */
	public static void glGetProgramEnvParameterfvARB(int target, int index, FloatBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 4);
		nglGetProgramEnvParameterfvARB(target, index, memAddress(params));
	}

	// --- [ glGetProgramEnvParameterdvARB ] ---

	/**
	 * Double version of {@link #glGetProgramEnvParameterfvARB GetProgramEnvParameterfvARB}.
	 *
	 * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
	 * @param index  the environment parameter index
	 * @param params a buffer in which to place the current parameter value
	 */
	public static void nglGetProgramEnvParameterdvARB(int target, int index, long params) {
		long __functionAddress = GL.getCapabilities().glGetProgramEnvParameterdvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, index, params);
	}

	/**
	 * Double version of {@link #glGetProgramEnvParameterfvARB GetProgramEnvParameterfvARB}.
	 *
	 * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
	 * @param index  the environment parameter index
	 * @param params a buffer in which to place the current parameter value
	 */
	public static void glGetProgramEnvParameterdvARB(int target, int index, DoubleBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 4);
		nglGetProgramEnvParameterdvARB(target, index, memAddress(params));
	}

	// --- [ glGetProgramLocalParameterfvARB ] ---

	/**
	 * Obtain the current value for the program local parameter numbered {@code index} for the specified program target {@code target}, and places the
	 * information in the array {@code params}.
	 *
	 * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
	 * @param index  the environment parameter index
	 * @param params a buffer in which to place the current parameter value
	 */
	public static void nglGetProgramLocalParameterfvARB(int target, int index, long params) {
		long __functionAddress = GL.getCapabilities().glGetProgramLocalParameterfvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, index, params);
	}

	/**
	 * Obtain the current value for the program local parameter numbered {@code index} for the specified program target {@code target}, and places the
	 * information in the array {@code params}.
	 *
	 * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
	 * @param index  the environment parameter index
	 * @param params a buffer in which to place the current parameter value
	 */
	public static void glGetProgramLocalParameterfvARB(int target, int index, FloatBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 4);
		nglGetProgramLocalParameterfvARB(target, index, memAddress(params));
	}

	// --- [ glGetProgramLocalParameterdvARB ] ---

	/**
	 * Double version of {@link #glGetProgramLocalParameterfvARB GetProgramLocalParameterfvARB}.
	 *
	 * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
	 * @param index  the environment parameter index
	 * @param params a buffer in which to place the current parameter value
	 */
	public static void nglGetProgramLocalParameterdvARB(int target, int index, long params) {
		long __functionAddress = GL.getCapabilities().glGetProgramLocalParameterdvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, index, params);
	}

	/**
	 * Double version of {@link #glGetProgramLocalParameterfvARB GetProgramLocalParameterfvARB}.
	 *
	 * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
	 * @param index  the environment parameter index
	 * @param params a buffer in which to place the current parameter value
	 */
	public static void glGetProgramLocalParameterdvARB(int target, int index, DoubleBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 4);
		nglGetProgramLocalParameterdvARB(target, index, memAddress(params));
	}

	// --- [ glGetProgramivARB ] ---

	/**
	 * Obtains program state for the program target {@code target}, writing the state into the array given by {@code params}. GetProgramivARB can be used to
	 * determine the properties of the currently bound program object or implementation limits for {@code target}.
	 *
	 * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
	 * @param pname  the parameter to query. One of:<br><table><tr><td>{@link #GL_PROGRAM_LENGTH_ARB PROGRAM_LENGTH_ARB}</td><td>{@link #GL_PROGRAM_FORMAT_ARB PROGRAM_FORMAT_ARB}</td></tr><tr><td>{@link #GL_PROGRAM_BINDING_ARB PROGRAM_BINDING_ARB}</td><td>{@link #GL_PROGRAM_INSTRUCTIONS_ARB PROGRAM_INSTRUCTIONS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_INSTRUCTIONS_ARB MAX_PROGRAM_INSTRUCTIONS_ARB}</td><td>{@link #GL_PROGRAM_NATIVE_INSTRUCTIONS_ARB PROGRAM_NATIVE_INSTRUCTIONS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_NATIVE_INSTRUCTIONS_ARB MAX_PROGRAM_NATIVE_INSTRUCTIONS_ARB}</td><td>{@link #GL_PROGRAM_TEMPORARIES_ARB PROGRAM_TEMPORARIES_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_TEMPORARIES_ARB MAX_PROGRAM_TEMPORARIES_ARB}</td><td>{@link #GL_PROGRAM_NATIVE_TEMPORARIES_ARB PROGRAM_NATIVE_TEMPORARIES_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_NATIVE_TEMPORARIES_ARB MAX_PROGRAM_NATIVE_TEMPORARIES_ARB}</td><td>{@link #GL_PROGRAM_PARAMETERS_ARB PROGRAM_PARAMETERS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_PARAMETERS_ARB MAX_PROGRAM_PARAMETERS_ARB}</td><td>{@link #GL_PROGRAM_NATIVE_PARAMETERS_ARB PROGRAM_NATIVE_PARAMETERS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_NATIVE_PARAMETERS_ARB MAX_PROGRAM_NATIVE_PARAMETERS_ARB}</td><td>{@link #GL_PROGRAM_ATTRIBS_ARB PROGRAM_ATTRIBS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_ATTRIBS_ARB MAX_PROGRAM_ATTRIBS_ARB}</td><td>{@link #GL_PROGRAM_NATIVE_ATTRIBS_ARB PROGRAM_NATIVE_ATTRIBS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_NATIVE_ATTRIBS_ARB MAX_PROGRAM_NATIVE_ATTRIBS_ARB}</td><td>{@link #GL_PROGRAM_ADDRESS_REGISTERS_ARB PROGRAM_ADDRESS_REGISTERS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_ADDRESS_REGISTERS_ARB MAX_PROGRAM_ADDRESS_REGISTERS_ARB}</td><td>{@link #GL_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB MAX_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB}</td><td>{@link #GL_MAX_PROGRAM_LOCAL_PARAMETERS_ARB MAX_PROGRAM_LOCAL_PARAMETERS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_ENV_PARAMETERS_ARB MAX_PROGRAM_ENV_PARAMETERS_ARB}</td><td>{@link #GL_PROGRAM_UNDER_NATIVE_LIMITS_ARB PROGRAM_UNDER_NATIVE_LIMITS_ARB}</td></tr></table>
	 * @param params an array in which to place the parameter value
	 */
	public static void nglGetProgramivARB(int target, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetProgramivARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, params);
	}

	/**
	 * Obtains program state for the program target {@code target}, writing the state into the array given by {@code params}. GetProgramivARB can be used to
	 * determine the properties of the currently bound program object or implementation limits for {@code target}.
	 *
	 * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
	 * @param pname  the parameter to query. One of:<br><table><tr><td>{@link #GL_PROGRAM_LENGTH_ARB PROGRAM_LENGTH_ARB}</td><td>{@link #GL_PROGRAM_FORMAT_ARB PROGRAM_FORMAT_ARB}</td></tr><tr><td>{@link #GL_PROGRAM_BINDING_ARB PROGRAM_BINDING_ARB}</td><td>{@link #GL_PROGRAM_INSTRUCTIONS_ARB PROGRAM_INSTRUCTIONS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_INSTRUCTIONS_ARB MAX_PROGRAM_INSTRUCTIONS_ARB}</td><td>{@link #GL_PROGRAM_NATIVE_INSTRUCTIONS_ARB PROGRAM_NATIVE_INSTRUCTIONS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_NATIVE_INSTRUCTIONS_ARB MAX_PROGRAM_NATIVE_INSTRUCTIONS_ARB}</td><td>{@link #GL_PROGRAM_TEMPORARIES_ARB PROGRAM_TEMPORARIES_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_TEMPORARIES_ARB MAX_PROGRAM_TEMPORARIES_ARB}</td><td>{@link #GL_PROGRAM_NATIVE_TEMPORARIES_ARB PROGRAM_NATIVE_TEMPORARIES_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_NATIVE_TEMPORARIES_ARB MAX_PROGRAM_NATIVE_TEMPORARIES_ARB}</td><td>{@link #GL_PROGRAM_PARAMETERS_ARB PROGRAM_PARAMETERS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_PARAMETERS_ARB MAX_PROGRAM_PARAMETERS_ARB}</td><td>{@link #GL_PROGRAM_NATIVE_PARAMETERS_ARB PROGRAM_NATIVE_PARAMETERS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_NATIVE_PARAMETERS_ARB MAX_PROGRAM_NATIVE_PARAMETERS_ARB}</td><td>{@link #GL_PROGRAM_ATTRIBS_ARB PROGRAM_ATTRIBS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_ATTRIBS_ARB MAX_PROGRAM_ATTRIBS_ARB}</td><td>{@link #GL_PROGRAM_NATIVE_ATTRIBS_ARB PROGRAM_NATIVE_ATTRIBS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_NATIVE_ATTRIBS_ARB MAX_PROGRAM_NATIVE_ATTRIBS_ARB}</td><td>{@link #GL_PROGRAM_ADDRESS_REGISTERS_ARB PROGRAM_ADDRESS_REGISTERS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_ADDRESS_REGISTERS_ARB MAX_PROGRAM_ADDRESS_REGISTERS_ARB}</td><td>{@link #GL_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB MAX_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB}</td><td>{@link #GL_MAX_PROGRAM_LOCAL_PARAMETERS_ARB MAX_PROGRAM_LOCAL_PARAMETERS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_ENV_PARAMETERS_ARB MAX_PROGRAM_ENV_PARAMETERS_ARB}</td><td>{@link #GL_PROGRAM_UNDER_NATIVE_LIMITS_ARB PROGRAM_UNDER_NATIVE_LIMITS_ARB}</td></tr></table>
	 * @param params an array in which to place the parameter value
	 */
	public static void glGetProgramivARB(int target, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetProgramivARB(target, pname, memAddress(params));
	}

	/**
	 * Obtains program state for the program target {@code target}, writing the state into the array given by {@code params}. GetProgramivARB can be used to
	 * determine the properties of the currently bound program object or implementation limits for {@code target}.
	 *
	 * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
	 * @param pname  the parameter to query. One of:<br><table><tr><td>{@link #GL_PROGRAM_LENGTH_ARB PROGRAM_LENGTH_ARB}</td><td>{@link #GL_PROGRAM_FORMAT_ARB PROGRAM_FORMAT_ARB}</td></tr><tr><td>{@link #GL_PROGRAM_BINDING_ARB PROGRAM_BINDING_ARB}</td><td>{@link #GL_PROGRAM_INSTRUCTIONS_ARB PROGRAM_INSTRUCTIONS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_INSTRUCTIONS_ARB MAX_PROGRAM_INSTRUCTIONS_ARB}</td><td>{@link #GL_PROGRAM_NATIVE_INSTRUCTIONS_ARB PROGRAM_NATIVE_INSTRUCTIONS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_NATIVE_INSTRUCTIONS_ARB MAX_PROGRAM_NATIVE_INSTRUCTIONS_ARB}</td><td>{@link #GL_PROGRAM_TEMPORARIES_ARB PROGRAM_TEMPORARIES_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_TEMPORARIES_ARB MAX_PROGRAM_TEMPORARIES_ARB}</td><td>{@link #GL_PROGRAM_NATIVE_TEMPORARIES_ARB PROGRAM_NATIVE_TEMPORARIES_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_NATIVE_TEMPORARIES_ARB MAX_PROGRAM_NATIVE_TEMPORARIES_ARB}</td><td>{@link #GL_PROGRAM_PARAMETERS_ARB PROGRAM_PARAMETERS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_PARAMETERS_ARB MAX_PROGRAM_PARAMETERS_ARB}</td><td>{@link #GL_PROGRAM_NATIVE_PARAMETERS_ARB PROGRAM_NATIVE_PARAMETERS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_NATIVE_PARAMETERS_ARB MAX_PROGRAM_NATIVE_PARAMETERS_ARB}</td><td>{@link #GL_PROGRAM_ATTRIBS_ARB PROGRAM_ATTRIBS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_ATTRIBS_ARB MAX_PROGRAM_ATTRIBS_ARB}</td><td>{@link #GL_PROGRAM_NATIVE_ATTRIBS_ARB PROGRAM_NATIVE_ATTRIBS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_NATIVE_ATTRIBS_ARB MAX_PROGRAM_NATIVE_ATTRIBS_ARB}</td><td>{@link #GL_PROGRAM_ADDRESS_REGISTERS_ARB PROGRAM_ADDRESS_REGISTERS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_ADDRESS_REGISTERS_ARB MAX_PROGRAM_ADDRESS_REGISTERS_ARB}</td><td>{@link #GL_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB MAX_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB}</td><td>{@link #GL_MAX_PROGRAM_LOCAL_PARAMETERS_ARB MAX_PROGRAM_LOCAL_PARAMETERS_ARB}</td></tr><tr><td>{@link #GL_MAX_PROGRAM_ENV_PARAMETERS_ARB MAX_PROGRAM_ENV_PARAMETERS_ARB}</td><td>{@link #GL_PROGRAM_UNDER_NATIVE_LIMITS_ARB PROGRAM_UNDER_NATIVE_LIMITS_ARB}</td></tr></table>
	 */
	public static int glGetProgramiARB(int target, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetProgramivARB(target, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetProgramStringARB ] ---

	/**
	 * Obtains the program string for the program object bound to {@code target} and places the information in the array {@code string}.
	 * 
	 * <p>{@code n} ubytes are returned into the array program where {@code n} is the length of the program in ubytes, as returned by {@link #glGetProgramivARB GetProgramivARB} when
	 * {@code pname} is {@link #GL_PROGRAM_LENGTH_ARB PROGRAM_LENGTH_ARB}. The program string is always returned using the format given when the program string was specified.</p>
	 *
	 * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
	 * @param pname  the parameter to query. Must be:<br><table><tr><td>{@link #GL_PROGRAM_STRING_ARB PROGRAM_STRING_ARB}</td></tr></table>
	 * @param string an array in which to place the program string
	 */
	public static void nglGetProgramStringARB(int target, int pname, long string) {
		long __functionAddress = GL.getCapabilities().glGetProgramStringARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, target, pname, string);
	}

	/**
	 * Obtains the program string for the program object bound to {@code target} and places the information in the array {@code string}.
	 * 
	 * <p>{@code n} ubytes are returned into the array program where {@code n} is the length of the program in ubytes, as returned by {@link #glGetProgramivARB GetProgramivARB} when
	 * {@code pname} is {@link #GL_PROGRAM_LENGTH_ARB PROGRAM_LENGTH_ARB}. The program string is always returned using the format given when the program string was specified.</p>
	 *
	 * @param target the program target. One of:<br><table><tr><td>{@link #GL_VERTEX_PROGRAM_ARB VERTEX_PROGRAM_ARB}</td><td>{@link ARBFragmentProgram#GL_FRAGMENT_PROGRAM_ARB FRAGMENT_PROGRAM_ARB}</td></tr></table>
	 * @param pname  the parameter to query. Must be:<br><table><tr><td>{@link #GL_PROGRAM_STRING_ARB PROGRAM_STRING_ARB}</td></tr></table>
	 * @param string an array in which to place the program string
	 */
	public static void glGetProgramStringARB(int target, int pname, ByteBuffer string) {
		if ( CHECKS )
			if ( DEBUG )
				checkBuffer(string, glGetProgramiARB(target, GL_PROGRAM_LENGTH_ARB));
		nglGetProgramStringARB(target, pname, memAddress(string));
	}

	// --- [ glGetVertexAttribfvARB ] ---

	/**
	 * Obtains the vertex attribute state named by {@code pname} for the vertex attribute numbered {@code index} and places the information in the array
	 * {@code params}.
	 *
	 * @param index  the vertex attribute index
	 * @param pname  the parameter to query. Must be:<br><table><tr><td>{@link #GL_CURRENT_VERTEX_ATTRIB_ARB CURRENT_VERTEX_ATTRIB_ARB}</td></tr></table>
	 * @param params an array in which to place the parameter value
	 */
	public static void nglGetVertexAttribfvARB(int index, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetVertexAttribfvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, pname, params);
	}

	/**
	 * Obtains the vertex attribute state named by {@code pname} for the vertex attribute numbered {@code index} and places the information in the array
	 * {@code params}.
	 *
	 * @param index  the vertex attribute index
	 * @param pname  the parameter to query. Must be:<br><table><tr><td>{@link #GL_CURRENT_VERTEX_ATTRIB_ARB CURRENT_VERTEX_ATTRIB_ARB}</td></tr></table>
	 * @param params an array in which to place the parameter value
	 */
	public static void glGetVertexAttribfvARB(int index, int pname, FloatBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 4);
		nglGetVertexAttribfvARB(index, pname, memAddress(params));
	}

	// --- [ glGetVertexAttribdvARB ] ---

	/**
	 * Double version of {@link #glGetVertexAttribfvARB GetVertexAttribfvARB}.
	 *
	 * @param index  the vertex attribute index
	 * @param pname  the parameter to query. Must be:<br><table><tr><td>{@link #GL_CURRENT_VERTEX_ATTRIB_ARB CURRENT_VERTEX_ATTRIB_ARB}</td></tr></table>
	 * @param params an array in which to place the parameter value
	 */
	public static void nglGetVertexAttribdvARB(int index, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetVertexAttribdvARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, pname, params);
	}

	/**
	 * Double version of {@link #glGetVertexAttribfvARB GetVertexAttribfvARB}.
	 *
	 * @param index  the vertex attribute index
	 * @param pname  the parameter to query. Must be:<br><table><tr><td>{@link #GL_CURRENT_VERTEX_ATTRIB_ARB CURRENT_VERTEX_ATTRIB_ARB}</td></tr></table>
	 * @param params an array in which to place the parameter value
	 */
	public static void glGetVertexAttribdvARB(int index, int pname, DoubleBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 4);
		nglGetVertexAttribdvARB(index, pname, memAddress(params));
	}

	// --- [ glGetVertexAttribivARB ] ---

	/**
	 * Integer version of {@link #glGetVertexAttribfvARB GetVertexAttribfvARB}.
	 *
	 * @param index  the vertex attribute index
	 * @param pname  the parameter to query. One of:<br><table><tr><td>{@link #GL_VERTEX_ATTRIB_ARRAY_ENABLED_ARB VERTEX_ATTRIB_ARRAY_ENABLED_ARB}</td><td>{@link #GL_VERTEX_ATTRIB_ARRAY_SIZE_ARB VERTEX_ATTRIB_ARRAY_SIZE_ARB}</td></tr><tr><td>{@link #GL_VERTEX_ATTRIB_ARRAY_STRIDE_ARB VERTEX_ATTRIB_ARRAY_STRIDE_ARB}</td><td>{@link #GL_VERTEX_ATTRIB_ARRAY_TYPE_ARB VERTEX_ATTRIB_ARRAY_TYPE_ARB}</td></tr><tr><td>{@link #GL_VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB}</td><td>{@link #GL_CURRENT_VERTEX_ATTRIB_ARB CURRENT_VERTEX_ATTRIB_ARB}</td></tr></table>
	 * @param params an array in which to place the parameter value
	 */
	public static void nglGetVertexAttribivARB(int index, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetVertexAttribivARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, pname, params);
	}

	/**
	 * Integer version of {@link #glGetVertexAttribfvARB GetVertexAttribfvARB}.
	 *
	 * @param index  the vertex attribute index
	 * @param pname  the parameter to query. One of:<br><table><tr><td>{@link #GL_VERTEX_ATTRIB_ARRAY_ENABLED_ARB VERTEX_ATTRIB_ARRAY_ENABLED_ARB}</td><td>{@link #GL_VERTEX_ATTRIB_ARRAY_SIZE_ARB VERTEX_ATTRIB_ARRAY_SIZE_ARB}</td></tr><tr><td>{@link #GL_VERTEX_ATTRIB_ARRAY_STRIDE_ARB VERTEX_ATTRIB_ARRAY_STRIDE_ARB}</td><td>{@link #GL_VERTEX_ATTRIB_ARRAY_TYPE_ARB VERTEX_ATTRIB_ARRAY_TYPE_ARB}</td></tr><tr><td>{@link #GL_VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB}</td><td>{@link #GL_CURRENT_VERTEX_ATTRIB_ARB CURRENT_VERTEX_ATTRIB_ARB}</td></tr></table>
	 * @param params an array in which to place the parameter value
	 */
	public static void glGetVertexAttribivARB(int index, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetVertexAttribivARB(index, pname, memAddress(params));
	}

	/**
	 * Integer version of {@link #glGetVertexAttribfvARB GetVertexAttribfvARB}.
	 *
	 * @param index the vertex attribute index
	 * @param pname the parameter to query. One of:<br><table><tr><td>{@link #GL_VERTEX_ATTRIB_ARRAY_ENABLED_ARB VERTEX_ATTRIB_ARRAY_ENABLED_ARB}</td><td>{@link #GL_VERTEX_ATTRIB_ARRAY_SIZE_ARB VERTEX_ATTRIB_ARRAY_SIZE_ARB}</td></tr><tr><td>{@link #GL_VERTEX_ATTRIB_ARRAY_STRIDE_ARB VERTEX_ATTRIB_ARRAY_STRIDE_ARB}</td><td>{@link #GL_VERTEX_ATTRIB_ARRAY_TYPE_ARB VERTEX_ATTRIB_ARRAY_TYPE_ARB}</td></tr><tr><td>{@link #GL_VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB}</td><td>{@link #GL_CURRENT_VERTEX_ATTRIB_ARB CURRENT_VERTEX_ATTRIB_ARB}</td></tr></table>
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

	// --- [ glGetVertexAttribPointervARB ] ---

	/**
	 * Obtains the pointer named {@code pname} for vertex attribute numbered {@code index} and places the information in the array {@code pointer}.
	 *
	 * @param index   the vertex attribute index
	 * @param pname   the parameter to query. Must be:<br><table><tr><td>{@link #GL_VERTEX_ATTRIB_ARRAY_POINTER_ARB VERTEX_ATTRIB_ARRAY_POINTER_ARB}</td></tr></table>
	 * @param pointer an array in which to place the vertex attribute array pointer
	 */
	public static void nglGetVertexAttribPointervARB(int index, int pname, long pointer) {
		long __functionAddress = GL.getCapabilities().glGetVertexAttribPointervARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, pname, pointer);
	}

	/**
	 * Obtains the pointer named {@code pname} for vertex attribute numbered {@code index} and places the information in the array {@code pointer}.
	 *
	 * @param index   the vertex attribute index
	 * @param pname   the parameter to query. Must be:<br><table><tr><td>{@link #GL_VERTEX_ATTRIB_ARRAY_POINTER_ARB VERTEX_ATTRIB_ARRAY_POINTER_ARB}</td></tr></table>
	 * @param pointer an array in which to place the vertex attribute array pointer
	 */
	public static void glGetVertexAttribPointervARB(int index, int pname, PointerBuffer pointer) {
		if ( CHECKS )
			checkBuffer(pointer, 1);
		nglGetVertexAttribPointervARB(index, pname, memAddress(pointer));
	}

	/**
	 * Obtains the pointer named {@code pname} for vertex attribute numbered {@code index} and places the information in the array {@code pointer}.
	 *
	 * @param index the vertex attribute index
	 * @param pname the parameter to query. Must be:<br><table><tr><td>{@link #GL_VERTEX_ATTRIB_ARRAY_POINTER_ARB VERTEX_ATTRIB_ARRAY_POINTER_ARB}</td></tr></table>
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

	// --- [ glIsProgramARB ] ---

	/**
	 * Returns {@link GL11#GL_TRUE TRUE} if {@code program} is the name of a program object. If {@code program} is zero or is a non-zero value that is not the name of a
	 * program object, or if an error condition occurs, IsProgramARB returns {@link GL11#GL_FALSE FALSE}. A name returned by {@link #glGenProgramsARB GenProgramsARB}, but not yet bound, is not the
	 * name of a program object.
	 *
	 * @param program the program name
	 */
	public static boolean glIsProgramARB(int program) {
		long __functionAddress = GL.getCapabilities().glIsProgramARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callZ(__functionAddress, program);
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

	/** Array version of: {@link #glVertexAttrib1fvARB VertexAttrib1fvARB} */
	public static void glVertexAttrib1fvARB(int index, float[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib1fvARB;
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

	/** Array version of: {@link #glVertexAttrib2svARB VertexAttrib2svARB} */
	public static void glVertexAttrib2svARB(int index, short[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib2svARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2);
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

	/** Array version of: {@link #glVertexAttrib2dvARB VertexAttrib2dvARB} */
	public static void glVertexAttrib2dvARB(int index, double[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib2dvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2);
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

	/** Array version of: {@link #glVertexAttrib3fvARB VertexAttrib3fvARB} */
	public static void glVertexAttrib3fvARB(int index, float[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib3fvARB;
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

	/** Array version of: {@link #glVertexAttrib4dvARB VertexAttrib4dvARB} */
	public static void glVertexAttrib4dvARB(int index, double[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttrib4dvARB;
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

	/** Array version of: {@link #glDeleteProgramsARB DeleteProgramsARB} */
	public static void glDeleteProgramsARB(int[] programs) {
		long __functionAddress = GL.getCapabilities().glDeleteProgramsARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, programs.length, programs);
	}

	/** Array version of: {@link #glGenProgramsARB GenProgramsARB} */
	public static void glGenProgramsARB(int[] programs) {
		long __functionAddress = GL.getCapabilities().glGenProgramsARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, programs.length, programs);
	}

	/** Array version of: {@link #glProgramEnvParameter4dvARB ProgramEnvParameter4dvARB} */
	public static void glProgramEnvParameter4dvARB(int target, int index, double[] params) {
		long __functionAddress = GL.getCapabilities().glProgramEnvParameter4dvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		callPV(__functionAddress, target, index, params);
	}

	/** Array version of: {@link #glProgramEnvParameter4fvARB ProgramEnvParameter4fvARB} */
	public static void glProgramEnvParameter4fvARB(int target, int index, float[] params) {
		long __functionAddress = GL.getCapabilities().glProgramEnvParameter4fvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		callPV(__functionAddress, target, index, params);
	}

	/** Array version of: {@link #glProgramLocalParameter4dvARB ProgramLocalParameter4dvARB} */
	public static void glProgramLocalParameter4dvARB(int target, int index, double[] params) {
		long __functionAddress = GL.getCapabilities().glProgramLocalParameter4dvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		callPV(__functionAddress, target, index, params);
	}

	/** Array version of: {@link #glProgramLocalParameter4fvARB ProgramLocalParameter4fvARB} */
	public static void glProgramLocalParameter4fvARB(int target, int index, float[] params) {
		long __functionAddress = GL.getCapabilities().glProgramLocalParameter4fvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		callPV(__functionAddress, target, index, params);
	}

	/** Array version of: {@link #glGetProgramEnvParameterfvARB GetProgramEnvParameterfvARB} */
	public static void glGetProgramEnvParameterfvARB(int target, int index, float[] params) {
		long __functionAddress = GL.getCapabilities().glGetProgramEnvParameterfvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		callPV(__functionAddress, target, index, params);
	}

	/** Array version of: {@link #glGetProgramEnvParameterdvARB GetProgramEnvParameterdvARB} */
	public static void glGetProgramEnvParameterdvARB(int target, int index, double[] params) {
		long __functionAddress = GL.getCapabilities().glGetProgramEnvParameterdvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		callPV(__functionAddress, target, index, params);
	}

	/** Array version of: {@link #glGetProgramLocalParameterfvARB GetProgramLocalParameterfvARB} */
	public static void glGetProgramLocalParameterfvARB(int target, int index, float[] params) {
		long __functionAddress = GL.getCapabilities().glGetProgramLocalParameterfvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		callPV(__functionAddress, target, index, params);
	}

	/** Array version of: {@link #glGetProgramLocalParameterdvARB GetProgramLocalParameterdvARB} */
	public static void glGetProgramLocalParameterdvARB(int target, int index, double[] params) {
		long __functionAddress = GL.getCapabilities().glGetProgramLocalParameterdvARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		callPV(__functionAddress, target, index, params);
	}

	/** Array version of: {@link #glGetProgramivARB GetProgramivARB} */
	public static void glGetProgramivARB(int target, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetProgramivARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, target, pname, params);
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

	/** Array version of: {@link #glGetVertexAttribivARB GetVertexAttribivARB} */
	public static void glGetVertexAttribivARB(int index, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetVertexAttribivARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, index, pname, params);
	}

}