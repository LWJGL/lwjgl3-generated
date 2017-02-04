/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/sampler_objects.txt">ARB_sampler_objects</a> extension.
 * 
 * <p>In unextended OpenGL textures are considered to be sets of image data (mip-chains, arrays, cube-map face sets, etc.) and sampling state (sampling mode,
 * mip-mapping state, coordinate wrapping and clamping rules, etc.) combined into a single object. It is typical for an application to use many textures
 * with a limited set of sampling states that are the same between them. In order to use textures in this way, an application must generate and configure
 * many texture names, adding overhead both to applications and to implementations. Furthermore, should an application wish to sample from a texture in
 * more than one way (with and without mip-mapping, for example) it must either modify the state of the texture or create two textures, each with a copy of
 * the same image data. This can introduce runtime and memory costs to the application.</p>
 * 
 * <p>This extension separates sampler state from texture image data. A new object type is introduced, the sampler (representing generic sampling parameters).
 * The new sampler objects are represented by a new named type encapsulating the sampling parameters of a traditional texture object. Sampler objects may
 * be bound to texture units to supplant the bound texture's sampling state. A single sampler may be bound to more than one texture unit simultaneously,
 * allowing different textures to be accessed with a single set of shared sampling parameters. Also, by binding different sampler objects to texture units
 * to which the same texture has been bound, the same texture image data may be sampled with different sampling parameters.</p>
 * 
 * <p>Promoted to core in {@link GL33 OpenGL 3.3}.</p>
 */
public class ARBSamplerObjects {

	/** Accepted by the {@code value} parameter of the GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv and GetDoublev functions. */
	public static final int GL_SAMPLER_BINDING = 0x8919;

	static { GL.initialize(); }

