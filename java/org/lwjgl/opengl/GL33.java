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

/** The core OpenGL 3.3 functionality. */
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
	public static final int
		GL_MAX_DUAL_SOURCE_DRAW_BUFFERS = 0x88FC;

	/** Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv. */
	public static final int
		GL_ANY_SAMPLES_PASSED = 0x8C2F;

	/** Accepted by the {@code value} parameter of the GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv and GetDoublev functions. */
	public static final int
		GL_SAMPLER_BINDING = 0x8919;

	/**
	 * Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, RenderbufferStorage and
	 * RenderbufferStorageMultisample.
	 */
	public static final int
		GL_RGB10_A2UI = 0x906F;

	/** Accepted by the {@code pname} parameters of TexParameteri, TexParameterf, TexParameteriv, TexParameterfv, GetTexParameterfv, and GetTexParameteriv. */
	public static final int
		GL_TEXTURE_SWIZZLE_R = 0x8E42,
		GL_TEXTURE_SWIZZLE_G = 0x8E43,
		GL_TEXTURE_SWIZZLE_B = 0x8E44,
		GL_TEXTURE_SWIZZLE_A = 0x8E45;

	/** Accepted by the {@code pname} parameters of TexParameteriv,  TexParameterfv, GetTexParameterfv, and GetTexParameteriv. */
	public static final int
		GL_TEXTURE_SWIZZLE_RGBA = 0x8E46;

	/** Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv. */
	public static final int
		GL_TIME_ELAPSED = 0x88BF;

	/**
	 * Accepted by the {@code target} parameter of GetQueryiv and QueryCounter. Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv,
	 * GetInteger64v, GetFloatv, and GetDoublev.
	 */
	public static final int
		GL_TIMESTAMP = 0x8E28;

	/** Accepted by the {@code pname} parameters of GetVertexAttribdv, GetVertexAttribfv, and GetVertexAttribiv. */
	public static final int
		GL_VERTEX_ATTRIB_ARRAY_DIVISOR = 0x88FE;

	/**
	 * Accepted by the {@code type} parameter of VertexAttribPointer, VertexPointer, NormalPointer, ColorPointer, SecondaryColorPointer, TexCoordPointer,
	 * VertexAttribP{1234}ui, VertexP*, TexCoordP*, MultiTexCoordP*, NormalP3ui, ColorP*, SecondaryColorP* and VertexAttribP*.
	 */
	public static final int
		GL_INT_2_10_10_10_REV = 0x8D9F;

	private GL33() {}

	// --- [ glBindFragDataLocationIndexed ] ---

	/** JNI method for {@link #glBindFragDataLocationIndexed(int, int, int, ByteBuffer)} */
	public static native void nglBindFragDataLocationIndexed(int program, int colorNumber, int index, long name, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBindFragDataLocationIndexed.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Binds a user-defined varying out variable to a fragment shader color number and index.
	 *
	 * @param program     the name of the program containing varying out variable whose binding to modify
	 * @param colorNumber the color number to bind the user-defined varying out variable to
	 * @param index       the index of the color input to bind the user-defined varying out variable to
	 * @param name        the name of the user-defined varying out variable whose binding to modify
	 */
	public static void glBindFragDataLocationIndexed(int program, int colorNumber, int index, ByteBuffer name) {
		long __functionAddress = getInstance().glBindFragDataLocationIndexed;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkNT1(name);
		}
		nglBindFragDataLocationIndexed(program, colorNumber, index, memAddress(name), __functionAddress);
	}

	/** CharSequence version of: {@link #glBindFragDataLocationIndexed(int, int, int, ByteBuffer)} */
	public static void glBindFragDataLocationIndexed(int program, int colorNumber, int index, CharSequence name) {
		long __functionAddress = getInstance().glBindFragDataLocationIndexed;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBindFragDataLocationIndexed(program, colorNumber, index, memAddress(memEncodeASCII(name)), __functionAddress);
	}

	// --- [ glGetFragDataIndex ] ---

	/** JNI method for {@link #glGetFragDataIndex(int, ByteBuffer)} */
	public static native int nglGetFragDataIndex(int program, long name, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetFragDataIndex.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Queries the bindings of color indices to user-defined varying out variables.
	 *
	 * @param program the name of the program containing varying out variable whose binding to query
	 * @param name    the name of the user-defined varying out variable whose index to query
	 */
	public static int glGetFragDataIndex(int program, ByteBuffer name) {
		long __functionAddress = getInstance().glGetFragDataIndex;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkNT1(name);
		}
		return nglGetFragDataIndex(program, memAddress(name), __functionAddress);
	}

	/** CharSequence version of: {@link #glGetFragDataIndex(int, ByteBuffer)} */
	public static int glGetFragDataIndex(int program, CharSequence name) {
		long __functionAddress = getInstance().glGetFragDataIndex;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglGetFragDataIndex(program, memAddress(memEncodeASCII(name)), __functionAddress);
	}

	// --- [ glGenSamplers ] ---

	/** JNI method for {@link #glGenSamplers(int, ByteBuffer)} */
	public static native void nglGenSamplers(int count, long samplers, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGenSamplers.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Generates sampler object names.
	 *
	 * @param count    the number of sampler object names to generate
	 * @param samplers an array in which the generated sampler object names are stored
	 */
	public static void glGenSamplers(int count, ByteBuffer samplers) {
		long __functionAddress = getInstance().glGenSamplers;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(samplers, count << 2);
		}
		nglGenSamplers(count, memAddress(samplers), __functionAddress);
	}

	/** Alternative version of: {@link #glGenSamplers(int, ByteBuffer)} */
	public static void glGenSamplers(IntBuffer samplers) {
		long __functionAddress = getInstance().glGenSamplers;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglGenSamplers(samplers.remaining(), memAddress(samplers), __functionAddress);
	}

	/** Single return value version of: {@link #glGenSamplers(int, ByteBuffer)} */
	public static int glGenSamplers() {
		long __functionAddress = getInstance().glGenSamplers;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int samplers = __buffer.intParam();
		nglGenSamplers(1, __buffer.address() + samplers, __functionAddress);
		return __buffer.intValue(samplers);
	}

	// --- [ glDeleteSamplers ] ---

	/** JNI method for {@link #glDeleteSamplers(int, ByteBuffer)} */
	public static native void nglDeleteSamplers(int count, long samplers, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glDeleteSamplers.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Deletes named sampler objects.
	 *
	 * @param count    the number of sampler objects to be deleted
	 * @param samplers an array of sampler objects to be deleted
	 */
	public static void glDeleteSamplers(int count, ByteBuffer samplers) {
		long __functionAddress = getInstance().glDeleteSamplers;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(samplers, count << 2);
		}
		nglDeleteSamplers(count, memAddress(samplers), __functionAddress);
	}

	/** Alternative version of: {@link #glDeleteSamplers(int, ByteBuffer)} */
	public static void glDeleteSamplers(IntBuffer samplers) {
		long __functionAddress = getInstance().glDeleteSamplers;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglDeleteSamplers(samplers.remaining(), memAddress(samplers), __functionAddress);
	}

	/** Single value version of: {@link #glDeleteSamplers(int, ByteBuffer)} */
	public static void glDeleteSamplers(int sampler) {
		long __functionAddress = getInstance().glDeleteSamplers;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int samplers = __buffer.intParam();
		__buffer.intValue(samplers, sampler);
		nglDeleteSamplers(1, __buffer.address() + samplers, __functionAddress);
	}

	// --- [ glIsSampler ] ---

	/** JNI method for {@link #glIsSampler(int)} */
	public static native boolean nglIsSampler(int sampler, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glIsSampler.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Determines if a name corresponds to a sampler object.
	 *
	 * @param sampler a value that may be the name of a sampler object
	 */
	public static boolean glIsSampler(int sampler) {
		long __functionAddress = getInstance().glIsSampler;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nglIsSampler(sampler, __functionAddress);
	}

	// --- [ glBindSampler ] ---

	/** JNI method for {@link #glBindSampler(int, int)} */
	public static native void nglBindSampler(int unit, int sampler, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glBindSampler.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Binds a named sampler to a texturing target.
	 *
	 * @param unit    the index of the texture unit to which the sampler is bound
	 * @param sampler the name of a sampler
	 */
	public static void glBindSampler(int unit, int sampler) {
		long __functionAddress = getInstance().glBindSampler;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglBindSampler(unit, sampler, __functionAddress);
	}

	// --- [ glSamplerParameteri ] ---

	/** JNI method for {@link #glSamplerParameteri(int, int, int)} */
	public static native void nglSamplerParameteri(int sampler, int pname, int param, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glSamplerParameteri.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Set the integer value of a sampler parameter.
	 *
	 * @param sampler the sampler object whose parameter to modify
	 * @param pname   the symbolic name of a single-valued sampler parameter. One of:<p/>{@link GL11#GL_TEXTURE_WRAP_S}, {@link GL11#GL_TEXTURE_WRAP_T}, {@link GL12#GL_TEXTURE_WRAP_R}, {@link GL11#GL_TEXTURE_MIN_FILTER}, {@link GL11#GL_TEXTURE_MAG_FILTER}, {@link GL12#GL_TEXTURE_MIN_LOD}, {@link GL12#GL_TEXTURE_MAX_LOD}, {@link GL14#GL_TEXTURE_LOD_BIAS}, {@link GL14#GL_TEXTURE_COMPARE_MODE}, {@link GL14#GL_TEXTURE_COMPARE_FUNC}
	 * @param param   the value of {@code pname}
	 */
	public static void glSamplerParameteri(int sampler, int pname, int param) {
		long __functionAddress = getInstance().glSamplerParameteri;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglSamplerParameteri(sampler, pname, param, __functionAddress);
	}

	// --- [ glSamplerParameterf ] ---

	/** JNI method for {@link #glSamplerParameterf(int, int, float)} */
	public static native void nglSamplerParameterf(int sampler, int pname, float param, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glSamplerParameterf.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Float version of {@link #glSamplerParameteri(int, int, int)}.
	 *
	 * @param sampler the sampler object whose parameter to modify
	 * @param pname   the symbolic name of a single-valued sampler parameter
	 * @param param   the value of {@code pname}
	 */
	public static void glSamplerParameterf(int sampler, int pname, float param) {
		long __functionAddress = getInstance().glSamplerParameterf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglSamplerParameterf(sampler, pname, param, __functionAddress);
	}

	// --- [ glSamplerParameteriv ] ---

	/** JNI method for {@link #glSamplerParameteri(int, int, ByteBuffer)} */
	public static native void nglSamplerParameteriv(int sampler, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glSamplerParameter.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glSamplerParameteri(int, int, int)}.
	 *
	 * @param sampler the sampler object whose parameter to modify
	 * @param pname   the symbolic name of a sampler parameter. One of:<p/>{@link GL11#GL_TEXTURE_BORDER_COLOR}, {@link GL11#GL_TEXTURE_WRAP_S}, {@link GL11#GL_TEXTURE_WRAP_T}, {@link GL12#GL_TEXTURE_WRAP_R}, {@link GL11#GL_TEXTURE_MIN_FILTER}, {@link GL11#GL_TEXTURE_MAG_FILTER}, {@link GL12#GL_TEXTURE_MIN_LOD}, {@link GL12#GL_TEXTURE_MAX_LOD}, {@link GL14#GL_TEXTURE_LOD_BIAS}, {@link GL14#GL_TEXTURE_COMPARE_MODE}, {@link GL14#GL_TEXTURE_COMPARE_FUNC}
	 * @param params  an array where the value or values of {@code pname} are stored
	 */
	public static void glSamplerParameteri(int sampler, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glSamplerParameteriv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglSamplerParameteriv(sampler, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glSamplerParameteri(int, int, ByteBuffer)} */
	public static void glSamplerParameter(int sampler, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glSamplerParameteriv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglSamplerParameteriv(sampler, pname, memAddress(params), __functionAddress);
	}

	// --- [ glSamplerParameterfv ] ---

	/** JNI method for {@link #glSamplerParameterf(int, int, ByteBuffer)} */
	public static native void nglSamplerParameterfv(int sampler, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glSamplerParameter.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Float version of {@link #glSamplerParameteri(int, int, ByteBuffer)}.
	 *
	 * @param sampler the sampler object whose parameter to modify
	 * @param pname   the symbolic name of a sampler parameter
	 * @param params  an array where the value or values of {@code pname} are stored
	 */
	public static void glSamplerParameterf(int sampler, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glSamplerParameterfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglSamplerParameterfv(sampler, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glSamplerParameterf(int, int, ByteBuffer)} */
	public static void glSamplerParameter(int sampler, int pname, FloatBuffer params) {
		long __functionAddress = getInstance().glSamplerParameterfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglSamplerParameterfv(sampler, pname, memAddress(params), __functionAddress);
	}

	// --- [ glSamplerParameterIiv ] ---

	/** JNI method for {@link #glSamplerParameterIi(int, int, ByteBuffer)} */
	public static native void nglSamplerParameterIiv(int sampler, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glSamplerParameterI.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pure integer version of {@link #glSamplerParameteri(int, int, ByteBuffer)}.
	 *
	 * @param sampler the sampler object whose parameter to modify
	 * @param pname   the symbolic name of a sampler parameter
	 * @param params  an array where the value or values of {@code pname} are stored
	 */
	public static void glSamplerParameterIi(int sampler, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glSamplerParameterIiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglSamplerParameterIiv(sampler, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glSamplerParameterIi(int, int, ByteBuffer)} */
	public static void glSamplerParameterI(int sampler, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glSamplerParameterIiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglSamplerParameterIiv(sampler, pname, memAddress(params), __functionAddress);
	}

	// --- [ glSamplerParameterIuiv ] ---

	/** JNI method for {@link #glSamplerParameterIui(int, int, ByteBuffer)} */
	public static native void nglSamplerParameterIuiv(int sampler, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glSamplerParameterI.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Unsigned pure integer version of {@link #glSamplerParameteri(int, int, ByteBuffer)}.
	 *
	 * @param sampler the sampler object whose parameter to modify
	 * @param pname   the symbolic name of a sampler parameter
	 * @param params  an array where the value or values of {@code pname} are stored
	 */
	public static void glSamplerParameterIui(int sampler, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glSamplerParameterIuiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglSamplerParameterIuiv(sampler, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glSamplerParameterIui(int, int, ByteBuffer)} */
	public static void glSamplerParameterIu(int sampler, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glSamplerParameterIuiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglSamplerParameterIuiv(sampler, pname, memAddress(params), __functionAddress);
	}

	// --- [ glGetSamplerParameteriv ] ---

	/** JNI method for {@link #glGetSamplerParameteri(int, int, ByteBuffer)} */
	public static native void nglGetSamplerParameteriv(int sampler, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetSamplerParameter.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Return the integer value(s) of a sampler parameter.
	 *
	 * @param sampler the name of the sampler object from which to retrieve parameters
	 * @param pname   the symbolic name of a sampler parameter. One of:<p/>{@link GL11#GL_TEXTURE_WRAP_S}, {@link GL11#GL_TEXTURE_WRAP_T}, {@link GL12#GL_TEXTURE_WRAP_R}, {@link GL11#GL_TEXTURE_MIN_FILTER}, {@link GL11#GL_TEXTURE_MAG_FILTER}, {@link GL12#GL_TEXTURE_MIN_LOD}, {@link GL12#GL_TEXTURE_MAX_LOD}, {@link GL14#GL_TEXTURE_LOD_BIAS}, {@link GL14#GL_TEXTURE_COMPARE_MODE}, {@link GL14#GL_TEXTURE_COMPARE_FUNC}, ,, {@link GL11#GL_TEXTURE_BORDER_COLOR}
	 * @param params  the sampler parameters
	 */
	public static void glGetSamplerParameteri(int sampler, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetSamplerParameteriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglGetSamplerParameteriv(sampler, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetSamplerParameteri(int, int, ByteBuffer)} */
	public static void glGetSamplerParameter(int sampler, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glGetSamplerParameteriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetSamplerParameteriv(sampler, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetSamplerParameteri(int, int, ByteBuffer)} */
	public static int glGetSamplerParameteri(int sampler, int pname) {
		long __functionAddress = getInstance().glGetSamplerParameteriv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetSamplerParameteriv(sampler, pname, __buffer.address() + params, __functionAddress);
		return __buffer.intValue(params);
	}

	// --- [ glGetSamplerParameterfv ] ---

	/** JNI method for {@link #glGetSamplerParameterf(int, int, ByteBuffer)} */
	public static native void nglGetSamplerParameterfv(int sampler, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetSamplerParameter.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Float version of {@link #glGetSamplerParameteri(int, int, ByteBuffer)}.
	 *
	 * @param sampler the name of the sampler object from which to retrieve parameters
	 * @param pname   the symbolic name of a sampler parameter
	 * @param params  the sampler parameters
	 */
	public static void glGetSamplerParameterf(int sampler, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetSamplerParameterfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglGetSamplerParameterfv(sampler, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetSamplerParameterf(int, int, ByteBuffer)} */
	public static void glGetSamplerParameter(int sampler, int pname, FloatBuffer params) {
		long __functionAddress = getInstance().glGetSamplerParameterfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetSamplerParameterfv(sampler, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetSamplerParameterf(int, int, ByteBuffer)} */
	public static float glGetSamplerParameterf(int sampler, int pname) {
		long __functionAddress = getInstance().glGetSamplerParameterfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetSamplerParameterfv(sampler, pname, __buffer.address() + params, __functionAddress);
		return __buffer.floatValue(params);
	}

	// --- [ glGetSamplerParameterIiv ] ---

	/** JNI method for {@link #glGetSamplerParameterIi(int, int, ByteBuffer)} */
	public static native void nglGetSamplerParameterIiv(int sampler, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetSamplerParameterI.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pure integer version of {@link #glGetSamplerParameteri(int, int, ByteBuffer)}.
	 *
	 * @param sampler the name of the sampler object from which to retrieve parameters
	 * @param pname   the symbolic name of a sampler parameter
	 * @param params  the sampler parameters
	 */
	public static void glGetSamplerParameterIi(int sampler, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetSamplerParameterIiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglGetSamplerParameterIiv(sampler, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetSamplerParameterIi(int, int, ByteBuffer)} */
	public static void glGetSamplerParameterI(int sampler, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glGetSamplerParameterIiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetSamplerParameterIiv(sampler, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetSamplerParameterIi(int, int, ByteBuffer)} */
	public static int glGetSamplerParameterIi(int sampler, int pname) {
		long __functionAddress = getInstance().glGetSamplerParameterIiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetSamplerParameterIiv(sampler, pname, __buffer.address() + params, __functionAddress);
		return __buffer.intValue(params);
	}

	// --- [ glGetSamplerParameterIuiv ] ---

	/** JNI method for {@link #glGetSamplerParameterIui(int, int, ByteBuffer)} */
	public static native void nglGetSamplerParameterIuiv(int sampler, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetSamplerParameterI.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Unsigned pure integer version of {@link #glGetSamplerParameteri(int, int, ByteBuffer)}.
	 *
	 * @param sampler the name of the sampler object from which to retrieve parameters
	 * @param pname   the symbolic name of a sampler parameter
	 * @param params  the sampler parameters
	 */
	public static void glGetSamplerParameterIui(int sampler, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetSamplerParameterIuiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 2);
		}
		nglGetSamplerParameterIuiv(sampler, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetSamplerParameterIui(int, int, ByteBuffer)} */
	public static void glGetSamplerParameterIu(int sampler, int pname, IntBuffer params) {
		long __functionAddress = getInstance().glGetSamplerParameterIuiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetSamplerParameterIuiv(sampler, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetSamplerParameterIui(int, int, ByteBuffer)} */
	public static int glGetSamplerParameterIui(int sampler, int pname) {
		long __functionAddress = getInstance().glGetSamplerParameterIuiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetSamplerParameterIuiv(sampler, pname, __buffer.address() + params, __functionAddress);
		return __buffer.intValue(params);
	}

	// --- [ glQueryCounter ] ---

	/** JNI method for {@link #glQueryCounter(int, int)} */
	public static native void nglQueryCounter(int id, int target, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glQueryCounter.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Records the GL time into a query object after all previous commands have reached the GL server but have not yet necessarily executed.
	 *
	 * @param id     the name of a query object into which to record the GL time
	 * @param target the counter to query. Must be:<p/>{@link #GL_TIMESTAMP}
	 */
	public static void glQueryCounter(int id, int target) {
		long __functionAddress = getInstance().glQueryCounter;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglQueryCounter(id, target, __functionAddress);
	}

	// --- [ glGetQueryObjecti64v ] ---

	/** JNI method for {@link #glGetQueryObjecti64(int, int, ByteBuffer)} */
	public static native void nglGetQueryObjecti64v(int id, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetQueryObject.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Returns the 64bit integer value of query object parameter.
	 *
	 * @param id     the name of a query object
	 * @param pname  the symbolic name of a query object parameter. One of:<p/>{@link GL15#GL_QUERY_RESULT}, {@link GL15#GL_QUERY_RESULT_AVAILABLE}
	 * @param params the requested data
	 */
	public static void glGetQueryObjecti64(int id, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetQueryObjecti64v;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 3);
		}
		nglGetQueryObjecti64v(id, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetQueryObjecti64(int, int, ByteBuffer)} */
	public static void glGetQueryObject(int id, int pname, LongBuffer params) {
		long __functionAddress = getInstance().glGetQueryObjecti64v;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetQueryObjecti64v(id, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetQueryObjecti64(int, int, ByteBuffer)} */
	public static long glGetQueryObjecti64(int id, int pname) {
		long __functionAddress = getInstance().glGetQueryObjecti64v;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.longParam();
		nglGetQueryObjecti64v(id, pname, __buffer.address() + params, __functionAddress);
		return __buffer.longValue(params);
	}

	// --- [ glGetQueryObjectui64v ] ---

	/** JNI method for {@link #glGetQueryObjectui64(int, int, ByteBuffer)} */
	public static native void nglGetQueryObjectui64v(int id, int pname, long params, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glGetQueryObject.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Unsigned version of {@link #glGetQueryObjecti64(int, int, ByteBuffer)}.
	 *
	 * @param id     the name of a query object
	 * @param pname  the symbolic name of a query object parameter
	 * @param params the requested data
	 */
	public static void glGetQueryObjectui64(int id, int pname, ByteBuffer params) {
		long __functionAddress = getInstance().glGetQueryObjectui64v;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1 << 3);
		}
		nglGetQueryObjectui64v(id, pname, memAddress(params), __functionAddress);
	}

	/** Alternative version of: {@link #glGetQueryObjectui64(int, int, ByteBuffer)} */
	public static void glGetQueryObjectu(int id, int pname, LongBuffer params) {
		long __functionAddress = getInstance().glGetQueryObjectui64v;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		nglGetQueryObjectui64v(id, pname, memAddress(params), __functionAddress);
	}

	/** Single return value version of: {@link #glGetQueryObjectui64(int, int, ByteBuffer)} */
	public static long glGetQueryObjectui64(int id, int pname) {
		long __functionAddress = getInstance().glGetQueryObjectui64v;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.longParam();
		nglGetQueryObjectui64v(id, pname, __buffer.address() + params, __functionAddress);
		return __buffer.longValue(params);
	}

	// --- [ glVertexAttribDivisor ] ---

	/** JNI method for {@link #glVertexAttribDivisor(int, int)} */
	public static native void nglVertexAttribDivisor(int index, int divisor, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribDivisor.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Modifies the rate at which generic vertex attributes advance during instanced rendering.
	 *
	 * @param index   the index of the generic vertex attribute
	 * @param divisor the number of instances that will pass between updates of the generic attribute at slot {@code index}
	 */
	public static void glVertexAttribDivisor(int index, int divisor) {
		long __functionAddress = getInstance().glVertexAttribDivisor;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttribDivisor(index, divisor, __functionAddress);
	}

	// --- [ glVertexP2ui ] ---

	/** JNI method for {@link #glVertexP2ui(int, int)} */
	public static native void nglVertexP2ui(int type, int value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glVertexP2ui.xml">OpenGL SDK Reference</a> <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Packed component version of {@link GL11#glVertex2f}.
	 *
	 * @param type  type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param value the packed value
	 */
	public static void glVertexP2ui(int type, int value) {
		long __functionAddress = getInstance().glVertexP2ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexP2ui(type, value, __functionAddress);
	}

	// --- [ glVertexP3ui ] ---

	/** JNI method for {@link #glVertexP3ui(int, int)} */
	public static native void nglVertexP3ui(int type, int value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glVertexP3ui.xml">OpenGL SDK Reference</a> <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Packed component version of {@link GL11#glVertex3f}.
	 *
	 * @param type  type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param value the packed value
	 */
	public static void glVertexP3ui(int type, int value) {
		long __functionAddress = getInstance().glVertexP3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexP3ui(type, value, __functionAddress);
	}

	// --- [ glVertexP4ui ] ---

	/** JNI method for {@link #glVertexP4ui(int, int)} */
	public static native void nglVertexP4ui(int type, int value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glVertexP4ui.xml">OpenGL SDK Reference</a> <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Packed component version of {@link GL11#glVertex4f}.
	 *
	 * @param type  type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param value the packed value
	 */
	public static void glVertexP4ui(int type, int value) {
		long __functionAddress = getInstance().glVertexP4ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexP4ui(type, value, __functionAddress);
	}

	// --- [ glVertexP2uiv ] ---

	/** JNI method for {@link #glVertexP2ui(int, ByteBuffer)} */
	public static native void nglVertexP2uiv(int type, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexP2.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexP2ui(int, int)}.
	 *
	 * @param type  type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param value the packed value
	 */
	public static void glVertexP2ui(int type, ByteBuffer value) {
		long __functionAddress = getInstance().glVertexP2uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1 << 2);
		}
		nglVertexP2uiv(type, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexP2ui(int, ByteBuffer)} */
	public static void glVertexP2u(int type, IntBuffer value) {
		long __functionAddress = getInstance().glVertexP2uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		nglVertexP2uiv(type, memAddress(value), __functionAddress);
	}

	// --- [ glVertexP3uiv ] ---

	/** JNI method for {@link #glVertexP3ui(int, ByteBuffer)} */
	public static native void nglVertexP3uiv(int type, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexP3.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexP3ui(int, int)}.
	 *
	 * @param type  type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param value the packed value
	 */
	public static void glVertexP3ui(int type, ByteBuffer value) {
		long __functionAddress = getInstance().glVertexP3uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1 << 2);
		}
		nglVertexP3uiv(type, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexP3ui(int, ByteBuffer)} */
	public static void glVertexP3u(int type, IntBuffer value) {
		long __functionAddress = getInstance().glVertexP3uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		nglVertexP3uiv(type, memAddress(value), __functionAddress);
	}

	// --- [ glVertexP4uiv ] ---

	/** JNI method for {@link #glVertexP4ui(int, ByteBuffer)} */
	public static native void nglVertexP4uiv(int type, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexP4.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexP4ui(int, int)}.
	 *
	 * @param type  type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param value the packed value
	 */
	public static void glVertexP4ui(int type, ByteBuffer value) {
		long __functionAddress = getInstance().glVertexP4uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1 << 2);
		}
		nglVertexP4uiv(type, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexP4ui(int, ByteBuffer)} */
	public static void glVertexP4u(int type, IntBuffer value) {
		long __functionAddress = getInstance().glVertexP4uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		nglVertexP4uiv(type, memAddress(value), __functionAddress);
	}

	// --- [ glTexCoordP1ui ] ---

	/** JNI method for {@link #glTexCoordP1ui(int, int)} */
	public static native void nglTexCoordP1ui(int type, int coords, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glTexCoordP1ui.xml">OpenGL SDK Reference</a> <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Packed component version of {@link GL11#glTexCoord1f}.
	 *
	 * @param type   type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP1ui(int type, int coords) {
		long __functionAddress = getInstance().glTexCoordP1ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoordP1ui(type, coords, __functionAddress);
	}

	// --- [ glTexCoordP2ui ] ---

	/** JNI method for {@link #glTexCoordP2ui(int, int)} */
	public static native void nglTexCoordP2ui(int type, int coords, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glTexCoordP2ui.xml">OpenGL SDK Reference</a> <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Packed component version of {@link GL11#glTexCoord2f}.
	 *
	 * @param type   type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP2ui(int type, int coords) {
		long __functionAddress = getInstance().glTexCoordP2ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoordP2ui(type, coords, __functionAddress);
	}

	// --- [ glTexCoordP3ui ] ---

	/** JNI method for {@link #glTexCoordP3ui(int, int)} */
	public static native void nglTexCoordP3ui(int type, int coords, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glTexCoordP3ui.xml">OpenGL SDK Reference</a> <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Packed component version of {@link GL11#glTexCoord3f}.
	 *
	 * @param type   type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP3ui(int type, int coords) {
		long __functionAddress = getInstance().glTexCoordP3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoordP3ui(type, coords, __functionAddress);
	}

	// --- [ glTexCoordP4ui ] ---

	/** JNI method for {@link #glTexCoordP4ui(int, int)} */
	public static native void nglTexCoordP4ui(int type, int coords, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glTexCoordP4ui.xml">OpenGL SDK Reference</a> <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Packed component version of {@link GL11#glTexCoord4f}.
	 *
	 * @param type   type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP4ui(int type, int coords) {
		long __functionAddress = getInstance().glTexCoordP4ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglTexCoordP4ui(type, coords, __functionAddress);
	}

	// --- [ glTexCoordP1uiv ] ---

	/** JNI method for {@link #glTexCoordP1ui(int, ByteBuffer)} */
	public static native void nglTexCoordP1uiv(int type, long coords, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glTexCoordP1.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glTexCoordP1ui(int, int)}.
	 *
	 * @param type   type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP1ui(int type, ByteBuffer coords) {
		long __functionAddress = getInstance().glTexCoordP1uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 1 << 2);
		}
		nglTexCoordP1uiv(type, memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glTexCoordP1ui(int, ByteBuffer)} */
	public static void glTexCoordP1u(int type, IntBuffer coords) {
		long __functionAddress = getInstance().glTexCoordP1uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 1);
		}
		nglTexCoordP1uiv(type, memAddress(coords), __functionAddress);
	}

	// --- [ glTexCoordP2uiv ] ---

	/** JNI method for {@link #glTexCoordP2ui(int, ByteBuffer)} */
	public static native void nglTexCoordP2uiv(int type, long coords, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glTexCoordP2.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glTexCoordP2ui(int, int)}.
	 *
	 * @param type   type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP2ui(int type, ByteBuffer coords) {
		long __functionAddress = getInstance().glTexCoordP2uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 1 << 2);
		}
		nglTexCoordP2uiv(type, memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glTexCoordP2ui(int, ByteBuffer)} */
	public static void glTexCoordP2u(int type, IntBuffer coords) {
		long __functionAddress = getInstance().glTexCoordP2uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 1);
		}
		nglTexCoordP2uiv(type, memAddress(coords), __functionAddress);
	}

	// --- [ glTexCoordP3uiv ] ---

	/** JNI method for {@link #glTexCoordP3ui(int, ByteBuffer)} */
	public static native void nglTexCoordP3uiv(int type, long coords, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glTexCoordP3.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glTexCoordP3ui(int, int)}.
	 *
	 * @param type   type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP3ui(int type, ByteBuffer coords) {
		long __functionAddress = getInstance().glTexCoordP3uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 1 << 2);
		}
		nglTexCoordP3uiv(type, memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glTexCoordP3ui(int, ByteBuffer)} */
	public static void glTexCoordP3u(int type, IntBuffer coords) {
		long __functionAddress = getInstance().glTexCoordP3uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 1);
		}
		nglTexCoordP3uiv(type, memAddress(coords), __functionAddress);
	}

	// --- [ glTexCoordP4uiv ] ---

	/** JNI method for {@link #glTexCoordP4ui(int, ByteBuffer)} */
	public static native void nglTexCoordP4uiv(int type, long coords, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glTexCoordP4.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glTexCoordP4ui(int, int)}.
	 *
	 * @param type   type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glTexCoordP4ui(int type, ByteBuffer coords) {
		long __functionAddress = getInstance().glTexCoordP4uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 1 << 2);
		}
		nglTexCoordP4uiv(type, memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glTexCoordP4ui(int, ByteBuffer)} */
	public static void glTexCoordP4u(int type, IntBuffer coords) {
		long __functionAddress = getInstance().glTexCoordP4uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 1);
		}
		nglTexCoordP4uiv(type, memAddress(coords), __functionAddress);
	}

	// --- [ glMultiTexCoordP1ui ] ---

	/** JNI method for {@link #glMultiTexCoordP1ui(int, int, int)} */
	public static native void nglMultiTexCoordP1ui(int texture, int type, int coords, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoordP1ui.xml">OpenGL SDK Reference</a> <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Packed component version of {@link GL13#glMultiTexCoord1f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<p/>type, of, packing, used, on, the, data
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP1ui(int texture, int type, int coords) {
		long __functionAddress = getInstance().glMultiTexCoordP1ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoordP1ui(texture, type, coords, __functionAddress);
	}

	// --- [ glMultiTexCoordP2ui ] ---

	/** JNI method for {@link #glMultiTexCoordP2ui(int, int, int)} */
	public static native void nglMultiTexCoordP2ui(int texture, int type, int coords, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoordP2ui.xml">OpenGL SDK Reference</a> <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Packed component version of {@link GL13#glMultiTexCoord2f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<p/>type, of, packing, used, on, the, data
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP2ui(int texture, int type, int coords) {
		long __functionAddress = getInstance().glMultiTexCoordP2ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoordP2ui(texture, type, coords, __functionAddress);
	}

	// --- [ glMultiTexCoordP3ui ] ---

	/** JNI method for {@link #glMultiTexCoordP3ui(int, int, int)} */
	public static native void nglMultiTexCoordP3ui(int texture, int type, int coords, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoordP3ui.xml">OpenGL SDK Reference</a> <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Packed component version of {@link GL13#glMultiTexCoord3f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<p/>type, of, packing, used, on, the, data
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP3ui(int texture, int type, int coords) {
		long __functionAddress = getInstance().glMultiTexCoordP3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoordP3ui(texture, type, coords, __functionAddress);
	}

	// --- [ glMultiTexCoordP4ui ] ---

	/** JNI method for {@link #glMultiTexCoordP4ui(int, int, int)} */
	public static native void nglMultiTexCoordP4ui(int texture, int type, int coords, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man2/xhtml/glMultiTexCoordP4ui.xml">OpenGL SDK Reference</a> <em>- This function is deprecated and unavailable in the Core profile -</em>
	 * <p/>
	 * Packed component version of {@link GL13#glMultiTexCoord4f}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<p/>type, of, packing, used, on, the, data
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP4ui(int texture, int type, int coords) {
		long __functionAddress = getInstance().glMultiTexCoordP4ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglMultiTexCoordP4ui(texture, type, coords, __functionAddress);
	}

	// --- [ glMultiTexCoordP1uiv ] ---

	/** JNI method for {@link #glMultiTexCoordP1ui(int, int, ByteBuffer)} */
	public static native void nglMultiTexCoordP1uiv(int texture, int type, long coords, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glMultiTexCoordP1.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glMultiTexCoordP1ui(int, int, int)}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP1ui(int texture, int type, ByteBuffer coords) {
		long __functionAddress = getInstance().glMultiTexCoordP1uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 1 << 2);
		}
		nglMultiTexCoordP1uiv(texture, type, memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glMultiTexCoordP1ui(int, int, ByteBuffer)} */
	public static void glMultiTexCoordP1u(int texture, int type, IntBuffer coords) {
		long __functionAddress = getInstance().glMultiTexCoordP1uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 1);
		}
		nglMultiTexCoordP1uiv(texture, type, memAddress(coords), __functionAddress);
	}

	// --- [ glMultiTexCoordP2uiv ] ---

	/** JNI method for {@link #glMultiTexCoordP2ui(int, int, ByteBuffer)} */
	public static native void nglMultiTexCoordP2uiv(int texture, int type, long coords, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glMultiTexCoordP2.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glMultiTexCoordP2ui(int, int, int)}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP2ui(int texture, int type, ByteBuffer coords) {
		long __functionAddress = getInstance().glMultiTexCoordP2uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 1 << 2);
		}
		nglMultiTexCoordP2uiv(texture, type, memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glMultiTexCoordP2ui(int, int, ByteBuffer)} */
	public static void glMultiTexCoordP2u(int texture, int type, IntBuffer coords) {
		long __functionAddress = getInstance().glMultiTexCoordP2uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 1);
		}
		nglMultiTexCoordP2uiv(texture, type, memAddress(coords), __functionAddress);
	}

	// --- [ glMultiTexCoordP3uiv ] ---

	/** JNI method for {@link #glMultiTexCoordP3ui(int, int, ByteBuffer)} */
	public static native void nglMultiTexCoordP3uiv(int texture, int type, long coords, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glMultiTexCoordP3.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glMultiTexCoordP3ui(int, int, int)}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP3ui(int texture, int type, ByteBuffer coords) {
		long __functionAddress = getInstance().glMultiTexCoordP3uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 1 << 2);
		}
		nglMultiTexCoordP3uiv(texture, type, memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glMultiTexCoordP3ui(int, int, ByteBuffer)} */
	public static void glMultiTexCoordP3u(int texture, int type, IntBuffer coords) {
		long __functionAddress = getInstance().glMultiTexCoordP3uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 1);
		}
		nglMultiTexCoordP3uiv(texture, type, memAddress(coords), __functionAddress);
	}

	// --- [ glMultiTexCoordP4uiv ] ---

	/** JNI method for {@link #glMultiTexCoordP4ui(int, int, ByteBuffer)} */
	public static native void nglMultiTexCoordP4uiv(int texture, int type, long coords, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glMultiTexCoordP4.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glMultiTexCoordP4ui(int, int, int)}.
	 *
	 * @param texture the coordinate set to be modified
	 * @param type    type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords  the packed value
	 */
	public static void glMultiTexCoordP4ui(int texture, int type, ByteBuffer coords) {
		long __functionAddress = getInstance().glMultiTexCoordP4uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 1 << 2);
		}
		nglMultiTexCoordP4uiv(texture, type, memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glMultiTexCoordP4ui(int, int, ByteBuffer)} */
	public static void glMultiTexCoordP4u(int texture, int type, IntBuffer coords) {
		long __functionAddress = getInstance().glMultiTexCoordP4uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 1);
		}
		nglMultiTexCoordP4uiv(texture, type, memAddress(coords), __functionAddress);
	}

	// --- [ glNormalP3ui ] ---

	/** JNI method for {@link #glNormalP3ui(int, int)} */
	public static native void nglNormalP3ui(int type, int coords, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glNormalP3ui.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Packed component version of {@link GL11#glNormal3f}.
	 *
	 * @param type   type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glNormalP3ui(int type, int coords) {
		long __functionAddress = getInstance().glNormalP3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglNormalP3ui(type, coords, __functionAddress);
	}

	// --- [ glNormalP3uiv ] ---

	/** JNI method for {@link #glNormalP3ui(int, ByteBuffer)} */
	public static native void nglNormalP3uiv(int type, long coords, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glNormalP3.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version {@link #glNormalP3ui(int, int)}.
	 *
	 * @param type   type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param coords the packed value
	 */
	public static void glNormalP3ui(int type, ByteBuffer coords) {
		long __functionAddress = getInstance().glNormalP3uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 1 << 2);
		}
		nglNormalP3uiv(type, memAddress(coords), __functionAddress);
	}

	/** Alternative version of: {@link #glNormalP3ui(int, ByteBuffer)} */
	public static void glNormalP3u(int type, IntBuffer coords) {
		long __functionAddress = getInstance().glNormalP3uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(coords, 1);
		}
		nglNormalP3uiv(type, memAddress(coords), __functionAddress);
	}

	// --- [ glColorP3ui ] ---

	/** JNI method for {@link #glColorP3ui(int, int)} */
	public static native void nglColorP3ui(int type, int color, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glColorP3ui.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Packed component version of {@link GL11#glColor3f}.
	 *
	 * @param type  type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param color the packed value
	 */
	public static void glColorP3ui(int type, int color) {
		long __functionAddress = getInstance().glColorP3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColorP3ui(type, color, __functionAddress);
	}

	// --- [ glColorP4ui ] ---

	/** JNI method for {@link #glColorP4ui(int, int)} */
	public static native void nglColorP4ui(int type, int color, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glColorP4ui.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Packed component version of {@link GL11#glColor4f}.
	 *
	 * @param type  type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param color the packed value
	 */
	public static void glColorP4ui(int type, int color) {
		long __functionAddress = getInstance().glColorP4ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglColorP4ui(type, color, __functionAddress);
	}

	// --- [ glColorP3uiv ] ---

	/** JNI method for {@link #glColorP3ui(int, ByteBuffer)} */
	public static native void nglColorP3uiv(int type, long color, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glColorP3.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glColorP3ui(int, int)}.
	 *
	 * @param type  type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param color the packed value
	 */
	public static void glColorP3ui(int type, ByteBuffer color) {
		long __functionAddress = getInstance().glColorP3uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(color, 1 << 2);
		}
		nglColorP3uiv(type, memAddress(color), __functionAddress);
	}

	/** Alternative version of: {@link #glColorP3ui(int, ByteBuffer)} */
	public static void glColorP3u(int type, IntBuffer color) {
		long __functionAddress = getInstance().glColorP3uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(color, 1);
		}
		nglColorP3uiv(type, memAddress(color), __functionAddress);
	}

	// --- [ glColorP4uiv ] ---

	/** JNI method for {@link #glColorP4ui(int, ByteBuffer)} */
	public static native void nglColorP4uiv(int type, long color, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glColorP4.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glColorP4ui(int, int)}.
	 *
	 * @param type  type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param color the packed value
	 */
	public static void glColorP4ui(int type, ByteBuffer color) {
		long __functionAddress = getInstance().glColorP4uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(color, 1 << 2);
		}
		nglColorP4uiv(type, memAddress(color), __functionAddress);
	}

	/** Alternative version of: {@link #glColorP4ui(int, ByteBuffer)} */
	public static void glColorP4u(int type, IntBuffer color) {
		long __functionAddress = getInstance().glColorP4uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(color, 1);
		}
		nglColorP4uiv(type, memAddress(color), __functionAddress);
	}

	// --- [ glSecondaryColorP3ui ] ---

	/** JNI method for {@link #glSecondaryColorP3ui(int, int)} */
	public static native void nglSecondaryColorP3ui(int type, int color, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glSecondaryColorP3ui.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Packed component version of {@link GL14#glSecondaryColor3f}.
	 *
	 * @param type  type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param color the packed value
	 */
	public static void glSecondaryColorP3ui(int type, int color) {
		long __functionAddress = getInstance().glSecondaryColorP3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglSecondaryColorP3ui(type, color, __functionAddress);
	}

	// --- [ glSecondaryColorP3uiv ] ---

	/** JNI method for {@link #glSecondaryColorP3ui(int, ByteBuffer)} */
	public static native void nglSecondaryColorP3uiv(int type, long color, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glSecondaryColorP3.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glSecondaryColorP3ui(int, int)}.
	 *
	 * @param type  type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param color the packed value
	 */
	public static void glSecondaryColorP3ui(int type, ByteBuffer color) {
		long __functionAddress = getInstance().glSecondaryColorP3uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(color, 1 << 2);
		}
		nglSecondaryColorP3uiv(type, memAddress(color), __functionAddress);
	}

	/** Alternative version of: {@link #glSecondaryColorP3ui(int, ByteBuffer)} */
	public static void glSecondaryColorP3u(int type, IntBuffer color) {
		long __functionAddress = getInstance().glSecondaryColorP3uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(color, 1);
		}
		nglSecondaryColorP3uiv(type, memAddress(color), __functionAddress);
	}

	// --- [ glVertexAttribP1ui ] ---

	/** JNI method for {@link #glVertexAttribP1ui(int, int, boolean, int)} */
	public static native void nglVertexAttribP1ui(int index, int type, boolean normalized, int value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribP1ui.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Packed component version of {@link GL20#glVertexAttrib1f}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP1ui(int index, int type, boolean normalized, int value) {
		long __functionAddress = getInstance().glVertexAttribP1ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttribP1ui(index, type, normalized, value, __functionAddress);
	}

	// --- [ glVertexAttribP2ui ] ---

	/** JNI method for {@link #glVertexAttribP2ui(int, int, boolean, int)} */
	public static native void nglVertexAttribP2ui(int index, int type, boolean normalized, int value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribP2ui.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Packed component version of {@link GL20#glVertexAttrib2f}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP2ui(int index, int type, boolean normalized, int value) {
		long __functionAddress = getInstance().glVertexAttribP2ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttribP2ui(index, type, normalized, value, __functionAddress);
	}

	// --- [ glVertexAttribP3ui ] ---

	/** JNI method for {@link #glVertexAttribP3ui(int, int, boolean, int)} */
	public static native void nglVertexAttribP3ui(int index, int type, boolean normalized, int value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribP3ui.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Packed component version of {@link GL20#glVertexAttrib3f}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP3ui(int index, int type, boolean normalized, int value) {
		long __functionAddress = getInstance().glVertexAttribP3ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttribP3ui(index, type, normalized, value, __functionAddress);
	}

	// --- [ glVertexAttribP4ui ] ---

	/** JNI method for {@link #glVertexAttribP4ui(int, int, boolean, int)} */
	public static native void nglVertexAttribP4ui(int index, int type, boolean normalized, int value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribP4ui.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Packed component version of {@link GL20#glVertexAttrib4f}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP4ui(int index, int type, boolean normalized, int value) {
		long __functionAddress = getInstance().glVertexAttribP4ui;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexAttribP4ui(index, type, normalized, value, __functionAddress);
	}

	// --- [ glVertexAttribP1uiv ] ---

	/** JNI method for {@link #glVertexAttribP1ui(int, int, boolean, ByteBuffer)} */
	public static native void nglVertexAttribP1uiv(int index, int type, boolean normalized, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribP1.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexAttribP1ui(int, int, boolean, int)}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP1ui(int index, int type, boolean normalized, ByteBuffer value) {
		long __functionAddress = getInstance().glVertexAttribP1uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1 << 2);
		}
		nglVertexAttribP1uiv(index, type, normalized, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttribP1ui(int, int, boolean, ByteBuffer)} */
	public static void glVertexAttribP1u(int index, int type, boolean normalized, IntBuffer value) {
		long __functionAddress = getInstance().glVertexAttribP1uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		nglVertexAttribP1uiv(index, type, normalized, memAddress(value), __functionAddress);
	}

	// --- [ glVertexAttribP2uiv ] ---

	/** JNI method for {@link #glVertexAttribP2ui(int, int, boolean, ByteBuffer)} */
	public static native void nglVertexAttribP2uiv(int index, int type, boolean normalized, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribP2.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexAttribP2ui(int, int, boolean, int)}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP2ui(int index, int type, boolean normalized, ByteBuffer value) {
		long __functionAddress = getInstance().glVertexAttribP2uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1 << 2);
		}
		nglVertexAttribP2uiv(index, type, normalized, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttribP2ui(int, int, boolean, ByteBuffer)} */
	public static void glVertexAttribP2u(int index, int type, boolean normalized, IntBuffer value) {
		long __functionAddress = getInstance().glVertexAttribP2uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		nglVertexAttribP2uiv(index, type, normalized, memAddress(value), __functionAddress);
	}

	// --- [ glVertexAttribP3uiv ] ---

	/** JNI method for {@link #glVertexAttribP3ui(int, int, boolean, ByteBuffer)} */
	public static native void nglVertexAttribP3uiv(int index, int type, boolean normalized, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribP3.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexAttribP3ui(int, int, boolean, int)}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP3ui(int index, int type, boolean normalized, ByteBuffer value) {
		long __functionAddress = getInstance().glVertexAttribP3uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1 << 2);
		}
		nglVertexAttribP3uiv(index, type, normalized, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttribP3ui(int, int, boolean, ByteBuffer)} */
	public static void glVertexAttribP3u(int index, int type, boolean normalized, IntBuffer value) {
		long __functionAddress = getInstance().glVertexAttribP3uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		nglVertexAttribP3uiv(index, type, normalized, memAddress(value), __functionAddress);
	}

	// --- [ glVertexAttribP4uiv ] ---

	/** JNI method for {@link #glVertexAttribP4ui(int, int, boolean, ByteBuffer)} */
	public static native void nglVertexAttribP4uiv(int index, int type, boolean normalized, long value, long __functionAddress);

	/**
	 * <a href="http://www.opengl.org/sdk/docs/man/xhtml/glVertexAttribP4.xml">OpenGL SDK Reference</a>
	 * <p/>
	 * Pointer version of {@link #glVertexAttribP4ui(int, int, boolean, int)}.
	 *
	 * @param index      the index of the generic vertex attribute to be modified
	 * @param type       type of packing used on the data. One of:<p/>{@link #GL_INT_2_10_10_10_REV}, {@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV}
	 * @param normalized whether values should be normalized or cast directly to floating-point
	 * @param value      the packed value
	 */
	public static void glVertexAttribP4ui(int index, int type, boolean normalized, ByteBuffer value) {
		long __functionAddress = getInstance().glVertexAttribP4uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1 << 2);
		}
		nglVertexAttribP4uiv(index, type, normalized, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #glVertexAttribP4ui(int, int, boolean, ByteBuffer)} */
	public static void glVertexAttribP4u(int index, int type, boolean normalized, IntBuffer value) {
		long __functionAddress = getInstance().glVertexAttribP4uiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		nglVertexAttribP4uiv(index, type, normalized, memAddress(value), __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return GL.getCapabilities().__GL33;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider, boolean fc) {
		if ( !ext.contains("OpenGL33") ) return null;

		Functions funcs = new Functions(provider, fc);

		boolean supported = 
			GL.isFunctionSupported(funcs.glBindFragDataLocationIndexed) &&
			GL.isFunctionSupported(funcs.glGetFragDataIndex) &&
			GL.isFunctionSupported(funcs.glGenSamplers) &&
			GL.isFunctionSupported(funcs.glDeleteSamplers) &&
			GL.isFunctionSupported(funcs.glIsSampler) &&
			GL.isFunctionSupported(funcs.glBindSampler) &&
			GL.isFunctionSupported(funcs.glSamplerParameteri) &&
			GL.isFunctionSupported(funcs.glSamplerParameterf) &&
			GL.isFunctionSupported(funcs.glSamplerParameteriv) &&
			GL.isFunctionSupported(funcs.glSamplerParameterfv) &&
			GL.isFunctionSupported(funcs.glSamplerParameterIiv) &&
			GL.isFunctionSupported(funcs.glSamplerParameterIuiv) &&
			GL.isFunctionSupported(funcs.glGetSamplerParameteriv) &&
			GL.isFunctionSupported(funcs.glGetSamplerParameterfv) &&
			GL.isFunctionSupported(funcs.glGetSamplerParameterIiv) &&
			GL.isFunctionSupported(funcs.glGetSamplerParameterIuiv) &&
			GL.isFunctionSupported(funcs.glQueryCounter) &&
			GL.isFunctionSupported(funcs.glGetQueryObjecti64v) &&
			GL.isFunctionSupported(funcs.glGetQueryObjectui64v) &&
			GL.isFunctionSupported(funcs.glVertexAttribDivisor) &&
			GL.isFunctionSupported(funcs.glVertexP2ui, fc) &&
			GL.isFunctionSupported(funcs.glVertexP3ui, fc) &&
			GL.isFunctionSupported(funcs.glVertexP4ui, fc) &&
			GL.isFunctionSupported(funcs.glVertexP2uiv) &&
			GL.isFunctionSupported(funcs.glVertexP3uiv) &&
			GL.isFunctionSupported(funcs.glVertexP4uiv) &&
			GL.isFunctionSupported(funcs.glTexCoordP1ui, fc) &&
			GL.isFunctionSupported(funcs.glTexCoordP2ui, fc) &&
			GL.isFunctionSupported(funcs.glTexCoordP3ui, fc) &&
			GL.isFunctionSupported(funcs.glTexCoordP4ui, fc) &&
			GL.isFunctionSupported(funcs.glTexCoordP1uiv) &&
			GL.isFunctionSupported(funcs.glTexCoordP2uiv) &&
			GL.isFunctionSupported(funcs.glTexCoordP3uiv) &&
			GL.isFunctionSupported(funcs.glTexCoordP4uiv) &&
			GL.isFunctionSupported(funcs.glMultiTexCoordP1ui, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoordP2ui, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoordP3ui, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoordP4ui, fc) &&
			GL.isFunctionSupported(funcs.glMultiTexCoordP1uiv) &&
			GL.isFunctionSupported(funcs.glMultiTexCoordP2uiv) &&
			GL.isFunctionSupported(funcs.glMultiTexCoordP3uiv) &&
			GL.isFunctionSupported(funcs.glMultiTexCoordP4uiv) &&
			GL.isFunctionSupported(funcs.glNormalP3ui) &&
			GL.isFunctionSupported(funcs.glNormalP3uiv) &&
			GL.isFunctionSupported(funcs.glColorP3ui) &&
			GL.isFunctionSupported(funcs.glColorP4ui) &&
			GL.isFunctionSupported(funcs.glColorP3uiv) &&
			GL.isFunctionSupported(funcs.glColorP4uiv) &&
			GL.isFunctionSupported(funcs.glSecondaryColorP3ui) &&
			GL.isFunctionSupported(funcs.glSecondaryColorP3uiv) &&
			GL.isFunctionSupported(funcs.glVertexAttribP1ui) &&
			GL.isFunctionSupported(funcs.glVertexAttribP2ui) &&
			GL.isFunctionSupported(funcs.glVertexAttribP3ui) &&
			GL.isFunctionSupported(funcs.glVertexAttribP4ui) &&
			GL.isFunctionSupported(funcs.glVertexAttribP1uiv) &&
			GL.isFunctionSupported(funcs.glVertexAttribP2uiv) &&
			GL.isFunctionSupported(funcs.glVertexAttribP3uiv) &&
			GL.isFunctionSupported(funcs.glVertexAttribP4uiv);

		return GL.checkExtension("OpenGL33", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code GL33}. */
	public static final class Functions implements FunctionMap {

		public final long
			glBindFragDataLocationIndexed,
			glGetFragDataIndex,
			glGenSamplers,
			glDeleteSamplers,
			glIsSampler,
			glBindSampler,
			glSamplerParameteri,
			glSamplerParameterf,
			glSamplerParameteriv,
			glSamplerParameterfv,
			glSamplerParameterIiv,
			glSamplerParameterIuiv,
			glGetSamplerParameteriv,
			glGetSamplerParameterfv,
			glGetSamplerParameterIiv,
			glGetSamplerParameterIuiv,
			glQueryCounter,
			glGetQueryObjecti64v,
			glGetQueryObjectui64v,
			glVertexAttribDivisor,
			glVertexP2ui,
			glVertexP3ui,
			glVertexP4ui,
			glVertexP2uiv,
			glVertexP3uiv,
			glVertexP4uiv,
			glTexCoordP1ui,
			glTexCoordP2ui,
			glTexCoordP3ui,
			glTexCoordP4ui,
			glTexCoordP1uiv,
			glTexCoordP2uiv,
			glTexCoordP3uiv,
			glTexCoordP4uiv,
			glMultiTexCoordP1ui,
			glMultiTexCoordP2ui,
			glMultiTexCoordP3ui,
			glMultiTexCoordP4ui,
			glMultiTexCoordP1uiv,
			glMultiTexCoordP2uiv,
			glMultiTexCoordP3uiv,
			glMultiTexCoordP4uiv,
			glNormalP3ui,
			glNormalP3uiv,
			glColorP3ui,
			glColorP4ui,
			glColorP3uiv,
			glColorP4uiv,
			glSecondaryColorP3ui,
			glSecondaryColorP3uiv,
			glVertexAttribP1ui,
			glVertexAttribP2ui,
			glVertexAttribP3ui,
			glVertexAttribP4ui,
			glVertexAttribP1uiv,
			glVertexAttribP2uiv,
			glVertexAttribP3uiv,
			glVertexAttribP4uiv;

		public Functions(FunctionProvider provider, boolean fc) {
			glBindFragDataLocationIndexed = provider.getFunctionAddress("glBindFragDataLocationIndexed");
			glGetFragDataIndex = provider.getFunctionAddress("glGetFragDataIndex");
			glGenSamplers = provider.getFunctionAddress("glGenSamplers");
			glDeleteSamplers = provider.getFunctionAddress("glDeleteSamplers");
			glIsSampler = provider.getFunctionAddress("glIsSampler");
			glBindSampler = provider.getFunctionAddress("glBindSampler");
			glSamplerParameteri = provider.getFunctionAddress("glSamplerParameteri");
			glSamplerParameterf = provider.getFunctionAddress("glSamplerParameterf");
			glSamplerParameteriv = provider.getFunctionAddress("glSamplerParameteriv");
			glSamplerParameterfv = provider.getFunctionAddress("glSamplerParameterfv");
			glSamplerParameterIiv = provider.getFunctionAddress("glSamplerParameterIiv");
			glSamplerParameterIuiv = provider.getFunctionAddress("glSamplerParameterIuiv");
			glGetSamplerParameteriv = provider.getFunctionAddress("glGetSamplerParameteriv");
			glGetSamplerParameterfv = provider.getFunctionAddress("glGetSamplerParameterfv");
			glGetSamplerParameterIiv = provider.getFunctionAddress("glGetSamplerParameterIiv");
			glGetSamplerParameterIuiv = provider.getFunctionAddress("glGetSamplerParameterIuiv");
			glQueryCounter = provider.getFunctionAddress("glQueryCounter");
			glGetQueryObjecti64v = provider.getFunctionAddress("glGetQueryObjecti64v");
			glGetQueryObjectui64v = provider.getFunctionAddress("glGetQueryObjectui64v");
			glVertexAttribDivisor = provider.getFunctionAddress("glVertexAttribDivisor");
			glVertexP2ui = GL.getFunctionAddress(provider, "glVertexP2ui", fc);
			glVertexP3ui = GL.getFunctionAddress(provider, "glVertexP3ui", fc);
			glVertexP4ui = GL.getFunctionAddress(provider, "glVertexP4ui", fc);
			glVertexP2uiv = provider.getFunctionAddress("glVertexP2uiv");
			glVertexP3uiv = provider.getFunctionAddress("glVertexP3uiv");
			glVertexP4uiv = provider.getFunctionAddress("glVertexP4uiv");
			glTexCoordP1ui = GL.getFunctionAddress(provider, "glTexCoordP1ui", fc);
			glTexCoordP2ui = GL.getFunctionAddress(provider, "glTexCoordP2ui", fc);
			glTexCoordP3ui = GL.getFunctionAddress(provider, "glTexCoordP3ui", fc);
			glTexCoordP4ui = GL.getFunctionAddress(provider, "glTexCoordP4ui", fc);
			glTexCoordP1uiv = provider.getFunctionAddress("glTexCoordP1uiv");
			glTexCoordP2uiv = provider.getFunctionAddress("glTexCoordP2uiv");
			glTexCoordP3uiv = provider.getFunctionAddress("glTexCoordP3uiv");
			glTexCoordP4uiv = provider.getFunctionAddress("glTexCoordP4uiv");
			glMultiTexCoordP1ui = GL.getFunctionAddress(provider, "glMultiTexCoordP1ui", fc);
			glMultiTexCoordP2ui = GL.getFunctionAddress(provider, "glMultiTexCoordP2ui", fc);
			glMultiTexCoordP3ui = GL.getFunctionAddress(provider, "glMultiTexCoordP3ui", fc);
			glMultiTexCoordP4ui = GL.getFunctionAddress(provider, "glMultiTexCoordP4ui", fc);
			glMultiTexCoordP1uiv = provider.getFunctionAddress("glMultiTexCoordP1uiv");
			glMultiTexCoordP2uiv = provider.getFunctionAddress("glMultiTexCoordP2uiv");
			glMultiTexCoordP3uiv = provider.getFunctionAddress("glMultiTexCoordP3uiv");
			glMultiTexCoordP4uiv = provider.getFunctionAddress("glMultiTexCoordP4uiv");
			glNormalP3ui = provider.getFunctionAddress("glNormalP3ui");
			glNormalP3uiv = provider.getFunctionAddress("glNormalP3uiv");
			glColorP3ui = provider.getFunctionAddress("glColorP3ui");
			glColorP4ui = provider.getFunctionAddress("glColorP4ui");
			glColorP3uiv = provider.getFunctionAddress("glColorP3uiv");
			glColorP4uiv = provider.getFunctionAddress("glColorP4uiv");
			glSecondaryColorP3ui = provider.getFunctionAddress("glSecondaryColorP3ui");
			glSecondaryColorP3uiv = provider.getFunctionAddress("glSecondaryColorP3uiv");
			glVertexAttribP1ui = provider.getFunctionAddress("glVertexAttribP1ui");
			glVertexAttribP2ui = provider.getFunctionAddress("glVertexAttribP2ui");
			glVertexAttribP3ui = provider.getFunctionAddress("glVertexAttribP3ui");
			glVertexAttribP4ui = provider.getFunctionAddress("glVertexAttribP4ui");
			glVertexAttribP1uiv = provider.getFunctionAddress("glVertexAttribP1uiv");
			glVertexAttribP2uiv = provider.getFunctionAddress("glVertexAttribP2uiv");
			glVertexAttribP3uiv = provider.getFunctionAddress("glVertexAttribP3uiv");
			glVertexAttribP4uiv = provider.getFunctionAddress("glVertexAttribP4uiv");
		}

	}

}