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
 * The core OpenGL 3.3 functionality. OpenGL 3.3 implementations support revision 3.30 of the OpenGL Shading Language.
 * 
 * <p>Extensions promoted to core in this release:
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
 * </ul></p>
 */
public final class GL33 {

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

	/** Function address. */
	@JavadocExclude
	public final long
		BindFragDataLocationIndexed,
		GetFragDataIndex,
		GenSamplers,
		DeleteSamplers,
		IsSampler,
		BindSampler,
		SamplerParameteri,
		SamplerParameterf,
		SamplerParameteriv,
		SamplerParameterfv,
		SamplerParameterIiv,
		SamplerParameterIuiv,
		GetSamplerParameteriv,
		GetSamplerParameterfv,
		GetSamplerParameterIiv,
		GetSamplerParameterIuiv,
		QueryCounter,
		GetQueryObjecti64v,
		GetQueryObjectui64v,
		VertexAttribDivisor,
		VertexP2ui,
		VertexP3ui,
		VertexP4ui,
		VertexP2uiv,
		VertexP3uiv,
		VertexP4uiv,
		TexCoordP1ui,
		TexCoordP2ui,
		TexCoordP3ui,
		TexCoordP4ui,
		TexCoordP1uiv,
		TexCoordP2uiv,
		TexCoordP3uiv,
		TexCoordP4uiv,
		MultiTexCoordP1ui,
		MultiTexCoordP2ui,
		MultiTexCoordP3ui,
		MultiTexCoordP4ui,
		MultiTexCoordP1uiv,
		MultiTexCoordP2uiv,
		MultiTexCoordP3uiv,
		MultiTexCoordP4uiv,
		NormalP3ui,
		NormalP3uiv,
		ColorP3ui,
		ColorP4ui,
		ColorP3uiv,
		ColorP4uiv,
		SecondaryColorP3ui,
		SecondaryColorP3uiv,
		VertexAttribP1ui,
		VertexAttribP2ui,
		VertexAttribP3ui,
		VertexAttribP4ui,
		VertexAttribP1uiv,
		VertexAttribP2uiv,
		VertexAttribP3uiv,
		VertexAttribP4uiv;

	@JavadocExclude
	public GL33(FunctionProvider provider, boolean fc) {
		BindFragDataLocationIndexed = provider.getFunctionAddress("glBindFragDataLocationIndexed");
		GetFragDataIndex = provider.getFunctionAddress("glGetFragDataIndex");
		GenSamplers = provider.getFunctionAddress("glGenSamplers");
		DeleteSamplers = provider.getFunctionAddress("glDeleteSamplers");
		IsSampler = provider.getFunctionAddress("glIsSampler");
		BindSampler = provider.getFunctionAddress("glBindSampler");
		SamplerParameteri = provider.getFunctionAddress("glSamplerParameteri");
		SamplerParameterf = provider.getFunctionAddress("glSamplerParameterf");
		SamplerParameteriv = provider.getFunctionAddress("glSamplerParameteriv");
		SamplerParameterfv = provider.getFunctionAddress("glSamplerParameterfv");
		SamplerParameterIiv = provider.getFunctionAddress("glSamplerParameterIiv");
		SamplerParameterIuiv = provider.getFunctionAddress("glSamplerParameterIuiv");
		GetSamplerParameteriv = provider.getFunctionAddress("glGetSamplerParameteriv");
		GetSamplerParameterfv = provider.getFunctionAddress("glGetSamplerParameterfv");
		GetSamplerParameterIiv = provider.getFunctionAddress("glGetSamplerParameterIiv");
		GetSamplerParameterIuiv = provider.getFunctionAddress("glGetSamplerParameterIuiv");
		QueryCounter = provider.getFunctionAddress("glQueryCounter");
		GetQueryObjecti64v = provider.getFunctionAddress("glGetQueryObjecti64v");
		GetQueryObjectui64v = provider.getFunctionAddress("glGetQueryObjectui64v");
		VertexAttribDivisor = provider.getFunctionAddress("glVertexAttribDivisor");
		VertexP2ui = GL.getFunctionAddress(provider, "glVertexP2ui", fc);
		VertexP3ui = GL.getFunctionAddress(provider, "glVertexP3ui", fc);
		VertexP4ui = GL.getFunctionAddress(provider, "glVertexP4ui", fc);
		VertexP2uiv = GL.getFunctionAddress(provider, "glVertexP2uiv", fc);
		VertexP3uiv = GL.getFunctionAddress(provider, "glVertexP3uiv", fc);
		VertexP4uiv = GL.getFunctionAddress(provider, "glVertexP4uiv", fc);
		TexCoordP1ui = GL.getFunctionAddress(provider, "glTexCoordP1ui", fc);
		TexCoordP2ui = GL.getFunctionAddress(provider, "glTexCoordP2ui", fc);
		TexCoordP3ui = GL.getFunctionAddress(provider, "glTexCoordP3ui", fc);
		TexCoordP4ui = GL.getFunctionAddress(provider, "glTexCoordP4ui", fc);
		TexCoordP1uiv = GL.getFunctionAddress(provider, "glTexCoordP1uiv", fc);
		TexCoordP2uiv = GL.getFunctionAddress(provider, "glTexCoordP2uiv", fc);
		TexCoordP3uiv = GL.getFunctionAddress(provider, "glTexCoordP3uiv", fc);
		TexCoordP4uiv = GL.getFunctionAddress(provider, "glTexCoordP4uiv", fc);
		MultiTexCoordP1ui = GL.getFunctionAddress(provider, "glMultiTexCoordP1ui", fc);
		MultiTexCoordP2ui = GL.getFunctionAddress(provider, "glMultiTexCoordP2ui", fc);
		MultiTexCoordP3ui = GL.getFunctionAddress(provider, "glMultiTexCoordP3ui", fc);
		MultiTexCoordP4ui = GL.getFunctionAddress(provider, "glMultiTexCoordP4ui", fc);
		MultiTexCoordP1uiv = GL.getFunctionAddress(provider, "glMultiTexCoordP1uiv", fc);
		MultiTexCoordP2uiv = GL.getFunctionAddress(provider, "glMultiTexCoordP2uiv", fc);
		MultiTexCoordP3uiv = GL.getFunctionAddress(provider, "glMultiTexCoordP3uiv", fc);
		MultiTexCoordP4uiv = GL.getFunctionAddress(provider, "glMultiTexCoordP4uiv", fc);
		NormalP3ui = GL.getFunctionAddress(provider, "glNormalP3ui", fc);
		NormalP3uiv = GL.getFunctionAddress(provider, "glNormalP3uiv", fc);
		ColorP3ui = GL.getFunctionAddress(provider, "glColorP3ui", fc);
		ColorP4ui = GL.getFunctionAddress(provider, "glColorP4ui", fc);
		ColorP3uiv = GL.getFunctionAddress(provider, "glColorP3uiv", fc);
		ColorP4uiv = GL.getFunctionAddress(provider, "glColorP4uiv", fc);
		SecondaryColorP3ui = GL.getFunctionAddress(provider, "glSecondaryColorP3ui", fc);
		SecondaryColorP3uiv = GL.getFunctionAddress(provider, "glSecondaryColorP3uiv", fc);
		VertexAttribP1ui = provider.getFunctionAddress("glVertexAttribP1ui");
		VertexAttribP2ui = provider.getFunctionAddress("glVertexAttribP2ui");
		VertexAttribP3ui = provider.getFunctionAddress("glVertexAttribP3ui");
		VertexAttribP4ui = provider.getFunctionAddress("glVertexAttribP4ui");
		VertexAttribP1uiv = provider.getFunctionAddress("glVertexAttribP1uiv");
		VertexAttribP2uiv = provider.getFunctionAddress("glVertexAttribP2uiv");
		VertexAttribP3uiv = provider.getFunctionAddress("glVertexAttribP3uiv");
		VertexAttribP4uiv = provider.getFunctionAddress("glVertexAttribP4uiv");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link GL33} instance for the current context. */
	public static GL33 getInstance() {
		return checkFunctionality(GL.getCapabilities().__GL33);
	}

