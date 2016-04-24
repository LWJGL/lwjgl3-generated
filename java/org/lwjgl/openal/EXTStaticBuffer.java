/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the {@code AL_EXT_static_buffer} extension.
 * 
 * <p>This extension provides a means for the caller to avoid the overhead associated with the {@link AL10#alBufferData BufferData} call which performs a physical copy of the
 * data provided by the caller to internal buffers. When using the {@code AL_EXT_static_buffer} extension, OpenAL's internal buffers use the data pointer provided by
 * the caller for all data access.</p>
 */
public class EXTStaticBuffer {

	protected EXTStaticBuffer() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(ALCapabilities caps) {
		return checkFunctions(
			caps.alBufferDataStatic
		);
	}

	// --- [ alBufferDataStatic ] ---

	/**
	 * Sets the sample data of the specified buffer.
	 *
	 * @param buffer the buffer handle
	 * @param format the data format
	 * @param data   the sample data
	 * @param len    the data buffer size, in bytes
	 * @param freq   the data frequency
	 */
	public static void nalBufferDataStatic(int buffer, int format, long data, int len, int freq) {
		long __functionAddress = AL.getCapabilities().alBufferDataStatic;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokePV(__functionAddress, buffer, format, data, len, freq);
	}

	/**
	 * Sets the sample data of the specified buffer.
	 *
	 * @param buffer the buffer handle
	 * @param format the data format
	 * @param data   the sample data
	 * @param freq   the data frequency
	 */
	public static void alBufferDataStatic(int buffer, int format, ByteBuffer data, int freq) {
		nalBufferDataStatic(buffer, format, memAddress(data), data.remaining(), freq);
	}

	/** ShortBuffer version of: {@link #alBufferDataStatic BufferDataStatic} */
	public static void alBufferDataStatic(int buffer, int format, ShortBuffer data, int freq) {
		nalBufferDataStatic(buffer, format, memAddress(data), data.remaining() << 1, freq);
	}

	/** IntBuffer version of: {@link #alBufferDataStatic BufferDataStatic} */
	public static void alBufferDataStatic(int buffer, int format, IntBuffer data, int freq) {
		nalBufferDataStatic(buffer, format, memAddress(data), data.remaining() << 2, freq);
	}

	/** FloatBuffer version of: {@link #alBufferDataStatic BufferDataStatic} */
	public static void alBufferDataStatic(int buffer, int format, FloatBuffer data, int freq) {
		nalBufferDataStatic(buffer, format, memAddress(data), data.remaining() << 2, freq);
	}

	/** short[] version of: {@link #alBufferDataStatic BufferDataStatic} */
	public static void alBufferDataStatic(int buffer, int format, short[] data, int freq) {
		long __functionAddress = AL.getCapabilities().alBufferDataStatic;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokePV(__functionAddress, buffer, format, data, data.length << 1, freq);
	}

	/** int[] version of: {@link #alBufferDataStatic BufferDataStatic} */
	public static void alBufferDataStatic(int buffer, int format, int[] data, int freq) {
		long __functionAddress = AL.getCapabilities().alBufferDataStatic;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokePV(__functionAddress, buffer, format, data, data.length << 2, freq);
	}

	/** float[] version of: {@link #alBufferDataStatic BufferDataStatic} */
	public static void alBufferDataStatic(int buffer, int format, float[] data, int freq) {
		long __functionAddress = AL.getCapabilities().alBufferDataStatic;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokePV(__functionAddress, buffer, format, data, data.length << 2, freq);
	}

}