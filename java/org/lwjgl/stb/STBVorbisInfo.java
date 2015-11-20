/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Information about a Vorbis stream.
 * 
 * <h3>stb_vorbis_info members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>sample_rate</td><td class="nw">unsigned int</td><td></td></tr>
 * <tr><td>channels</td><td class="nw">int</td><td></td></tr>
 * <tr><td>setup_memory_required</td><td class="nw">unsigned int</td><td></td></tr>
 * <tr><td>setup_temp_memory_required</td><td class="nw">unsigned int</td><td></td></tr>
 * <tr><td>temp_memory_required</td><td class="nw">unsigned int</td><td></td></tr>
 * <tr><td>max_frame_size</td><td class="nw">int</td><td></td></tr>
 * </table>
 */
public class STBVorbisInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

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
		__ALIGNMENT = layout.getAlignment();

		SAMPLE_RATE = layout.offsetof(0);
		CHANNELS = layout.offsetof(1);
		SETUP_MEMORY_REQUIRED = layout.offsetof(2);
		SETUP_TEMP_MEMORY_REQUIRED = layout.offsetof(3);
		TEMP_MEMORY_REQUIRED = layout.offsetof(4);
		MAX_FRAME_SIZE = layout.offsetof(5);
	}

	STBVorbisInfo(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link STBVorbisInfo} instance at the specified memory address. */
	public STBVorbisInfo(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link STBVorbisInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public STBVorbisInfo(ByteBuffer container) {
		this(memAddress(container), container);
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

	/** Returns a new {@link STBVorbisInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static STBVorbisInfo malloc() {
		return new STBVorbisInfo(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link STBVorbisInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static STBVorbisInfo calloc() {
		return new STBVorbisInfo(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link STBVorbisInfo} instance allocated with {@link BufferUtils}. */
	public static STBVorbisInfo create() {
		return new STBVorbisInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link STBVorbisInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link STBVorbisInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link STBVorbisInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link STBVorbisInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

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
	public static final class Buffer extends StructBuffer<STBVorbisInfo, Buffer> {

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
			this(container.slice(), SIZEOF);
		}

		Buffer(ByteBuffer container, int SIZEOF) {
			super(container, SIZEOF);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(ByteBuffer buffer) {
			return new Buffer(buffer);
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

	}

}