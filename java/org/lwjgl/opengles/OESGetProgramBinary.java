/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_get_program_binary.txt">OES_get_program_binary</a> extension.
 * 
 * <p>This extension introduces two new commands. GetProgramBinaryOES empowers an application to use the GL itself as an offline compiler. The resulting
 * program binary can be reloaded into the GL via ProgramBinaryOES. This is a very useful path for applications that wish to remain portable by shipping
 * pure GLSL source shaders, yet would like to avoid the cost of compiling their shaders at runtime. Instead an application can supply its GLSL source
 * shaders during first application run, or even during installation. The application then compiles and links its shaders and reads back the program
 * binaries. On subsequent runs, only the program binaries need be supplied! Though the level of optimization may not be identical -- the offline shader
 * compiler may have the luxury of more aggressive optimization at its disposal -- program binaries generated online by the GL are interchangeable with
 * those generated offline by an SDK tool.</p>
 * 
 * <p>Note that an implementation supporting this extension need not include an online compiler. That is, it is not required to support loading GLSL shader
 * sources via the ShaderSource command. A query of boolean value SHADER_COMPILER can be used to determine if an implementation supports a shader
 * compiler. If not, the GetProgramBinaryOES command is rendered virtually useless, but the ProgramBinaryOES command may still be used by vendor
 * extensions as a standard method for loading offline-compiled program binaries.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public class OESGetProgramBinary {

	/** ccepted by the {@code pname} parameter of GetProgramiv. */
	public static final int GL_PROGRAM_BINARY_LENGTH_OES = 0x8741;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv. */
	public static final int
		GL_NUM_PROGRAM_BINARY_FORMATS_OES = 0x87FE,
		GL_PROGRAM_BINARY_FORMATS_OES     = 0x87FF;

	protected OESGetProgramBinary() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glGetProgramBinaryOES, caps.glProgramBinaryOES
		);
	}

	// --- [ glGetProgramBinaryOES ] ---

	public static void nglGetProgramBinaryOES(int program, int bufSize, long length, long binaryFormat, long binary) {
		long __functionAddress = GLES.getCapabilities().glGetProgramBinaryOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPPPV(__functionAddress, program, bufSize, length, binaryFormat, binary);
	}

	public static void glGetProgramBinaryOES(int program, IntBuffer length, IntBuffer binaryFormat, ByteBuffer binary) {
		if ( CHECKS ) {
			if ( length != null ) checkBuffer(length, 1);
			checkBuffer(binaryFormat, 1);
		}
		nglGetProgramBinaryOES(program, binary.remaining(), memAddressSafe(length), memAddress(binaryFormat), memAddress(binary));
	}

	// --- [ glProgramBinaryOES ] ---

	public static void nglProgramBinaryOES(int program, int binaryFormat, long binary, int length) {
		long __functionAddress = GLES.getCapabilities().glProgramBinaryOES;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, binaryFormat, binary, length);
	}

	public static void glProgramBinaryOES(int program, int binaryFormat, ByteBuffer binary) {
		nglProgramBinaryOES(program, binaryFormat, memAddress(binary), binary.remaining());
	}

	/** Array version of: {@link #glGetProgramBinaryOES GetProgramBinaryOES} */
	public static void glGetProgramBinaryOES(int program, int[] length, int[] binaryFormat, ByteBuffer binary) {
		long __functionAddress = GLES.getCapabilities().glGetProgramBinaryOES;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			if ( length != null ) checkBuffer(length, 1);
			checkBuffer(binaryFormat, 1);
		}
		callPPPV(__functionAddress, program, binary.remaining(), length, binaryFormat, memAddress(binary));
	}

}