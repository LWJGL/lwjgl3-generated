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
 * Native bindings to the <a href="http://kcat.strangesoft.net/openal-extensions/SOFT_buffer_sub_data.txt">SOFT_buffer_sub_data</a> extension.
 * 
 * <p>This extension allows an application to modify a section of buffered sample data while the buffer is in use.</p>
 */
public class SOFTBufferSubData {

	/** Accepted by the {@code paramName} parameter of {@link AL10#alGetSourceiv GetSourceiv} and {@link AL10#alGetSourcefv GetSourcefv}. */
	public static final int
		AL_BYTE_RW_OFFSETS_SOFT   = 0x1031,
		AL_SAMPLE_RW_OFFSETS_SOFT = 0x1032;

	protected SOFTBufferSubData() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(ALCapabilities caps) {
		return checkFunctions(
			caps.alBufferSubDataSOFT
		);
	}

	// --- [ alBufferSubDataSOFT ] ---

	/**
	 * To update a section of buffered sample data, use the function alBufferSubDataSOFT.The named {@code buffer} may be attached to a source (either queued
	 * or by the {@link AL10#AL_BUFFER BUFFER} property), and the source does not need to be stopped, paused, or in an initial state to be modified.
	 * 
	 * <p>The {@code offset} value is the number of bytes from the start of the original data, and {@code length} is the number of bytes of the original data, to
	 * modify. If either {@code offset} or {@code length} are negative, or if the sum of {@code offset} and {@code length} reaches beyond the end of the
	 * buffer, an {@link AL10#AL_INVALID_VALUE INVALID_VALUE} error is generated. For compressed formats, {@code length} and {@code offset} must be block aligned. Complex compressed
	 * formats (such as those with no constant block alignment), may not be modified and will result in an {@link AL10#AL_INVALID_ENUM INVALID_ENUM} error.</p>
	 * 
	 * <p>The specified {@code format} is the sample format of the passed {@code data}. The passed format must exactly match the format passed to
	 * {@link AL10#alBufferData BufferData}, or an {@link AL10#AL_INVALID_ENUM INVALID_ENUM} error is generated.</p>
	 * 
	 * <p>When modifying a playing source's buffer, an application must take care to not modify the section that is currently being played. The read-only source
	 * attributes:</p>
	 * 
	 * <ul>
	 * <li>{@link #AL_BYTE_RW_OFFSETS_SOFT BYTE_RW_OFFSETS_SOFT}</li>
	 * <li>{@link #AL_SAMPLE_RW_OFFSETS_SOFT SAMPLE_RW_OFFSETS_SOFT}</li>
	 * </ul>
	 * 
	 * <p>may be used to retrieve the read and write cursor offsets. Behavior is undefined if an attempt is made to modify buffer data between the read and write
	 * offsets.</p>
	 *
	 * @param buffer ID of the buffer to modify
	 * @param format sample format of the passed data
	 * @param data   existing buffer data to write to
	 * @param offset number of bytes from the start of the original data
	 * @param length number of bytes of the original data, to modify
	 */
	public static void nalBufferSubDataSOFT(int buffer, int format, long data, int offset, int length) {
		long __functionAddress = AL.getCapabilities().alBufferSubDataSOFT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		invokeIIPIIV(__functionAddress, buffer, format, data, offset, length);
	}

	/**
	 * To update a section of buffered sample data, use the function alBufferSubDataSOFT.The named {@code buffer} may be attached to a source (either queued
	 * or by the {@link AL10#AL_BUFFER BUFFER} property), and the source does not need to be stopped, paused, or in an initial state to be modified.
	 * 
	 * <p>The {@code offset} value is the number of bytes from the start of the original data, and {@code length} is the number of bytes of the original data, to
	 * modify. If either {@code offset} or {@code length} are negative, or if the sum of {@code offset} and {@code length} reaches beyond the end of the
	 * buffer, an {@link AL10#AL_INVALID_VALUE INVALID_VALUE} error is generated. For compressed formats, {@code length} and {@code offset} must be block aligned. Complex compressed
	 * formats (such as those with no constant block alignment), may not be modified and will result in an {@link AL10#AL_INVALID_ENUM INVALID_ENUM} error.</p>
	 * 
	 * <p>The specified {@code format} is the sample format of the passed {@code data}. The passed format must exactly match the format passed to
	 * {@link AL10#alBufferData BufferData}, or an {@link AL10#AL_INVALID_ENUM INVALID_ENUM} error is generated.</p>
	 * 
	 * <p>When modifying a playing source's buffer, an application must take care to not modify the section that is currently being played. The read-only source
	 * attributes:</p>
	 * 
	 * <ul>
	 * <li>{@link #AL_BYTE_RW_OFFSETS_SOFT BYTE_RW_OFFSETS_SOFT}</li>
	 * <li>{@link #AL_SAMPLE_RW_OFFSETS_SOFT SAMPLE_RW_OFFSETS_SOFT}</li>
	 * </ul>
	 * 
	 * <p>may be used to retrieve the read and write cursor offsets. Behavior is undefined if an attempt is made to modify buffer data between the read and write
	 * offsets.</p>
	 *
	 * @param buffer ID of the buffer to modify
	 * @param format sample format of the passed data
	 * @param data   existing buffer data to write to
	 * @param offset number of bytes from the start of the original data
	 */
	public static void alBufferSubDataSOFT(int buffer, int format, ByteBuffer data, int offset) {
		nalBufferSubDataSOFT(buffer, format, memAddress(data), offset, data.remaining());
	}

	/** ShortBuffer version of: {@link #alBufferSubDataSOFT BufferSubDataSOFT} */
	public static void alBufferSubDataSOFT(int buffer, int format, ShortBuffer data, int offset) {
		nalBufferSubDataSOFT(buffer, format, memAddress(data), offset, data.remaining() << 1);
	}

	/** IntBuffer version of: {@link #alBufferSubDataSOFT BufferSubDataSOFT} */
	public static void alBufferSubDataSOFT(int buffer, int format, IntBuffer data, int offset) {
		nalBufferSubDataSOFT(buffer, format, memAddress(data), offset, data.remaining() << 2);
	}

	/** FloatBuffer version of: {@link #alBufferSubDataSOFT BufferSubDataSOFT} */
	public static void alBufferSubDataSOFT(int buffer, int format, FloatBuffer data, int offset) {
		nalBufferSubDataSOFT(buffer, format, memAddress(data), offset, data.remaining() << 2);
	}

}