/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/gpu_shader4.txt">EXT_gpu_shader4</a> extension.
 * 
 * <p>This extension provides a set of new features to the OpenGL Shading Language and related APIs to support capabilities of new hardware. In particular,
 * this extension provides the following functionality:</p>
 * 
 * <ul>
 * <li>New texture lookup functions are provided that allow shaders to access individual texels using integer coordinates referring to the texel location
 * and level of detail. No filtering is performed. These functions allow applications to use textures as one-, two-, and three-dimensional arrays.</li>
 * <li>New texture lookup functions are provided that allow shaders to query the dimensions of a specific level-of-detail image of a texture object.</li>
 * <li>New texture lookup functions variants are provided that allow shaders to pass a constant integer vector used to offset the texel locations used
 * during the lookup to assist in custom texture filtering operations.</li>
 * <li>New texture lookup functions are provided that allow shaders to access one- and two-dimensional array textures. The second, or third, coordinate is
 * used to select the layer of the array to access.</li>
 * <li>New "Grad" texture lookup functions are provided that allow shaders to explicitely pass in derivative values which are used by the GL to compute the
 * level-of-detail when performing a texture lookup.</li>
 * <li>A new texture lookup function is provided to access a buffer texture.</li>
 * <li>The existing absolute LOD texture lookup functions are no longer restricted to the vertex shader only.</li>
 * <li>The ability to specify and use cubemap textures with a DEPTH_COMPONENT internal format. This also enables shadow mapping on cubemaps. The 'q'
 * coordinate is used as the reference value for comparisons. A set of new texture lookup functions is provided to lookup into shadow cubemaps.</li>
 * <li>The ability to specify if varying variables are interpolated in a non-perspective correct manner, if they are flat shaded or, if multi-sampling, if
 * centroid sampling should be performed.</li>
 * <li>Full signed integer and unsigned integer support in the OpenGL Shading Language:
 * 
 * <ul>
 * <li>Integers are defined as 32 bit values using two's complement.</li>
 * <li>Unsigned integers and vectors thereof are added.</li>
 * <li>New texture lookup functions are provided that return integer values. These functions are to be used in conjunction with new texture formats
 * whose components are actual integers, rather than integers that encode a floating-point value. To support these lookup functions, new integer
 * and unsigned-integer sampler types are introduced.</li>
 * <li>Integer bitwise operators are now enabled.</li>
 * <li>Several built-in functions and operators now operate on integers or vectors of integers.</li>
 * <li>New vertex attribute functions are added that load integer attribute data and can be referenced in a vertex shader as integer data.</li>
 * <li>New uniform loading commands are added to load unsigned integer data.</li>
 * <li>Varying variables can now be (unsigned) integers. If declared as such, they have to be flat shaded.</li>
 * <li>Fragment shaders can define their own output variables, and declare them to be of type floating-point, integer or unsigned integer. These
 * variables are bound to a fragment color index with the new API command BindFragDataLocationEXT(), and directed to buffers using the existing
 * DrawBuffer or DrawBuffers API commands.</li>
 * </ul></li>
 * <li>Added new built-in functions truncate() and round() to the shading language.</li>
 * <li>A new built-in variable accessible from within vertex shaders that holds the index <i> implicitly passed to ArrayElement to specify the vertex.
 * This is called the vertex ID.</li>
 * <li>A new built-in variable accessible from within fragment and geometry shaders that hold the index of the currently processed primitive. This is
 * called the primitive ID.</li>
 * </ul>
 * 
 * <p>This extension also briefly mentions a new shader type, called a geometry shader. A geometry shader is run after vertices are transformed, but before
 * clipping. A geometry shader begins with a single primitive (point, line, triangle. It can read the attributes of any of the vertices in the primitive
 * and use them to generate new primitives. A geometry shader has a fixed output primitive type (point, line strip, or triangle strip) and emits vertices
 * to define a new primitive. Geometry shaders are discussed in detail in the GL_EXT_geometry_shader4 specification.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0}.</p>
 */
