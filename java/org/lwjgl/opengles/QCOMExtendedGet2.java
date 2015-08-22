/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/QCOM/QCOM_extended_get2.txt">QCOM_extended_get2</a> extension.
 * 
 * <p>This extension enables instrumenting the driver for debugging of OpenGL ES applications.</p>
 */
public final class QCOMExtendedGet2 {

	/** Function address. */
	@JavadocExclude
	public final long
		ExtGetShadersQCOM,
		ExtGetProgramsQCOM,
		ExtIsProgramBinaryQCOM,
		ExtGetProgramBinarySourceQCOM;

	@JavadocExclude
	public QCOMExtendedGet2(FunctionProvider provider) {
		ExtGetShadersQCOM = provider.getFunctionAddress("glExtGetShadersQCOM");
		ExtGetProgramsQCOM = provider.getFunctionAddress("glExtGetProgramsQCOM");
		ExtIsProgramBinaryQCOM = provider.getFunctionAddress("glExtIsProgramBinaryQCOM");
		ExtGetProgramBinarySourceQCOM = provider.getFunctionAddress("glExtGetProgramBinarySourceQCOM");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link QCOMExtendedGet2} instance for the current context. */
	public static QCOMExtendedGet2 getInstance() {
		return checkFunctionality(GLES.getCapabilities().__QCOMExtendedGet2);
	}

	static QCOMExtendedGet2 create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_QCOM_extended_get2") ) return null;

		QCOMExtendedGet2 funcs = new QCOMExtendedGet2(provider);
		boolean supported = checkFunctions(
			funcs.ExtGetShadersQCOM, funcs.ExtGetProgramsQCOM, funcs.ExtIsProgramBinaryQCOM, funcs.ExtGetProgramBinarySourceQCOM
		);

		return GLES.checkExtension("GL_QCOM_extended_get2", funcs, supported);
	}

	// --- [ glExtGetShadersQCOM ] ---

	/** Unsafe version of {@link #glExtGetShadersQCOM ExtGetShadersQCOM} */
	@JavadocExclude
	public static void nglExtGetShadersQCOM(long shaders, int maxShaders, long numShaders) {
		long __functionAddress = getInstance().ExtGetShadersQCOM;
		callPIPV(__functionAddress, shaders, maxShaders, numShaders);
	}

	public static void glExtGetShadersQCOM(ByteBuffer shaders, int maxShaders, ByteBuffer numShaders) {
		if ( LWJGLUtil.CHECKS ) {
			if ( shaders != null ) checkBuffer(shaders, maxShaders << 2);
			if ( numShaders != null ) checkBuffer(numShaders, 1 << 2);
		}
		nglExtGetShadersQCOM(memAddressSafe(shaders), maxShaders, memAddressSafe(numShaders));
	}

	/** Alternative version of: {@link #glExtGetShadersQCOM ExtGetShadersQCOM} */
	public static void glExtGetShadersQCOM(IntBuffer shaders, IntBuffer numShaders) {
		if ( LWJGLUtil.CHECKS )
			if ( numShaders != null ) checkBuffer(numShaders, 1);
		nglExtGetShadersQCOM(memAddressSafe(shaders), shaders == null ? 0 : shaders.remaining(), memAddressSafe(numShaders));
	}

	// --- [ glExtGetProgramsQCOM ] ---

	/** Unsafe version of {@link #glExtGetProgramsQCOM ExtGetProgramsQCOM} */
	@JavadocExclude
	public static void nglExtGetProgramsQCOM(long programs, int maxPrograms, long numPrograms) {
		long __functionAddress = getInstance().ExtGetProgramsQCOM;
		callPIPV(__functionAddress, programs, maxPrograms, numPrograms);
	}

	public static void glExtGetProgramsQCOM(ByteBuffer programs, int maxPrograms, ByteBuffer numPrograms) {
		if ( LWJGLUtil.CHECKS ) {
			if ( programs != null ) checkBuffer(programs, maxPrograms << 2);
			if ( numPrograms != null ) checkBuffer(numPrograms, 1 << 2);
		}
		nglExtGetProgramsQCOM(memAddressSafe(programs), maxPrograms, memAddressSafe(numPrograms));
	}

	/** Alternative version of: {@link #glExtGetProgramsQCOM ExtGetProgramsQCOM} */
	public static void glExtGetProgramsQCOM(IntBuffer programs, IntBuffer numPrograms) {
		if ( LWJGLUtil.CHECKS )
			if ( numPrograms != null ) checkBuffer(numPrograms, 1);
		nglExtGetProgramsQCOM(memAddressSafe(programs), programs == null ? 0 : programs.remaining(), memAddressSafe(numPrograms));
	}

	// --- [ glExtIsProgramBinaryQCOM ] ---

	public static boolean glExtIsProgramBinaryQCOM(int program) {
		long __functionAddress = getInstance().ExtIsProgramBinaryQCOM;
		return callIZ(__functionAddress, program);
	}

	// --- [ glExtGetProgramBinarySourceQCOM ] ---

	/** Unsafe version of {@link #glExtGetProgramBinarySourceQCOM ExtGetProgramBinarySourceQCOM} */
	@JavadocExclude
	public static void nglExtGetProgramBinarySourceQCOM(int program, int shadertype, long source, long length) {
		long __functionAddress = getInstance().ExtGetProgramBinarySourceQCOM;
		callIIPPV(__functionAddress, program, shadertype, source, length);
	}

	public static void glExtGetProgramBinarySourceQCOM(int program, int shadertype, ByteBuffer source, ByteBuffer length) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1 << 2);
		nglExtGetProgramBinarySourceQCOM(program, shadertype, memAddressSafe(source), memAddressSafe(length));
	}

	/** Alternative version of: {@link #glExtGetProgramBinarySourceQCOM ExtGetProgramBinarySourceQCOM} */
	public static void glExtGetProgramBinarySourceQCOM(int program, int shadertype, ByteBuffer source, IntBuffer length) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglExtGetProgramBinarySourceQCOM(program, shadertype, memAddressSafe(source), memAddressSafe(length));
	}

}