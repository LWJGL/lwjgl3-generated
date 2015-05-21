/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Information about a Vorbis stream. */
public final class STBVorbisInfo implements Pointer {

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
		IntBuffer offsets = BufferUtils.createIntBuffer(6);

		SIZEOF = offsets(memAddress(offsets));

		SAMPLE_RATE = offsets.get(0);
		CHANNELS = offsets.get(1);
		SETUP_MEMORY_REQUIRED = offsets.get(2);
		SETUP_TEMP_MEMORY_REQUIRED = offsets.get(3);
		TEMP_MEMORY_REQUIRED = offsets.get(4);
		MAX_FRAME_SIZE = offsets.get(5);
	}

	private final ByteBuffer struct;

	public STBVorbisInfo() {
		this(malloc());
	}

	public STBVorbisInfo(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);

		this.struct = struct;
	}

	public ByteBuffer buffer() {
		return struct;
	}

	@Override
	public long getPointer() {
		return memAddress(struct);
	}

	public void setSampleRate(int sample_rate) { sample_rate(struct, sample_rate); }
	public void setChannels(int channels) { channels(struct, channels); }
	public void setSetupMemoryRequired(int setup_memory_required) { setup_memory_required(struct, setup_memory_required); }
	public void setSetupTempMemoryRequired(int setup_temp_memory_required) { setup_temp_memory_required(struct, setup_temp_memory_required); }
	public void setTempMemoryRequired(int temp_memory_required) { temp_memory_required(struct, temp_memory_required); }
	public void setMaxFrameSize(int max_frame_size) { max_frame_size(struct, max_frame_size); }

	public int getSampleRate() { return sample_rate(struct); }
	public int getChannels() { return channels(struct); }
	public int getSetupMemoryRequired() { return setup_memory_required(struct); }
	public int getSetupTempMemoryRequired() { return setup_temp_memory_required(struct); }
	public int getTempMemoryRequired() { return temp_memory_required(struct); }
	public int getMaxFrameSize() { return max_frame_size(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int sample_rate,
		int channels,
		int setup_memory_required,
		int setup_temp_memory_required,
		int temp_memory_required,
		int max_frame_size
	) {
		ByteBuffer stb_vorbis_info = malloc();

		sample_rate(stb_vorbis_info, sample_rate);
		channels(stb_vorbis_info, channels);
		setup_memory_required(stb_vorbis_info, setup_memory_required);
		setup_temp_memory_required(stb_vorbis_info, setup_temp_memory_required);
		temp_memory_required(stb_vorbis_info, temp_memory_required);
		max_frame_size(stb_vorbis_info, max_frame_size);

		return stb_vorbis_info;
	}

	public static void sample_rate(ByteBuffer stb_vorbis_info, int sample_rate) { stb_vorbis_info.putInt(stb_vorbis_info.position() + SAMPLE_RATE, sample_rate); }
	public static void channels(ByteBuffer stb_vorbis_info, int channels) { stb_vorbis_info.putInt(stb_vorbis_info.position() + CHANNELS, channels); }
	public static void setup_memory_required(ByteBuffer stb_vorbis_info, int setup_memory_required) { stb_vorbis_info.putInt(stb_vorbis_info.position() + SETUP_MEMORY_REQUIRED, setup_memory_required); }
	public static void setup_temp_memory_required(ByteBuffer stb_vorbis_info, int setup_temp_memory_required) { stb_vorbis_info.putInt(stb_vorbis_info.position() + SETUP_TEMP_MEMORY_REQUIRED, setup_temp_memory_required); }
	public static void temp_memory_required(ByteBuffer stb_vorbis_info, int temp_memory_required) { stb_vorbis_info.putInt(stb_vorbis_info.position() + TEMP_MEMORY_REQUIRED, temp_memory_required); }
	public static void max_frame_size(ByteBuffer stb_vorbis_info, int max_frame_size) { stb_vorbis_info.putInt(stb_vorbis_info.position() + MAX_FRAME_SIZE, max_frame_size); }

	public static int sample_rate(ByteBuffer stb_vorbis_info) { return stb_vorbis_info.getInt(stb_vorbis_info.position() + SAMPLE_RATE); }
	public static int channels(ByteBuffer stb_vorbis_info) { return stb_vorbis_info.getInt(stb_vorbis_info.position() + CHANNELS); }
	public static int setup_memory_required(ByteBuffer stb_vorbis_info) { return stb_vorbis_info.getInt(stb_vorbis_info.position() + SETUP_MEMORY_REQUIRED); }
	public static int setup_temp_memory_required(ByteBuffer stb_vorbis_info) { return stb_vorbis_info.getInt(stb_vorbis_info.position() + SETUP_TEMP_MEMORY_REQUIRED); }
	public static int temp_memory_required(ByteBuffer stb_vorbis_info) { return stb_vorbis_info.getInt(stb_vorbis_info.position() + TEMP_MEMORY_REQUIRED); }
	public static int max_frame_size(ByteBuffer stb_vorbis_info) { return stb_vorbis_info.getInt(stb_vorbis_info.position() + MAX_FRAME_SIZE); }

}