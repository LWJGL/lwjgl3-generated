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

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/EXT_buffer_storage.txt">EXT_buffer_storage</a> extension.
 * 
 * <p>OpenGL ES has long supported buffer objects as a means of storing data that may be used to source vertex attributes, pixel data for textures, uniforms
 * and other elements. In un-extended ES, buffer data stores are mutable - that is, they may be de-allocated or resized while they are in use. The
 * GL_EXT_texture_storage extension added immutable storage for texture objects (and was subsequently incorporated into OpenGL ES 3.0). This extension
 * further applies the concept of immutable storage to buffer objects. If an implementation is aware of a buffer's immutability, it may be able to make
 * certain assumptions or apply particular optimizations in order to increase performance or reliability.</p>
 * 
 * <p>Furthermore, this extension allows applications to pass additional information about a requested allocation to the implementation which it may use to
 * select memory heaps, caching behavior or allocation strategies.</p>
 * 
 * <p>Finally, this extension introduces the concept of persistent client mappings of buffer objects, which allow clients to retain pointers to a buffer's
 * data store returned as the result of a mapping, and to issue drawing commands while those mappings are in place.</p>
 * 
 * <p>Requires {@link GLES31 GLES E.S}.</p>
 */
public final class EXTBufferStorage {

	/** Accepted in the {@code flags} parameter of BufferStorageEXT and NamedBufferStorageEXT. */
	public static final int
		GL_MAP_PERSISTENT_BIT_EXT  = 0x40,
		GL_MAP_COHERENT_BIT_EXT    = 0x80,
		GL_DYNAMIC_STORAGE_BIT_EXT = 0x100,
		GL_CLIENT_STORAGE_BIT_EXT  = 0x200;

	/** MAP_PERSISTENT_BIT_EXT 0x0040 (as above) MAP_COHERENT_BIT_EXT 0x0080 (as above) Accepted by the {@code pname} parameter of GetBufferParameter{i|i64}v. */
	public static final int
		GL_BUFFER_IMMUTABLE_STORAGE_EXT = 0x821F,
		GL_BUFFER_STORAGE_FLAGS_EXT     = 0x8220;

	/** Accepted by the {@code barriers} parameter of MemoryBarrier. */
	public static final int GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT_EXT = 0x4000;

	/** Function address. */
	@JavadocExclude
	public final long BufferStorageEXT;

	@JavadocExclude
	public EXTBufferStorage(FunctionProvider provider) {
		BufferStorageEXT = provider.getFunctionAddress("glBufferStorageEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTBufferStorage} instance for the current context. */
	public static EXTBufferStorage getInstance() {
		return checkFunctionality(GLES.getCapabilities().__EXTBufferStorage);
	}

	static EXTBufferStorage create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_buffer_storage") ) return null;

		EXTBufferStorage funcs = new EXTBufferStorage(provider);
		boolean supported = checkFunctions(
			funcs.BufferStorageEXT
		);

		return GLES.checkExtension("GL_EXT_buffer_storage", funcs, supported);
	}

	// --- [ glBufferStorageEXT ] ---

	/** Unsafe version of {@link #glBufferStorageEXT BufferStorageEXT} */
	@JavadocExclude
	public static void nglBufferStorageEXT(int target, long size, long data, int flags) {
		long __functionAddress = getInstance().BufferStorageEXT;
		callIPPIV(__functionAddress, target, size, data, flags);
	}

	public static void glBufferStorageEXT(int target, long size, ByteBuffer data, int flags) {
		if ( LWJGLUtil.CHECKS )
			if ( data != null ) checkBuffer(data, size);
		nglBufferStorageEXT(target, size, memAddressSafe(data), flags);
	}

	/** Alternative version of: {@link #glBufferStorageEXT BufferStorageEXT} */
	public static void glBufferStorageEXT(int target, long size, int flags) {
		nglBufferStorageEXT(target, size, 0L, flags);
	}

	/** ByteBuffer version of: {@link #glBufferStorageEXT BufferStorageEXT} */
	public static void glBufferStorageEXT(int target, ByteBuffer data, int flags) {
		nglBufferStorageEXT(target, data.remaining(), memAddress(data), flags);
	}

	/** ShortBuffer version of: {@link #glBufferStorageEXT BufferStorageEXT} */
	public static void glBufferStorageEXT(int target, ShortBuffer data, int flags) {
		nglBufferStorageEXT(target, data.remaining() << 1, memAddress(data), flags);
	}

	/** IntBuffer version of: {@link #glBufferStorageEXT BufferStorageEXT} */
	public static void glBufferStorageEXT(int target, IntBuffer data, int flags) {
		nglBufferStorageEXT(target, data.remaining() << 2, memAddress(data), flags);
	}

	/** FloatBuffer version of: {@link #glBufferStorageEXT BufferStorageEXT} */
	public static void glBufferStorageEXT(int target, FloatBuffer data, int flags) {
		nglBufferStorageEXT(target, data.remaining() << 2, memAddress(data), flags);
	}

}