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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/gl_spirv.txt">ARB_gl_spirv</a> extension.
 * 
 * <p>This is version 100 of the GL_ARB_gl_spirv extension.</p>
 * 
 * <p>This extension does two things:</p>
 * 
 * <ol>
 * <li>Allows a SPIR-V module to be specified as containing a programmable shader stage, rather than using GLSL, whatever the source language was used to
 * create the SPIR-V module.</li>
 * <li>Modifies GLSL to be a source language for creating SPIR-V modules for OpenGL consumption. Such GLSL can be used to create such SPIR-V modules,
 * outside of the OpenGL runtime.</li>
 * </ol>
 * 
 * <p>Requires {@link GL33 OpenGL 3.3}.</p>
 */
public class ARBGLSPIRV {

	/** Accepted by the {@code binaryformat} parameter of {@link GL41#glShaderBinary ShaderBinary}. */
	public static final int GL_SHADER_BINARY_FORMAT_SPIR_V_ARB = 0x9551;

	/** Accepted by the {@code pname} parameter of {@link GL20#glGetShaderiv GetShaderiv}. */
	public static final int GL_SPIR_V_BINARY_ARB = 0x9552;

	protected ARBGLSPIRV() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glSpecializeShaderARB
		);
	}

	// --- [ glSpecializeShaderARB ] ---

	/** Unsafe version of: {@link #glSpecializeShaderARB SpecializeShaderARB} */
	public static void nglSpecializeShaderARB(int shader, long pEntryPoint, int numSpecializationConstants, long pConstantIndex, long pConstantValue) {
		long __functionAddress = GL.getCapabilities().glSpecializeShaderARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, shader, pEntryPoint, numSpecializationConstants, pConstantIndex, pConstantValue);
	}

	/**
	 * Specializes a shader created from a SPIR-V module.
	 *
	 * @param shader         
	 * @param pEntryPoint    
	 * @param pConstantIndex 
	 * @param pConstantValue 
	 */
	public static void glSpecializeShaderARB(int shader, ByteBuffer pEntryPoint, IntBuffer pConstantIndex, IntBuffer pConstantValue) {
		if ( CHECKS ) {
			checkNT1(pEntryPoint);
			checkBuffer(pConstantValue, pConstantIndex.remaining());
		}
		nglSpecializeShaderARB(shader, memAddress(pEntryPoint), pConstantIndex.remaining(), memAddress(pConstantIndex), memAddress(pConstantValue));
	}

	/**
	 * Specializes a shader created from a SPIR-V module.
	 *
	 * @param shader         
	 * @param pEntryPoint    
	 * @param pConstantIndex 
	 * @param pConstantValue 
	 */
	public static void glSpecializeShaderARB(int shader, CharSequence pEntryPoint, IntBuffer pConstantIndex, IntBuffer pConstantValue) {
		if ( CHECKS )
			checkBuffer(pConstantValue, pConstantIndex.remaining());
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer pEntryPointEncoded = stack.UTF8(pEntryPoint);
			nglSpecializeShaderARB(shader, memAddress(pEntryPointEncoded), pConstantIndex.remaining(), memAddress(pConstantIndex), memAddress(pConstantValue));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #glSpecializeShaderARB SpecializeShaderARB} */
	public static void glSpecializeShaderARB(int shader, ByteBuffer pEntryPoint, int[] pConstantIndex, int[] pConstantValue) {
		long __functionAddress = GL.getCapabilities().glSpecializeShaderARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkNT1(pEntryPoint);
			checkBuffer(pConstantValue, pConstantIndex.length);
		}
		callPPPV(__functionAddress, shader, memAddress(pEntryPoint), pConstantIndex.length, pConstantIndex, pConstantValue);
	}

	/** Array version of: {@link #glSpecializeShaderARB SpecializeShaderARB} */
	public static void glSpecializeShaderARB(int shader, CharSequence pEntryPoint, int[] pConstantIndex, int[] pConstantValue) {
		long __functionAddress = GL.getCapabilities().glSpecializeShaderARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(pConstantValue, pConstantIndex.length);
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer pEntryPointEncoded = stack.UTF8(pEntryPoint);
			callPPPV(__functionAddress, shader, memAddress(pEntryPointEncoded), pConstantIndex.length, pConstantIndex, pConstantValue);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

}