public class EXTGPUShader4 {

	/** Accepted by the {@code pname} parameters of GetVertexAttribdv, GetVertexAttribfv, GetVertexAttribiv, GetVertexAttribIuivEXT and GetVertexAttribIivEXT. */
	public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER_EXT = 0x88FD;

	/** Returned by the {@code type} parameter of GetActiveUniform. */
	public static final int
		GL_SAMPLER_1D_ARRAY_EXT              = 0x8DC0,
		GL_SAMPLER_2D_ARRAY_EXT              = 0x8DC1,
		GL_SAMPLER_BUFFER_EXT                = 0x8DC2,
		GL_SAMPLER_1D_ARRAY_SHADOW_EXT       = 0x8DC3,
		GL_SAMPLER_2D_ARRAY_SHADOW_EXT       = 0x8DC4,
		GL_SAMPLER_CUBE_SHADOW_EXT           = 0x8DC5,
		GL_UNSIGNED_INT_VEC2_EXT             = 0x8DC6,
		GL_UNSIGNED_INT_VEC3_EXT             = 0x8DC7,
		GL_UNSIGNED_INT_VEC4_EXT             = 0x8DC8,
		GL_INT_SAMPLER_1D_EXT                = 0x8DC9,
		GL_INT_SAMPLER_2D_EXT                = 0x8DCA,
		GL_INT_SAMPLER_3D_EXT                = 0x8DCB,
		GL_INT_SAMPLER_CUBE_EXT              = 0x8DCC,
		GL_INT_SAMPLER_2D_RECT_EXT           = 0x8DCD,
		GL_INT_SAMPLER_1D_ARRAY_EXT          = 0x8DCE,
		GL_INT_SAMPLER_2D_ARRAY_EXT          = 0x8DCF,
		GL_INT_SAMPLER_BUFFER_EXT            = 0x8DD0,
		GL_UNSIGNED_INT_SAMPLER_1D_EXT       = 0x8DD1,
		GL_UNSIGNED_INT_SAMPLER_2D_EXT       = 0x8DD2,
		GL_UNSIGNED_INT_SAMPLER_3D_EXT       = 0x8DD3,
		GL_UNSIGNED_INT_SAMPLER_CUBE_EXT     = 0x8DD4,
		GL_UNSIGNED_INT_SAMPLER_2D_RECT_EXT  = 0x8DD5,
		GL_UNSIGNED_INT_SAMPLER_1D_ARRAY_EXT = 0x8DD6,
		GL_UNSIGNED_INT_SAMPLER_2D_ARRAY_EXT = 0x8DD7,
		GL_UNSIGNED_INT_SAMPLER_BUFFER_EXT   = 0x8DD8;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_MIN_PROGRAM_TEXEL_OFFSET_EXT = 0x8904,
		GL_MAX_PROGRAM_TEXEL_OFFSET_EXT = 0x8905;

