/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/buffer_storage.txt">ARB_buffer_storage</a> extension.
 * 
 * <p>OpenGL has long supported buffer objects as a means of storing data that may be used to source vertex attributes, pixel data for textures, uniforms and
 * other elements. In un-extended GL, buffer data stores are mutable - that is, they may be de-allocated or resized while they are in use. The
 * <a href="http://www.opengl.org/registry/specs/ARB/texture_storage.txt">ARB_texture_storage</a> extension added immutable storage for texture object (and was subsequently incorporated into OpenGL 4.2).
 * This extension further applies the concept of immutable storage to buffer objects. If an implementation is aware of a buffer's immutability, it may be
 * able to make certain assumptions or apply particular optimizations in order to increase performance or reliability.</p>
 * 
 * <p>Furthermore, this extension allows applications to pass additional information about a requested allocation to the implementation which it may use to
 * select memory heaps, caching behavior or allocation strategies.</p>
 * 
 * <p>Finally, this extension introduces the concept of persistent client mappings of buffer objects, which allow clients to retain pointers to a buffer's
 * data store returned as the result of a mapping, and to issue drawing commands while those mappings are in place.</p>
 * 
 * <p>Promoted to core in {@link GL44 OpenGL 4.4}.</p>
 */
public class ARBBufferStorage {

	/** Accepted in the {@code flags} parameter of {@link #glBufferStorage BufferStorage} and {@link #glNamedBufferStorageEXT NamedBufferStorageEXT}. */
	public static final int
		GL_MAP_PERSISTENT_BIT  = 0x40,
		GL_MAP_COHERENT_BIT    = 0x80,
		GL_DYNAMIC_STORAGE_BIT = 0x100,
		GL_CLIENT_STORAGE_BIT  = 0x200;

	/** Accepted by the {@code pname} parameter of {@code GetBufferParameter&#123;i|i64&#125;v}. */
	public static final int
		GL_BUFFER_IMMUTABLE_STORAGE = 0x821F,
		GL_BUFFER_STORAGE_FLAGS     = 0x8220;

	/** Accepted by the {@code barriers} parameter of {@link GL42#glMemoryBarrier MemoryBarrier}. */
	public static final int GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT = 0x4000;

	/** Function address. */
	@JavadocExclude
	public final long
		BufferStorage,
		NamedBufferStorageEXT;

