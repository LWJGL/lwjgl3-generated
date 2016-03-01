/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import java.nio.*;

import org.lwjgl.system.*;

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

	/** Function address. */
	public final long BufferDataStatic;

	protected EXTStaticBuffer() {
		throw new UnsupportedOperationException();
	}

	public EXTStaticBuffer(FunctionProvider provider) {
		BufferDataStatic = provider.getFunctionAddress("alBufferDataStatic");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTStaticBuffer} instance of the current context. */
	public static EXTStaticBuffer getInstance() {
		return checkFunctionality(AL.getCapabilities().__EXTStaticBuffer);
	}

	static EXTStaticBuffer create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("AL_EXT_static_buffer") ) return null;

		EXTStaticBuffer funcs = new EXTStaticBuffer(provider);

		boolean supported = checkFunctions(
			funcs.BufferDataStatic
		);

		return AL.checkExtension("AL_EXT_static_buffer", funcs, supported);
	}

	// --- [ alBufferDataStatic ] ---

	/** Unsafe version of {@link #alBufferDataStatic BufferDataStatic} */
	public static void nalBufferDataStatic(int buffer, int format, long data, int len, int freq) {
		long __functionAddress = getInstance().BufferDataStatic;
		invokeIIPIIV(__functionAddress, buffer, format, data, len, freq);
	}

	/**
	 * Sets the sample data of the specified buffer.
	 *
	 * @param buffer the buffer handle
	 * @param format the data format
	 * @param data   the sample data
	 * @param len    the data buffer size, in bytes
	 * @param freq   the data frequency
	 */
	public static void alBufferDataStatic(int buffer, int format, ByteBuffer data, int len, int freq) {
		if ( CHECKS )
			checkBuffer(data, len);
		nalBufferDataStatic(buffer, format, memAddress(data), len, freq);
	}

	/** Alternative version of: {@link #alBufferDataStatic BufferDataStatic} */
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

}