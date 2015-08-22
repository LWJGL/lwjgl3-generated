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
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/gpu_shader4.txt">EXT_gpu_shader4</a> extension.
 * 
 * <p>This extension provides a set of new features to the OpenGL Shading Language and related APIs to support capabilities of new hardware. In particular,
 * this extension provides the following functionality:
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
 * This extension also briefly mentions a new shader type, called a geometry shader. A geometry shader is run after vertices are transformed, but before
 * clipping. A geometry shader begins with a single primitive (point, line, triangle. It can read the attributes of any of the vertices in the primitive
 * and use them to generate new primitives. A geometry shader has a fixed output primitive type (point, line strip, or triangle strip) and emits vertices
 * to define a new primitive. Geometry shaders are discussed in detail in the GL_EXT_geometry_shader4 specification.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0}.</p>
 */
public final class EXTGPUShader4 {

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

	/** Function address. */
	@JavadocExclude
	public final long
		VertexAttribI1iEXT,
		VertexAttribI2iEXT,
		VertexAttribI3iEXT,
		VertexAttribI4iEXT,
		VertexAttribI1uiEXT,
		VertexAttribI2uiEXT,
		VertexAttribI3uiEXT,
		VertexAttribI4uiEXT,
		VertexAttribI1ivEXT,
		VertexAttribI2ivEXT,
		VertexAttribI3ivEXT,
		VertexAttribI4ivEXT,
		VertexAttribI1uivEXT,
		VertexAttribI2uivEXT,
		VertexAttribI3uivEXT,
		VertexAttribI4uivEXT,
		VertexAttribI4bvEXT,
		VertexAttribI4svEXT,
		VertexAttribI4ubvEXT,
		VertexAttribI4usvEXT,
		VertexAttribIPointerEXT,
		GetVertexAttribIivEXT,
		GetVertexAttribIuivEXT,
		GetUniformuivEXT,
		BindFragDataLocationEXT,
		GetFragDataLocationEXT,
		Uniform1uiEXT,
		Uniform2uiEXT,
		Uniform3uiEXT,
		Uniform4uiEXT,
		Uniform1uivEXT,
		Uniform2uivEXT,
		Uniform3uivEXT,
		Uniform4uivEXT;