	protected ARBSamplerObjects() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glGenSamplers, caps.glDeleteSamplers, caps.glIsSampler, caps.glBindSampler, caps.glSamplerParameteri, caps.glSamplerParameterf, 
			caps.glSamplerParameteriv, caps.glSamplerParameterfv, caps.glSamplerParameterIiv, caps.glSamplerParameterIuiv, caps.glGetSamplerParameteriv, 
			caps.glGetSamplerParameterfv, caps.glGetSamplerParameterIiv, caps.glGetSamplerParameterIuiv
		);
	}

	// --- [ glGenSamplers ] ---

	/**
	 * Unsafe version of: {@link #glGenSamplers GenSamplers}
	 *
	 * @param count the number of sampler object names to generate
	 */
	public static native void nglGenSamplers(int count, long samplers);

	/**
	 * Generates sampler object names.
	 *
	 * @param samplers a buffer in which the generated sampler object names are stored
	 */
	public static void glGenSamplers(IntBuffer samplers) {
		nglGenSamplers(samplers.remaining(), memAddress(samplers));
	}

	/** Generates sampler object names. */
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
	 * Unsafe version of: {@link #glDeleteSamplers DeleteSamplers}
	 *
	 * @param count the number of sampler objects to be deleted
	 */
	public static native void nglDeleteSamplers(int count, long samplers);

	/**
	 * Deletes named sampler objects.
	 *
	 * @param samplers an array of sampler objects to be deleted
	 */
	public static void glDeleteSamplers(IntBuffer samplers) {
		nglDeleteSamplers(samplers.remaining(), memAddress(samplers));
	}

	/** Deletes named sampler objects. */
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
	 * Determines if a name corresponds to a sampler object.
	 *
	 * @param sampler a value that may be the name of a sampler object
	 */
	public static native boolean glIsSampler(int sampler);

	// --- [ glBindSampler ] ---

	/**
	 * Binds a named sampler to a texturing target.
	 *
	 * @param unit    the index of the texture unit to which the sampler is bound
	 * @param sampler the name of a sampler
	 */
	public static native void glBindSampler(int unit, int sampler);

	// --- [ glSamplerParameteri ] ---

	/**
	 * Set the integer value of a sampler parameter.
	 *
	 * @param sampler the sampler object whose parameter to modify
	 * @param pname   the symbolic name of a single-valued sampler parameter. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td></tr><tr><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr></table>
	 * @param param   the value of {@code pname}
	 */
	public static native void glSamplerParameteri(int sampler, int pname, int param);

	// --- [ glSamplerParameterf ] ---

	/**
	 * Float version of {@link #glSamplerParameteri SamplerParameteri}.
	 *
	 * @param sampler the sampler object whose parameter to modify
	 * @param pname   the symbolic name of a single-valued sampler parameter
	 * @param param   the value of {@code pname}
	 */
	public static native void glSamplerParameterf(int sampler, int pname, float param);

	// --- [ glSamplerParameteriv ] ---

	/** Unsafe version of: {@link #glSamplerParameteriv SamplerParameteriv} */
	public static native void nglSamplerParameteriv(int sampler, int pname, long params);

	/**
	 * Pointer version of {@link #glSamplerParameteri SamplerParameteri}.
	 *
	 * @param sampler the sampler object whose parameter to modify
	 * @param pname   the symbolic name of a sampler parameter. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td></tr><tr><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td></tr><tr><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr></table>
	 * @param params  an array where the value or values of {@code pname} are stored
	 */
	public static void glSamplerParameteriv(int sampler, int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglSamplerParameteriv(sampler, pname, memAddress(params));
	}

	// --- [ glSamplerParameterfv ] ---

	/** Unsafe version of: {@link #glSamplerParameterfv SamplerParameterfv} */
	public static native void nglSamplerParameterfv(int sampler, int pname, long params);

	/**
	 * Float version of {@link #glSamplerParameteriv SamplerParameteriv}.
	 *
	 * @param sampler the sampler object whose parameter to modify
	 * @param pname   the symbolic name of a sampler parameter
	 * @param params  an array where the value or values of {@code pname} are stored
	 */
	public static void glSamplerParameterfv(int sampler, int pname, FloatBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglSamplerParameterfv(sampler, pname, memAddress(params));
	}

	// --- [ glSamplerParameterIiv ] ---

	/** Unsafe version of: {@link #glSamplerParameterIiv SamplerParameterIiv} */
	public static native void nglSamplerParameterIiv(int sampler, int pname, long params);

	/**
	 * Pure integer version of {@link #glSamplerParameteriv SamplerParameteriv}.
	 *
	 * @param sampler the sampler object whose parameter to modify
	 * @param pname   the symbolic name of a sampler parameter
	 * @param params  an array where the value or values of {@code pname} are stored
	 */
	public static void glSamplerParameterIiv(int sampler, int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglSamplerParameterIiv(sampler, pname, memAddress(params));
	}

	// --- [ glSamplerParameterIuiv ] ---

	/** Unsafe version of: {@link #glSamplerParameterIuiv SamplerParameterIuiv} */
	public static native void nglSamplerParameterIuiv(int sampler, int pname, long params);

	/**
	 * Unsigned pure integer version of {@link #glSamplerParameteriv SamplerParameteriv}.
	 *
	 * @param sampler the sampler object whose parameter to modify
	 * @param pname   the symbolic name of a sampler parameter
	 * @param params  an array where the value or values of {@code pname} are stored
	 */
	public static void glSamplerParameterIuiv(int sampler, int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglSamplerParameterIuiv(sampler, pname, memAddress(params));
	}

	// --- [ glGetSamplerParameteriv ] ---

	/** Unsafe version of: {@link #glGetSamplerParameteriv GetSamplerParameteriv} */
	public static native void nglGetSamplerParameteriv(int sampler, int pname, long params);

	/**
	 * Return the integer value(s) of a sampler parameter.
	 *
	 * @param sampler the name of the sampler object from which to retrieve parameters
	 * @param pname   the symbolic name of a sampler parameter. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td></tr><tr><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr><tr><td>,</td><td>{@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td></tr></table>
	 * @param params  the sampler parameters
	 */
	public static void glGetSamplerParameteriv(int sampler, int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglGetSamplerParameteriv(sampler, pname, memAddress(params));
	}

	/**
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

	/** Unsafe version of: {@link #glGetSamplerParameterfv GetSamplerParameterfv} */
	public static native void nglGetSamplerParameterfv(int sampler, int pname, long params);

	/**
	 * Float version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.
	 *
	 * @param sampler the name of the sampler object from which to retrieve parameters
	 * @param pname   the symbolic name of a sampler parameter
	 * @param params  the sampler parameters
	 */
	public static void glGetSamplerParameterfv(int sampler, int pname, FloatBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglGetSamplerParameterfv(sampler, pname, memAddress(params));
	}

	/**
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

	/** Unsafe version of: {@link #glGetSamplerParameterIiv GetSamplerParameterIiv} */
	public static native void nglGetSamplerParameterIiv(int sampler, int pname, long params);

	/**
	 * Pure integer version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.
	 *
	 * @param sampler the name of the sampler object from which to retrieve parameters
	 * @param pname   the symbolic name of a sampler parameter
	 * @param params  the sampler parameters
	 */
	public static void glGetSamplerParameterIiv(int sampler, int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglGetSamplerParameterIiv(sampler, pname, memAddress(params));
	}

	/**
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

	/** Unsafe version of: {@link #glGetSamplerParameterIuiv GetSamplerParameterIuiv} */
	public static native void nglGetSamplerParameterIuiv(int sampler, int pname, long params);

	/**
	 * Unsigned pure integer version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.
	 *
	 * @param sampler the name of the sampler object from which to retrieve parameters
	 * @param pname   the symbolic name of a sampler parameter
	 * @param params  the sampler parameters
	 */
	public static void glGetSamplerParameterIuiv(int sampler, int pname, IntBuffer params) {
		if ( CHECKS )
			check(params, 1);
		nglGetSamplerParameterIuiv(sampler, pname, memAddress(params));
	}

	/**
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

	/** Array version of: {@link #glGenSamplers GenSamplers} */
	public static void glGenSamplers(int[] samplers) {
		long __functionAddress = GL.getICD().glGenSamplers;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, samplers.length, samplers);
	}

	/** Array version of: {@link #glDeleteSamplers DeleteSamplers} */
	public static void glDeleteSamplers(int[] samplers) {
		long __functionAddress = GL.getICD().glDeleteSamplers;
		if ( CHECKS )
			check(__functionAddress);
		callPV(__functionAddress, samplers.length, samplers);
	}

	/** Array version of: {@link #glSamplerParameteriv SamplerParameteriv} */
	public static void glSamplerParameteriv(int sampler, int pname, int[] params) {
		long __functionAddress = GL.getICD().glSamplerParameteriv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 1);
		}
		callPV(__functionAddress, sampler, pname, params);
	}

	/** Array version of: {@link #glSamplerParameterfv SamplerParameterfv} */
	public static void glSamplerParameterfv(int sampler, int pname, float[] params) {
		long __functionAddress = GL.getICD().glSamplerParameterfv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 1);
		}
		callPV(__functionAddress, sampler, pname, params);
	}

	/** Array version of: {@link #glSamplerParameterIiv SamplerParameterIiv} */
	public static void glSamplerParameterIiv(int sampler, int pname, int[] params) {
		long __functionAddress = GL.getICD().glSamplerParameterIiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 1);
		}
		callPV(__functionAddress, sampler, pname, params);
	}

	/** Array version of: {@link #glSamplerParameterIuiv SamplerParameterIuiv} */
	public static void glSamplerParameterIuiv(int sampler, int pname, int[] params) {
		long __functionAddress = GL.getICD().glSamplerParameterIuiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 1);
		}
		callPV(__functionAddress, sampler, pname, params);
	}

	/** Array version of: {@link #glGetSamplerParameteriv GetSamplerParameteriv} */
	public static void glGetSamplerParameteriv(int sampler, int pname, int[] params) {
		long __functionAddress = GL.getICD().glGetSamplerParameteriv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 1);
		}
		callPV(__functionAddress, sampler, pname, params);
	}

	/** Array version of: {@link #glGetSamplerParameterfv GetSamplerParameterfv} */
	public static void glGetSamplerParameterfv(int sampler, int pname, float[] params) {
		long __functionAddress = GL.getICD().glGetSamplerParameterfv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 1);
		}
		callPV(__functionAddress, sampler, pname, params);
	}

	/** Array version of: {@link #glGetSamplerParameterIiv GetSamplerParameterIiv} */
	public static void glGetSamplerParameterIiv(int sampler, int pname, int[] params) {
		long __functionAddress = GL.getICD().glGetSamplerParameterIiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 1);
		}
		callPV(__functionAddress, sampler, pname, params);
	}

	/** Array version of: {@link #glGetSamplerParameterIuiv GetSamplerParameterIuiv} */
	public static void glGetSamplerParameterIuiv(int sampler, int pname, int[] params) {
		long __functionAddress = GL.getICD().glGetSamplerParameterIuiv;
		if ( CHECKS ) {
			check(__functionAddress);
			check(params, 1);
		}
		callPV(__functionAddress, sampler, pname, params);
	}

}