	protected EXTGPUShader4() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glVertexAttribI1iEXT, caps.glVertexAttribI2iEXT, caps.glVertexAttribI3iEXT, caps.glVertexAttribI4iEXT, caps.glVertexAttribI1uiEXT, 
			caps.glVertexAttribI2uiEXT, caps.glVertexAttribI3uiEXT, caps.glVertexAttribI4uiEXT, caps.glVertexAttribI1ivEXT, caps.glVertexAttribI2ivEXT, 
			caps.glVertexAttribI3ivEXT, caps.glVertexAttribI4ivEXT, caps.glVertexAttribI1uivEXT, caps.glVertexAttribI2uivEXT, caps.glVertexAttribI3uivEXT, 
			caps.glVertexAttribI4uivEXT, caps.glVertexAttribI4bvEXT, caps.glVertexAttribI4svEXT, caps.glVertexAttribI4ubvEXT, caps.glVertexAttribI4usvEXT, 
			caps.glVertexAttribIPointerEXT, caps.glGetVertexAttribIivEXT, caps.glGetVertexAttribIuivEXT, caps.glGetUniformuivEXT, 
			caps.glBindFragDataLocationEXT, caps.glGetFragDataLocationEXT, caps.glUniform1uiEXT, caps.glUniform2uiEXT, caps.glUniform3uiEXT, 
			caps.glUniform4uiEXT, caps.glUniform1uivEXT, caps.glUniform2uivEXT, caps.glUniform3uivEXT, caps.glUniform4uivEXT
		);
	}

	// --- [ glVertexAttribI1iEXT ] ---

	/**
	 * Specifies the value of a pure integer generic vertex attribute. The y and z components are implicitly set to 0 and w to 1.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 */
	public static void glVertexAttribI1iEXT(int index, int x) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI1iEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x);
	}

	// --- [ glVertexAttribI2iEXT ] ---

	/**
	 * Specifies the value of a pure integer generic vertex attribute. The z component is implicitly set to 0 and w to 1.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 * @param y     the vertex attribute y component
	 */
	public static void glVertexAttribI2iEXT(int index, int x, int y) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI2iEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x, y);
	}

	// --- [ glVertexAttribI3iEXT ] ---

	/**
	 * Specifies the value of a pure integer generic vertex attribute. The w component is implicitly set to 1.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 * @param y     the vertex attribute y component
	 * @param z     the vertex attribute z component
	 */
	public static void glVertexAttribI3iEXT(int index, int x, int y, int z) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI3iEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x, y, z);
	}

	// --- [ glVertexAttribI4iEXT ] ---

	/**
	 * Specifies the value of a pure integer generic vertex attribute.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 * @param y     the vertex attribute y component
	 * @param z     the vertex attribute z component
	 * @param w     the vertex attribute w component
	 */
	public static void glVertexAttribI4iEXT(int index, int x, int y, int z, int w) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI4iEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x, y, z, w);
	}

	// --- [ glVertexAttribI1uiEXT ] ---

	/**
	 * Specifies the value of an unsigned pure integer generic vertex attribute. The y and z components are implicitly set to 0 and w to 1.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 */
	public static void glVertexAttribI1uiEXT(int index, int x) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI1uiEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x);
	}

	// --- [ glVertexAttribI2uiEXT ] ---

	/**
	 * Specifies the value of an unsigned pure integer generic vertex attribute. The z component is implicitly set to 0 and w to 1.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 * @param y     the vertex attribute y component
	 */
	public static void glVertexAttribI2uiEXT(int index, int x, int y) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI2uiEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x, y);
	}

	// --- [ glVertexAttribI3uiEXT ] ---

	/**
	 * Specifies the value of an unsigned pure integer generic vertex attribute. The w component is implicitly set to 1.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 * @param y     the vertex attribute y component
	 * @param z     the vertex attribute z component
	 */
	public static void glVertexAttribI3uiEXT(int index, int x, int y, int z) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI3uiEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x, y, z);
	}

	// --- [ glVertexAttribI4uiEXT ] ---

	/**
	 * Specifies the value of an unsigned pure integer generic vertex attribute.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 * @param y     the vertex attribute y component
	 * @param z     the vertex attribute z component
	 * @param w     the vertex attribute w component
	 */
	public static void glVertexAttribI4uiEXT(int index, int x, int y, int z, int w) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI4uiEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x, y, z, w);
	}

	// --- [ glVertexAttribI1ivEXT ] ---

	/**
	 * Pointer version of {@link #glVertexAttribI1iEXT VertexAttribI1iEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void nglVertexAttribI1ivEXT(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI1ivEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttribI1iEXT VertexAttribI1iEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI1ivEXT(int index, IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 1);
		nglVertexAttribI1ivEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribI2ivEXT ] ---

	/**
	 * Pointer version of {@link #glVertexAttribI2iEXT VertexAttribI2iEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void nglVertexAttribI2ivEXT(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI2ivEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttribI2iEXT VertexAttribI2iEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI2ivEXT(int index, IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 2);
		nglVertexAttribI2ivEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribI3ivEXT ] ---

	/**
	 * Pointer version of {@link #glVertexAttribI3iEXT VertexAttribI3iEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void nglVertexAttribI3ivEXT(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI3ivEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttribI3iEXT VertexAttribI3iEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI3ivEXT(int index, IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglVertexAttribI3ivEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribI4ivEXT ] ---

	/**
	 * Pointer version of {@link #glVertexAttribI4iEXT VertexAttribI4iEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void nglVertexAttribI4ivEXT(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI4ivEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttribI4iEXT VertexAttribI4iEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI4ivEXT(int index, IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttribI4ivEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribI1uivEXT ] ---

	/**
	 * Pointer version of {@link #glVertexAttribI1uiEXT VertexAttribI1uiEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void nglVertexAttribI1uivEXT(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI1uivEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttribI1uiEXT VertexAttribI1uiEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI1uivEXT(int index, IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 1);
		nglVertexAttribI1uivEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribI2uivEXT ] ---

	/**
	 * Pointer version of {@link #glVertexAttribI2uiEXT VertexAttribI2uiEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void nglVertexAttribI2uivEXT(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI2uivEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttribI2uiEXT VertexAttribI2uiEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI2uivEXT(int index, IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 2);
		nglVertexAttribI2uivEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribI3uivEXT ] ---

	/**
	 * Pointer version of {@link #glVertexAttribI3uiEXT VertexAttribI3uiEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void nglVertexAttribI3uivEXT(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI3uivEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttribI3uiEXT VertexAttribI3uiEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI3uivEXT(int index, IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglVertexAttribI3uivEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribI4uivEXT ] ---

	/**
	 * Pointer version of {@link #glVertexAttribI4uiEXT VertexAttribI4uiEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void nglVertexAttribI4uivEXT(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI4uivEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttribI4uiEXT VertexAttribI4uiEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI4uivEXT(int index, IntBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttribI4uivEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribI4bvEXT ] ---

	/**
	 * Byte version of {@link #glVertexAttribI4ivEXT VertexAttribI4ivEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void nglVertexAttribI4bvEXT(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI4bvEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Byte version of {@link #glVertexAttribI4ivEXT VertexAttribI4ivEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI4bvEXT(int index, ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttribI4bvEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribI4svEXT ] ---

	/**
	 * Short version of {@link #glVertexAttribI4ivEXT VertexAttribI4ivEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void nglVertexAttribI4svEXT(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI4svEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Short version of {@link #glVertexAttribI4ivEXT VertexAttribI4ivEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI4svEXT(int index, ShortBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttribI4svEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribI4ubvEXT ] ---

	/**
	 * Byte version of {@link #glVertexAttribI4uivEXT VertexAttribI4uivEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void nglVertexAttribI4ubvEXT(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI4ubvEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Byte version of {@link #glVertexAttribI4uivEXT VertexAttribI4uivEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI4ubvEXT(int index, ByteBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttribI4ubvEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribI4usvEXT ] ---

	/**
	 * Short version of {@link #glVertexAttribI4uivEXT VertexAttribI4uivEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void nglVertexAttribI4usvEXT(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI4usvEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Short version of {@link #glVertexAttribI4uivEXT VertexAttribI4uivEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI4usvEXT(int index, ShortBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttribI4usvEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribIPointerEXT ] ---

	/**
	 * Specifies the location and organization of a pure integer vertex attribute array.
	 *
	 * @param index   the index of the pure integer generic vertex attribute to be modified
	 * @param size    the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
	 * @param type    the data type of each component in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 * @param stride  the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
	 *                the array. The initial value is 0.
	 * @param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
	 *                currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
	 */
	public static void nglVertexAttribIPointerEXT(int index, int size, int type, int stride, long pointer) {
		long __functionAddress = GL.getCapabilities().glVertexAttribIPointerEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, size, type, stride, pointer);
	}

	/**
	 * Specifies the location and organization of a pure integer vertex attribute array.
	 *
	 * @param index   the index of the pure integer generic vertex attribute to be modified
	 * @param size    the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
	 * @param type    the data type of each component in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 * @param stride  the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
	 *                the array. The initial value is 0.
	 * @param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
	 *                currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
	 */
	public static void glVertexAttribIPointerEXT(int index, int size, int type, int stride, ByteBuffer pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribIPointerEXT(index, size, type, stride, memAddress(pointer));
	}

	/**
	 * Specifies the location and organization of a pure integer vertex attribute array.
	 *
	 * @param index   the index of the pure integer generic vertex attribute to be modified
	 * @param size    the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
	 * @param type    the data type of each component in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
	 * @param stride  the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
	 *                the array. The initial value is 0.
	 * @param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
	 *                currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
	 */
	public static void glVertexAttribIPointerEXT(int index, int size, int type, int stride, long pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, true);
		nglVertexAttribIPointerEXT(index, size, type, stride, pointer);
	}

	/** ShortBuffer version of: {@link #glVertexAttribIPointerEXT VertexAttribIPointerEXT} */
	public static void glVertexAttribIPointerEXT(int index, int size, int type, int stride, ShortBuffer pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribIPointerEXT(index, size, type, stride, memAddress(pointer));
	}

	/** IntBuffer version of: {@link #glVertexAttribIPointerEXT VertexAttribIPointerEXT} */
	public static void glVertexAttribIPointerEXT(int index, int size, int type, int stride, IntBuffer pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribIPointerEXT(index, size, type, stride, memAddress(pointer));
	}

	// --- [ glGetVertexAttribIivEXT ] ---

	/**
	 * Returns the value of a pure integer generic vertex attribute parameter.
	 *
	 * @param index  the index of the pure integer generic vertex attribute to be modified
	 * @param pname  the symbolic name of the vertex attribute parameter to be queried
	 * @param params returns the requested data
	 */
	public static void nglGetVertexAttribIivEXT(int index, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetVertexAttribIivEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, pname, params);
	}

	/**
	 * Returns the value of a pure integer generic vertex attribute parameter.
	 *
	 * @param index  the index of the pure integer generic vertex attribute to be modified
	 * @param pname  the symbolic name of the vertex attribute parameter to be queried
	 * @param params returns the requested data
	 */
	public static void glGetVertexAttribIivEXT(int index, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 4);
		nglGetVertexAttribIivEXT(index, pname, memAddress(params));
	}

	/**
	 * Returns the value of a pure integer generic vertex attribute parameter.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param pname the symbolic name of the vertex attribute parameter to be queried
	 */
	public static int glGetVertexAttribIiEXT(int index, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetVertexAttribIivEXT(index, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetVertexAttribIuivEXT ] ---

	/**
	 * Unsigned version of {@link #glGetVertexAttribIivEXT GetVertexAttribIivEXT}.
	 *
	 * @param index  the index of the pure integer generic vertex attribute to be modified
	 * @param pname  the symbolic name of the vertex attribute parameter to be queried
	 * @param params returns the requested data
	 */
	public static void nglGetVertexAttribIuivEXT(int index, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetVertexAttribIuivEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, pname, params);
	}

	/**
	 * Unsigned version of {@link #glGetVertexAttribIivEXT GetVertexAttribIivEXT}.
	 *
	 * @param index  the index of the pure integer generic vertex attribute to be modified
	 * @param pname  the symbolic name of the vertex attribute parameter to be queried
	 * @param params returns the requested data
	 */
	public static void glGetVertexAttribIuivEXT(int index, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 4);
		nglGetVertexAttribIuivEXT(index, pname, memAddress(params));
	}

	/**
	 * Unsigned version of {@link #glGetVertexAttribIivEXT GetVertexAttribIivEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param pname the symbolic name of the vertex attribute parameter to be queried
	 */
	public static int glGetVertexAttribIuiEXT(int index, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetVertexAttribIuivEXT(index, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetUniformuivEXT ] ---

	public static void nglGetUniformuivEXT(int program, int location, long params) {
		long __functionAddress = GL.getCapabilities().glGetUniformuivEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, params);
	}

	public static void glGetUniformuivEXT(int program, int location, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetUniformuivEXT(program, location, memAddress(params));
	}

	public static int glGetUniformuiEXT(int program, int location) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetUniformuivEXT(program, location, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glBindFragDataLocationEXT ] ---

	public static void nglBindFragDataLocationEXT(int program, int color, long name) {
		long __functionAddress = GL.getCapabilities().glBindFragDataLocationEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, color, name);
	}

	public static void glBindFragDataLocationEXT(int program, int color, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		nglBindFragDataLocationEXT(program, color, memAddress(name));
	}

	public static void glBindFragDataLocationEXT(int program, int color, CharSequence name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.ASCII(name);
			nglBindFragDataLocationEXT(program, color, memAddress(nameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetFragDataLocationEXT ] ---

	public static int nglGetFragDataLocationEXT(int program, long name) {
		long __functionAddress = GL.getCapabilities().glGetFragDataLocationEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPI(__functionAddress, program, name);
	}

	public static int glGetFragDataLocationEXT(int program, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nglGetFragDataLocationEXT(program, memAddress(name));
	}

	public static int glGetFragDataLocationEXT(int program, CharSequence name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.ASCII(name);
			return nglGetFragDataLocationEXT(program, memAddress(nameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glUniform1uiEXT ] ---

	public static void glUniform1uiEXT(int location, int v0) {
		long __functionAddress = GL.getCapabilities().glUniform1uiEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, location, v0);
	}

	// --- [ glUniform2uiEXT ] ---

	public static void glUniform2uiEXT(int location, int v0, int v1) {
		long __functionAddress = GL.getCapabilities().glUniform2uiEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, location, v0, v1);
	}

	// --- [ glUniform3uiEXT ] ---

	public static void glUniform3uiEXT(int location, int v0, int v1, int v2) {
		long __functionAddress = GL.getCapabilities().glUniform3uiEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, location, v0, v1, v2);
	}

	// --- [ glUniform4uiEXT ] ---

	public static void glUniform4uiEXT(int location, int v0, int v1, int v2, int v3) {
		long __functionAddress = GL.getCapabilities().glUniform4uiEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, location, v0, v1, v2, v3);
	}

	// --- [ glUniform1uivEXT ] ---

	public static void nglUniform1uivEXT(int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glUniform1uivEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, value);
	}

	public static void glUniform1uivEXT(int location, IntBuffer value) {
		nglUniform1uivEXT(location, value.remaining(), memAddress(value));
	}

	// --- [ glUniform2uivEXT ] ---

	public static void nglUniform2uivEXT(int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glUniform2uivEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, value);
	}

	public static void glUniform2uivEXT(int location, IntBuffer value) {
		nglUniform2uivEXT(location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glUniform3uivEXT ] ---

	public static void nglUniform3uivEXT(int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glUniform3uivEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, value);
	}

	public static void glUniform3uivEXT(int location, IntBuffer value) {
		nglUniform3uivEXT(location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glUniform4uivEXT ] ---

	public static void nglUniform4uivEXT(int location, int count, long value) {
		long __functionAddress = GL.getCapabilities().glUniform4uivEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, value);
	}

	public static void glUniform4uivEXT(int location, IntBuffer value) {
		nglUniform4uivEXT(location, value.remaining() >> 2, memAddress(value));
	}

	/** Array version of: {@link #glVertexAttribI1ivEXT VertexAttribI1ivEXT} */
	public static void glVertexAttribI1ivEXT(int index, int[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI1ivEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttribI2ivEXT VertexAttribI2ivEXT} */
	public static void glVertexAttribI2ivEXT(int index, int[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI2ivEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttribI3ivEXT VertexAttribI3ivEXT} */
	public static void glVertexAttribI3ivEXT(int index, int[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI3ivEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttribI4ivEXT VertexAttribI4ivEXT} */
	public static void glVertexAttribI4ivEXT(int index, int[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI4ivEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttribI1uivEXT VertexAttribI1uivEXT} */
	public static void glVertexAttribI1uivEXT(int index, int[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI1uivEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttribI2uivEXT VertexAttribI2uivEXT} */
	public static void glVertexAttribI2uivEXT(int index, int[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI2uivEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttribI3uivEXT VertexAttribI3uivEXT} */
	public static void glVertexAttribI3uivEXT(int index, int[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI3uivEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttribI4uivEXT VertexAttribI4uivEXT} */
	public static void glVertexAttribI4uivEXT(int index, int[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI4uivEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttribI4svEXT VertexAttribI4svEXT} */
	public static void glVertexAttribI4svEXT(int index, short[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI4svEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttribI4usvEXT VertexAttribI4usvEXT} */
	public static void glVertexAttribI4usvEXT(int index, short[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribI4usvEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		callPV(__functionAddress, index, v);
	}

	/** short[] version of: {@link #glVertexAttribIPointerEXT VertexAttribIPointerEXT} */
	public static void glVertexAttribIPointerEXT(int index, int size, int type, int stride, short[] pointer) {
		long __functionAddress = GL.getCapabilities().glVertexAttribIPointerEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, index, size, type, stride, pointer);
	}

	/** int[] version of: {@link #glVertexAttribIPointerEXT VertexAttribIPointerEXT} */
	public static void glVertexAttribIPointerEXT(int index, int size, int type, int stride, int[] pointer) {
		long __functionAddress = GL.getCapabilities().glVertexAttribIPointerEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		}
		callPV(__functionAddress, index, size, type, stride, pointer);
	}

	/** Array version of: {@link #glGetVertexAttribIivEXT GetVertexAttribIivEXT} */
	public static void glGetVertexAttribIivEXT(int index, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetVertexAttribIivEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		callPV(__functionAddress, index, pname, params);
	}

	/** Array version of: {@link #glGetVertexAttribIuivEXT GetVertexAttribIuivEXT} */
	public static void glGetVertexAttribIuivEXT(int index, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetVertexAttribIuivEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 4);
		}
		callPV(__functionAddress, index, pname, params);
	}

	/** Array version of: {@link #glGetUniformuivEXT GetUniformuivEXT} */
	public static void glGetUniformuivEXT(int program, int location, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetUniformuivEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, program, location, params);
	}

	/** Array version of: {@link #glUniform1uivEXT Uniform1uivEXT} */
	public static void glUniform1uivEXT(int location, int[] value) {
		long __functionAddress = GL.getCapabilities().glUniform1uivEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length, value);
	}

	/** Array version of: {@link #glUniform2uivEXT Uniform2uivEXT} */
	public static void glUniform2uivEXT(int location, int[] value) {
		long __functionAddress = GL.getCapabilities().glUniform2uivEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length >> 1, value);
	}

	/** Array version of: {@link #glUniform3uivEXT Uniform3uivEXT} */
	public static void glUniform3uivEXT(int location, int[] value) {
		long __functionAddress = GL.getCapabilities().glUniform3uivEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length / 3, value);
	}

	/** Array version of: {@link #glUniform4uivEXT Uniform4uivEXT} */
	public static void glUniform4uivEXT(int location, int[] value) {
		long __functionAddress = GL.getCapabilities().glUniform4uivEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, value.length >> 2, value);
	}

}