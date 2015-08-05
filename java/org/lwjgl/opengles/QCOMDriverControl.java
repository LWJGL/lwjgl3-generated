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
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/QCOM/QCOM_driver_control.txt">QCOM_driver_control</a> extension.
 * 
 * <p>This extension exposes special control features in a driver to a developer. A use of these controls would be to override state or implement special
 * modes of operation. One common example might be an IFH or infinitely fast hardware mode. In this mode none of draw commands would be sent to the GPU so
 * no image would be displayed, but all the driver software overhead would still happen thus enabling developers to analyze driver overhead separate from
 * GPU performance. Some uses of this extension could invalidate future rendering and thus should only be used by developers for debugging and performance
 * profiling purposes.</p>
 * 
 * <p>The extension is general enough to allow the implementation to choose which controls to expose and to provide a textual description of those controls
 * to developers.</p>
 */
public final class QCOMDriverControl {

	/** Function address. */
	@JavadocExclude
	public final long
		GetDriverControlsQCOM,
		GetDriverControlStringQCOM,
		EnableDriverControlQCOM,
		DisableDriverControlQCOM;

	@JavadocExclude
	public QCOMDriverControl(FunctionProvider provider) {
		GetDriverControlsQCOM = provider.getFunctionAddress("glGetDriverControlsQCOM");
		GetDriverControlStringQCOM = provider.getFunctionAddress("glGetDriverControlStringQCOM");
		EnableDriverControlQCOM = provider.getFunctionAddress("glEnableDriverControlQCOM");
		DisableDriverControlQCOM = provider.getFunctionAddress("glDisableDriverControlQCOM");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link QCOMDriverControl} instance for the current context. */
	public static QCOMDriverControl getInstance() {
		return checkFunctionality(GLES.getCapabilities().__QCOMDriverControl);
	}

	static QCOMDriverControl create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_QCOM_driver_control") ) return null;

		QCOMDriverControl funcs = new QCOMDriverControl(provider);
		boolean supported = checkFunctions(
			funcs.GetDriverControlsQCOM, funcs.GetDriverControlStringQCOM, funcs.EnableDriverControlQCOM, funcs.DisableDriverControlQCOM
		);

		return GLES.checkExtension("GL_QCOM_driver_control", funcs, supported);
	}

	// --- [ glGetDriverControlsQCOM ] ---

	/** JNI method for {@link #glGetDriverControlsQCOM GetDriverControlsQCOM} */
	@JavadocExclude
	public static native void nglGetDriverControlsQCOM(long num, int size, long driverControls, long __functionAddress);

	/** Unsafe version of {@link #glGetDriverControlsQCOM GetDriverControlsQCOM} */
	@JavadocExclude
	public static void nglGetDriverControlsQCOM(long num, int size, long driverControls) {
		long __functionAddress = getInstance().GetDriverControlsQCOM;
		nglGetDriverControlsQCOM(num, size, driverControls, __functionAddress);
	}

	public static void glGetDriverControlsQCOM(ByteBuffer num, int size, ByteBuffer driverControls) {
		if ( LWJGLUtil.CHECKS ) {
			if ( num != null ) checkBuffer(num, 1 << 2);
			if ( driverControls != null ) checkBuffer(driverControls, size << 2);
		}
		nglGetDriverControlsQCOM(memAddressSafe(num), size, memAddressSafe(driverControls));
	}

	/** Alternative version of: {@link #glGetDriverControlsQCOM GetDriverControlsQCOM} */
	public static void glGetDriverControlsQCOM(IntBuffer num, IntBuffer driverControls) {
		if ( LWJGLUtil.CHECKS )
			if ( num != null ) checkBuffer(num, 1);
		nglGetDriverControlsQCOM(memAddressSafe(num), driverControls == null ? 0 : driverControls.remaining(), memAddressSafe(driverControls));
	}

	// --- [ glGetDriverControlStringQCOM ] ---

	/** JNI method for {@link #glGetDriverControlStringQCOM GetDriverControlStringQCOM} */
	@JavadocExclude
	public static native void nglGetDriverControlStringQCOM(int driverControl, int bufSize, long length, long driverControlString, long __functionAddress);

	/** Unsafe version of {@link #glGetDriverControlStringQCOM GetDriverControlStringQCOM} */
	@JavadocExclude
	public static void nglGetDriverControlStringQCOM(int driverControl, int bufSize, long length, long driverControlString) {
		long __functionAddress = getInstance().GetDriverControlStringQCOM;
		nglGetDriverControlStringQCOM(driverControl, bufSize, length, driverControlString, __functionAddress);
	}

	public static void glGetDriverControlStringQCOM(int driverControl, int bufSize, ByteBuffer length, ByteBuffer driverControlString) {
		if ( LWJGLUtil.CHECKS ) {
			if ( driverControlString != null ) checkBuffer(driverControlString, bufSize);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetDriverControlStringQCOM(driverControl, bufSize, memAddressSafe(length), memAddressSafe(driverControlString));
	}

	/** Alternative version of: {@link #glGetDriverControlStringQCOM GetDriverControlStringQCOM} */
	public static void glGetDriverControlStringQCOM(int driverControl, IntBuffer length, ByteBuffer driverControlString) {
		if ( LWJGLUtil.CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetDriverControlStringQCOM(driverControl, driverControlString == null ? 0 : driverControlString.remaining(), memAddressSafe(length), memAddressSafe(driverControlString));
	}

	/** String return version of: {@link #glGetDriverControlStringQCOM GetDriverControlStringQCOM} */
	public static String glGetDriverControlStringQCOM(int driverControl, int bufSize) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int driverControlString = __buffer.bufferParam(bufSize);
		nglGetDriverControlStringQCOM(driverControl, bufSize, __buffer.address(length), __buffer.address(driverControlString));
		return memDecodeASCII(memByteBuffer(__buffer.address(driverControlString), __buffer.intValue(length)));
	}

	// --- [ glEnableDriverControlQCOM ] ---

	/** JNI method for {@link #glEnableDriverControlQCOM EnableDriverControlQCOM} */
	@JavadocExclude
	public static native void nglEnableDriverControlQCOM(int driverControl, long __functionAddress);

	public static void glEnableDriverControlQCOM(int driverControl) {
		long __functionAddress = getInstance().EnableDriverControlQCOM;
		nglEnableDriverControlQCOM(driverControl, __functionAddress);
	}

	// --- [ glDisableDriverControlQCOM ] ---

	/** JNI method for {@link #glDisableDriverControlQCOM DisableDriverControlQCOM} */
	@JavadocExclude
	public static native void nglDisableDriverControlQCOM(int driverControl, long __functionAddress);

	public static void glDisableDriverControlQCOM(int driverControl) {
		long __functionAddress = getInstance().DisableDriverControlQCOM;
		nglDisableDriverControlQCOM(driverControl, __functionAddress);
	}

}