	@JavadocExclude
	public EXTGPUShader4(FunctionProvider provider) {
		VertexAttribI1iEXT = provider.getFunctionAddress("glVertexAttribI1iEXT");
		VertexAttribI2iEXT = provider.getFunctionAddress("glVertexAttribI2iEXT");
		VertexAttribI3iEXT = provider.getFunctionAddress("glVertexAttribI3iEXT");
		VertexAttribI4iEXT = provider.getFunctionAddress("glVertexAttribI4iEXT");
		VertexAttribI1uiEXT = provider.getFunctionAddress("glVertexAttribI1uiEXT");
		VertexAttribI2uiEXT = provider.getFunctionAddress("glVertexAttribI2uiEXT");
		VertexAttribI3uiEXT = provider.getFunctionAddress("glVertexAttribI3uiEXT");
		VertexAttribI4uiEXT = provider.getFunctionAddress("glVertexAttribI4uiEXT");
		VertexAttribI1ivEXT = provider.getFunctionAddress("glVertexAttribI1ivEXT");
		VertexAttribI2ivEXT = provider.getFunctionAddress("glVertexAttribI2ivEXT");
		VertexAttribI3ivEXT = provider.getFunctionAddress("glVertexAttribI3ivEXT");
		VertexAttribI4ivEXT = provider.getFunctionAddress("glVertexAttribI4ivEXT");
		VertexAttribI1uivEXT = provider.getFunctionAddress("glVertexAttribI1uivEXT");
		VertexAttribI2uivEXT = provider.getFunctionAddress("glVertexAttribI2uivEXT");
		VertexAttribI3uivEXT = provider.getFunctionAddress("glVertexAttribI3uivEXT");
		VertexAttribI4uivEXT = provider.getFunctionAddress("glVertexAttribI4uivEXT");
		VertexAttribI4bvEXT = provider.getFunctionAddress("glVertexAttribI4bvEXT");
		VertexAttribI4svEXT = provider.getFunctionAddress("glVertexAttribI4svEXT");
		VertexAttribI4ubvEXT = provider.getFunctionAddress("glVertexAttribI4ubvEXT");
		VertexAttribI4usvEXT = provider.getFunctionAddress("glVertexAttribI4usvEXT");
		VertexAttribIPointerEXT = provider.getFunctionAddress("glVertexAttribIPointerEXT");
		GetVertexAttribIivEXT = provider.getFunctionAddress("glGetVertexAttribIivEXT");
		GetVertexAttribIuivEXT = provider.getFunctionAddress("glGetVertexAttribIuivEXT");
		GetUniformuivEXT = provider.getFunctionAddress("glGetUniformuivEXT");
		BindFragDataLocationEXT = provider.getFunctionAddress("glBindFragDataLocationEXT");
		GetFragDataLocationEXT = provider.getFunctionAddress("glGetFragDataLocationEXT");
		Uniform1uiEXT = provider.getFunctionAddress("glUniform1uiEXT");
		Uniform2uiEXT = provider.getFunctionAddress("glUniform2uiEXT");
		Uniform3uiEXT = provider.getFunctionAddress("glUniform3uiEXT");
		Uniform4uiEXT = provider.getFunctionAddress("glUniform4uiEXT");
		Uniform1uivEXT = provider.getFunctionAddress("glUniform1uivEXT");
		Uniform2uivEXT = provider.getFunctionAddress("glUniform2uivEXT");
		Uniform3uivEXT = provider.getFunctionAddress("glUniform3uivEXT");
		Uniform4uivEXT = provider.getFunctionAddress("glUniform4uivEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTGPUShader4} instance for the current context. */
	public static EXTGPUShader4 getInstance() {
		return checkFunctionality(GL.getCapabilities().__EXTGPUShader4);
	}

	static EXTGPUShader4 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_gpu_shader4") ) return null;

		EXTGPUShader4 funcs = new EXTGPUShader4(provider);

		boolean supported = checkFunctions(
			funcs.VertexAttribI1iEXT, funcs.VertexAttribI2iEXT, funcs.VertexAttribI3iEXT, funcs.VertexAttribI4iEXT, funcs.VertexAttribI1uiEXT, 
			funcs.VertexAttribI2uiEXT, funcs.VertexAttribI3uiEXT, funcs.VertexAttribI4uiEXT, funcs.VertexAttribI1ivEXT, funcs.VertexAttribI2ivEXT, 
			funcs.VertexAttribI3ivEXT, funcs.VertexAttribI4ivEXT, funcs.VertexAttribI1uivEXT, funcs.VertexAttribI2uivEXT, funcs.VertexAttribI3uivEXT, 
			funcs.VertexAttribI4uivEXT, funcs.VertexAttribI4bvEXT, funcs.VertexAttribI4svEXT, funcs.VertexAttribI4ubvEXT, funcs.VertexAttribI4usvEXT, 
			funcs.VertexAttribIPointerEXT, funcs.GetVertexAttribIivEXT, funcs.GetVertexAttribIuivEXT, funcs.GetUniformuivEXT, funcs.BindFragDataLocationEXT, 
			funcs.GetFragDataLocationEXT, funcs.Uniform1uiEXT, funcs.Uniform2uiEXT, funcs.Uniform3uiEXT, funcs.Uniform4uiEXT, funcs.Uniform1uivEXT, 
			funcs.Uniform2uivEXT, funcs.Uniform3uivEXT, funcs.Uniform4uivEXT
		);

		return GL.checkExtension("GL_EXT_gpu_shader4", funcs, supported);
	}

	// --- [ glVertexAttribI1iEXT ] ---

	/**
	 * Specifies the value of a pure integer generic vertex attribute. The y and z components are implicitly set to 0 and w to 1.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 */
	public static void glVertexAttribI1iEXT(int index, int x) {
		long __functionAddress = getInstance().VertexAttribI1iEXT;
		callIIV(__functionAddress, index, x);
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
		long __functionAddress = getInstance().VertexAttribI2iEXT;
		callIIIV(__functionAddress, index, x, y);
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
		long __functionAddress = getInstance().VertexAttribI3iEXT;
		callIIIIV(__functionAddress, index, x, y, z);
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
		long __functionAddress = getInstance().VertexAttribI4iEXT;
		callIIIIIV(__functionAddress, index, x, y, z, w);
	}

	// --- [ glVertexAttribI1uiEXT ] ---

	/**
	 * Specifies the value of an unsigned pure integer generic vertex attribute. The y and z components are implicitly set to 0 and w to 1.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 */
	public static void glVertexAttribI1uiEXT(int index, int x) {
		long __functionAddress = getInstance().VertexAttribI1uiEXT;
		callIIV(__functionAddress, index, x);
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
		long __functionAddress = getInstance().VertexAttribI2uiEXT;
		callIIIV(__functionAddress, index, x, y);
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
		long __functionAddress = getInstance().VertexAttribI3uiEXT;
		callIIIIV(__functionAddress, index, x, y, z);
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
		long __functionAddress = getInstance().VertexAttribI4uiEXT;
		callIIIIIV(__functionAddress, index, x, y, z, w);
	}

	// --- [ glVertexAttribI1ivEXT ] ---

	/** Unsafe version of {@link #glVertexAttribI1ivEXT VertexAttribI1ivEXT} */
	@JavadocExclude
	public static void nglVertexAttribI1ivEXT(int index, long v) {
		long __functionAddress = getInstance().VertexAttribI1ivEXT;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttribI1iEXT VertexAttribI1iEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI1ivEXT(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1 << 2);
		nglVertexAttribI1ivEXT(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribI1ivEXT VertexAttribI1ivEXT} */
	public static void glVertexAttribI1ivEXT(int index, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1);
		nglVertexAttribI1ivEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribI2ivEXT ] ---

	/** Unsafe version of {@link #glVertexAttribI2ivEXT VertexAttribI2ivEXT} */
	@JavadocExclude
	public static void nglVertexAttribI2ivEXT(int index, long v) {
		long __functionAddress = getInstance().VertexAttribI2ivEXT;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttribI2iEXT VertexAttribI2iEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI2ivEXT(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2 << 2);
		nglVertexAttribI2ivEXT(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribI2ivEXT VertexAttribI2ivEXT} */
	public static void glVertexAttribI2ivEXT(int index, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2);
		nglVertexAttribI2ivEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribI3ivEXT ] ---

	/** Unsafe version of {@link #glVertexAttribI3ivEXT VertexAttribI3ivEXT} */
	@JavadocExclude
	public static void nglVertexAttribI3ivEXT(int index, long v) {
		long __functionAddress = getInstance().VertexAttribI3ivEXT;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttribI3iEXT VertexAttribI3iEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI3ivEXT(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 2);
		nglVertexAttribI3ivEXT(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribI3ivEXT VertexAttribI3ivEXT} */
	public static void glVertexAttribI3ivEXT(int index, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglVertexAttribI3ivEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribI4ivEXT ] ---

	/** Unsafe version of {@link #glVertexAttribI4ivEXT VertexAttribI4ivEXT} */
	@JavadocExclude
	public static void nglVertexAttribI4ivEXT(int index, long v) {
		long __functionAddress = getInstance().VertexAttribI4ivEXT;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttribI4iEXT VertexAttribI4iEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI4ivEXT(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 2);
		nglVertexAttribI4ivEXT(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribI4ivEXT VertexAttribI4ivEXT} */
	public static void glVertexAttribI4ivEXT(int index, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttribI4ivEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribI1uivEXT ] ---

	/** Unsafe version of {@link #glVertexAttribI1uivEXT VertexAttribI1uivEXT} */
	@JavadocExclude
	public static void nglVertexAttribI1uivEXT(int index, long v) {
		long __functionAddress = getInstance().VertexAttribI1uivEXT;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttribI1uiEXT VertexAttribI1uiEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI1uivEXT(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1 << 2);
		nglVertexAttribI1uivEXT(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribI1uivEXT VertexAttribI1uivEXT} */
	public static void glVertexAttribI1uivEXT(int index, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 1);
		nglVertexAttribI1uivEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribI2uivEXT ] ---

	/** Unsafe version of {@link #glVertexAttribI2uivEXT VertexAttribI2uivEXT} */
	@JavadocExclude
	public static void nglVertexAttribI2uivEXT(int index, long v) {
		long __functionAddress = getInstance().VertexAttribI2uivEXT;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttribI2uiEXT VertexAttribI2uiEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI2uivEXT(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2 << 2);
		nglVertexAttribI2uivEXT(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribI2uivEXT VertexAttribI2uivEXT} */
	public static void glVertexAttribI2uivEXT(int index, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 2);
		nglVertexAttribI2uivEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribI3uivEXT ] ---

	/** Unsafe version of {@link #glVertexAttribI3uivEXT VertexAttribI3uivEXT} */
	@JavadocExclude
	public static void nglVertexAttribI3uivEXT(int index, long v) {
		long __functionAddress = getInstance().VertexAttribI3uivEXT;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttribI3uiEXT VertexAttribI3uiEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI3uivEXT(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3 << 2);
		nglVertexAttribI3uivEXT(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribI3uivEXT VertexAttribI3uivEXT} */
	public static void glVertexAttribI3uivEXT(int index, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 3);
		nglVertexAttribI3uivEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribI4uivEXT ] ---

	/** Unsafe version of {@link #glVertexAttribI4uivEXT VertexAttribI4uivEXT} */
	@JavadocExclude
	public static void nglVertexAttribI4uivEXT(int index, long v) {
		long __functionAddress = getInstance().VertexAttribI4uivEXT;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttribI4uiEXT VertexAttribI4uiEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI4uivEXT(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 2);
		nglVertexAttribI4uivEXT(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribI4uivEXT VertexAttribI4uivEXT} */
	public static void glVertexAttribI4uivEXT(int index, IntBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttribI4uivEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribI4bvEXT ] ---

	/** Unsafe version of {@link #glVertexAttribI4bvEXT VertexAttribI4bvEXT} */
	@JavadocExclude
	public static void nglVertexAttribI4bvEXT(int index, long v) {
		long __functionAddress = getInstance().VertexAttribI4bvEXT;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Byte version of {@link #glVertexAttribI4ivEXT VertexAttribI4ivEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI4bvEXT(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttribI4bvEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribI4svEXT ] ---

	/** Unsafe version of {@link #glVertexAttribI4svEXT VertexAttribI4svEXT} */
	@JavadocExclude
	public static void nglVertexAttribI4svEXT(int index, long v) {
		long __functionAddress = getInstance().VertexAttribI4svEXT;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Short version of {@link #glVertexAttribI4ivEXT VertexAttribI4ivEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI4svEXT(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 1);
		nglVertexAttribI4svEXT(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribI4svEXT VertexAttribI4svEXT} */
	public static void glVertexAttribI4svEXT(int index, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttribI4svEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribI4ubvEXT ] ---

	/** Unsafe version of {@link #glVertexAttribI4ubvEXT VertexAttribI4ubvEXT} */
	@JavadocExclude
	public static void nglVertexAttribI4ubvEXT(int index, long v) {
		long __functionAddress = getInstance().VertexAttribI4ubvEXT;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Byte version of {@link #glVertexAttribI4uivEXT VertexAttribI4uivEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI4ubvEXT(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttribI4ubvEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribI4usvEXT ] ---

	/** Unsafe version of {@link #glVertexAttribI4usvEXT VertexAttribI4usvEXT} */
	@JavadocExclude
	public static void nglVertexAttribI4usvEXT(int index, long v) {
		long __functionAddress = getInstance().VertexAttribI4usvEXT;
		callIPV(__functionAddress, index, v);
	}

	/**
	 * Short version of {@link #glVertexAttribI4uivEXT VertexAttribI4uivEXT}.
	 *
	 * @param index the index of the pure integer generic vertex attribute to be modified
	 * @param v     the pure integer vertex attribute buffer
	 */
	public static void glVertexAttribI4usvEXT(int index, ByteBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4 << 1);
		nglVertexAttribI4usvEXT(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribI4usvEXT VertexAttribI4usvEXT} */
	public static void glVertexAttribI4usvEXT(int index, ShortBuffer v) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(v, 4);
		nglVertexAttribI4usvEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribIPointerEXT ] ---

	/** Unsafe version of {@link #glVertexAttribIPointerEXT VertexAttribIPointerEXT} */
	@JavadocExclude
	public static void nglVertexAttribIPointerEXT(int index, int size, int type, int stride, long pointer) {
		long __functionAddress = getInstance().VertexAttribIPointerEXT;
		callIIIIPV(__functionAddress, index, size, type, stride, pointer);
	}

	/**
	 * Specifies the location and organization of a pure integer vertex attribute array.
	 *
	 * @param index   the index of the pure integer generic vertex attribute to be modified
	 * @param size    the number of values per vertex that are stored in the array. The initial value is 4. One of:<br>1, 2, 3, 4, {@link GL12#GL_BGRA BGRA}
	 * @param type    the data type of each component in the array. One of:<br>{@link GL11#GL_BYTE BYTE}, {@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}, {@link GL11#GL_SHORT SHORT}, {@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}, {@link GL11#GL_INT INT}, {@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}
	 * @param stride  the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
	 *                the array. The initial value is 0.
	 * @param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
	 *                currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
	 */
	public static void glVertexAttribIPointerEXT(int index, int size, int type, int stride, ByteBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribIPointerEXT(index, size, type, stride, memAddress(pointer));
	}

	/** Buffer object offset version of: {@link #glVertexAttribIPointerEXT VertexAttribIPointerEXT} */
	public static void glVertexAttribIPointerEXT(int index, int size, int type, int stride, long pointerOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, true);
		nglVertexAttribIPointerEXT(index, size, type, stride, pointerOffset);
	}

	/** ShortBuffer version of: {@link #glVertexAttribIPointerEXT VertexAttribIPointerEXT} */
	public static void glVertexAttribIPointerEXT(int index, int size, int type, int stride, ShortBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribIPointerEXT(index, size, type, stride, memAddress(pointer));
	}

	/** IntBuffer version of: {@link #glVertexAttribIPointerEXT VertexAttribIPointerEXT} */
	public static void glVertexAttribIPointerEXT(int index, int size, int type, int stride, IntBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribIPointerEXT(index, size, type, stride, memAddress(pointer));
	}

	// --- [ glGetVertexAttribIivEXT ] ---

	/** Unsafe version of {@link #glGetVertexAttribIivEXT GetVertexAttribIivEXT} */
	@JavadocExclude
	public static void nglGetVertexAttribIivEXT(int index, int pname, long params) {
		long __functionAddress = getInstance().GetVertexAttribIivEXT;
		callIIPV(__functionAddress, index, pname, params);
	}

	/**
	 * Returns the value of a pure integer generic vertex attribute parameter.
	 *
	 * @param index  the index of the pure integer generic vertex attribute to be modified
	 * @param pname  the symbolic name of the vertex attribute parameter to be queried
	 * @param params returns the requested data
	 */
	public static void glGetVertexAttribIivEXT(int index, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglGetVertexAttribIivEXT(index, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetVertexAttribIivEXT GetVertexAttribIivEXT} */
	public static void glGetVertexAttribIivEXT(int index, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglGetVertexAttribIivEXT(index, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetVertexAttribIivEXT GetVertexAttribIivEXT} */
	public static int glGetVertexAttribIiEXT(int index, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetVertexAttribIivEXT(index, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetVertexAttribIuivEXT ] ---

	/** Unsafe version of {@link #glGetVertexAttribIuivEXT GetVertexAttribIuivEXT} */
	@JavadocExclude
	public static void nglGetVertexAttribIuivEXT(int index, int pname, long params) {
		long __functionAddress = getInstance().GetVertexAttribIuivEXT;
		callIIPV(__functionAddress, index, pname, params);
	}

	/**
	 * Unsigned version of {@link #glGetVertexAttribIivEXT GetVertexAttribIivEXT}.
	 *
	 * @param index  the index of the pure integer generic vertex attribute to be modified
	 * @param pname  the symbolic name of the vertex attribute parameter to be queried
	 * @param params returns the requested data
	 */
	public static void glGetVertexAttribIuivEXT(int index, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4 << 2);
		nglGetVertexAttribIuivEXT(index, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetVertexAttribIuivEXT GetVertexAttribIuivEXT} */
	public static void glGetVertexAttribIuivEXT(int index, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 4);
		nglGetVertexAttribIuivEXT(index, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetVertexAttribIuivEXT GetVertexAttribIuivEXT} */
	public static int glGetVertexAttribIuiEXT(int index, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetVertexAttribIuivEXT(index, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetUniformuivEXT ] ---

	/** Unsafe version of {@link #glGetUniformuivEXT GetUniformuivEXT} */
	@JavadocExclude
	public static void nglGetUniformuivEXT(int program, int location, long params) {
		long __functionAddress = getInstance().GetUniformuivEXT;
		callIIPV(__functionAddress, program, location, params);
	}

	public static void glGetUniformuivEXT(int program, int location, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetUniformuivEXT(program, location, memAddress(params));
	}

	/** Alternative version of: {@link #glGetUniformuivEXT GetUniformuivEXT} */
	public static void glGetUniformuivEXT(int program, int location, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetUniformuivEXT(program, location, memAddress(params));
	}

	/** Single return value version of: {@link #glGetUniformuivEXT GetUniformuivEXT} */
	public static int glGetUniformuiEXT(int program, int location) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetUniformuivEXT(program, location, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glBindFragDataLocationEXT ] ---

	/** Unsafe version of {@link #glBindFragDataLocationEXT BindFragDataLocationEXT} */
	@JavadocExclude
	public static void nglBindFragDataLocationEXT(int program, int color, long name) {
		long __functionAddress = getInstance().BindFragDataLocationEXT;
		callIIPV(__functionAddress, program, color, name);
	}

	public static void glBindFragDataLocationEXT(int program, int color, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		nglBindFragDataLocationEXT(program, color, memAddress(name));
	}

	/** CharSequence version of: {@link #glBindFragDataLocationEXT BindFragDataLocationEXT} */
	public static void glBindFragDataLocationEXT(int program, int color, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		nglBindFragDataLocationEXT(program, color, __buffer.address(nameEncoded));
	}

	// --- [ glGetFragDataLocationEXT ] ---

	/** Unsafe version of {@link #glGetFragDataLocationEXT GetFragDataLocationEXT} */
	@JavadocExclude
	public static int nglGetFragDataLocationEXT(int program, long name) {
		long __functionAddress = getInstance().GetFragDataLocationEXT;
		return callIPI(__functionAddress, program, name);
	}

	public static int glGetFragDataLocationEXT(int program, ByteBuffer name) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		return nglGetFragDataLocationEXT(program, memAddress(name));
	}

	/** CharSequence version of: {@link #glGetFragDataLocationEXT GetFragDataLocationEXT} */
	public static int glGetFragDataLocationEXT(int program, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		return nglGetFragDataLocationEXT(program, __buffer.address(nameEncoded));
	}

	// --- [ glUniform1uiEXT ] ---

	public static void glUniform1uiEXT(int location, int v0) {
		long __functionAddress = getInstance().Uniform1uiEXT;
		callIIV(__functionAddress, location, v0);
	}

	// --- [ glUniform2uiEXT ] ---

	public static void glUniform2uiEXT(int location, int v0, int v1) {
		long __functionAddress = getInstance().Uniform2uiEXT;
		callIIIV(__functionAddress, location, v0, v1);
	}

	// --- [ glUniform3uiEXT ] ---

	public static void glUniform3uiEXT(int location, int v0, int v1, int v2) {
		long __functionAddress = getInstance().Uniform3uiEXT;
		callIIIIV(__functionAddress, location, v0, v1, v2);
	}

	// --- [ glUniform4uiEXT ] ---

	public static void glUniform4uiEXT(int location, int v0, int v1, int v2, int v3) {
		long __functionAddress = getInstance().Uniform4uiEXT;
		callIIIIIV(__functionAddress, location, v0, v1, v2, v3);
	}

	// --- [ glUniform1uivEXT ] ---

	/** Unsafe version of {@link #glUniform1uivEXT Uniform1uivEXT} */
	@JavadocExclude
	public static void nglUniform1uivEXT(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform1uivEXT;
		callIIPV(__functionAddress, location, count, value);
	}

	public static void glUniform1uivEXT(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, count << 2);
		nglUniform1uivEXT(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform1uivEXT Uniform1uivEXT} */
	public static void glUniform1uivEXT(int location, IntBuffer value) {
		nglUniform1uivEXT(location, value.remaining(), memAddress(value));
	}

	// --- [ glUniform2uivEXT ] ---

	/** Unsafe version of {@link #glUniform2uivEXT Uniform2uivEXT} */
	@JavadocExclude
	public static void nglUniform2uivEXT(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform2uivEXT;
		callIIPV(__functionAddress, location, count, value);
	}

	public static void glUniform2uivEXT(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 1) << 2);
		nglUniform2uivEXT(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform2uivEXT Uniform2uivEXT} */
	public static void glUniform2uivEXT(int location, IntBuffer value) {
		nglUniform2uivEXT(location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glUniform3uivEXT ] ---

	/** Unsafe version of {@link #glUniform3uivEXT Uniform3uivEXT} */
	@JavadocExclude
	public static void nglUniform3uivEXT(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform3uivEXT;
		callIIPV(__functionAddress, location, count, value);
	}

	public static void glUniform3uivEXT(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count * 3) << 2);
		nglUniform3uivEXT(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform3uivEXT Uniform3uivEXT} */
	public static void glUniform3uivEXT(int location, IntBuffer value) {
		nglUniform3uivEXT(location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glUniform4uivEXT ] ---

	/** Unsafe version of {@link #glUniform4uivEXT Uniform4uivEXT} */
	@JavadocExclude
	public static void nglUniform4uivEXT(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform4uivEXT;
		callIIPV(__functionAddress, location, count, value);
	}

	public static void glUniform4uivEXT(int location, int count, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, (count << 2) << 2);
		nglUniform4uivEXT(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform4uivEXT Uniform4uivEXT} */
	public static void glUniform4uivEXT(int location, IntBuffer value) {
		nglUniform4uivEXT(location, value.remaining() >> 2, memAddress(value));
	}

}