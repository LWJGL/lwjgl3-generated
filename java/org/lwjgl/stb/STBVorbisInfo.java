/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Information about a Vorbis stream.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct stb_vorbis_info {
    unsigned int sample_rate;
    int channels;
    unsigned int setup_memory_required;
    unsigned int setup_temp_memory_required;
    unsigned int temp_memory_required;
    int max_frame_size;
}</code></pre>
 */
public class STBVorbisInfo extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		SAMPLE_RATE,
		CHANNELS,
		SETUP_MEMORY_REQUIRED,
		SETUP_TEMP_MEMORY_REQUIRED,
		TEMP_MEMORY_REQUIRED,
		MAX_FRAME_SIZE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		SAMPLE_RATE = layout.offsetof(0);
		CHANNELS = layout.offsetof(1);
		SETUP_MEMORY_REQUIRED = layout.offsetof(2);
		SETUP_TEMP_MEMORY_REQUIRED = layout.offsetof(3);
		TEMP_MEMORY_REQUIRED = layout.offsetof(4);
		MAX_FRAME_SIZE = layout.offsetof(5);
	}

	STBVorbisInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link STBVorbisInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public STBVorbisInfo(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sample_rate} field. */
	public int sample_rate() { return nsample_rate(address()); }
	/** Returns the value of the {@code channels} field. */
	public int channels() { return nchannels(address()); }
	/** Returns the value of the {@code setup_memory_required} field. */
	public int setup_memory_required() { return nsetup_memory_required(address()); }
	/** Returns the value of the {@code setup_temp_memory_required} field. */
	public int setup_temp_memory_required() { return nsetup_temp_memory_required(address()); }
	/** Returns the value of the {@code temp_memory_required} field. */
	public int temp_memory_required() { return ntemp_memory_required(address()); }
	/** Returns the value of the {@code max_frame_size} field. */
	public int max_frame_size() { return nmax_frame_size(address()); }

	// -----------------------------------

	/** Returns a new {@link STBVorbisInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static STBVorbisInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link STBVorbisInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static STBVorbisInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link STBVorbisInfo} instance allocated with {@link BufferUtils}. */
	public static STBVorbisInfo create() {
		return new STBVorbisInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link STBVorbisInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static STBVorbisInfo create(long address) {
		return address == NULL ? null : new STBVorbisInfo(address, null);
	}

	/**
	 * Returns a new {@link STBVorbisInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link STBVorbisInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link STBVorbisInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link STBVorbisInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link STBVorbisInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static STBVorbisInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link STBVorbisInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static STBVorbisInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link STBVorbisInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static STBVorbisInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link STBVorbisInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static STBVorbisInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link STBVorbisInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link STBVorbisInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link STBVorbisInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link STBVorbisInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sample_rate}. */
	public static int nsample_rate(long struct) { return memGetInt(struct + STBVorbisInfo.SAMPLE_RATE); }
	/** Unsafe version of {@link #channels}. */
	public static int nchannels(long struct) { return memGetInt(struct + STBVorbisInfo.CHANNELS); }
	/** Unsafe version of {@link #setup_memory_required}. */
	public static int nsetup_memory_required(long struct) { return memGetInt(struct + STBVorbisInfo.SETUP_MEMORY_REQUIRED); }
	/** Unsafe version of {@link #setup_temp_memory_required}. */
	public static int nsetup_temp_memory_required(long struct) { return memGetInt(struct + STBVorbisInfo.SETUP_TEMP_MEMORY_REQUIRED); }
	/** Unsafe version of {@link #temp_memory_required}. */
	public static int ntemp_memory_required(long struct) { return memGetInt(struct + STBVorbisInfo.TEMP_MEMORY_REQUIRED); }
	/** Unsafe version of {@link #max_frame_size}. */
	public static int nmax_frame_size(long struct) { return memGetInt(struct + STBVorbisInfo.MAX_FRAME_SIZE); }

	// -----------------------------------

	/** An array of {@link STBVorbisInfo} structs. */
	public static final class Buffer extends StructBuffer<STBVorbisInfo, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link STBVorbisInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link STBVorbisInfo#SIZEOF}, and its mark will be undefined.
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
		protected STBVorbisInfo newInstance(long address) {
			return new STBVorbisInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sample_rate} field. */
		public int sample_rate() { return STBVorbisInfo.nsample_rate(address()); }
		/** Returns the value of the {@code channels} field. */
		public int channels() { return STBVorbisInfo.nchannels(address()); }
		/** Returns the value of the {@code setup_memory_required} field. */
		public int setup_memory_required() { return STBVorbisInfo.nsetup_memory_required(address()); }
		/** Returns the value of the {@code setup_temp_memory_required} field. */
		public int setup_temp_memory_required() { return STBVorbisInfo.nsetup_temp_memory_required(address()); }
		/** Returns the value of the {@code temp_memory_required} field. */
		public int temp_memory_required() { return STBVorbisInfo.ntemp_memory_required(address()); }
		/** Returns the value of the {@code max_frame_size} field. */
		public int max_frame_size() { return STBVorbisInfo.nmax_frame_size(address()); }

	}

}