	@JavadocExclude
	protected ARBBufferStorage() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public ARBBufferStorage(FunctionProvider provider) {
		BufferStorage = provider.getFunctionAddress("glBufferStorage");
		NamedBufferStorageEXT = provider.getFunctionAddress("glNamedBufferStorageEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBBufferStorage} instance of the current context. */
	public static ARBBufferStorage getInstance() {
		return getInstance(GL.getCapabilities());
	}

	/** Returns the {@link ARBBufferStorage} instance of the specified {@link GLCapabilities}. */
	public static ARBBufferStorage getInstance(GLCapabilities caps) {
		return checkFunctionality(caps.__ARBBufferStorage);
	}

	static ARBBufferStorage create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_buffer_storage") ) return null;

		ARBBufferStorage funcs = new ARBBufferStorage(provider);

		boolean supported = checkFunctions(
			funcs.BufferStorage, ext.contains("GL_EXT_direct_state_access") ? funcs.NamedBufferStorageEXT : -1L
		);

		return GL.checkExtension("GL_ARB_buffer_storage", funcs, supported);
	}

	// --- [ glBufferStorage ] ---

	/** Unsafe version of {@link #glBufferStorage BufferStorage} */
	@JavadocExclude
	public static void nglBufferStorage(int target, long size, long data, int flags) {
		long __functionAddress = getInstance().BufferStorage;
		callIPPIV(__functionAddress, target, size, data, flags);
	}

	/**
	 * Creates the data store of a buffer object.
	 * 
	 * <p>The data store of the buffer object bound to {@code target} is allocated as a result of a call to this function and cannot be de-allocated until the
	 * buffer is deleted with a call to {@link GL15#glDeleteBuffers DeleteBuffers}. Such a store may not be re-allocated through further calls to {@code BufferStorage}
	 * or {@link GL15#glBufferData BufferData}.</p>
	 * 
	 * <p>{@code BufferStorage} deletes any existing data store. If any portion of the buffer object is mapped in the current context or any context current to
	 * another thread, it is as though {@link GL15#glUnmapBuffer UnmapBuffer} is executed in each such context prior to deleting the existing data store.</p>
	 *
	 * @param target the buffer object target. One of:<br>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}, {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}, {@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}, {@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}, {@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}, {@link GL31#GL_UNIFORM_BUFFER UNIFORM_BUFFER}, {@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}, {@link GL31#GL_COPY_READ_BUFFER COPY_READ_BUFFER}, {@link GL31#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}, {@link GL40#GL_DRAW_INDIRECT_BUFFER DRAW_INDIRECT_BUFFER}, {@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}, {@link GL43#GL_DISPATCH_INDIRECT_BUFFER DISPATCH_INDIRECT_BUFFER}, {@link GL43#GL_SHADER_STORAGE_BUFFER SHADER_STORAGE_BUFFER}, {@link ARBIndirectParameters#GL_PARAMETER_BUFFER_ARB PARAMETER_BUFFER_ARB}
	 * @param size   the size of the data store in basic machine units
	 * @param data   the address in client memory of the data that should be used to initialize the buffer's data store. If {@code data} is {@code NULL}, the data store of the
	 *               buffer is created, but contains undefined data. Otherwise, {@code data} should point to an array of at least {@code size} basic machine units.
	 * @param flags  the bitwise {@code OR} of flags describing the intended usage of the buffer object's data store by the application. Valid flags and their meanings
	 *               are as follows:
	 *               <ul>
	 *               <li>{@link #GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT} &ndash; The contents of the data store may be updated after creation through calls to
	 *               {@link GL15#glBufferSubData BufferSubData}. If this bit is not set, the buffer content may not be directly updated by the client. The {@code data}
	 *               argument may be used to specify the initial content of the buffer's data store regardless of the presence of the {@link #GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT}.
	 *               Regardless of the presence of this bit, buffers may always be updated with server-side calls such as {@link GL31#glCopyBufferSubData CopyBufferSubData} and
	 *               {@link GL43#glClearBufferSubData ClearBufferSubData}.</li>
	 *               <li>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} &ndash; The buffer's data store may be mapped by the client for read access and a pointer in the client's address space
	 *               obtained that may be read from.</li>
	 *               <li>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT} &ndash; The buffer's data store may be mapped by the client for write access and a pointer in the client's address
	 *               space obtained that may be written to.</li>
	 *               <li>{@link #GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT} &ndash; The client may request that the server read from or write to the buffer while it is mapped. The client's
	 *               pointer to the data store remains valid so long as the data store is mapped, even during execution of drawing or dispatch commands.</li>
	 *               <li>{@link #GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} &ndash; Shared access to buffers that are simultaneously mapped for client access and are used by the server will be
	 *               coherent, so long as that mapping is performed using MapBufferRange. That is, data written to the store by either the client or server will be
	 *               immediately visible to the other with no further action taken by the application. In particular:
	 *               <ul>
	 *               <li>If {@code MAP_COHERENT_BIT} is not set and the client performs a write followed by a call to the {@link GL42#glMemoryBarrier MemoryBarrier} command with
	 *               the {@link #GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set, then in subsequent commands the server will see the writes.</li>
	 *               <li>If {@code MAP_COHERENT_BIT} is set and the client performs a write, then in subsequent commands the server will see the writes.</li>
	 *               <li>If {@code MAP_COHERENT_BIT} is not set and the server performs a write, the application must call {@link GL42#glMemoryBarrier MemoryBarrier} with the
	 *               {@link #GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set and then call {@link GL32#glFenceSync FenceSync} with {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or
	 *               {@link GL11#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
	 *               <li>If {@code MAP_COHERENT_BIT} is set and the server does a write, the app must call {@link GL32#glFenceSync FenceSync} with
	 *               {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or {@link GL11#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
	 *               </ul></li>
	 *               <li>{@link #GL_CLIENT_STORAGE_BIT CLIENT_STORAGE_BIT} &ndash; When all other criteria for the buffer storage allocation are met, this bit may be used by an
	 *               implementation to determine whether to use storage that is local to the server or to the client to serve as the backing store for the buffer.</li>
	 *               </ul>
	 *               If {@code flags} contains {@link #GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}, it must also contain at least one of {@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} or {@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}.
	 *               
	 *               <p>It is an error to specify {@link #GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} without also specifying {@link #GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}.</p>
	 */
	public static void glBufferStorage(int target, long size, ByteBuffer data, int flags) {
		if ( LWJGLUtil.CHECKS )
			if ( data != null ) checkBuffer(data, size);
		nglBufferStorage(target, size, memAddressSafe(data), flags);
	}

	/** Alternative version of: {@link #glBufferStorage BufferStorage} */
	public static void glBufferStorage(int target, long size, int flags) {
		nglBufferStorage(target, size, 0L, flags);
	}

	/** ByteBuffer version of: {@link #glBufferStorage BufferStorage} */
	public static void glBufferStorage(int target, ByteBuffer data, int flags) {
		nglBufferStorage(target, data.remaining(), memAddress(data), flags);
	}

	/** ShortBuffer version of: {@link #glBufferStorage BufferStorage} */
	public static void glBufferStorage(int target, ShortBuffer data, int flags) {
		nglBufferStorage(target, data.remaining() << 1, memAddress(data), flags);
	}

	/** IntBuffer version of: {@link #glBufferStorage BufferStorage} */
	public static void glBufferStorage(int target, IntBuffer data, int flags) {
		nglBufferStorage(target, data.remaining() << 2, memAddress(data), flags);
	}

	/** FloatBuffer version of: {@link #glBufferStorage BufferStorage} */
	public static void glBufferStorage(int target, FloatBuffer data, int flags) {
		nglBufferStorage(target, data.remaining() << 2, memAddress(data), flags);
	}

	/** DoubleBuffer version of: {@link #glBufferStorage BufferStorage} */
	public static void glBufferStorage(int target, DoubleBuffer data, int flags) {
		nglBufferStorage(target, data.remaining() << 3, memAddress(data), flags);
	}

	// --- [ glNamedBufferStorageEXT ] ---

	/** Unsafe version of {@link #glNamedBufferStorageEXT NamedBufferStorageEXT} */
	@JavadocExclude
	public static void nglNamedBufferStorageEXT(int buffer, long size, long data, int flags) {
		long __functionAddress = getInstance().NamedBufferStorageEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		callIPPIV(__functionAddress, buffer, size, data, flags);
	}

	/**
	 * Behaves similarly to {@link #glBufferStorage BufferStorage}, except that the buffer whose storage is to be defined is specified by {@code buffer} rather than by the current
	 * binding to {@code target}.
	 *
	 * @param buffer the buffer object
	 * @param size   the size of the data store in basic machine units
	 * @param data   the address in client memory of the data that should be used to initialize the buffer's data store. If {@code data} is {@code NULL}, the data store of the
	 *               buffer is created, but contains undefined data. Otherwise, {@code data} should point to an array of at least {@code size} basic machine units.
	 * @param flags  the bitwise {@code OR} of flags describing the intended usage of the buffer object's data store by the application. Valid flags and their meanings
	 *               are as follows:
	 *               <ul>
	 *               <li>{@link #GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT} &ndash; The contents of the data store may be updated after creation through calls to
	 *               {@link GL15#glBufferSubData BufferSubData}. If this bit is not set, the buffer content may not be directly updated by the client. The {@code data}
	 *               argument may be used to specify the initial content of the buffer's data store regardless of the presence of the {@link #GL_DYNAMIC_STORAGE_BIT DYNAMIC_STORAGE_BIT}.
	 *               Regardless of the presence of this bit, buffers may always be updated with server-side calls such as {@link GL31#glCopyBufferSubData CopyBufferSubData} and
	 *               {@link GL43#glClearBufferSubData ClearBufferSubData}.</li>
	 *               <li>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} &ndash; The buffer's data store may be mapped by the client for read access and a pointer in the client's address space
	 *               obtained that may be read from.</li>
	 *               <li>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT} &ndash; The buffer's data store may be mapped by the client for write access and a pointer in the client's address
	 *               space obtained that may be written to.</li>
	 *               <li>{@link #GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT} &ndash; The client may request that the server read from or write to the buffer while it is mapped. The client's
	 *               pointer to the data store remains valid so long as the data store is mapped, even during execution of drawing or dispatch commands.</li>
	 *               <li>{@link #GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} &ndash; Shared access to buffers that are simultaneously mapped for client access and are used by the server will be
	 *               coherent, so long as that mapping is performed using MapBufferRange. That is, data written to the store by either the client or server will be
	 *               immediately visible to the other with no further action taken by the application. In particular:
	 *               <ul>
	 *               <li>If {@code MAP_COHERENT_BIT} is not set and the client performs a write followed by a call to the {@link GL42#glMemoryBarrier MemoryBarrier} command with
	 *               the {@link #GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set, then in subsequent commands the server will see the writes.</li>
	 *               <li>If {@code MAP_COHERENT_BIT} is set and the client performs a write, then in subsequent commands the server will see the writes.</li>
	 *               <li>If {@code MAP_COHERENT_BIT} is not set and the server performs a write, the application must call {@link GL42#glMemoryBarrier MemoryBarrier} with the
	 *               {@link #GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT CLIENT_MAPPED_BUFFER_BARRIER_BIT} set and then call {@link GL32#glFenceSync FenceSync} with {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or
	 *               {@link GL11#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
	 *               <li>If {@code MAP_COHERENT_BIT} is set and the server does a write, the app must call {@link GL32#glFenceSync FenceSync} with
	 *               {@link GL32#GL_SYNC_GPU_COMMANDS_COMPLETE SYNC_GPU_COMMANDS_COMPLETE} (or {@link GL11#glFinish Finish}). Then the CPU will see the writes after the sync is complete.</li>
	 *               </ul></li>
	 *               <li>{@link #GL_CLIENT_STORAGE_BIT CLIENT_STORAGE_BIT} &ndash; When all other criteria for the buffer storage allocation are met, this bit may be used by an
	 *               implementation to determine whether to use storage that is local to the server or to the client to serve as the backing store for the buffer.</li>
	 *               </ul>
	 *               If {@code flags} contains {@link #GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}, it must also contain at least one of {@link GL30#GL_MAP_READ_BIT MAP_READ_BIT} or {@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}.
	 *               
	 *               <p>It is an error to specify {@link #GL_MAP_COHERENT_BIT MAP_COHERENT_BIT} without also specifying {@link #GL_MAP_PERSISTENT_BIT MAP_PERSISTENT_BIT}.</p>
	 */
	public static void glNamedBufferStorageEXT(int buffer, long size, ByteBuffer data, int flags) {
		if ( LWJGLUtil.CHECKS )
			if ( data != null ) checkBuffer(data, size);
		nglNamedBufferStorageEXT(buffer, size, memAddressSafe(data), flags);
	}

	/** Alternative version of: {@link #glNamedBufferStorageEXT NamedBufferStorageEXT} */
	public static void glNamedBufferStorageEXT(int buffer, long size, int flags) {
		nglNamedBufferStorageEXT(buffer, size, 0L, flags);
	}

	/** ByteBuffer version of: {@link #glNamedBufferStorageEXT NamedBufferStorageEXT} */
	public static void glNamedBufferStorageEXT(int buffer, ByteBuffer data, int flags) {
		nglNamedBufferStorageEXT(buffer, data.remaining(), memAddress(data), flags);
	}

	/** ShortBuffer version of: {@link #glNamedBufferStorageEXT NamedBufferStorageEXT} */
	public static void glNamedBufferStorageEXT(int buffer, ShortBuffer data, int flags) {
		nglNamedBufferStorageEXT(buffer, data.remaining() << 1, memAddress(data), flags);
	}

	/** IntBuffer version of: {@link #glNamedBufferStorageEXT NamedBufferStorageEXT} */
	public static void glNamedBufferStorageEXT(int buffer, IntBuffer data, int flags) {
		nglNamedBufferStorageEXT(buffer, data.remaining() << 2, memAddress(data), flags);
	}

	/** FloatBuffer version of: {@link #glNamedBufferStorageEXT NamedBufferStorageEXT} */
	public static void glNamedBufferStorageEXT(int buffer, FloatBuffer data, int flags) {
		nglNamedBufferStorageEXT(buffer, data.remaining() << 2, memAddress(data), flags);
	}

	/** DoubleBuffer version of: {@link #glNamedBufferStorageEXT NamedBufferStorageEXT} */
	public static void glNamedBufferStorageEXT(int buffer, DoubleBuffer data, int flags) {
		nglNamedBufferStorageEXT(buffer, data.remaining() << 3, memAddress(data), flags);
	}

}