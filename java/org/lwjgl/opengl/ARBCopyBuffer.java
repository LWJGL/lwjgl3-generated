/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/copy_buffer.txt">ARB_copy_buffer</a> extension.
 * 
 * <p>This extension provides a mechanism to do an accelerated copy from one buffer object to another. This may be useful to load buffer objects in a "loading
 * thread" while minimizing cost and synchronization effort in the "rendering thread."</p>
 * 
 * <p>Promoted to core in {@link GL31 OpenGL 3.1}.</p>
 */
public class ARBCopyBuffer {

	/**
	 * Accepted by the target parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv, MapBufferRange,
	 * FlushMappedBufferRange, GetBufferParameteriv, BindBufferRange, BindBufferBase, and CopyBufferSubData.
	 */
	public static final int
		GL_COPY_READ_BUFFER  = 0x8F36,
		GL_COPY_WRITE_BUFFER = 0x8F37;

	/** Function address. */
	public final long CopyBufferSubData;

	protected ARBCopyBuffer() {
		throw new UnsupportedOperationException();
	}

	public ARBCopyBuffer(FunctionProvider provider) {
		CopyBufferSubData = provider.getFunctionAddress("glCopyBufferSubData");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBCopyBuffer} instance of the current context. */
	public static ARBCopyBuffer getInstance() {
		return getInstance(GL.getCapabilities());
	}

	/** Returns the {@link ARBCopyBuffer} instance of the specified {@link GLCapabilities}. */
	public static ARBCopyBuffer getInstance(GLCapabilities caps) {
		return checkFunctionality(caps.__ARBCopyBuffer);
	}

	static ARBCopyBuffer create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_copy_buffer") ) return null;

		ARBCopyBuffer funcs = new ARBCopyBuffer(provider);

		boolean supported = checkFunctions(
			funcs.CopyBufferSubData
		);

		return GL.checkExtension("GL_ARB_copy_buffer", funcs, supported);
	}

	// --- [ glCopyBufferSubData ] ---

	/**
	 * Copies all or part of one buffer object's data store to the data store of another buffer object.
	 * 
	 * <p>An {@link GL11#GL_INVALID_VALUE INVALID_VALUE} error is generated if any of readoffset, writeoffset, or size are negative, if readoffset+size exceeds the size of the buffer object
	 * bound to readtarget, or if writeoffset+size exceeds the size of the buffer object bound to writetarget.</p>
	 * 
	 * <p>An {@link GL11#GL_INVALID_VALUE INVALID_VALUE} error is generated if the same buffer object is bound to both readtarget and writetarget, and the ranges [readoffset, readoffset+size)
	 * and [writeoffset, writeoffset+size) overlap.</p>
	 * 
	 * <p>An {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} error is generated if zero is bound to readtarget or writetarget.</p>
	 * 
	 * <p>An {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} error is generated if the buffer objects bound to either readtarget or writetarget are mapped.</p>
	 *
	 * @param readTarget  the source buffer object target. One of:<br>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link #GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link #GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}
	 * @param writeTarget the destination buffer object target
	 * @param readOffset  the source buffer object offset, in bytes
	 * @param writeOffset the destination buffer object offset, in bytes
	 * @param size        the number of bytes to copy
	 */
	public static void glCopyBufferSubData(int readTarget, int writeTarget, long readOffset, long writeOffset, long size) {
		long __functionAddress = getInstance().CopyBufferSubData;
		callIIPPPV(__functionAddress, readTarget, writeTarget, readOffset, writeOffset, size);
	}

}