	static GL33 create(java.util.Set<String> ext, FunctionProvider provider, boolean fc) {
		if ( !ext.contains("OpenGL33") ) return null;

		GL33 funcs = new GL33(provider, fc);

		boolean supported = (fc || checkFunctions(
			funcs.VertexP2ui, funcs.VertexP3ui, funcs.VertexP4ui, funcs.VertexP2uiv, funcs.VertexP3uiv, funcs.VertexP4uiv, funcs.TexCoordP1ui, 
			funcs.TexCoordP2ui, funcs.TexCoordP3ui, funcs.TexCoordP4ui, funcs.TexCoordP1uiv, funcs.TexCoordP2uiv, funcs.TexCoordP3uiv, funcs.TexCoordP4uiv, 
			funcs.MultiTexCoordP1ui, funcs.MultiTexCoordP2ui, funcs.MultiTexCoordP3ui, funcs.MultiTexCoordP4ui, funcs.MultiTexCoordP1uiv, 
			funcs.MultiTexCoordP2uiv, funcs.MultiTexCoordP3uiv, funcs.MultiTexCoordP4uiv, funcs.NormalP3ui, funcs.NormalP3uiv, funcs.ColorP3ui, funcs.ColorP4ui, 
			funcs.ColorP3uiv, funcs.ColorP4uiv, funcs.SecondaryColorP3ui, funcs.SecondaryColorP3uiv
		)) && checkFunctions(
			funcs.BindFragDataLocationIndexed, funcs.GetFragDataIndex, funcs.GenSamplers, funcs.DeleteSamplers, funcs.IsSampler, funcs.BindSampler, 
			funcs.SamplerParameteri, funcs.SamplerParameterf, funcs.SamplerParameteriv, funcs.SamplerParameterfv, funcs.SamplerParameterIiv, 
			funcs.SamplerParameterIuiv, funcs.GetSamplerParameteriv, funcs.GetSamplerParameterfv, funcs.GetSamplerParameterIiv, funcs.GetSamplerParameterIuiv, 
			funcs.QueryCounter, funcs.GetQueryObjecti64v, funcs.GetQueryObjectui64v, funcs.VertexAttribDivisor, funcs.VertexAttribP1ui, funcs.VertexAttribP2ui, 
			funcs.VertexAttribP3ui, funcs.VertexAttribP4ui, funcs.VertexAttribP1uiv, funcs.VertexAttribP2uiv, funcs.VertexAttribP3uiv, funcs.VertexAttribP4uiv
		);

		return GL.checkExtension("OpenGL33", funcs, supported);
	}

	// --- [ glBindFragDataLocationIndexed ] ---

	/** JNI method for {@link #glBindFragDataLocationIndexed BindFragDataLocationIndexed} */
	@JavadocExclude
	public static native void nglBindFragDataLocationIndexed(int program, int colorNumber, int index, long name, long __functionAddress);

	/** Unsafe version of {@link #glBindFragDataLocationIndexed BindFragDataLocationIndexed} */
	@JavadocExclude
	public static void nglBindFragDataLocationIndexed(int program, int colorNumber, int index, long name) {
		long __functionAddress = getInstance().BindFragDataLocationIndexed;
		nglBindFragDataLocationIndexed(program, colorNumber, index, name, __functionAddress);
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
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		nglBindFragDataLocationIndexed(program, colorNumber, index, memAddress(name));
	}

	/** CharSequence version of: {@link #glBindFragDataLocationIndexed BindFragDataLocationIndexed} */
	public static void glBindFragDataLocationIndexed(int program, int colorNumber, int index, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		nglBindFragDataLocationIndexed(program, colorNumber, index, __buffer.address(nameEncoded));
	}

	// --- [ glGetFragDataIndex ] ---

	/** JNI method for {@link #glGetFragDataIndex GetFragDataIndex} */
	@JavadocExclude
	public static native int nglGetFragDataIndex(int program, long name, long __functionAddress);

	/** Unsafe version of {@link #glGetFragDataIndex GetFragDataIndex} */
	@JavadocExclude
	public static int nglGetFragDataIndex(int program, long name) {
		long __functionAddress = getInstance().GetFragDataIndex;
		return nglGetFragDataIndex(program, name, __functionAddress);
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
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		return nglGetFragDataIndex(program, memAddress(name));
	}

	/** CharSequence version of: {@link #glGetFragDataIndex GetFragDataIndex} */
	public static int glGetFragDataIndex(int program, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		return nglGetFragDataIndex(program, __buffer.address(nameEncoded));
	}

	// --- [ glGenSamplers ] ---

	/** JNI method for {@link #glGenSamplers GenSamplers} */
	@JavadocExclude
	public static native void nglGenSamplers(int count, long samplers, long __functionAddress);

