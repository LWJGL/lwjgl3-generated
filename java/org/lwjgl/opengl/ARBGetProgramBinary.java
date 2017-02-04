/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/get_program_binary.txt">ARB_get_program_binary</a> extension.
 * 
 * <p>This extension introduces new commands to retrieve and set the binary representation of a program object. {@link #glGetProgramBinary GetProgramBinary} allows an application to
 * cache compiled and linked programs to avoid compiling and linking when used again. This may even allow the GL itself to act as an offline compiler. The
 * resulting program binary can be reloaded into the GL via {@link #glProgramBinary ProgramBinary}. This is a very useful path for applications that wish to remain portable by
 * shipping pure GLSL source shaders, yet would like to avoid the cost of compiling their shaders at runtime. Instead an application can supply its GLSL
 * source shaders during first application run, or even during installation. The application then compiles and links its shaders and reads back the program
 * binaries. On subsequent runs, only the program binaries need be supplied.</p>
 * 
 * <p>{@link #glProgramBinary ProgramBinary} may also accept binaries in vendor-specific formats produced by specialized offline compilation tools. This extension does not add any
 * such formats, but allows for them in further extensions. Though the level of optimization may not be identical -- the offline shader compiler may have
 * the luxury of more aggressive optimization at its disposal -- program binaries generated online by the GL are interchangeable with those generated
 * offline by an SDK tool.</p>
 * 
 * <p>Requires {@link GL30 OpenGL 3.0}. Promoted to core in {@link GL41 OpenGL 4.1}.</p>
 */
public class ARBGetProgramBinary {

	/** Accepted by the {@code pname} parameter of ProgramParameteri and GetProgramiv. */
	public static final int GL_PROGRAM_BINARY_RETRIEVABLE_HINT = 0x8257;

	/** Accepted by the {@code pname} parameter of GetProgramiv. */
	public static final int GL_PROGRAM_BINARY_LENGTH = 0x8741;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv and GetDoublev. */
	public static final int
		GL_NUM_PROGRAM_BINARY_FORMATS = 0x87FE,
		GL_PROGRAM_BINARY_FORMATS     = 0x87FF;

	static { GL.initialize(); }

	protected ARBGetProgramBinary() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glGetProgramBinary, caps.glProgramBinary, caps.glProgramParameteri
		);
	}

	// --- [ glGetProgramBinary ] ---

	/**
	 * Unsafe version of: {@link #glGetProgramBinary GetProgramBinary}
	 *
	 * @param bufSize the size of the buffer whose address is given by {@code binary}
	 */
	public static native void nglGetProgramBinary(int program, int bufSize, long length, long binaryFormat, long binary);

	/**
	 * Returns a binary representation of a program object's compiled and linked executable source.
	 *
	 * @param program      the name of a program object whose binary representation to retrieve
	 * @param length       the address of a variable to receive the number of bytes written into {@code binary}
	 * @param binaryFormat a variable to receive a token indicating the format of the binary data returned by the GL
	 * @param binary       an array into which the GL will return {@code program}'s binary representation
	 */
	public static void glGetProgramBinary(int program, IntBuffer length, IntBuffer binaryFormat, ByteBuffer binary) {
		if ( CHECKS ) {
			checkSafe(length, 1);
			check(binaryFormat, 1);
		}
		nglGetProgramBinary(program, binary.remaining(), memAddressSafe(length), memAddress(binaryFormat), memAddress(binary));
	}

	// --- [ glProgramBinary ] ---

	/**
	 * Unsafe version of: {@link #glProgramBinary ProgramBinary}
	 *
	 * @param length the number of bytes contained in {@code binary}
	 */
	public static native void nglProgramBinary(int program, int binaryFormat, long binary, int length);

	/**
	 * Loads a program object with a program binary.
	 *
	 * @param program      the name of a program object into which to load a program binary
	 * @param binaryFormat the format of the binary data in binary
	 * @param binary       an array containing the binary to be loaded into {@code program}
	 */
	public static void glProgramBinary(int program, int binaryFormat, ByteBuffer binary) {
		nglProgramBinary(program, binaryFormat, memAddress(binary), binary.remaining());
	}

	// --- [ glProgramParameteri ] ---

	/**
	 * Specifies the integer value of a program object parameter.
	 *
	 * @param program the name of a program object whose parameter to modify
	 * @param pname   the name of the parameter to modify. One of:<br><table><tr><td>{@link GL41#GL_PROGRAM_BINARY_RETRIEVABLE_HINT PROGRAM_BINARY_RETRIEVABLE_HINT}</td><td>{@link GL41#GL_PROGRAM_SEPARABLE PROGRAM_SEPARABLE}</td></tr></table>
	 * @param value   the new value of the parameter specified by {@code pname} for {@code program}
	 */
	public static native void glProgramParameteri(int program, int pname, int value);

	/** Array version of: {@link #glGetProgramBinary GetProgramBinary} */
	public static void glGetProgramBinary(int program, int[] length, int[] binaryFormat, ByteBuffer binary) {
		long __functionAddress = GL.getICD().glGetProgramBinary;
		if ( CHECKS ) {
			check(__functionAddress);
			checkSafe(length, 1);
			check(binaryFormat, 1);
		}
		callPPPV(__functionAddress, program, binary.remaining(), length, binaryFormat, memAddress(binary));
	}

}