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
 * The core OpenGL 3.3 functionality. OpenGL 3.3 implementations support revision 3.30 of the OpenGL Shading Language.
 * 
 * <p>Extensions promoted to core in this release:</p>
 * 
 * <ul>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/shader_bit_encoding.txt">ARB_shader_bit_encoding</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/blend_func_extended.txt">ARB_blend_func_extended</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/explicit_attrib_location.txt">ARB_explicit_attrib_location</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/occlusion_query2.txt">ARB_occlusion_query2</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/sampler_objects.txt">ARB_sampler_objects</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/texture_rgb10_a2ui.txt">ARB_texture_rgb10_a2ui</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/texture_swizzle.txt">ARB_texture_swizzle</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/timer_query.txt">ARB_timer_query</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/instanced_arrays.txt">ARB_instanced_arrays</a></li>
 * <li><a href="http://www.opengl.org/registry/specs/ARB/vertex_type_2_10_10_10_rev.txt">ARB_vertex_type_2_10_10_10_rev</a></li>
 * </ul>
 */
public class GL33 {

	/**
	 * Accepted by the {@code src} and {@code dst} parameters of BlendFunc and BlendFunci, and by the {@code srcRGB}, {@code dstRGB}, {@code srcAlpha} and
	 * {@code dstAlpha} parameters of BlendFuncSeparate and BlendFuncSeparatei.
	 */
	public static final int
		GL_SRC1_COLOR           = 0x88F9,
		GL_ONE_MINUS_SRC1_COLOR = 0x88FA,
		GL_ONE_MINUS_SRC1_ALPHA = 0x88FB;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and GetDoublev. */
	public static final int GL_MAX_DUAL_SOURCE_DRAW_BUFFERS = 0x88FC;

	/** Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv. */
	public static final int GL_ANY_SAMPLES_PASSED = 0x8C2F;

	/** Accepted by the {@code value} parameter of the GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv and GetDoublev functions. */
	public static final int GL_SAMPLER_BINDING = 0x8919;

	/**
	 * Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, RenderbufferStorage and
	 * RenderbufferStorageMultisample.
	 */
	public static final int GL_RGB10_A2UI = 0x906F;

	/** Accepted by the {@code pname} parameters of TexParameteri, TexParameterf, TexParameteriv, TexParameterfv, GetTexParameterfv, and GetTexParameteriv. */
	public static final int
		GL_TEXTURE_SWIZZLE_R = 0x8E42,
		GL_TEXTURE_SWIZZLE_G = 0x8E43,
		GL_TEXTURE_SWIZZLE_B = 0x8E44,
		GL_TEXTURE_SWIZZLE_A = 0x8E45;

	/** Accepted by the {@code pname} parameters of TexParameteriv,  TexParameterfv, GetTexParameterfv, and GetTexParameteriv. */
	public static final int GL_TEXTURE_SWIZZLE_RGBA = 0x8E46;

	/** Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv. */
	public static final int GL_TIME_ELAPSED = 0x88BF;

	/**
	 * Accepted by the {@code target} parameter of GetQueryiv and QueryCounter. Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv,
	 * GetInteger64v, GetFloatv, and GetDoublev.
	 */
	public static final int GL_TIMESTAMP = 0x8E28;

	/** Accepted by the {@code pname} parameters of GetVertexAttribdv, GetVertexAttribfv, and GetVertexAttribiv. */
	public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR = 0x88FE;

	/**
	 * Accepted by the {@code type} parameter of VertexAttribPointer, VertexPointer, NormalPointer, ColorPointer, SecondaryColorPointer, TexCoordPointer,
	 * VertexAttribP{1234}ui, VertexP*, TexCoordP*, MultiTexCoordP*, NormalP3ui, ColorP*, SecondaryColorP* and VertexAttribP*.
	 */
	public static final int GL_INT_2_10_10_10_REV = 0x8D9F;