	/** Unsafe version of {@link #glGenSamplers GenSamplers} */
	@JavadocExclude
	public static void nglGenSamplers(int count, long samplers) {
		long __functionAddress = getInstance().GenSamplers;
		nglGenSamplers(count, samplers, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGenSamplers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Generates sampler object names.
	 *
	 * @param count    the number of sampler object names to generate
	 * @param samplers a buffer in which the generated sampler object names are stored
	 */
	public static void glGenSamplers(int count, ByteBuffer samplers) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(samplers, count << 2);
		nglGenSamplers(count, memAddress(samplers));
	}

	/** Alternative version of: {@link #glGenSamplers GenSamplers} */
	public static void glGenSamplers(IntBuffer samplers) {
		nglGenSamplers(samplers.remaining(), memAddress(samplers));
	}

	/** Single return value version of: {@link #glGenSamplers GenSamplers} */
	public static int glGenSamplers() {
		APIBuffer __buffer = apiBuffer();
		int samplers = __buffer.intParam();
		nglGenSamplers(1, __buffer.address(samplers));
		return __buffer.intValue(samplers);
	}

	// --- [ glDeleteSamplers ] ---

	/** JNI method for {@link #glDeleteSamplers DeleteSamplers} */
	@JavadocExclude
	public static native void nglDeleteSamplers(int count, long samplers, long __functionAddress);

	/** Unsafe version of {@link #glDeleteSamplers DeleteSamplers} */
	@JavadocExclude
	public static void nglDeleteSamplers(int count, long samplers) {
		long __functionAddress = getInstance().DeleteSamplers;
		nglDeleteSamplers(count, samplers, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glDeleteSamplers.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Deletes named sampler objects.
	 *
	 * @param count    the number of sampler objects to be deleted
	 * @param samplers an array of sampler objects to be deleted
	 */
	public static void glDeleteSamplers(int count, ByteBuffer samplers) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(samplers, count << 2);
		nglDeleteSamplers(count, memAddress(samplers));
	}

	/** Alternative version of: {@link #glDeleteSamplers DeleteSamplers} */
	public static void glDeleteSamplers(IntBuffer samplers) {
		nglDeleteSamplers(samplers.remaining(), memAddress(samplers));
	}

	/** Single value version of: {@link #glDeleteSamplers DeleteSamplers} */
	public static void glDeleteSamplers(int sampler) {
		APIBuffer __buffer = apiBuffer();
		int samplers = __buffer.intParam(sampler);
		nglDeleteSamplers(1, __buffer.address(samplers));
	}

	// --- [ glIsSampler ] ---

	/** JNI method for {@link #glIsSampler IsSampler} */
	@JavadocExclude
	public static native boolean nglIsSampler(int sampler, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glIsSampler.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Determines if a name corresponds to a sampler object.
	 *
	 * @param sampler a value that may be the name of a sampler object
	 */
	public static boolean glIsSampler(int sampler) {
		long __functionAddress = getInstance().IsSampler;
		return nglIsSampler(sampler, __functionAddress);
	}

	// --- [ glBindSampler ] ---

	/** JNI method for {@link #glBindSampler BindSampler} */
	@JavadocExclude
	public static native void nglBindSampler(int unit, int sampler, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glBindSampler.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Binds a named sampler to a texturing target.
	 *
	 * @param unit    the index of the texture unit to which the sampler is bound
	 * @param sampler the name of a sampler
	 */
	public static void glBindSampler(int unit, int sampler) {
		long __functionAddress = getInstance().BindSampler;
		nglBindSampler(unit, sampler, __functionAddress);
	}

	// --- [ glSamplerParameteri ] ---

	/** JNI method for {@link #glSamplerParameteri SamplerParameteri} */
	@JavadocExclude
	public static native void nglSamplerParameteri(int sampler, int pname, int param, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glSamplerParameteri.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Set the integer value of a sampler parameter.
	 *
	 * @param sampler the sampler object whose parameter to modify
	 * @param pname   the symbolic name of a single-valued sampler parameter. One of:<br>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}, {@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}, {@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}, {@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}, {@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}, {@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}, {@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}, {@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}, {@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}, {@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}
	 * @param param   the value of {@code pname}
	 */
	public static void glSamplerParameteri(int sampler, int pname, int param) {
		long __functionAddress = getInstance().SamplerParameteri;
		nglSamplerParameteri(sampler, pname, param, __functionAddress);
	}

	// --- [ glSamplerParameterf ] ---

	/** JNI method for {@link #glSamplerParameterf SamplerParameterf} */
	@JavadocExclude
	public static native void nglSamplerParameterf(int sampler, int pname, float param, long __functionAddress);

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
		long __functionAddress = getInstance().SamplerParameterf;
		nglSamplerParameterf(sampler, pname, param, __functionAddress);
	}

	// --- [ glSamplerParameteriv ] ---

	/** JNI method for {@link #glSamplerParameteriv SamplerParameteriv} */
	@JavadocExclude
	public static native void nglSamplerParameteriv(int sampler, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glSamplerParameteriv SamplerParameteriv} */
	@JavadocExclude
	public static void nglSamplerParameteriv(int sampler, int pname, long params) {
		long __functionAddress = getInstance().SamplerParameteriv;
		nglSamplerParameteriv(sampler, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glSamplerParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glSamplerParameteri SamplerParameteri}.
	 *
	 * @param sampler the sampler object whose parameter to modify
	 * @param pname   the symbolic name of a sampler parameter. One of:<br>{@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}, {@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}, {@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}, {@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}, {@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}, {@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}, {@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}, {@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}, {@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}, {@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}, {@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}
	 * @param params  an array where the value or values of {@code pname} are stored
	 */
	public static void glSamplerParameteriv(int sampler, int pname, ByteBuffer params) {
		nglSamplerParameteriv(sampler, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glSamplerParameteriv SamplerParameteriv} */
	public static void glSamplerParameteriv(int sampler, int pname, IntBuffer params) {
		nglSamplerParameteriv(sampler, pname, memAddress(params));
	}

	// --- [ glSamplerParameterfv ] ---

	/** JNI method for {@link #glSamplerParameterfv SamplerParameterfv} */
	@JavadocExclude
	public static native void nglSamplerParameterfv(int sampler, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glSamplerParameterfv SamplerParameterfv} */
	@JavadocExclude
	public static void nglSamplerParameterfv(int sampler, int pname, long params) {
		long __functionAddress = getInstance().SamplerParameterfv;
		nglSamplerParameterfv(sampler, pname, params, __functionAddress);
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
	public static void glSamplerParameterfv(int sampler, int pname, ByteBuffer params) {
		nglSamplerParameterfv(sampler, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glSamplerParameterfv SamplerParameterfv} */
	public static void glSamplerParameterfv(int sampler, int pname, FloatBuffer params) {
		nglSamplerParameterfv(sampler, pname, memAddress(params));
	}

	// --- [ glSamplerParameterIiv ] ---

	/** JNI method for {@link #glSamplerParameterIiv SamplerParameterIiv} */
	@JavadocExclude
	public static native void nglSamplerParameterIiv(int sampler, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glSamplerParameterIiv SamplerParameterIiv} */
	@JavadocExclude
	public static void nglSamplerParameterIiv(int sampler, int pname, long params) {
		long __functionAddress = getInstance().SamplerParameterIiv;
		nglSamplerParameterIiv(sampler, pname, params, __functionAddress);
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
	public static void glSamplerParameterIiv(int sampler, int pname, ByteBuffer params) {
		nglSamplerParameterIiv(sampler, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glSamplerParameterIiv SamplerParameterIiv} */
	public static void glSamplerParameterIiv(int sampler, int pname, IntBuffer params) {
		nglSamplerParameterIiv(sampler, pname, memAddress(params));
	}

	// --- [ glSamplerParameterIuiv ] ---

	/** JNI method for {@link #glSamplerParameterIuiv SamplerParameterIuiv} */
	@JavadocExclude
	public static native void nglSamplerParameterIuiv(int sampler, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glSamplerParameterIuiv SamplerParameterIuiv} */
	@JavadocExclude
	public static void nglSamplerParameterIuiv(int sampler, int pname, long params) {
		long __functionAddress = getInstance().SamplerParameterIuiv;
		nglSamplerParameterIuiv(sampler, pname, params, __functionAddress);
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
	public static void glSamplerParameterIuiv(int sampler, int pname, ByteBuffer params) {
		nglSamplerParameterIuiv(sampler, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glSamplerParameterIuiv SamplerParameterIuiv} */
	public static void glSamplerParameterIuiv(int sampler, int pname, IntBuffer params) {
		nglSamplerParameterIuiv(sampler, pname, memAddress(params));
	}

	// --- [ glGetSamplerParameteriv ] ---

	/** JNI method for {@link #glGetSamplerParameteriv GetSamplerParameteriv} */
	@JavadocExclude
	public static native void nglGetSamplerParameteriv(int sampler, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetSamplerParameteriv GetSamplerParameteriv} */
	@JavadocExclude
	public static void nglGetSamplerParameteriv(int sampler, int pname, long params) {
		long __functionAddress = getInstance().GetSamplerParameteriv;
		nglGetSamplerParameteriv(sampler, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetSamplerParameter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Return the integer value(s) of a sampler parameter.
	 *
	 * @param sampler the name of the sampler object from which to retrieve parameters
	 * @param pname   the symbolic name of a sampler parameter. One of:<br>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}, {@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}, {@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}, {@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}, {@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}, {@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}, {@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}, {@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}, {@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}, {@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}, ,, {@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}
	 * @param params  the sampler parameters
	 */
	public static void glGetSamplerParameteriv(int sampler, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetSamplerParameteriv(sampler, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetSamplerParameteriv GetSamplerParameteriv} */
	public static void glGetSamplerParameteriv(int sampler, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetSamplerParameteriv(sampler, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetSamplerParameteriv GetSamplerParameteriv} */
	public static int glGetSamplerParameteri(int sampler, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetSamplerParameteriv(sampler, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetSamplerParameterfv ] ---

	/** JNI method for {@link #glGetSamplerParameterfv GetSamplerParameterfv} */
	@JavadocExclude
	public static native void nglGetSamplerParameterfv(int sampler, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetSamplerParameterfv GetSamplerParameterfv} */
	@JavadocExclude
	public static void nglGetSamplerParameterfv(int sampler, int pname, long params) {
		long __functionAddress = getInstance().GetSamplerParameterfv;
		nglGetSamplerParameterfv(sampler, pname, params, __functionAddress);
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
	public static void glGetSamplerParameterfv(int sampler, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetSamplerParameterfv(sampler, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetSamplerParameterfv GetSamplerParameterfv} */
	public static void glGetSamplerParameterfv(int sampler, int pname, FloatBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetSamplerParameterfv(sampler, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetSamplerParameterfv GetSamplerParameterfv} */
	public static float glGetSamplerParameterf(int sampler, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetSamplerParameterfv(sampler, pname, __buffer.address(params));
		return __buffer.floatValue(params);
	}

	// --- [ glGetSamplerParameterIiv ] ---

	/** JNI method for {@link #glGetSamplerParameterIiv GetSamplerParameterIiv} */
	@JavadocExclude
	public static native void nglGetSamplerParameterIiv(int sampler, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetSamplerParameterIiv GetSamplerParameterIiv} */
	@JavadocExclude
	public static void nglGetSamplerParameterIiv(int sampler, int pname, long params) {
		long __functionAddress = getInstance().GetSamplerParameterIiv;
		nglGetSamplerParameterIiv(sampler, pname, params, __functionAddress);
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
	public static void glGetSamplerParameterIiv(int sampler, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetSamplerParameterIiv(sampler, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetSamplerParameterIiv GetSamplerParameterIiv} */
	public static void glGetSamplerParameterIiv(int sampler, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetSamplerParameterIiv(sampler, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetSamplerParameterIiv GetSamplerParameterIiv} */
	public static int glGetSamplerParameterIi(int sampler, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetSamplerParameterIiv(sampler, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetSamplerParameterIuiv ] ---

	/** JNI method for {@link #glGetSamplerParameterIuiv GetSamplerParameterIuiv} */
	@JavadocExclude
	public static native void nglGetSamplerParameterIuiv(int sampler, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetSamplerParameterIuiv GetSamplerParameterIuiv} */
	@JavadocExclude
	public static void nglGetSamplerParameterIuiv(int sampler, int pname, long params) {
		long __functionAddress = getInstance().GetSamplerParameterIuiv;
		nglGetSamplerParameterIuiv(sampler, pname, params, __functionAddress);
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
	public static void glGetSamplerParameterIuiv(int sampler, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetSamplerParameterIuiv(sampler, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetSamplerParameterIuiv GetSamplerParameterIuiv} */
	public static void glGetSamplerParameterIuiv(int sampler, int pname, IntBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetSamplerParameterIuiv(sampler, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetSamplerParameterIuiv GetSamplerParameterIuiv} */
	public static int glGetSamplerParameterIui(int sampler, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetSamplerParameterIuiv(sampler, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glQueryCounter ] ---

	/** JNI method for {@link #glQueryCounter QueryCounter} */
	@JavadocExclude
	public static native void nglQueryCounter(int id, int target, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glQueryCounter.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Records the GL time into a query object after all previous commands have reached the GL server but have not yet necessarily executed.
	 *
	 * @param id     the name of a query object into which to record the GL time
	 * @param target the counter to query. Must be:<br>{@link #GL_TIMESTAMP TIMESTAMP}
	 */
	public static void glQueryCounter(int id, int target) {
		long __functionAddress = getInstance().QueryCounter;
		nglQueryCounter(id, target, __functionAddress);
	}

	// --- [ glGetQueryObjecti64v ] ---

	/** JNI method for {@link #glGetQueryObjecti64v GetQueryObjecti64v} */
	@JavadocExclude
	public static native void nglGetQueryObjecti64v(int id, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetQueryObjecti64v GetQueryObjecti64v} */
	@JavadocExclude
	public static void nglGetQueryObjecti64v(int id, int pname, long params) {
		long __functionAddress = getInstance().GetQueryObjecti64v;
		nglGetQueryObjecti64v(id, pname, params, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glGetQueryObject.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Returns the 64bit integer value of query object parameter.
	 *
	 * @param id     the name of a query object
	 * @param pname  the symbolic name of a query object parameter. One of:<br>{@link GL15#GL_QUERY_RESULT QUERY_RESULT}, {@link GL15#GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}
	 * @param params the requested data
	 */
	public static void glGetQueryObjecti64v(int id, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 3);
		nglGetQueryObjecti64v(id, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetQueryObjecti64v GetQueryObjecti64v} */
	public static void glGetQueryObjecti64v(int id, int pname, LongBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetQueryObjecti64v(id, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetQueryObjecti64v GetQueryObjecti64v} */
	public static long glGetQueryObjecti64(int id, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.longParam();
		nglGetQueryObjecti64v(id, pname, __buffer.address(params));
		return __buffer.longValue(params);
	}

	// --- [ glGetQueryObjectui64v ] ---

	/** JNI method for {@link #glGetQueryObjectui64v GetQueryObjectui64v} */
	@JavadocExclude
	public static native void nglGetQueryObjectui64v(int id, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetQueryObjectui64v GetQueryObjectui64v} */
	@JavadocExclude
	public static void nglGetQueryObjectui64v(int id, int pname, long params) {
		long __functionAddress = getInstance().GetQueryObjectui64v;
		nglGetQueryObjectui64v(id, pname, params, __functionAddress);
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
	public static void glGetQueryObjectui64v(int id, int pname, ByteBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1 << 3);
		nglGetQueryObjectui64v(id, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetQueryObjectui64v GetQueryObjectui64v} */
	public static void glGetQueryObjectui64v(int id, int pname, LongBuffer params) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(params, 1);
		nglGetQueryObjectui64v(id, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetQueryObjectui64v GetQueryObjectui64v} */
	public static long glGetQueryObjectui64(int id, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.longParam();
		nglGetQueryObjectui64v(id, pname, __buffer.address(params));
		return __buffer.longValue(params);
	}

	// --- [ glVertexAttribDivisor ] ---

	/** JNI method for {@link #glVertexAttribDivisor VertexAttribDivisor} */
	@JavadocExclude
	public static native void nglVertexAttribDivisor(int index, int divisor, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribDivisor.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Modifies the rate at which generic vertex attributes advance during instanced rendering.
	 *
	 * @param index   the index of the generic vertex attribute
	 * @param divisor the number of instances that will pass between updates of the generic attribute at slot {@code index}
	 */
	public static void glVertexAttribDivisor(int index, int divisor) {
		long __functionAddress = getInstance().VertexAttribDivisor;
		nglVertexAttribDivisor(index, divisor, __functionAddress);
	}

	// --- [ glVertexP2ui ] ---

	/** JNI method for {@link #glVertexP2ui VertexP2ui} */
	@JavadocExclude
	public static native void nglVertexP2ui(int type, int value, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertexP2ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL11#glVertex2f Vertex2f}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param value the packed value
	 */
	public static void glVertexP2ui(int type, int value) {
		long __functionAddress = getInstance().VertexP2ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexP2ui(type, value, __functionAddress);
	}

	// --- [ glVertexP3ui ] ---

	/** JNI method for {@link #glVertexP3ui VertexP3ui} */
	@JavadocExclude
	public static native void nglVertexP3ui(int type, int value, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertexP3ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL11#glVertex3f Vertex3f}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param value the packed value
	 */
	public static void glVertexP3ui(int type, int value) {
		long __functionAddress = getInstance().VertexP3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexP3ui(type, value, __functionAddress);
	}

	// --- [ glVertexP4ui ] ---

	/** JNI method for {@link #glVertexP4ui VertexP4ui} */
	@JavadocExclude
	public static native void nglVertexP4ui(int type, int value, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertexP4ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL11#glVertex4f Vertex4f}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param value the packed value
	 */
	public static void glVertexP4ui(int type, int value) {
		long __functionAddress = getInstance().VertexP4ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexP4ui(type, value, __functionAddress);
	}

	// --- [ glVertexP2uiv ] ---

	/** JNI method for {@link #glVertexP2uiv VertexP2uiv} */
	@JavadocExclude
	public static native void nglVertexP2uiv(int type, long value, long __functionAddress);

	/** Unsafe version of {@link #glVertexP2uiv VertexP2uiv} */
	@JavadocExclude
	public static void nglVertexP2uiv(int type, long value) {
		long __functionAddress = getInstance().VertexP2uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexP2uiv(type, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertexP2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertexP2ui VertexP2ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param value the packed value
	 */
	public static void glVertexP2uiv(int type, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglVertexP2uiv(type, memAddress(value));
	}

	/** Alternative version of: {@link #glVertexP2uiv VertexP2uiv} */
	public static void glVertexP2uiv(int type, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglVertexP2uiv(type, memAddress(value));
	}

	// --- [ glVertexP3uiv ] ---

	/** JNI method for {@link #glVertexP3uiv VertexP3uiv} */
	@JavadocExclude
	public static native void nglVertexP3uiv(int type, long value, long __functionAddress);

	/** Unsafe version of {@link #glVertexP3uiv VertexP3uiv} */
	@JavadocExclude
	public static void nglVertexP3uiv(int type, long value) {
		long __functionAddress = getInstance().VertexP3uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexP3uiv(type, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertexP3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertexP3ui VertexP3ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param value the packed value
	 */
	public static void glVertexP3uiv(int type, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglVertexP3uiv(type, memAddress(value));
	}

	/** Alternative version of: {@link #glVertexP3uiv VertexP3uiv} */
	public static void glVertexP3uiv(int type, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglVertexP3uiv(type, memAddress(value));
	}

	// --- [ glVertexP4uiv ] ---

	/** JNI method for {@link #glVertexP4uiv VertexP4uiv} */
	@JavadocExclude
	public static native void nglVertexP4uiv(int type, long value, long __functionAddress);

	/** Unsafe version of {@link #glVertexP4uiv VertexP4uiv} */
	@JavadocExclude
	public static void nglVertexP4uiv(int type, long value) {
		long __functionAddress = getInstance().VertexP4uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexP4uiv(type, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glVertexP4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glVertexP4ui VertexP4ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param value the packed value
	 */
	public static void glVertexP4uiv(int type, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglVertexP4uiv(type, memAddress(value));
	}

	/** Alternative version of: {@link #glVertexP4uiv VertexP4uiv} */
	public static void glVertexP4uiv(int type, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglVertexP4uiv(type, memAddress(value));
	}

	// --- [ glTexCoordP1ui ] ---

	/** JNI method for {@link #glTexCoordP1ui TexCoordP1ui} */
	@JavadocExclude
	public static native void nglTexCoordP1ui(int type, int coords, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoordP1ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL11#glTexCoord1f TexCoord1f}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP1ui(int type, int coords) {
		long __functionAddress = getInstance().TexCoordP1ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoordP1ui(type, coords, __functionAddress);
	}

	// --- [ glTexCoordP2ui ] ---

	/** JNI method for {@link #glTexCoordP2ui TexCoordP2ui} */
	@JavadocExclude
	public static native void nglTexCoordP2ui(int type, int coords, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoordP2ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL11#glTexCoord2f TexCoord2f}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP2ui(int type, int coords) {
		long __functionAddress = getInstance().TexCoordP2ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoordP2ui(type, coords, __functionAddress);
	}

	// --- [ glTexCoordP3ui ] ---

	/** JNI method for {@link #glTexCoordP3ui TexCoordP3ui} */
	@JavadocExclude
	public static native void nglTexCoordP3ui(int type, int coords, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoordP3ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL11#glTexCoord3f TexCoord3f}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP3ui(int type, int coords) {
		long __functionAddress = getInstance().TexCoordP3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoordP3ui(type, coords, __functionAddress);
	}

	// --- [ glTexCoordP4ui ] ---

	/** JNI method for {@link #glTexCoordP4ui TexCoordP4ui} */
	@JavadocExclude
	public static native void nglTexCoordP4ui(int type, int coords, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoordP4ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL11#glTexCoord4f TexCoord4f}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP4ui(int type, int coords) {
		long __functionAddress = getInstance().TexCoordP4ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoordP4ui(type, coords, __functionAddress);
	}

	// --- [ glTexCoordP1uiv ] ---

	/** JNI method for {@link #glTexCoordP1uiv TexCoordP1uiv} */
	@JavadocExclude
	public static native void nglTexCoordP1uiv(int type, long coords, long __functionAddress);

	/** Unsafe version of {@link #glTexCoordP1uiv TexCoordP1uiv} */
	@JavadocExclude
	public static void nglTexCoordP1uiv(int type, long coords) {
		long __functionAddress = getInstance().TexCoordP1uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoordP1uiv(type, coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoordP1.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoordP1ui TexCoordP1ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP1uiv(int type, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1 << 2);
		nglTexCoordP1uiv(type, memAddress(coords));
	}

	/** Alternative version of: {@link #glTexCoordP1uiv TexCoordP1uiv} */
	public static void glTexCoordP1uiv(int type, IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1);
		nglTexCoordP1uiv(type, memAddress(coords));
	}

	// --- [ glTexCoordP2uiv ] ---

	/** JNI method for {@link #glTexCoordP2uiv TexCoordP2uiv} */
	@JavadocExclude
	public static native void nglTexCoordP2uiv(int type, long coords, long __functionAddress);

	/** Unsafe version of {@link #glTexCoordP2uiv TexCoordP2uiv} */
	@JavadocExclude
	public static void nglTexCoordP2uiv(int type, long coords) {
		long __functionAddress = getInstance().TexCoordP2uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoordP2uiv(type, coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoordP2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoordP2ui TexCoordP2ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP2uiv(int type, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1 << 2);
		nglTexCoordP2uiv(type, memAddress(coords));
	}

	/** Alternative version of: {@link #glTexCoordP2uiv TexCoordP2uiv} */
	public static void glTexCoordP2uiv(int type, IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1);
		nglTexCoordP2uiv(type, memAddress(coords));
	}

	// --- [ glTexCoordP3uiv ] ---

	/** JNI method for {@link #glTexCoordP3uiv TexCoordP3uiv} */
	@JavadocExclude
	public static native void nglTexCoordP3uiv(int type, long coords, long __functionAddress);

	/** Unsafe version of {@link #glTexCoordP3uiv TexCoordP3uiv} */
	@JavadocExclude
	public static void nglTexCoordP3uiv(int type, long coords) {
		long __functionAddress = getInstance().TexCoordP3uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoordP3uiv(type, coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoordP3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoordP3ui TexCoordP3ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP3uiv(int type, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1 << 2);
		nglTexCoordP3uiv(type, memAddress(coords));
	}

	/** Alternative version of: {@link #glTexCoordP3uiv TexCoordP3uiv} */
	public static void glTexCoordP3uiv(int type, IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1);
		nglTexCoordP3uiv(type, memAddress(coords));
	}

	// --- [ glTexCoordP4uiv ] ---

	/** JNI method for {@link #glTexCoordP4uiv TexCoordP4uiv} */
	@JavadocExclude
	public static native void nglTexCoordP4uiv(int type, long coords, long __functionAddress);

	/** Unsafe version of {@link #glTexCoordP4uiv TexCoordP4uiv} */
	@JavadocExclude
	public static void nglTexCoordP4uiv(int type, long coords) {
		long __functionAddress = getInstance().TexCoordP4uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoordP4uiv(type, coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glTexCoordP4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glTexCoordP4ui TexCoordP4ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP4uiv(int type, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1 << 2);
		nglTexCoordP4uiv(type, memAddress(coords));
	}

	/** Alternative version of: {@link #glTexCoordP4uiv TexCoordP4uiv} */
	public static void glTexCoordP4uiv(int type, IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1);
		nglTexCoordP4uiv(type, memAddress(coords));
	}

	// --- [ glMultiTexCoordP1ui ] ---

	/** JNI method for {@link #glMultiTexCoordP1ui MultiTexCoordP1ui} */
	@JavadocExclude
	public static native void nglMultiTexCoordP1ui(int texture, int type, int coords, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoordP1ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL13#glMultiTexCoord1f MultiTexCoord1f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br>type, of, packing, used, on, the, data
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP1ui(int texture, int type, int coords) {
		long __functionAddress = getInstance().MultiTexCoordP1ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoordP1ui(texture, type, coords, __functionAddress);
	}

	// --- [ glMultiTexCoordP2ui ] ---

	/** JNI method for {@link #glMultiTexCoordP2ui MultiTexCoordP2ui} */
	@JavadocExclude
	public static native void nglMultiTexCoordP2ui(int texture, int type, int coords, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoordP2ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL13#glMultiTexCoord2f MultiTexCoord2f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br>type, of, packing, used, on, the, data
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP2ui(int texture, int type, int coords) {
		long __functionAddress = getInstance().MultiTexCoordP2ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoordP2ui(texture, type, coords, __functionAddress);
	}

	// --- [ glMultiTexCoordP3ui ] ---

	/** JNI method for {@link #glMultiTexCoordP3ui MultiTexCoordP3ui} */
	@JavadocExclude
	public static native void nglMultiTexCoordP3ui(int texture, int type, int coords, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoordP3ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL13#glMultiTexCoord3f MultiTexCoord3f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br>type, of, packing, used, on, the, data
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP3ui(int texture, int type, int coords) {
		long __functionAddress = getInstance().MultiTexCoordP3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoordP3ui(texture, type, coords, __functionAddress);
	}

	// --- [ glMultiTexCoordP4ui ] ---

	/** JNI method for {@link #glMultiTexCoordP4ui MultiTexCoordP4ui} */
	@JavadocExclude
	public static native void nglMultiTexCoordP4ui(int texture, int type, int coords, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoordP4ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL13#glMultiTexCoord4f MultiTexCoord4f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br>type, of, packing, used, on, the, data
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP4ui(int texture, int type, int coords) {
		long __functionAddress = getInstance().MultiTexCoordP4ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoordP4ui(texture, type, coords, __functionAddress);
	}

	// --- [ glMultiTexCoordP1uiv ] ---

	/** JNI method for {@link #glMultiTexCoordP1uiv MultiTexCoordP1uiv} */
	@JavadocExclude
	public static native void nglMultiTexCoordP1uiv(int texture, int type, long coords, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexCoordP1uiv MultiTexCoordP1uiv} */
	@JavadocExclude
	public static void nglMultiTexCoordP1uiv(int texture, int type, long coords) {
		long __functionAddress = getInstance().MultiTexCoordP1uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoordP1uiv(texture, type, coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoordP1.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMultiTexCoordP1ui MultiTexCoordP1ui}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP1uiv(int texture, int type, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1 << 2);
		nglMultiTexCoordP1uiv(texture, type, memAddress(coords));
	}

	/** Alternative version of: {@link #glMultiTexCoordP1uiv MultiTexCoordP1uiv} */
	public static void glMultiTexCoordP1uiv(int texture, int type, IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1);
		nglMultiTexCoordP1uiv(texture, type, memAddress(coords));
	}

	// --- [ glMultiTexCoordP2uiv ] ---

	/** JNI method for {@link #glMultiTexCoordP2uiv MultiTexCoordP2uiv} */
	@JavadocExclude
	public static native void nglMultiTexCoordP2uiv(int texture, int type, long coords, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexCoordP2uiv MultiTexCoordP2uiv} */
	@JavadocExclude
	public static void nglMultiTexCoordP2uiv(int texture, int type, long coords) {
		long __functionAddress = getInstance().MultiTexCoordP2uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoordP2uiv(texture, type, coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoordP2.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMultiTexCoordP2ui MultiTexCoordP2ui}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP2uiv(int texture, int type, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1 << 2);
		nglMultiTexCoordP2uiv(texture, type, memAddress(coords));
	}

	/** Alternative version of: {@link #glMultiTexCoordP2uiv MultiTexCoordP2uiv} */
	public static void glMultiTexCoordP2uiv(int texture, int type, IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1);
		nglMultiTexCoordP2uiv(texture, type, memAddress(coords));
	}

	// --- [ glMultiTexCoordP3uiv ] ---

	/** JNI method for {@link #glMultiTexCoordP3uiv MultiTexCoordP3uiv} */
	@JavadocExclude
	public static native void nglMultiTexCoordP3uiv(int texture, int type, long coords, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexCoordP3uiv MultiTexCoordP3uiv} */
	@JavadocExclude
	public static void nglMultiTexCoordP3uiv(int texture, int type, long coords) {
		long __functionAddress = getInstance().MultiTexCoordP3uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoordP3uiv(texture, type, coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoordP3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMultiTexCoordP3ui MultiTexCoordP3ui}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP3uiv(int texture, int type, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1 << 2);
		nglMultiTexCoordP3uiv(texture, type, memAddress(coords));
	}

	/** Alternative version of: {@link #glMultiTexCoordP3uiv MultiTexCoordP3uiv} */
	public static void glMultiTexCoordP3uiv(int texture, int type, IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1);
		nglMultiTexCoordP3uiv(texture, type, memAddress(coords));
	}

	// --- [ glMultiTexCoordP4uiv ] ---

	/** JNI method for {@link #glMultiTexCoordP4uiv MultiTexCoordP4uiv} */
	@JavadocExclude
	public static native void nglMultiTexCoordP4uiv(int texture, int type, long coords, long __functionAddress);

	/** Unsafe version of {@link #glMultiTexCoordP4uiv MultiTexCoordP4uiv} */
	@JavadocExclude
	public static void nglMultiTexCoordP4uiv(int texture, int type, long coords) {
		long __functionAddress = getInstance().MultiTexCoordP4uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoordP4uiv(texture, type, coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glMultiTexCoordP4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glMultiTexCoordP4ui MultiTexCoordP4ui}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP4uiv(int texture, int type, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1 << 2);
		nglMultiTexCoordP4uiv(texture, type, memAddress(coords));
	}

	/** Alternative version of: {@link #glMultiTexCoordP4uiv MultiTexCoordP4uiv} */
	public static void glMultiTexCoordP4uiv(int texture, int type, IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1);
		nglMultiTexCoordP4uiv(texture, type, memAddress(coords));
	}

	// --- [ glNormalP3ui ] ---

	/** JNI method for {@link #glNormalP3ui NormalP3ui} */
	@JavadocExclude
	public static native void nglNormalP3ui(int type, int coords, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glNormalP3ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL11#glNormal3f Normal3f}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glNormalP3ui(int type, int coords) {
		long __functionAddress = getInstance().NormalP3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNormalP3ui(type, coords, __functionAddress);
	}

	// --- [ glNormalP3uiv ] ---

	/** JNI method for {@link #glNormalP3uiv NormalP3uiv} */
	@JavadocExclude
	public static native void nglNormalP3uiv(int type, long coords, long __functionAddress);

	/** Unsafe version of {@link #glNormalP3uiv NormalP3uiv} */
	@JavadocExclude
	public static void nglNormalP3uiv(int type, long coords) {
		long __functionAddress = getInstance().NormalP3uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNormalP3uiv(type, coords, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glNormalP3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version {@link #glNormalP3ui NormalP3ui}.
	 *
	 * @param type   type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glNormalP3uiv(int type, ByteBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1 << 2);
		nglNormalP3uiv(type, memAddress(coords));
	}

	/** Alternative version of: {@link #glNormalP3uiv NormalP3uiv} */
	public static void glNormalP3uiv(int type, IntBuffer coords) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(coords, 1);
		nglNormalP3uiv(type, memAddress(coords));
	}

	// --- [ glColorP3ui ] ---

	/** JNI method for {@link #glColorP3ui ColorP3ui} */
	@JavadocExclude
	public static native void nglColorP3ui(int type, int color, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColorP3ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL11#glColor3f Color3f}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param color the packed value
	 */
	public static void glColorP3ui(int type, int color) {
		long __functionAddress = getInstance().ColorP3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColorP3ui(type, color, __functionAddress);
	}

	// --- [ glColorP4ui ] ---

	/** JNI method for {@link #glColorP4ui ColorP4ui} */
	@JavadocExclude
	public static native void nglColorP4ui(int type, int color, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColorP4ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL11#glColor4f Color4f}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param color the packed value
	 */
	public static void glColorP4ui(int type, int color) {
		long __functionAddress = getInstance().ColorP4ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColorP4ui(type, color, __functionAddress);
	}

	// --- [ glColorP3uiv ] ---

	/** JNI method for {@link #glColorP3uiv ColorP3uiv} */
	@JavadocExclude
	public static native void nglColorP3uiv(int type, long color, long __functionAddress);

	/** Unsafe version of {@link #glColorP3uiv ColorP3uiv} */
	@JavadocExclude
	public static void nglColorP3uiv(int type, long color) {
		long __functionAddress = getInstance().ColorP3uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColorP3uiv(type, color, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColorP3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColorP3ui ColorP3ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param color the packed value
	 */
	public static void glColorP3uiv(int type, ByteBuffer color) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(color, 1 << 2);
		nglColorP3uiv(type, memAddress(color));
	}

	/** Alternative version of: {@link #glColorP3uiv ColorP3uiv} */
	public static void glColorP3uiv(int type, IntBuffer color) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(color, 1);
		nglColorP3uiv(type, memAddress(color));
	}

	// --- [ glColorP4uiv ] ---

	/** JNI method for {@link #glColorP4uiv ColorP4uiv} */
	@JavadocExclude
	public static native void nglColorP4uiv(int type, long color, long __functionAddress);

	/** Unsafe version of {@link #glColorP4uiv ColorP4uiv} */
	@JavadocExclude
	public static void nglColorP4uiv(int type, long color) {
		long __functionAddress = getInstance().ColorP4uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColorP4uiv(type, color, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glColorP4.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glColorP4ui ColorP4ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param color the packed value
	 */
	public static void glColorP4uiv(int type, ByteBuffer color) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(color, 1 << 2);
		nglColorP4uiv(type, memAddress(color));
	}

	/** Alternative version of: {@link #glColorP4uiv ColorP4uiv} */
	public static void glColorP4uiv(int type, IntBuffer color) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(color, 1);
		nglColorP4uiv(type, memAddress(color));
	}

	// --- [ glSecondaryColorP3ui ] ---

	/** JNI method for {@link #glSecondaryColorP3ui SecondaryColorP3ui} */
	@JavadocExclude
	public static native void nglSecondaryColorP3ui(int type, int color, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColorP3ui.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Packed component version of {@link GL14#glSecondaryColor3f SecondaryColor3f}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param color the packed value
	 */
	public static void glSecondaryColorP3ui(int type, int color) {
		long __functionAddress = getInstance().SecondaryColorP3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglSecondaryColorP3ui(type, color, __functionAddress);
	}

	// --- [ glSecondaryColorP3uiv ] ---

	/** JNI method for {@link #glSecondaryColorP3uiv SecondaryColorP3uiv} */
	@JavadocExclude
	public static native void nglSecondaryColorP3uiv(int type, long color, long __functionAddress);

	/** Unsafe version of {@link #glSecondaryColorP3uiv SecondaryColorP3uiv} */
	@JavadocExclude
	public static void nglSecondaryColorP3uiv(int type, long color) {
		long __functionAddress = getInstance().SecondaryColorP3uiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglSecondaryColorP3uiv(type, color, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man2/html/glSecondaryColorP3.xhtml">OpenGL SDK Reference</a> - <em>This function is deprecated and unavailable in the Core profile</em></p>
	 * 
	 * Pointer version of {@link #glSecondaryColorP3ui SecondaryColorP3ui}.
	 *
	 * @param type  type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param color the packed value
	 */
	public static void glSecondaryColorP3uiv(int type, ByteBuffer color) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(color, 1 << 2);
		nglSecondaryColorP3uiv(type, memAddress(color));
	}

	/** Alternative version of: {@link #glSecondaryColorP3uiv SecondaryColorP3uiv} */
	public static void glSecondaryColorP3uiv(int type, IntBuffer color) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(color, 1);
		nglSecondaryColorP3uiv(type, memAddress(color));
	}

	// --- [ glVertexAttribP1ui ] ---

	/** JNI method for {@link #glVertexAttribP1ui VertexAttribP1ui} */
	@JavadocExclude
	public static native void nglVertexAttribP1ui(int index, int type, boolean normalized, int value, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribP1ui.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Packed component version of {@link GL20#glVertexAttrib1f VertexAttrib1f}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP1ui(int index, int type, boolean normalized, int value) {
		long __functionAddress = getInstance().VertexAttribP1ui;
		nglVertexAttribP1ui(index, type, normalized, value, __functionAddress);
	}

	// --- [ glVertexAttribP2ui ] ---

	/** JNI method for {@link #glVertexAttribP2ui VertexAttribP2ui} */
	@JavadocExclude
	public static native void nglVertexAttribP2ui(int index, int type, boolean normalized, int value, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribP2ui.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Packed component version of {@link GL20#glVertexAttrib2f VertexAttrib2f}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP2ui(int index, int type, boolean normalized, int value) {
		long __functionAddress = getInstance().VertexAttribP2ui;
		nglVertexAttribP2ui(index, type, normalized, value, __functionAddress);
	}

	// --- [ glVertexAttribP3ui ] ---

	/** JNI method for {@link #glVertexAttribP3ui VertexAttribP3ui} */
	@JavadocExclude
	public static native void nglVertexAttribP3ui(int index, int type, boolean normalized, int value, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribP3ui.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Packed component version of {@link GL20#glVertexAttrib3f VertexAttrib3f}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP3ui(int index, int type, boolean normalized, int value) {
		long __functionAddress = getInstance().VertexAttribP3ui;
		nglVertexAttribP3ui(index, type, normalized, value, __functionAddress);
	}

	// --- [ glVertexAttribP4ui ] ---

	/** JNI method for {@link #glVertexAttribP4ui VertexAttribP4ui} */
	@JavadocExclude
	public static native void nglVertexAttribP4ui(int index, int type, boolean normalized, int value, long __functionAddress);

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribP4ui.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Packed component version of {@link GL20#glVertexAttrib4f VertexAttrib4f}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP4ui(int index, int type, boolean normalized, int value) {
		long __functionAddress = getInstance().VertexAttribP4ui;
		nglVertexAttribP4ui(index, type, normalized, value, __functionAddress);
	}

	// --- [ glVertexAttribP1uiv ] ---

	/** JNI method for {@link #glVertexAttribP1uiv VertexAttribP1uiv} */
	@JavadocExclude
	public static native void nglVertexAttribP1uiv(int index, int type, boolean normalized, long value, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttribP1uiv VertexAttribP1uiv} */
	@JavadocExclude
	public static void nglVertexAttribP1uiv(int index, int type, boolean normalized, long value) {
		long __functionAddress = getInstance().VertexAttribP1uiv;
		nglVertexAttribP1uiv(index, type, normalized, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribP1.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttribP1ui VertexAttribP1ui}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP1uiv(int index, int type, boolean normalized, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglVertexAttribP1uiv(index, type, normalized, memAddress(value));
	}

	/** Alternative version of: {@link #glVertexAttribP1uiv VertexAttribP1uiv} */
	public static void glVertexAttribP1uiv(int index, int type, boolean normalized, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglVertexAttribP1uiv(index, type, normalized, memAddress(value));
	}

	// --- [ glVertexAttribP2uiv ] ---

	/** JNI method for {@link #glVertexAttribP2uiv VertexAttribP2uiv} */
	@JavadocExclude
	public static native void nglVertexAttribP2uiv(int index, int type, boolean normalized, long value, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttribP2uiv VertexAttribP2uiv} */
	@JavadocExclude
	public static void nglVertexAttribP2uiv(int index, int type, boolean normalized, long value) {
		long __functionAddress = getInstance().VertexAttribP2uiv;
		nglVertexAttribP2uiv(index, type, normalized, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribP2.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttribP2ui VertexAttribP2ui}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP2uiv(int index, int type, boolean normalized, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglVertexAttribP2uiv(index, type, normalized, memAddress(value));
	}

	/** Alternative version of: {@link #glVertexAttribP2uiv VertexAttribP2uiv} */
	public static void glVertexAttribP2uiv(int index, int type, boolean normalized, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglVertexAttribP2uiv(index, type, normalized, memAddress(value));
	}

	// --- [ glVertexAttribP3uiv ] ---

	/** JNI method for {@link #glVertexAttribP3uiv VertexAttribP3uiv} */
	@JavadocExclude
	public static native void nglVertexAttribP3uiv(int index, int type, boolean normalized, long value, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttribP3uiv VertexAttribP3uiv} */
	@JavadocExclude
	public static void nglVertexAttribP3uiv(int index, int type, boolean normalized, long value) {
		long __functionAddress = getInstance().VertexAttribP3uiv;
		nglVertexAttribP3uiv(index, type, normalized, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribP3.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttribP3ui VertexAttribP3ui}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP3uiv(int index, int type, boolean normalized, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglVertexAttribP3uiv(index, type, normalized, memAddress(value));
	}

	/** Alternative version of: {@link #glVertexAttribP3uiv VertexAttribP3uiv} */
	public static void glVertexAttribP3uiv(int index, int type, boolean normalized, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglVertexAttribP3uiv(index, type, normalized, memAddress(value));
	}

	// --- [ glVertexAttribP4uiv ] ---

	/** JNI method for {@link #glVertexAttribP4uiv VertexAttribP4uiv} */
	@JavadocExclude
	public static native void nglVertexAttribP4uiv(int index, int type, boolean normalized, long value, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttribP4uiv VertexAttribP4uiv} */
	@JavadocExclude
	public static void nglVertexAttribP4uiv(int index, int type, boolean normalized, long value) {
		long __functionAddress = getInstance().VertexAttribP4uiv;
		nglVertexAttribP4uiv(index, type, normalized, value, __functionAddress);
	}

	/**
	 * <p><a href="http://www.opengl.org/sdk/docs/man/html/glVertexAttribP4.xhtml">OpenGL SDK Reference</a></p>
	 * 
	 * Pointer version of {@link #glVertexAttribP4ui VertexAttribP4ui}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<br>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP4uiv(int index, int type, boolean normalized, ByteBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1 << 2);
		nglVertexAttribP4uiv(index, type, normalized, memAddress(value));
	}

	/** Alternative version of: {@link #glVertexAttribP4uiv VertexAttribP4uiv} */
	public static void glVertexAttribP4uiv(int index, int type, boolean normalized, IntBuffer value) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(value, 1);
		nglVertexAttribP4uiv(index, type, normalized, memAddress(value));
	}

}