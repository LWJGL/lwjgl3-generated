/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Information about a Vorbis stream. */
public final class STBVorbisInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		SAMPLE_RATE,
		CHANNELS,
		SETUP_MEMORY_REQUIRED,
		SETUP_TEMP_MEMORY_REQUIRED,
		TEMP_MEMORY_REQUIRED,
		MAX_FRAME_SIZE;

	static {
		IntBuffer offsets = memAllocInt(6);

		SIZEOF = offsets(memAddress(offsets));

		SAMPLE_RATE = offsets.get(0);
		CHANNELS = offsets.get(1);
		SETUP_MEMORY_REQUIRED = offsets.get(2);
		SETUP_TEMP_MEMORY_REQUIRED = offsets.get(3);
		TEMP_MEMORY_REQUIRED = offsets.get(4);
		MAX_FRAME_SIZE = offsets.get(5);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

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

	public int getSampleRate() { return ngetSampleRate(address()); }
	public int getChannels() { return ngetChannels(address()); }
	public int getSetupMemoryRequired() { return ngetSetupMemoryRequired(address()); }
	public int getSetupTempMemoryRequired() { return ngetSetupTempMemoryRequired(address()); }
	public int getTempMemoryRequired() { return ngetTempMemoryRequired(address()); }
	public int getMaxFrameSize() { return ngetMaxFrameSize(address()); }

	public STBVorbisInfo setSampleRate(int sample_rate) { nsetSampleRate(address(), sample_rate); return this; }
	public STBVorbisInfo setChannels(int channels) { nsetChannels(address(), channels); return this; }
	public STBVorbisInfo setSetupMemoryRequired(int setup_memory_required) { nsetSetupMemoryRequired(address(), setup_memory_required); return this; }
	public STBVorbisInfo setSetupTempMemoryRequired(int setup_temp_memory_required) { nsetSetupTempMemoryRequired(address(), setup_temp_memory_required); return this; }
	public STBVorbisInfo setTempMemoryRequired(int temp_memory_required) { nsetTempMemoryRequired(address(), temp_memory_required); return this; }
	public STBVorbisInfo setMaxFrameSize(int max_frame_size) { nsetMaxFrameSize(address(), max_frame_size); return this; }

	/** Initializes this struct with the specified values. */
	public STBVorbisInfo set(
		int sample_rate,
		int channels,
		int setup_memory_required,
		int setup_temp_memory_required,
		int temp_memory_required,
		int max_frame_size
	) {
		setSampleRate(sample_rate);
		setChannels(channels);
		setSetupMemoryRequired(setup_memory_required);
		setSetupTempMemoryRequired(setup_temp_memory_required);
		setTempMemoryRequired(temp_memory_required);
		setMaxFrameSize(max_frame_size);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public STBVorbisInfo nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @returns this struct
	 */
	public STBVorbisInfo set(STBVorbisInfo src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public STBVorbisInfo set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

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

	public static int ngetSampleRate(long struct) { return memGetInt(struct + SAMPLE_RATE); }
	public static int getSampleRate(ByteBuffer struct) { return ngetSampleRate(memAddress(struct)); }
	public static int ngetChannels(long struct) { return memGetInt(struct + CHANNELS); }
	public static int getChannels(ByteBuffer struct) { return ngetChannels(memAddress(struct)); }
	public static int ngetSetupMemoryRequired(long struct) { return memGetInt(struct + SETUP_MEMORY_REQUIRED); }
	public static int getSetupMemoryRequired(ByteBuffer struct) { return ngetSetupMemoryRequired(memAddress(struct)); }
	public static int ngetSetupTempMemoryRequired(long struct) { return memGetInt(struct + SETUP_TEMP_MEMORY_REQUIRED); }
	public static int getSetupTempMemoryRequired(ByteBuffer struct) { return ngetSetupTempMemoryRequired(memAddress(struct)); }
	public static int ngetTempMemoryRequired(long struct) { return memGetInt(struct + TEMP_MEMORY_REQUIRED); }
	public static int getTempMemoryRequired(ByteBuffer struct) { return ngetTempMemoryRequired(memAddress(struct)); }
	public static int ngetMaxFrameSize(long struct) { return memGetInt(struct + MAX_FRAME_SIZE); }
	public static int getMaxFrameSize(ByteBuffer struct) { return ngetMaxFrameSize(memAddress(struct)); }

	public static void nsetSampleRate(long struct, int sample_rate) { memPutInt(struct + SAMPLE_RATE, sample_rate); }
	public static void setSampleRate(ByteBuffer struct, int sample_rate) { nsetSampleRate(memAddress(struct), sample_rate); }
	public static void nsetChannels(long struct, int channels) { memPutInt(struct + CHANNELS, channels); }
	public static void setChannels(ByteBuffer struct, int channels) { nsetChannels(memAddress(struct), channels); }
	public static void nsetSetupMemoryRequired(long struct, int setup_memory_required) { memPutInt(struct + SETUP_MEMORY_REQUIRED, setup_memory_required); }
	public static void setSetupMemoryRequired(ByteBuffer struct, int setup_memory_required) { nsetSetupMemoryRequired(memAddress(struct), setup_memory_required); }
	public static void nsetSetupTempMemoryRequired(long struct, int setup_temp_memory_required) { memPutInt(struct + SETUP_TEMP_MEMORY_REQUIRED, setup_temp_memory_required); }
	public static void setSetupTempMemoryRequired(ByteBuffer struct, int setup_temp_memory_required) { nsetSetupTempMemoryRequired(memAddress(struct), setup_temp_memory_required); }
	public static void nsetTempMemoryRequired(long struct, int temp_memory_required) { memPutInt(struct + TEMP_MEMORY_REQUIRED, temp_memory_required); }
	public static void setTempMemoryRequired(ByteBuffer struct, int temp_memory_required) { nsetTempMemoryRequired(memAddress(struct), temp_memory_required); }
	public static void nsetMaxFrameSize(long struct, int max_frame_size) { memPutInt(struct + MAX_FRAME_SIZE, max_frame_size); }
	public static void setMaxFrameSize(ByteBuffer struct, int max_frame_size) { nsetMaxFrameSize(memAddress(struct), max_frame_size); }

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

	}

}