	protected GL33() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps, boolean fc) {
		return (fc || checkFunctions(
			caps.glVertexP2ui, caps.glVertexP3ui, caps.glVertexP4ui, caps.glVertexP2uiv, caps.glVertexP3uiv, caps.glVertexP4uiv, caps.glTexCoordP1ui, 
			caps.glTexCoordP2ui, caps.glTexCoordP3ui, caps.glTexCoordP4ui, caps.glTexCoordP1uiv, caps.glTexCoordP2uiv, caps.glTexCoordP3uiv, 
			caps.glTexCoordP4uiv, caps.glMultiTexCoordP1ui, caps.glMultiTexCoordP2ui, caps.glMultiTexCoordP3ui, caps.glMultiTexCoordP4ui, 
			caps.glMultiTexCoordP1uiv, caps.glMultiTexCoordP2uiv, caps.glMultiTexCoordP3uiv, caps.glMultiTexCoordP4uiv, caps.glNormalP3ui, caps.glNormalP3uiv, 
			caps.glColorP3ui, caps.glColorP4ui, caps.glColorP3uiv, caps.glColorP4uiv, caps.glSecondaryColorP3ui, caps.glSecondaryColorP3uiv
		)) && checkFunctions(
			caps.glBindFragDataLocationIndexed, caps.glGetFragDataIndex, caps.glGenSamplers, caps.glDeleteSamplers, caps.glIsSampler, caps.glBindSampler, 
			caps.glSamplerParameteri, caps.glSamplerParameterf, caps.glSamplerParameteriv, caps.glSamplerParameterfv, caps.glSamplerParameterIiv, 
			caps.glSamplerParameterIuiv, caps.glGetSamplerParameteriv, caps.glGetSamplerParameterfv, caps.glGetSamplerParameterIiv, 
			caps.glGetSamplerParameterIuiv, caps.glQueryCounter, caps.glGetQueryObjecti64v, caps.glGetQueryObjectui64v, caps.glVertexAttribDivisor, 
			caps.glVertexAttribP1ui, caps.glVertexAttribP2ui, caps.glVertexAttribP3ui, caps.glVertexAttribP4ui, caps.glVertexAttribP1uiv, 
			caps.glVertexAttribP2uiv, caps.glVertexAttribP3uiv, caps.glVertexAttribP4uiv
		);
	}

	// --- [ glBindFragDataLocationIndexed ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBindFragDataLocationIndexed.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Binds a user-defined varying out variable to a fragment shader color number and index.
	 *
	 * @param program     the name of the program containing varying out variable whose binding to modify
	 * @param colorNumber the color number to bind the user-defined varying out variable to
	 * @param index       the index of the color input to bind the user-defined varying out variable to
	 * @param name        the name of the user-defined varying out variable whose binding to modify
	 */
	public static void nglBindFragDataLocationIndexed(int program, int colorNumber, int index, long name) {
		long __functionAddress = GL.getCapabilities().glBindFragDataLocationIndexed;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, colorNumber, index, name);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBindFragDataLocationIndexed.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Binds a user-defined varying out variable to a fragment shader color number and index.
	 *
	 * @param program     the name of the program containing varying out variable whose binding to modify
	 * @param colorNumber the color number to bind the user-defined varying out variable to
	 * @param index       the index of the color input to bind the user-defined varying out variable to
	 * @param name        the name of the user-defined varying out variable whose binding to modify
	 */
	public static void glBindFragDataLocationIndexed(int program, int colorNumber, int index, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		nglBindFragDataLocationIndexed(program, colorNumber, index, memAddress(name));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBindFragDataLocationIndexed.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Binds a user-defined varying out variable to a fragment shader color number and index.
	 *
	 * @param program     the name of the program containing varying out variable whose binding to modify
	 * @param colorNumber the color number to bind the user-defined varying out variable to
	 * @param index       the index of the color input to bind the user-defined varying out variable to
	 * @param name        the name of the user-defined varying out variable whose binding to modify
	 */
	public static void glBindFragDataLocationIndexed(int program, int colorNumber, int index, CharSequence name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.ASCII(name);
			nglBindFragDataLocationIndexed(program, colorNumber, index, memAddress(nameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetFragDataIndex ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetFragDataIndex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries the bindings of color indices to user-defined varying out variables.
	 *
	 * @param program the name of the program containing varying out variable whose binding to query
	 * @param name    the name of the user-defined varying out variable whose index to query
	 */
	public static int nglGetFragDataIndex(int program, long name) {
		long __functionAddress = GL.getCapabilities().glGetFragDataIndex;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPI(__functionAddress, program, name);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetFragDataIndex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries the bindings of color indices to user-defined varying out variables.
	 *
	 * @param program the name of the program containing varying out variable whose binding to query
	 * @param name    the name of the user-defined varying out variable whose index to query
	 */
	public static int glGetFragDataIndex(int program, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nglGetFragDataIndex(program, memAddress(name));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetFragDataIndex.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Queries the bindings of color indices to user-defined varying out variables.
	 *
	 * @param program the name of the program containing varying out variable whose binding to query
	 * @param name    the name of the user-defined varying out variable whose index to query
	 */
	public static int glGetFragDataIndex(int program, CharSequence name) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.ASCII(name);
			return nglGetFragDataIndex(program, memAddress(nameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGenSamplers ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGenSamplers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Generates sampler object names.
	 *
	 * @param count    the number of sampler object names to generate
	 * @param samplers a buffer in which the generated sampler object names are stored
	 */
	public static void nglGenSamplers(int count, long samplers) {
		long __functionAddress = GL.getCapabilities().glGenSamplers;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, count, samplers);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGenSamplers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Generates sampler object names.
	 *
	 * @param samplers a buffer in which the generated sampler object names are stored
	 */
	public static void glGenSamplers(IntBuffer samplers) {
		nglGenSamplers(samplers.remaining(), memAddress(samplers));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGenSamplers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Generates sampler object names.
	 */
	public static int glGenSamplers() {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer samplers = stack.callocInt(1);
			nglGenSamplers(1, memAddress(samplers));
			return samplers.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glDeleteSamplers ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDeleteSamplers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Deletes named sampler objects.
	 *
	 * @param count    the number of sampler objects to be deleted
	 * @param samplers an array of sampler objects to be deleted
	 */
	public static void nglDeleteSamplers(int count, long samplers) {
		long __functionAddress = GL.getCapabilities().glDeleteSamplers;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, count, samplers);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDeleteSamplers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Deletes named sampler objects.
	 *
	 * @param samplers an array of sampler objects to be deleted
	 */
	public static void glDeleteSamplers(IntBuffer samplers) {
		nglDeleteSamplers(samplers.remaining(), memAddress(samplers));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDeleteSamplers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Deletes named sampler objects.
	 */
	public static void glDeleteSamplers(int sampler) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer samplers = stack.ints(sampler);
			nglDeleteSamplers(1, memAddress(samplers));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glIsSampler ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glIsSampler.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Determines if a name corresponds to a sampler object.
	 *
	 * @param sampler a value that may be the name of a sampler object
	 */
	public static boolean glIsSampler(int sampler) {
		long __functionAddress = GL.getCapabilities().glIsSampler;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callZ(__functionAddress, sampler);
	}

	// --- [ glBindSampler ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBindSampler.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Binds a named sampler to a texturing target.
	 *
	 * @param unit    the index of the texture unit to which the sampler is bound
	 * @param sampler the name of a sampler
	 */
	public static void glBindSampler(int unit, int sampler) {
		long __functionAddress = GL.getCapabilities().glBindSampler;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, unit, sampler);
	}

	// --- [ glSamplerParameteri ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glSamplerParameteri.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Set the integer value of a sampler parameter.
	 *
	 * @param sampler the sampler object whose parameter to modify
	 * @param pname   the symbolic name of a single-valued sampler parameter. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td></tr><tr><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr></table>
	 * @param param   the value of {@code pname}
	 */
	public static void glSamplerParameteri(int sampler, int pname, int param) {
		long __functionAddress = GL.getCapabilities().glSamplerParameteri;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, sampler, pname, param);
	}

	// --- [ glSamplerParameterf ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glSamplerParameterf.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Float version of {@link #glSamplerParameteri SamplerParameteri}.
	 *
	 * @param sampler the sampler object whose parameter to modify
	 * @param pname   the symbolic name of a single-valued sampler parameter
	 * @param param   the value of {@code pname}
	 */
	public static void glSamplerParameterf(int sampler, int pname, float param) {
		long __functionAddress = GL.getCapabilities().glSamplerParameterf;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, sampler, pname, param);
	}

	// --- [ glSamplerParameteriv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glSamplerParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glSamplerParameteri SamplerParameteri}.
	 *
	 * @param sampler the sampler object whose parameter to modify
	 * @param pname   the symbolic name of a sampler parameter. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td></tr><tr><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td></tr><tr><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr></table>
	 * @param params  an array where the value or values of {@code pname} are stored
	 */
	public static void nglSamplerParameteriv(int sampler, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glSamplerParameteriv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glSamplerParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glSamplerParameteri SamplerParameteri}.
	 *
	 * @param sampler the sampler object whose parameter to modify
	 * @param pname   the symbolic name of a sampler parameter. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td></tr><tr><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td></tr><tr><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr></table>
	 * @param params  an array where the value or values of {@code pname} are stored
	 */
	public static void glSamplerParameteriv(int sampler, int pname, IntBuffer params) {
		nglSamplerParameteriv(sampler, pname, memAddress(params));
	}

	// --- [ glSamplerParameterfv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glSamplerParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Float version of {@link #glSamplerParameteriv SamplerParameteriv}.
	 *
	 * @param sampler the sampler object whose parameter to modify
	 * @param pname   the symbolic name of a sampler parameter
	 * @param params  an array where the value or values of {@code pname} are stored
	 */
	public static void nglSamplerParameterfv(int sampler, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glSamplerParameterfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glSamplerParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Float version of {@link #glSamplerParameteriv SamplerParameteriv}.
	 *
	 * @param sampler the sampler object whose parameter to modify
	 * @param pname   the symbolic name of a sampler parameter
	 * @param params  an array where the value or values of {@code pname} are stored
	 */
	public static void glSamplerParameterfv(int sampler, int pname, FloatBuffer params) {
		nglSamplerParameterfv(sampler, pname, memAddress(params));
	}

	// --- [ glSamplerParameterIiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glSamplerParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pure integer version of {@link #glSamplerParameteriv SamplerParameteriv}.
	 *
	 * @param sampler the sampler object whose parameter to modify
	 * @param pname   the symbolic name of a sampler parameter
	 * @param params  an array where the value or values of {@code pname} are stored
	 */
	public static void nglSamplerParameterIiv(int sampler, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glSamplerParameterIiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glSamplerParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pure integer version of {@link #glSamplerParameteriv SamplerParameteriv}.
	 *
	 * @param sampler the sampler object whose parameter to modify
	 * @param pname   the symbolic name of a sampler parameter
	 * @param params  an array where the value or values of {@code pname} are stored
	 */
	public static void glSamplerParameterIiv(int sampler, int pname, IntBuffer params) {
		nglSamplerParameterIiv(sampler, pname, memAddress(params));
	}

	// --- [ glSamplerParameterIuiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glSamplerParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Unsigned pure integer version of {@link #glSamplerParameteriv SamplerParameteriv}.
	 *
	 * @param sampler the sampler object whose parameter to modify
	 * @param pname   the symbolic name of a sampler parameter
	 * @param params  an array where the value or values of {@code pname} are stored
	 */
	public static void nglSamplerParameterIuiv(int sampler, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glSamplerParameterIuiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glSamplerParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Unsigned pure integer version of {@link #glSamplerParameteriv SamplerParameteriv}.
	 *
	 * @param sampler the sampler object whose parameter to modify
	 * @param pname   the symbolic name of a sampler parameter
	 * @param params  an array where the value or values of {@code pname} are stored
	 */
	public static void glSamplerParameterIuiv(int sampler, int pname, IntBuffer params) {
		nglSamplerParameterIuiv(sampler, pname, memAddress(params));
	}

	// --- [ glGetSamplerParameteriv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetSamplerParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Return the integer value(s) of a sampler parameter.
	 *
	 * @param sampler the name of the sampler object from which to retrieve parameters
	 * @param pname   the symbolic name of a sampler parameter. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td></tr><tr><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr><tr><td>,</td><td>{@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td></tr></table>
	 * @param params  the sampler parameters
	 */
	public static void nglGetSamplerParameteriv(int sampler, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetSamplerParameteriv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetSamplerParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Return the integer value(s) of a sampler parameter.
	 *
	 * @param sampler the name of the sampler object from which to retrieve parameters
	 * @param pname   the symbolic name of a sampler parameter. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td></tr><tr><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr><tr><td>,</td><td>{@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td></tr></table>
	 * @param params  the sampler parameters
	 */
	public static void glGetSamplerParameteriv(int sampler, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetSamplerParameteriv(sampler, pname, memAddress(params));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetSamplerParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Return the integer value(s) of a sampler parameter.
	 *
	 * @param sampler the name of the sampler object from which to retrieve parameters
	 * @param pname   the symbolic name of a sampler parameter. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td></tr><tr><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr><tr><td>,</td><td>{@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td></tr></table>
	 */
	public static int glGetSamplerParameteri(int sampler, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetSamplerParameteriv(sampler, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetSamplerParameterfv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetSamplerParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Float version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.
	 *
	 * @param sampler the name of the sampler object from which to retrieve parameters
	 * @param pname   the symbolic name of a sampler parameter
	 * @param params  the sampler parameters
	 */
	public static void nglGetSamplerParameterfv(int sampler, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetSamplerParameterfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetSamplerParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Float version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.
	 *
	 * @param sampler the name of the sampler object from which to retrieve parameters
	 * @param pname   the symbolic name of a sampler parameter
	 * @param params  the sampler parameters
	 */
	public static void glGetSamplerParameterfv(int sampler, int pname, FloatBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetSamplerParameterfv(sampler, pname, memAddress(params));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetSamplerParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Float version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.
	 *
	 * @param sampler the name of the sampler object from which to retrieve parameters
	 * @param pname   the symbolic name of a sampler parameter
	 */
	public static float glGetSamplerParameterf(int sampler, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			FloatBuffer params = stack.callocFloat(1);
			nglGetSamplerParameterfv(sampler, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetSamplerParameterIiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetSamplerParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pure integer version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.
	 *
	 * @param sampler the name of the sampler object from which to retrieve parameters
	 * @param pname   the symbolic name of a sampler parameter
	 * @param params  the sampler parameters
	 */
	public static void nglGetSamplerParameterIiv(int sampler, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetSamplerParameterIiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetSamplerParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pure integer version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.
	 *
	 * @param sampler the name of the sampler object from which to retrieve parameters
	 * @param pname   the symbolic name of a sampler parameter
	 * @param params  the sampler parameters
	 */
	public static void glGetSamplerParameterIiv(int sampler, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetSamplerParameterIiv(sampler, pname, memAddress(params));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetSamplerParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pure integer version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.
	 *
	 * @param sampler the name of the sampler object from which to retrieve parameters
	 * @param pname   the symbolic name of a sampler parameter
	 */
	public static int glGetSamplerParameterIi(int sampler, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetSamplerParameterIiv(sampler, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetSamplerParameterIuiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetSamplerParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Unsigned pure integer version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.
	 *
	 * @param sampler the name of the sampler object from which to retrieve parameters
	 * @param pname   the symbolic name of a sampler parameter
	 * @param params  the sampler parameters
	 */
	public static void nglGetSamplerParameterIuiv(int sampler, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetSamplerParameterIuiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetSamplerParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Unsigned pure integer version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.
	 *
	 * @param sampler the name of the sampler object from which to retrieve parameters
	 * @param pname   the symbolic name of a sampler parameter
	 * @param params  the sampler parameters
	 */
	public static void glGetSamplerParameterIuiv(int sampler, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetSamplerParameterIuiv(sampler, pname, memAddress(params));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetSamplerParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Unsigned pure integer version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.
	 *
	 * @param sampler the name of the sampler object from which to retrieve parameters
	 * @param pname   the symbolic name of a sampler parameter
	 */
	public static int glGetSamplerParameterIui(int sampler, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			IntBuffer params = stack.callocInt(1);
			nglGetSamplerParameterIuiv(sampler, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glQueryCounter ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glQueryCounter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Records the GL time into a query object after all previous commands have reached the GL server but have not yet necessarily executed.
	 *
	 * @param id     the name of a query object into which to record the GL time
	 * @param target the counter to query. Must be:<br><table><tr><td>{@link #GL_TIMESTAMP TIMESTAMP}</td></tr></table>
	 */
	public static void glQueryCounter(int id, int target) {
		long __functionAddress = GL.getCapabilities().glQueryCounter;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, id, target);
	}

	// --- [ glGetQueryObjecti64v ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetQueryObject.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the 64bit integer value of query object parameter.
	 *
	 * @param id     the name of a query object
	 * @param pname  the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link GL15#GL_QUERY_RESULT QUERY_RESULT}</td><td>{@link GL15#GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}</td></tr></table>
	 * @param params the requested data
	 */
	public static void nglGetQueryObjecti64v(int id, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetQueryObjecti64v;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, id, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetQueryObject.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the 64bit integer value of query object parameter.
	 *
	 * @param id     the name of a query object
	 * @param pname  the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link GL15#GL_QUERY_RESULT QUERY_RESULT}</td><td>{@link GL15#GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}</td></tr></table>
	 * @param params the requested data
	 */
	public static void glGetQueryObjecti64v(int id, int pname, LongBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetQueryObjecti64v(id, pname, memAddress(params));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetQueryObject.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the 64bit integer value of query object parameter.
	 *
	 * @param id    the name of a query object
	 * @param pname the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link GL15#GL_QUERY_RESULT QUERY_RESULT}</td><td>{@link GL15#GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}</td></tr></table>
	 */
	public static long glGetQueryObjecti64(int id, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer params = stack.callocLong(1);
			nglGetQueryObjecti64v(id, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glGetQueryObjectui64v ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetQueryObject.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Unsigned version of {@link #glGetQueryObjecti64v GetQueryObjecti64v}.
	 *
	 * @param id     the name of a query object
	 * @param pname  the symbolic name of a query object parameter
	 * @param params the requested data
	 */
	public static void nglGetQueryObjectui64v(int id, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetQueryObjectui64v;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, id, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetQueryObject.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Unsigned version of {@link #glGetQueryObjecti64v GetQueryObjecti64v}.
	 *
	 * @param id     the name of a query object
	 * @param pname  the symbolic name of a query object parameter
	 * @param params the requested data
	 */
	public static void glGetQueryObjectui64v(int id, int pname, LongBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetQueryObjectui64v(id, pname, memAddress(params));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetQueryObject.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Unsigned version of {@link #glGetQueryObjecti64v GetQueryObjecti64v}.
	 *
	 * @param id    the name of a query object
	 * @param pname the symbolic name of a query object parameter
	 */
	public static long glGetQueryObjectui64(int id, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer params = stack.callocLong(1);
			nglGetQueryObjectui64v(id, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ glVertexAttribDivisor ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribDivisor.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Modifies the rate at which generic vertex attributes advance during instanced rendering.
	 *
	 * @param index   the index of the generic vertex attribute
	 * @param divisor the number of instances that will pass between updates of the generic attribute at slot {@code index}
	 */
	public static void glVertexAttribDivisor(int index, int divisor) {
		long __functionAddress = GL.getCapabilities().glVertexAttribDivisor;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, divisor);
	}

	// --- [ glVertexP2ui ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertexP2ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL11#glVertex2f Vertex2f}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param value the packed value
	 */
	public static void glVertexP2ui(int type, int value) {
		long __functionAddress = GL.getCapabilities().glVertexP2ui;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, type, value);
	}

	// --- [ glVertexP3ui ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertexP3ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL11#glVertex3f Vertex3f}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param value the packed value
	 */
	public static void glVertexP3ui(int type, int value) {
		long __functionAddress = GL.getCapabilities().glVertexP3ui;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, type, value);
	}

	// --- [ glVertexP4ui ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertexP4ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL11#glVertex4f Vertex4f}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param value the packed value
	 */
	public static void glVertexP4ui(int type, int value) {
		long __functionAddress = GL.getCapabilities().glVertexP4ui;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, type, value);
	}

	// --- [ glVertexP2uiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertexP2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertexP2ui VertexP2ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param value the packed value
	 */
	public static void nglVertexP2uiv(int type, long value) {
		long __functionAddress = GL.getCapabilities().glVertexP2uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, type, value);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertexP2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertexP2ui VertexP2ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param value the packed value
	 */
	public static void glVertexP2uiv(int type, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nglVertexP2uiv(type, memAddress(value));
	}

	// --- [ glVertexP3uiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertexP3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertexP3ui VertexP3ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param value the packed value
	 */
	public static void nglVertexP3uiv(int type, long value) {
		long __functionAddress = GL.getCapabilities().glVertexP3uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, type, value);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertexP3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertexP3ui VertexP3ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param value the packed value
	 */
	public static void glVertexP3uiv(int type, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nglVertexP3uiv(type, memAddress(value));
	}

	// --- [ glVertexP4uiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertexP4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertexP4ui VertexP4ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param value the packed value
	 */
	public static void nglVertexP4uiv(int type, long value) {
		long __functionAddress = GL.getCapabilities().glVertexP4uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, type, value);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertexP4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertexP4ui VertexP4ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param value the packed value
	 */
	public static void glVertexP4uiv(int type, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nglVertexP4uiv(type, memAddress(value));
	}

	// --- [ glTexCoordP1ui ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoordP1ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL11#glTexCoord1f TexCoord1f}.
	 *
	 * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords the packed value
	 */
	public static void glTexCoordP1ui(int type, int coords) {
		long __functionAddress = GL.getCapabilities().glTexCoordP1ui;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, type, coords);
	}

	// --- [ glTexCoordP2ui ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoordP2ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL11#glTexCoord2f TexCoord2f}.
	 *
	 * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords the packed value
	 */
	public static void glTexCoordP2ui(int type, int coords) {
		long __functionAddress = GL.getCapabilities().glTexCoordP2ui;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, type, coords);
	}

	// --- [ glTexCoordP3ui ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoordP3ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL11#glTexCoord3f TexCoord3f}.
	 *
	 * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords the packed value
	 */
	public static void glTexCoordP3ui(int type, int coords) {
		long __functionAddress = GL.getCapabilities().glTexCoordP3ui;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, type, coords);
	}

	// --- [ glTexCoordP4ui ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoordP4ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL11#glTexCoord4f TexCoord4f}.
	 *
	 * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords the packed value
	 */
	public static void glTexCoordP4ui(int type, int coords) {
		long __functionAddress = GL.getCapabilities().glTexCoordP4ui;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, type, coords);
	}

	// --- [ glTexCoordP1uiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoordP1.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoordP1ui TexCoordP1ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords the packed value
	 */
	public static void nglTexCoordP1uiv(int type, long coords) {
		long __functionAddress = GL.getCapabilities().glTexCoordP1uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, type, coords);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoordP1.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoordP1ui TexCoordP1ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords the packed value
	 */
	public static void glTexCoordP1uiv(int type, IntBuffer coords) {
		if ( CHECKS )
			checkBuffer(coords, 1);
		nglTexCoordP1uiv(type, memAddress(coords));
	}

	// --- [ glTexCoordP2uiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoordP2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoordP2ui TexCoordP2ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords the packed value
	 */
	public static void nglTexCoordP2uiv(int type, long coords) {
		long __functionAddress = GL.getCapabilities().glTexCoordP2uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, type, coords);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoordP2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoordP2ui TexCoordP2ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords the packed value
	 */
	public static void glTexCoordP2uiv(int type, IntBuffer coords) {
		if ( CHECKS )
			checkBuffer(coords, 1);
		nglTexCoordP2uiv(type, memAddress(coords));
	}

	// --- [ glTexCoordP3uiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoordP3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoordP3ui TexCoordP3ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords the packed value
	 */
	public static void nglTexCoordP3uiv(int type, long coords) {
		long __functionAddress = GL.getCapabilities().glTexCoordP3uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, type, coords);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoordP3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoordP3ui TexCoordP3ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords the packed value
	 */
	public static void glTexCoordP3uiv(int type, IntBuffer coords) {
		if ( CHECKS )
			checkBuffer(coords, 1);
		nglTexCoordP3uiv(type, memAddress(coords));
	}

	// --- [ glTexCoordP4uiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoordP4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoordP4ui TexCoordP4ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords the packed value
	 */
	public static void nglTexCoordP4uiv(int type, long coords) {
		long __functionAddress = GL.getCapabilities().glTexCoordP4uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, type, coords);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoordP4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoordP4ui TexCoordP4ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords the packed value
	 */
	public static void glTexCoordP4uiv(int type, IntBuffer coords) {
		if ( CHECKS )
			checkBuffer(coords, 1);
		nglTexCoordP4uiv(type, memAddress(coords));
	}

	// --- [ glMultiTexCoordP1ui ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoordP1ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL13#glMultiTexCoord1f MultiTexCoord1f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br><table><tr><td>type</td><td>of</td><td>packing</td><td>used</td><td>on</td><td>the</td><td>data</td></tr></table>
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP1ui(int texture, int type, int coords) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoordP1ui;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, type, coords);
	}

	// --- [ glMultiTexCoordP2ui ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoordP2ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL13#glMultiTexCoord2f MultiTexCoord2f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br><table><tr><td>type</td><td>of</td><td>packing</td><td>used</td><td>on</td><td>the</td><td>data</td></tr></table>
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP2ui(int texture, int type, int coords) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoordP2ui;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, type, coords);
	}

	// --- [ glMultiTexCoordP3ui ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoordP3ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL13#glMultiTexCoord3f MultiTexCoord3f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br><table><tr><td>type</td><td>of</td><td>packing</td><td>used</td><td>on</td><td>the</td><td>data</td></tr></table>
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP3ui(int texture, int type, int coords) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoordP3ui;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, type, coords);
	}

	// --- [ glMultiTexCoordP4ui ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoordP4ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL13#glMultiTexCoord4f MultiTexCoord4f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br><table><tr><td>type</td><td>of</td><td>packing</td><td>used</td><td>on</td><td>the</td><td>data</td></tr></table>
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP4ui(int texture, int type, int coords) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoordP4ui;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, texture, type, coords);
	}

	// --- [ glMultiTexCoordP1uiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoordP1.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMultiTexCoordP1ui MultiTexCoordP1ui}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords  the packed value
	 */
	public static void nglMultiTexCoordP1uiv(int texture, int type, long coords) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoordP1uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, type, coords);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoordP1.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMultiTexCoordP1ui MultiTexCoordP1ui}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP1uiv(int texture, int type, IntBuffer coords) {
		if ( CHECKS )
			checkBuffer(coords, 1);
		nglMultiTexCoordP1uiv(texture, type, memAddress(coords));
	}

	// --- [ glMultiTexCoordP2uiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoordP2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMultiTexCoordP2ui MultiTexCoordP2ui}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords  the packed value
	 */
	public static void nglMultiTexCoordP2uiv(int texture, int type, long coords) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoordP2uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, type, coords);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoordP2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMultiTexCoordP2ui MultiTexCoordP2ui}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP2uiv(int texture, int type, IntBuffer coords) {
		if ( CHECKS )
			checkBuffer(coords, 1);
		nglMultiTexCoordP2uiv(texture, type, memAddress(coords));
	}

	// --- [ glMultiTexCoordP3uiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoordP3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMultiTexCoordP3ui MultiTexCoordP3ui}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords  the packed value
	 */
	public static void nglMultiTexCoordP3uiv(int texture, int type, long coords) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoordP3uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, type, coords);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoordP3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMultiTexCoordP3ui MultiTexCoordP3ui}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP3uiv(int texture, int type, IntBuffer coords) {
		if ( CHECKS )
			checkBuffer(coords, 1);
		nglMultiTexCoordP3uiv(texture, type, memAddress(coords));
	}

	// --- [ glMultiTexCoordP4uiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoordP4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMultiTexCoordP4ui MultiTexCoordP4ui}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords  the packed value
	 */
	public static void nglMultiTexCoordP4uiv(int texture, int type, long coords) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoordP4uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, texture, type, coords);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoordP4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMultiTexCoordP4ui MultiTexCoordP4ui}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP4uiv(int texture, int type, IntBuffer coords) {
		if ( CHECKS )
			checkBuffer(coords, 1);
		nglMultiTexCoordP4uiv(texture, type, memAddress(coords));
	}

	// --- [ glNormalP3ui ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glNormalP3ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL11#glNormal3f Normal3f}.
	 *
	 * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords the packed value
	 */
	public static void glNormalP3ui(int type, int coords) {
		long __functionAddress = GL.getCapabilities().glNormalP3ui;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, type, coords);
	}

	// --- [ glNormalP3uiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glNormalP3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version {@link #glNormalP3ui NormalP3ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords the packed value
	 */
	public static void nglNormalP3uiv(int type, long coords) {
		long __functionAddress = GL.getCapabilities().glNormalP3uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, type, coords);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glNormalP3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version {@link #glNormalP3ui NormalP3ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param coords the packed value
	 */
	public static void glNormalP3uiv(int type, IntBuffer coords) {
		if ( CHECKS )
			checkBuffer(coords, 1);
		nglNormalP3uiv(type, memAddress(coords));
	}

	// --- [ glColorP3ui ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColorP3ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL11#glColor3f Color3f}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param color the packed value
	 */
	public static void glColorP3ui(int type, int color) {
		long __functionAddress = GL.getCapabilities().glColorP3ui;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, type, color);
	}

	// --- [ glColorP4ui ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColorP4ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL11#glColor4f Color4f}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param color the packed value
	 */
	public static void glColorP4ui(int type, int color) {
		long __functionAddress = GL.getCapabilities().glColorP4ui;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, type, color);
	}

	// --- [ glColorP3uiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColorP3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColorP3ui ColorP3ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param color the packed value
	 */
	public static void nglColorP3uiv(int type, long color) {
		long __functionAddress = GL.getCapabilities().glColorP3uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, type, color);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColorP3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColorP3ui ColorP3ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param color the packed value
	 */
	public static void glColorP3uiv(int type, IntBuffer color) {
		if ( CHECKS )
			checkBuffer(color, 1);
		nglColorP3uiv(type, memAddress(color));
	}

	// --- [ glColorP4uiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColorP4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColorP4ui ColorP4ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param color the packed value
	 */
	public static void nglColorP4uiv(int type, long color) {
		long __functionAddress = GL.getCapabilities().glColorP4uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, type, color);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColorP4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColorP4ui ColorP4ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param color the packed value
	 */
	public static void glColorP4uiv(int type, IntBuffer color) {
		if ( CHECKS )
			checkBuffer(color, 1);
		nglColorP4uiv(type, memAddress(color));
	}

	// --- [ glSecondaryColorP3ui ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColorP3ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL14#glSecondaryColor3f SecondaryColor3f}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param color the packed value
	 */
	public static void glSecondaryColorP3ui(int type, int color) {
		long __functionAddress = GL.getCapabilities().glSecondaryColorP3ui;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, type, color);
	}

	// --- [ glSecondaryColorP3uiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColorP3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glSecondaryColorP3ui SecondaryColorP3ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param color the packed value
	 */
	public static void nglSecondaryColorP3uiv(int type, long color) {
		long __functionAddress = GL.getCapabilities().glSecondaryColorP3uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, type, color);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColorP3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glSecondaryColorP3ui SecondaryColorP3ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param color the packed value
	 */
	public static void glSecondaryColorP3uiv(int type, IntBuffer color) {
		if ( CHECKS )
			checkBuffer(color, 1);
		nglSecondaryColorP3uiv(type, memAddress(color));
	}

	// --- [ glVertexAttribP1ui ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribP1ui.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Packed component version of {@link GL20#glVertexAttrib1f VertexAttrib1f}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP1ui(int index, int type, boolean normalized, int value) {
		long __functionAddress = GL.getCapabilities().glVertexAttribP1ui;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, type, normalized, value);
	}

	// --- [ glVertexAttribP2ui ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribP2ui.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Packed component version of {@link GL20#glVertexAttrib2f VertexAttrib2f}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP2ui(int index, int type, boolean normalized, int value) {
		long __functionAddress = GL.getCapabilities().glVertexAttribP2ui;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, type, normalized, value);
	}

	// --- [ glVertexAttribP3ui ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribP3ui.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Packed component version of {@link GL20#glVertexAttrib3f VertexAttrib3f}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP3ui(int index, int type, boolean normalized, int value) {
		long __functionAddress = GL.getCapabilities().glVertexAttribP3ui;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, type, normalized, value);
	}

	// --- [ glVertexAttribP4ui ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribP4ui.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Packed component version of {@link GL20#glVertexAttrib4f VertexAttrib4f}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP4ui(int index, int type, boolean normalized, int value) {
		long __functionAddress = GL.getCapabilities().glVertexAttribP4ui;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, type, normalized, value);
	}

	// --- [ glVertexAttribP1uiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribP1.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttribP1ui VertexAttribP1ui}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void nglVertexAttribP1uiv(int index, int type, boolean normalized, long value) {
		long __functionAddress = GL.getCapabilities().glVertexAttribP1uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, type, normalized, value);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribP1.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttribP1ui VertexAttribP1ui}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP1uiv(int index, int type, boolean normalized, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nglVertexAttribP1uiv(index, type, normalized, memAddress(value));
	}

	// --- [ glVertexAttribP2uiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribP2.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttribP2ui VertexAttribP2ui}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void nglVertexAttribP2uiv(int index, int type, boolean normalized, long value) {
		long __functionAddress = GL.getCapabilities().glVertexAttribP2uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, type, normalized, value);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribP2.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttribP2ui VertexAttribP2ui}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP2uiv(int index, int type, boolean normalized, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nglVertexAttribP2uiv(index, type, normalized, memAddress(value));
	}

	// --- [ glVertexAttribP3uiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribP3.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttribP3ui VertexAttribP3ui}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void nglVertexAttribP3uiv(int index, int type, boolean normalized, long value) {
		long __functionAddress = GL.getCapabilities().glVertexAttribP3uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, type, normalized, value);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribP3.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttribP3ui VertexAttribP3ui}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP3uiv(int index, int type, boolean normalized, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nglVertexAttribP3uiv(index, type, normalized, memAddress(value));
	}

	// --- [ glVertexAttribP4uiv ] ---

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribP4.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttribP4ui VertexAttribP4ui}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void nglVertexAttribP4uiv(int index, int type, boolean normalized, long value) {
		long __functionAddress = GL.getCapabilities().glVertexAttribP4uiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, type, normalized, value);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribP4.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttribP4ui VertexAttribP4ui}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP4uiv(int index, int type, boolean normalized, IntBuffer value) {
		if ( CHECKS )
			checkBuffer(value, 1);
		nglVertexAttribP4uiv(index, type, normalized, memAddress(value));
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGenSamplers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGenSamplers GenSamplers}
	 */
	public static void glGenSamplers(int[] samplers) {
		long __functionAddress = GL.getCapabilities().glGenSamplers;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, samplers.length, samplers);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDeleteSamplers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glDeleteSamplers DeleteSamplers}
	 */
	public static void glDeleteSamplers(int[] samplers) {
		long __functionAddress = GL.getCapabilities().glDeleteSamplers;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, samplers.length, samplers);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glSamplerParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glSamplerParameteriv SamplerParameteriv}
	 */
	public static void glSamplerParameteriv(int sampler, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glSamplerParameteriv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glSamplerParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glSamplerParameterfv SamplerParameterfv}
	 */
	public static void glSamplerParameterfv(int sampler, int pname, float[] params) {
		long __functionAddress = GL.getCapabilities().glSamplerParameterfv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glSamplerParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glSamplerParameterIiv SamplerParameterIiv}
	 */
	public static void glSamplerParameterIiv(int sampler, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glSamplerParameterIiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glSamplerParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glSamplerParameterIuiv SamplerParameterIuiv}
	 */
	public static void glSamplerParameterIuiv(int sampler, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glSamplerParameterIuiv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, sampler, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetSamplerParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetSamplerParameteriv GetSamplerParameteriv}
	 */
	public static void glGetSamplerParameteriv(int sampler, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetSamplerParameteriv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, sampler, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetSamplerParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetSamplerParameterfv GetSamplerParameterfv}
	 */
	public static void glGetSamplerParameterfv(int sampler, int pname, float[] params) {
		long __functionAddress = GL.getCapabilities().glGetSamplerParameterfv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, sampler, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetSamplerParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetSamplerParameterIiv GetSamplerParameterIiv}
	 */
	public static void glGetSamplerParameterIiv(int sampler, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetSamplerParameterIiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, sampler, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetSamplerParameterI.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetSamplerParameterIuiv GetSamplerParameterIuiv}
	 */
	public static void glGetSamplerParameterIuiv(int sampler, int pname, int[] params) {
		long __functionAddress = GL.getCapabilities().glGetSamplerParameterIuiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, sampler, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetQueryObject.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetQueryObjecti64v GetQueryObjecti64v}
	 */
	public static void glGetQueryObjecti64v(int id, int pname, long[] params) {
		long __functionAddress = GL.getCapabilities().glGetQueryObjecti64v;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, id, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetQueryObject.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glGetQueryObjectui64v GetQueryObjectui64v}
	 */
	public static void glGetQueryObjectui64v(int id, int pname, long[] params) {
		long __functionAddress = GL.getCapabilities().glGetQueryObjectui64v;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, id, pname, params);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertexP2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glVertexP2uiv VertexP2uiv}
	 */
	public static void glVertexP2uiv(int type, int[] value) {
		long __functionAddress = GL.getCapabilities().glVertexP2uiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		callPV(__functionAddress, type, value);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertexP3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glVertexP3uiv VertexP3uiv}
	 */
	public static void glVertexP3uiv(int type, int[] value) {
		long __functionAddress = GL.getCapabilities().glVertexP3uiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		callPV(__functionAddress, type, value);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertexP4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glVertexP4uiv VertexP4uiv}
	 */
	public static void glVertexP4uiv(int type, int[] value) {
		long __functionAddress = GL.getCapabilities().glVertexP4uiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		callPV(__functionAddress, type, value);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoordP1.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glTexCoordP1uiv TexCoordP1uiv}
	 */
	public static void glTexCoordP1uiv(int type, int[] coords) {
		long __functionAddress = GL.getCapabilities().glTexCoordP1uiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 1);
		}
		callPV(__functionAddress, type, coords);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoordP2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glTexCoordP2uiv TexCoordP2uiv}
	 */
	public static void glTexCoordP2uiv(int type, int[] coords) {
		long __functionAddress = GL.getCapabilities().glTexCoordP2uiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 1);
		}
		callPV(__functionAddress, type, coords);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoordP3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glTexCoordP3uiv TexCoordP3uiv}
	 */
	public static void glTexCoordP3uiv(int type, int[] coords) {
		long __functionAddress = GL.getCapabilities().glTexCoordP3uiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 1);
		}
		callPV(__functionAddress, type, coords);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoordP4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glTexCoordP4uiv TexCoordP4uiv}
	 */
	public static void glTexCoordP4uiv(int type, int[] coords) {
		long __functionAddress = GL.getCapabilities().glTexCoordP4uiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 1);
		}
		callPV(__functionAddress, type, coords);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoordP1.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMultiTexCoordP1uiv MultiTexCoordP1uiv}
	 */
	public static void glMultiTexCoordP1uiv(int texture, int type, int[] coords) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoordP1uiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 1);
		}
		callPV(__functionAddress, texture, type, coords);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoordP2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMultiTexCoordP2uiv MultiTexCoordP2uiv}
	 */
	public static void glMultiTexCoordP2uiv(int texture, int type, int[] coords) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoordP2uiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 1);
		}
		callPV(__functionAddress, texture, type, coords);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoordP3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMultiTexCoordP3uiv MultiTexCoordP3uiv}
	 */
	public static void glMultiTexCoordP3uiv(int texture, int type, int[] coords) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoordP3uiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 1);
		}
		callPV(__functionAddress, texture, type, coords);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoordP4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glMultiTexCoordP4uiv MultiTexCoordP4uiv}
	 */
	public static void glMultiTexCoordP4uiv(int texture, int type, int[] coords) {
		long __functionAddress = GL.getCapabilities().glMultiTexCoordP4uiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 1);
		}
		callPV(__functionAddress, texture, type, coords);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glNormalP3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glNormalP3uiv NormalP3uiv}
	 */
	public static void glNormalP3uiv(int type, int[] coords) {
		long __functionAddress = GL.getCapabilities().glNormalP3uiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 1);
		}
		callPV(__functionAddress, type, coords);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColorP3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glColorP3uiv ColorP3uiv}
	 */
	public static void glColorP3uiv(int type, int[] color) {
		long __functionAddress = GL.getCapabilities().glColorP3uiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(color, 1);
		}
		callPV(__functionAddress, type, color);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColorP4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glColorP4uiv ColorP4uiv}
	 */
	public static void glColorP4uiv(int type, int[] color) {
		long __functionAddress = GL.getCapabilities().glColorP4uiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(color, 1);
		}
		callPV(__functionAddress, type, color);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColorP3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Array version of: {@link #glSecondaryColorP3uiv SecondaryColorP3uiv}
	 */
	public static void glSecondaryColorP3uiv(int type, int[] color) {
		long __functionAddress = GL.getCapabilities().glSecondaryColorP3uiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(color, 1);
		}
		callPV(__functionAddress, type, color);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribP1.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glVertexAttribP1uiv VertexAttribP1uiv}
	 */
	public static void glVertexAttribP1uiv(int index, int type, boolean normalized, int[] value) {
		long __functionAddress = GL.getCapabilities().glVertexAttribP1uiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		callPV(__functionAddress, index, type, normalized, value);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribP2.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glVertexAttribP2uiv VertexAttribP2uiv}
	 */
	public static void glVertexAttribP2uiv(int index, int type, boolean normalized, int[] value) {
		long __functionAddress = GL.getCapabilities().glVertexAttribP2uiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		callPV(__functionAddress, index, type, normalized, value);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribP3.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glVertexAttribP3uiv VertexAttribP3uiv}
	 */
	public static void glVertexAttribP3uiv(int index, int type, boolean normalized, int[] value) {
		long __functionAddress = GL.getCapabilities().glVertexAttribP3uiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		callPV(__functionAddress, index, type, normalized, value);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribP4.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Array version of: {@link #glVertexAttribP4uiv VertexAttribP4uiv}
	 */
	public static void glVertexAttribP4uiv(int index, int type, boolean normalized, int[] value) {
		long __functionAddress = GL.getCapabilities().glVertexAttribP4uiv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		callPV(__functionAddress, index, type, normalized, value);
	}

}