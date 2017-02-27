/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Represents a log stream. A log stream receives all log messages and streams them somewhere
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code callback} &ndash; callback to be called</li>
 * <li>{@code user} &ndash; user data to be passed to the callback</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct aiLogStream {
    {@link AILogStreamCallbackI aiLogStreamCallback} callback;
    void * user;
}</code></pre>
 */
public class AILogStream extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		CALLBACK,
		USER;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		CALLBACK = layout.offsetof(0);
		USER = layout.offsetof(1);
	}

	AILogStream(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link AILogStream} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public AILogStream(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code callback} field. */
	public AILogStreamCallback callback() { return ncallback(address()); }
	/** Returns the value of the {@code user} field. */
	public long user() { return nuser(address()); }

	/** Sets the specified value to the {@code callback} field. */
	public AILogStream callback(AILogStreamCallbackI value) { ncallback(address(), value); return this; }
	/** Sets the specified value to the {@code user} field. */
	public AILogStream user(long value) { nuser(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public AILogStream set(
		AILogStreamCallbackI callback,
		long user
	) {
		callback(callback);
		user(user);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public AILogStream set(AILogStream src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link AILogStream} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static AILogStream malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link AILogStream} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static AILogStream calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link AILogStream} instance allocated with {@link BufferUtils}. */
	public static AILogStream create() {
		return new AILogStream(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link AILogStream} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static AILogStream create(long address) {
		return address == NULL ? null : new AILogStream(address, null);
	}

	/**
	 * Returns a new {@link AILogStream.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link AILogStream.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link AILogStream.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link AILogStream.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link AILogStream} instance allocated on the thread-local {@link MemoryStack}. */
	public static AILogStream mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link AILogStream} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static AILogStream callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link AILogStream} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static AILogStream mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link AILogStream} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static AILogStream callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link AILogStream.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link AILogStream.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link AILogStream.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link AILogStream.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #callback}. */
	public static AILogStreamCallback ncallback(long struct) { return AILogStreamCallback.create(memGetAddress(struct + AILogStream.CALLBACK)); }
	/** Unsafe version of {@link #user}. */
	public static long nuser(long struct) { return memGetAddress(struct + AILogStream.USER); }

	/** Unsafe version of {@link #callback(AILogStreamCallbackI) callback}. */
	public static void ncallback(long struct, AILogStreamCallbackI value) { memPutAddress(struct + AILogStream.CALLBACK, value.address()); }
	/** Unsafe version of {@link #user(long) user}. */
	public static void nuser(long struct, long value) { memPutAddress(struct + AILogStream.USER, check(value)); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		check(memGetAddress(struct + AILogStream.CALLBACK));
		check(memGetAddress(struct + AILogStream.USER));
	}

	/**
	 * Calls {@link #validate(long)} for each struct contained in the specified struct array.
	 *
	 * @param array the struct array to validate
	 * @param count the number of structs in {@code array}
	 */
	public static void validate(long array, int count) {
		for ( int i = 0; i < count; i++ )
			validate(array + i * SIZEOF);
	}

	// -----------------------------------

	/** An array of {@link AILogStream} structs. */
	public static class Buffer extends StructBuffer<AILogStream, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link AILogStream.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link AILogStream#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			super(container, container.remaining() / SIZEOF);
		}

		Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			super(address, container, mark, pos, lim, cap);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			return new Buffer(address, container, mark, pos, lim, cap);
		}

		@Override
		protected AILogStream newInstance(long address) {
			return new AILogStream(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code callback} field. */
		public AILogStreamCallback callback() { return AILogStream.ncallback(address()); }
		/** Returns the value of the {@code user} field. */
		public long user() { return AILogStream.nuser(address()); }

		/** Sets the specified value to the {@code callback} field. */
		public AILogStream.Buffer callback(AILogStreamCallbackI value) { AILogStream.ncallback(address(), value); return this; }
		/** Sets the specified value to the {@code user} field. */
		public AILogStream.Buffer user(long value) { AILogStream.nuser(address(), value); return this; }

	}

}