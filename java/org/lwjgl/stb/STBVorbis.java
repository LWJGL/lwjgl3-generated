/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/**
 * Native bindings to stb_vorbis.c from the <a href="https://github.com/nothings/stb">stb library</a>.
 * 
 * <p>Ogg Vorbis audio decoder.</p>
 * 
 * <h3>Limitations</h3>
 * <ul>
 * <li>seeking not supported except manually via PUSHDATA api</li>
 * <li>floor 0 not supported (used in old ogg vorbis files pre-2004)</li>
 * <li>lossless sample-truncation at beginning ignored</li>
 * <li>cannot concatenate multiple vorbis streams</li>
 * <li>sample positions are 32-bit, limiting seekable 192Khz files to around 6 hours (Ogg supports 64-bit)</li>
 * </ul>
 * 
 * <h3>THREAD SAFETY</h3>
 * 
 * <p>Individual stb_vorbis* handles are not thread-safe; you cannot decode from them from multiple threads at the same time. However, you can have multiple
 * {@code stb_vorbis*} handles and decode from them independently in multiple threads.</p>
 * 
 * <h3>PUSHDATA API</h3>
 * 
 * <p>This API allows you to get blocks of data from any source and hand them to stb_vorbis. you have to buffer them; stb_vorbis will tell you how much it
 * used, and you have to give it the rest next time; and stb_vorbis may not have enough data to work with and you will need to give it the same data
 * again PLUS more. Note that the Vorbis specification does not bound the size of an individual frame.</p>
 * 
 * <h3>PULLING INPUT API</h3>
 * 
 * <p>This API assumes stb_vorbis is allowed to pull data from a source -- either a block of memory containing the _entire_ vorbis stream, or a FILE * that
 * you or it create, or possibly some other reading mechanism if you go modify the source to replace the FILE * case with some kind of callback to your
 * code. (But if you don't support seeking, you may just want to go ahead and use pushdata.)</p>
 */
public final class STBVorbis {

	/** Error code. */
	public static final int
		VORBIS_no_error                        = 0x0,
		VORBISneed_more_data                   = 0x1,
		VORBISinvalid_api_mixing               = 0x2,
		VORBISoutofmem                         = 0x3,
		VORBISfeature_not_supported            = 0x4,
		VORBIStoo_many_channels                = 0x5,
		VORBISfile_open_failure                = 0x6,
		VORBISseek_without_length              = 0x7,
		VORBISunexpected_eof                   = 0xA,
		VORBISseek_invalid                     = 0xB,
		VORBISinvalid_setup                    = 0x14,
		VORBISinvalid_stream                   = 0x15,
		VORBISmissing_capture_pattern          = 0x1E,
		VORBISinvalid_stream_structure_version = 0x1F,
		VORBIScontinued_packet_flag_invalid    = 0x20,
		VORBISincorrect_stream_serial_number   = 0x21,
		VORBISinvalid_first_page               = 0x22,
		VORBISbad_packet_type                  = 0x23,
		VORBIScant_find_last_page              = 0x24,
		VORBISseek_failed                      = 0x25;

	static { LWJGLUtil.initialize(); }

	private STBVorbis() {}

	// --- [ stb_vorbis_get_info ] ---

	/** JNI method for {@link #stb_vorbis_get_info get_info} */
	@JavadocExclude
	public static native void nstb_vorbis_get_info(long f, long __result);

	/**
	 * Returns general information about the specified file.
	 *
	 * @param f an ogg vorbis file decoder
	 */
	public static void stb_vorbis_get_info(long f, ByteBuffer __result) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(f);
		nstb_vorbis_get_info(f, memAddress(__result));
	}

	// --- [ stb_vorbis_get_error ] ---

	/** JNI method for {@link #stb_vorbis_get_error get_error} */
	@JavadocExclude
	public static native int nstb_vorbis_get_error(long f);

	/**
	 * Returns the last error detected (clears it, too).
	 *
	 * @param f an ogg vorbis file decoder
	 */
	public static int stb_vorbis_get_error(long f) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(f);
		return nstb_vorbis_get_error(f);
	}

	// --- [ stb_vorbis_close ] ---

	/** JNI method for {@link #stb_vorbis_close close} */
	@JavadocExclude
	public static native void nstb_vorbis_close(long f);

	/**
	 * Closes an ogg vorbis file and free all memory in use
	 *
	 * @param f an ogg vorbis file decoder
	 */
	public static void stb_vorbis_close(long f) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(f);
		nstb_vorbis_close(f);
	}

	// --- [ stb_vorbis_get_sample_offset ] ---

	/** JNI method for {@link #stb_vorbis_get_sample_offset get_sample_offset} */
	@JavadocExclude
	public static native int nstb_vorbis_get_sample_offset(long f);

	/**
	 * Returns the offset (in samples) from the beginning of the file that will be returned by the next decode, if it is known, or -1 otherwise. After a
	 * {@link #stb_vorbis_flush_pushdata flush_pushdata} call, this may take a while before it becomes valid again.
	 * 
	 * <p>NOT WORKING YET after a seek with PULLDATA API.</p>
	 *
	 * @param f an ogg vorbis file decoder
	 */
	public static int stb_vorbis_get_sample_offset(long f) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(f);
		return nstb_vorbis_get_sample_offset(f);
	}

	// --- [ stb_vorbis_get_file_offset ] ---

	/** JNI method for {@link #stb_vorbis_get_file_offset get_file_offset} */
	@JavadocExclude
	public static native int nstb_vorbis_get_file_offset(long f);

	/**
	 * Returns the current seek point within the file, or offset from the beginning of the memory buffer. In pushdata mode it returns 0.
	 *
	 * @param f an ogg vorbis file decoder
	 */
	public static int stb_vorbis_get_file_offset(long f) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(f);
		return nstb_vorbis_get_file_offset(f);
	}

	// --- [ stb_vorbis_open_pushdata ] ---

	/** JNI method for {@link #stb_vorbis_open_pushdata open_pushdata} */
	@JavadocExclude
	public static native long nstb_vorbis_open_pushdata(long datablock, int datablock_length_in_bytes, long datablock_memory_consumed_in_bytes, long error, long alloc_buffer);

	/**
	 * Creates a vorbis decoder by passing in the initial data block containing the ogg&vorbis headers (you don't need to do parse them, just provide the
	 * first N bytes of the file -- you're told if it's not enough, see below)
	 *
	 * @param datablock                          the data block containing the ogg vorbis headers
	 * @param datablock_length_in_bytes          the length of {@code datablock}, in bytes
	 * @param datablock_memory_consumed_in_bytes returns the amount of data parsed/consumed, in bytes
	 * @param error                              returns the error code
	 * @param alloc_buffer                       an {@link STBVorbisAlloc} struct
	 *
	 * @return On success, returns an {@code stb_vorbis *}, does not set error, returns the amount of data parsed/consumed on this call in
	 *         {@code *datablock_memory_consumed_in_bytes}; On failure, returns {@code NULL} on error and sets {@code *error}, does not change
	 *         {@code *datablock_memory_consumed}. If it returns {@code NULL} and {@code *error} is {@link #VORBISneed_more_data need_more_data}, then the input block was incomplete and you need to pass
	 *         in a larger block from the start of the file.
	 */
	public static long stb_vorbis_open_pushdata(ByteBuffer datablock, int datablock_length_in_bytes, ByteBuffer datablock_memory_consumed_in_bytes, ByteBuffer error, ByteBuffer alloc_buffer) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(datablock, datablock_length_in_bytes);
			if ( alloc_buffer != null ) checkBuffer(alloc_buffer, STBVorbisAlloc.SIZEOF);
		}
		return nstb_vorbis_open_pushdata(memAddress(datablock), datablock_length_in_bytes, memAddress(datablock_memory_consumed_in_bytes), memAddress(error), memAddressSafe(alloc_buffer));
	}

	/** Alternative version of: {@link #stb_vorbis_open_pushdata open_pushdata} */
	public static long stb_vorbis_open_pushdata(ByteBuffer datablock, IntBuffer datablock_memory_consumed_in_bytes, IntBuffer error, ByteBuffer alloc_buffer) {
		if ( LWJGLUtil.CHECKS )
			if ( alloc_buffer != null ) checkBuffer(alloc_buffer, STBVorbisAlloc.SIZEOF);
		return nstb_vorbis_open_pushdata(memAddress(datablock), datablock.remaining(), memAddress(datablock_memory_consumed_in_bytes), memAddress(error), memAddressSafe(alloc_buffer));
	}

	// --- [ stb_vorbis_decode_frame_pushdata ] ---

	/** JNI method for {@link #stb_vorbis_decode_frame_pushdata decode_frame_pushdata} */
	@JavadocExclude
	public static native int nstb_vorbis_decode_frame_pushdata(long f, long datablock, int datablock_length_in_bytes, long channels, long output, long samples);

	/**
	 * Decodes a frame of audio sample data if possible from the passed-in data block.
	 * 
	 * <p>Note that on resynch, stb_vorbis will rarely consume all of the buffer, instead only {@code datablock_length_in_bytes-3} or less. This is because it
	 * wants to avoid missing parts of a page header if they cross a datablock boundary, without writing state-machiney code to record a partial detection.</p>
	 * 
	 * <p>The number of channels returned are stored in *channels (which can be NULL -- it is always the same as the number of channels reported by {@link #stb_vorbis_get_info get_info}).
	 * {@code *output} will contain an array of {@code float*} buffers, one per channel. In other words, {@code (*output)[0][0]} contains the first sample
	 * from the first channel, and {@code (*output)[1][0]} contains the first sample from the second channel.</p>
	 *
	 * @param f                         an ogg vorbis file decoder
	 * @param datablock                 
	 * @param datablock_length_in_bytes 
	 * @param channels                  place to write number of {@code float *} buffers
	 * @param output                    place to write float ** array of float * buffers
	 * @param samples                   place to write number of output samples
	 *
	 * @return the number of bytes we used from datablock. Possible cases:
	 *         <ul>
	 *         <li>0 bytes used, 0 samples output (need more data)</li>
	 *         <li>N bytes used, 0 samples output (resynching the stream, keep going)</li>
	 *         <li>N bytes used, M samples output (one frame of data)</li>
	 *         </ul>
	 *         Note that after opening a file, you will ALWAYS get one N-bytes,0-sample frame, because Vorbis always "discards" the first frame.
	 */
	public static int stb_vorbis_decode_frame_pushdata(long f, ByteBuffer datablock, int datablock_length_in_bytes, ByteBuffer channels, ByteBuffer output, ByteBuffer samples) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(f);
			checkBuffer(datablock, datablock_length_in_bytes);
			checkBuffer(channels, 1 << 2);
			checkBuffer(output, 1 << POINTER_SHIFT);
			checkBuffer(samples, 1 << 2);
		}
		return nstb_vorbis_decode_frame_pushdata(f, memAddress(datablock), datablock_length_in_bytes, memAddress(channels), memAddress(output), memAddress(samples));
	}

	/** Alternative version of: {@link #stb_vorbis_decode_frame_pushdata decode_frame_pushdata} */
	public static int stb_vorbis_decode_frame_pushdata(long f, ByteBuffer datablock, IntBuffer channels, PointerBuffer output, IntBuffer samples) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(f);
			checkBuffer(channels, 1);
			checkBuffer(output, 1);
			checkBuffer(samples, 1);
		}
		return nstb_vorbis_decode_frame_pushdata(f, memAddress(datablock), datablock.remaining(), memAddress(channels), memAddress(output), memAddress(samples));
	}

	// --- [ stb_vorbis_flush_pushdata ] ---

	/** JNI method for {@link #stb_vorbis_flush_pushdata flush_pushdata} */
	@JavadocExclude
	public static native void nstb_vorbis_flush_pushdata(long f);

	/**
	 * Inform stb_vorbis that your next datablock will not be contiguous with previous ones (e.g. you've seeked in the data); future attempts to decode frames
	 * will cause stb_vorbis to resynchronize (as noted above), and once it sees a valid Ogg page (typically 4-8KB, as large as 64KB), it will begin decoding
	 * the <b>next</b> frame.
	 * 
	 * <p>If you want to seek using pushdata, you need to seek in your file, then call stb_vorbis_flush_pushdata(), then start calling decoding, then once
	 * decoding is returning you data, call {@link #stb_vorbis_get_sample_offset get_sample_offset}, and if you don't like the result, seek your file again and repeat.</p>
	 *
	 * @param f an ogg vorbis file decoder
	 */
	public static void stb_vorbis_flush_pushdata(long f) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(f);
		nstb_vorbis_flush_pushdata(f);
	}

	// --- [ stb_vorbis_decode_filename ] ---

	/** JNI method for {@link #stb_vorbis_decode_filename decode_filename} */
	@JavadocExclude
	public static native int nstb_vorbis_decode_filename(long filename, long channels, long sample_rate, long output);

	/**
	 * Decode an entire file and output the data interleaved into a {@code malloc()ed} buffer stored in {@code *output}. When you're done with it, just
	 * {@link MemoryUtil#memFree} the pointer returned in {@code *output}.
	 *
	 * @param filename    the file name
	 * @param channels    returns the number of channels
	 * @param sample_rate returns the sample rate
	 * @param output      returns a pointer to the decoded data
	 *
	 * @return the number of samples decoded, or -1 if the file could not be opened or was not an ogg vorbis file
	 */
	public static int stb_vorbis_decode_filename(ByteBuffer filename, ByteBuffer channels, ByteBuffer sample_rate, ByteBuffer output) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT1(filename);
			checkBuffer(channels, 1 << 2);
			checkBuffer(sample_rate, 1 << 2);
			checkBuffer(output, 1 << POINTER_SHIFT);
		}
		return nstb_vorbis_decode_filename(memAddress(filename), memAddress(channels), memAddress(sample_rate), memAddress(output));
	}

	/** Alternative version of: {@link #stb_vorbis_decode_filename decode_filename} */
	public static int stb_vorbis_decode_filename(ByteBuffer filename, IntBuffer channels, IntBuffer sample_rate, PointerBuffer output) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(channels, 1);
			checkBuffer(sample_rate, 1);
			checkBuffer(output, 1);
		}
		return nstb_vorbis_decode_filename(memAddress(filename), memAddress(channels), memAddress(sample_rate), memAddress(output));
	}

	/** CharSequence version of: {@link #stb_vorbis_decode_filename decode_filename} */
	public static int stb_vorbis_decode_filename(CharSequence filename, IntBuffer channels, IntBuffer sample_rate, PointerBuffer output) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(channels, 1);
			checkBuffer(sample_rate, 1);
			checkBuffer(output, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int filenameEncoded = __buffer.stringParamASCII(filename, true);
		return nstb_vorbis_decode_filename(__buffer.address(filenameEncoded), memAddress(channels), memAddress(sample_rate), memAddress(output));
	}

	// --- [ stb_vorbis_decode_memory ] ---

	/** JNI method for {@link #stb_vorbis_decode_memory decode_memory} */
	@JavadocExclude
	public static native int nstb_vorbis_decode_memory(long mem, int len, long channels, long sample_rate, long output);

	/**
	 * In-memory version of {@link #stb_vorbis_decode_filename decode_filename}.
	 *
	 * @param mem         the data to decode
	 * @param len         the {@code data} length, in bytes
	 * @param channels    returns the number of channels
	 * @param sample_rate returns the sample rate
	 * @param output      returns a pointer to the decoded data
	 */
	public static int stb_vorbis_decode_memory(ByteBuffer mem, int len, ByteBuffer channels, ByteBuffer sample_rate, ByteBuffer output) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(mem, len);
			checkBuffer(channels, 1 << 2);
			checkBuffer(sample_rate, 1 << 2);
			checkBuffer(output, 1 << POINTER_SHIFT);
		}
		return nstb_vorbis_decode_memory(memAddress(mem), len, memAddress(channels), memAddress(sample_rate), memAddress(output));
	}

	/** Alternative version of: {@link #stb_vorbis_decode_memory decode_memory} */
	public static int stb_vorbis_decode_memory(ByteBuffer mem, IntBuffer channels, IntBuffer sample_rate, PointerBuffer output) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(channels, 1);
			checkBuffer(sample_rate, 1);
			checkBuffer(output, 1);
		}
		return nstb_vorbis_decode_memory(memAddress(mem), mem.remaining(), memAddress(channels), memAddress(sample_rate), memAddress(output));
	}

	// --- [ stb_vorbis_open_memory ] ---

	/** JNI method for {@link #stb_vorbis_open_memory open_memory} */
	@JavadocExclude
	public static native long nstb_vorbis_open_memory(long mem, int len, long error, long alloc_buffer);

	/**
	 * Creates an ogg vorbis decoder from an ogg vorbis stream in memory (note this must be the entire stream!).
	 *
	 * @param mem          the data to decode
	 * @param len          the {@code data} length, in bytes
	 * @param error        returns an error code
	 * @param alloc_buffer an {@link STBVorbisAlloc} struct
	 *
	 * @return the ogg vorbis decoder. On failure, returns {@code NULL} and sets {@code *error}.
	 */
	public static long stb_vorbis_open_memory(ByteBuffer mem, int len, ByteBuffer error, ByteBuffer alloc_buffer) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(mem, len);
			checkBuffer(error, 1 << 2);
			if ( alloc_buffer != null ) checkBuffer(alloc_buffer, STBVorbisAlloc.SIZEOF);
		}
		return nstb_vorbis_open_memory(memAddress(mem), len, memAddress(error), memAddressSafe(alloc_buffer));
	}

	/** Alternative version of: {@link #stb_vorbis_open_memory open_memory} */
	public static long stb_vorbis_open_memory(ByteBuffer mem, IntBuffer error, ByteBuffer alloc_buffer) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(error, 1);
			if ( alloc_buffer != null ) checkBuffer(alloc_buffer, STBVorbisAlloc.SIZEOF);
		}
		return nstb_vorbis_open_memory(memAddress(mem), mem.remaining(), memAddress(error), memAddressSafe(alloc_buffer));
	}

	// --- [ stb_vorbis_open_filename ] ---

	/** JNI method for {@link #stb_vorbis_open_filename open_filename} */
	@JavadocExclude
	public static native long nstb_vorbis_open_filename(long filename, long error, long alloc_buffer);

	/**
	 * Creates an ogg vorbis decoder from a file name.
	 *
	 * @param filename     the file name
	 * @param error        returns an error code
	 * @param alloc_buffer an {@link STBVorbisAlloc} struct
	 *
	 * @return the ogg vorbis decoder. On failure, returns {@code NULL} and sets {@code *error}.
	 */
	public static long stb_vorbis_open_filename(ByteBuffer filename, ByteBuffer error, ByteBuffer alloc_buffer) {
		if ( LWJGLUtil.CHECKS ) {
			checkNT1(filename);
			checkBuffer(error, 1 << 2);
			if ( alloc_buffer != null ) checkBuffer(alloc_buffer, STBVorbisAlloc.SIZEOF);
		}
		return nstb_vorbis_open_filename(memAddress(filename), memAddress(error), memAddressSafe(alloc_buffer));
	}

	/** Alternative version of: {@link #stb_vorbis_open_filename open_filename} */
	public static long stb_vorbis_open_filename(ByteBuffer filename, IntBuffer error, ByteBuffer alloc_buffer) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(error, 1);
			if ( alloc_buffer != null ) checkBuffer(alloc_buffer, STBVorbisAlloc.SIZEOF);
		}
		return nstb_vorbis_open_filename(memAddress(filename), memAddress(error), memAddressSafe(alloc_buffer));
	}

	/** CharSequence version of: {@link #stb_vorbis_open_filename open_filename} */
	public static long stb_vorbis_open_filename(CharSequence filename, IntBuffer error, ByteBuffer alloc_buffer) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(error, 1);
			if ( alloc_buffer != null ) checkBuffer(alloc_buffer, STBVorbisAlloc.SIZEOF);
		}
		APIBuffer __buffer = apiBuffer();
		int filenameEncoded = __buffer.stringParamASCII(filename, true);
		return nstb_vorbis_open_filename(__buffer.address(filenameEncoded), memAddress(error), memAddressSafe(alloc_buffer));
	}

	// --- [ stb_vorbis_seek_frame ] ---

	/** JNI method for {@link #stb_vorbis_seek_frame seek_frame} */
	@JavadocExclude
	public static native int nstb_vorbis_seek_frame(long f, int sample_number);

	/**
	 * <h3>NOT WORKING YET</h3>
	 * 
	 * <p>Seeks in the Vorbis file to (approximately) {@code sample_number}. After calling seek_frame(), the next call to {@code get_frame_*()} will include the
	 * specified sample.</p>
	 *
	 * @param f             an ogg vorbis file decoder
	 * @param sample_number the sample index
	 */
	public static int stb_vorbis_seek_frame(long f, int sample_number) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(f);
		return nstb_vorbis_seek_frame(f, sample_number);
	}

	// --- [ stb_vorbis_seek ] ---

	/** JNI method for {@link #stb_vorbis_seek seek} */
	@JavadocExclude
	public static native int nstb_vorbis_seek(long f, int sample_number);

	/**
	 * <h3>NOT WORKING YET</h3>
	 * 
	 * <p>Seeks in the Vorbis file to (approximately) {@code sample_number}. After calling stb_vorbis_seek(), the next call to {@code stb_vorbis_get_samples_*}
	 * will start with the specified sample.</p>
	 *
	 * @param f             an ogg vorbis file decoder
	 * @param sample_number the sample index
	 */
	public static int stb_vorbis_seek(long f, int sample_number) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(f);
		return nstb_vorbis_seek(f, sample_number);
	}

	// --- [ stb_vorbis_seek_start ] ---

	/** JNI method for {@link #stb_vorbis_seek_start seek_start} */
	@JavadocExclude
	public static native void nstb_vorbis_seek_start(long f);

	/**
	 * This function is equivalent to {@link #stb_vorbis_seek seek}(f,0), but it actually works.
	 *
	 * @param f an ogg vorbis file decoder
	 */
	public static void stb_vorbis_seek_start(long f) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(f);
		nstb_vorbis_seek_start(f);
	}

	// --- [ stb_vorbis_stream_length_in_samples ] ---

	/** JNI method for {@link #stb_vorbis_stream_length_in_samples stream_length_in_samples} */
	@JavadocExclude
	public static native int nstb_vorbis_stream_length_in_samples(long f);

	/**
	 * Returns the total length of the vorbis stream, in samples.
	 *
	 * @param f an ogg vorbis file decoder
	 */
	public static int stb_vorbis_stream_length_in_samples(long f) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(f);
		return nstb_vorbis_stream_length_in_samples(f);
	}

	// --- [ stb_vorbis_stream_length_in_seconds ] ---

	/** JNI method for {@link #stb_vorbis_stream_length_in_seconds stream_length_in_seconds} */
	@JavadocExclude
	public static native float nstb_vorbis_stream_length_in_seconds(long f);

	/**
	 * Returns the total length of the vorbis stream, in samples.
	 *
	 * @param f an ogg vorbis file decoder
	 */
	public static float stb_vorbis_stream_length_in_seconds(long f) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(f);
		return nstb_vorbis_stream_length_in_seconds(f);
	}

	// --- [ stb_vorbis_get_frame_float ] ---

	/** JNI method for {@link #stb_vorbis_get_frame_float get_frame_float} */
	@JavadocExclude
	public static native int nstb_vorbis_get_frame_float(long f, long channels, long output);

	/**
	 * Decodes the next frame and return the number of samples.
	 * 
	 * <p>You generally should not intermix calls to {@code stb_vorbis_get_frame_*()} and {@code stb_vorbis_get_samples_*()}, since the latter calls the former.</p>
	 *
	 * @param f        an ogg vorbis file decoder
	 * @param channels returns the number of channels. Can be {@code NULL} -- it is always the same as the number of channels reported by {@link #stb_vorbis_get_info get_info}.
	 * @param output   returns a pointer to an array of float* buffers, one per channel. These outputs will be overwritten on the next call to
	 *                 {@code stb_vorbis_get_frame_*}.
	 *
	 * @return the number of samples per channel
	 */
	public static int stb_vorbis_get_frame_float(long f, ByteBuffer channels, ByteBuffer output) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(f);
			if ( channels != null ) checkBuffer(channels, 1 << 2);
		}
		return nstb_vorbis_get_frame_float(f, memAddressSafe(channels), memAddress(output));
	}

	/** Alternative version of: {@link #stb_vorbis_get_frame_float get_frame_float} */
	public static int stb_vorbis_get_frame_float(long f, IntBuffer channels, PointerBuffer output) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(f);
			if ( channels != null ) checkBuffer(channels, 1);
		}
		return nstb_vorbis_get_frame_float(f, memAddressSafe(channels), memAddress(output));
	}

	// --- [ stb_vorbis_get_frame_short ] ---

	/** JNI method for {@link #stb_vorbis_get_frame_short get_frame_short} */
	@JavadocExclude
	public static native int nstb_vorbis_get_frame_short(long f, int num_c, long buffer, int num_samples);

	/**
	 * Decodes the next frame and return the number of samples per channel. The data is coerced to the number of channels you request according to the channel
	 * coercion rules (see below). You must pass in the size of your buffer(s) so that stb_vorbis will not overwrite the end of the buffer. The maximum buffer
	 * size needed can be gotten from {@link #stb_vorbis_get_info get_info}; however, the Vorbis I specification implies an absolute maximum of 4096 samples per channel.
	 * 
	 * <h3>Channel coercion rules</h3>
	 * 
	 * <p>Let M be the number of channels requested, and N the number of channels present, and Cn be the nth channel; let stereo L be the sum of all L and center
	 * channels, and stereo R be the sum of all R and center channels (channel assignment from the vorbis spec).
	 * <pre><code style="font-family: monospace">
	 * M    N      output
	 * 1    k      sum(Ck) for all k
	 * 2    *      stereo L, stereo R
	 * k    l      k > l, the first l channels, then 0s
	 * k    l      k <= l, the first k channels</code></pre>
	 * Note that this is not <b>good</b> surround etc. mixing at all! It's just so you get something useful.</p>
	 *
	 * @param f           an ogg vorbis file decoder
	 * @param num_c       the number of channels
	 * @param buffer      the output buffer, an array of pointers with length {@code num_c}, each pointing to a short array with length {@code num_samples}
	 * @param num_samples the number of samples
	 *
	 * @return the number of samples per channel
	 */
	public static int stb_vorbis_get_frame_short(long f, int num_c, ByteBuffer buffer, int num_samples) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(f);
			checkBuffer(buffer, num_c << POINTER_SHIFT);
		}
		return nstb_vorbis_get_frame_short(f, num_c, memAddress(buffer), num_samples);
	}

	/** Alternative version of: {@link #stb_vorbis_get_frame_short get_frame_short} */
	public static int stb_vorbis_get_frame_short(long f, PointerBuffer buffer, int num_samples) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(f);
		return nstb_vorbis_get_frame_short(f, buffer.remaining(), memAddress(buffer), num_samples);
	}

	// --- [ stb_vorbis_get_frame_short_interleaved ] ---

	/** JNI method for {@link #stb_vorbis_get_frame_short_interleaved get_frame_short_interleaved} */
	@JavadocExclude
	public static native int nstb_vorbis_get_frame_short_interleaved(long f, int num_c, long buffer, int num_shorts);

	/**
	 * Interleaved version of {@link #stb_vorbis_get_frame_short get_frame_short}.
	 * 
	 * <p>Note that for interleaved data, you pass in the number of shorts (the size of your array), but the return value is the number of samples per channel,
	 * not the total number of samples.</p>
	 *
	 * @param f          an ogg vorbis file decoder
	 * @param num_c      the number of channels
	 * @param buffer     the output buffer
	 * @param num_shorts the size of {@code buffer}
	 *
	 * @return the number of samples per channel
	 */
	public static int stb_vorbis_get_frame_short_interleaved(long f, int num_c, ByteBuffer buffer, int num_shorts) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(f);
			checkBuffer(buffer, num_shorts << 1);
		}
		return nstb_vorbis_get_frame_short_interleaved(f, num_c, memAddress(buffer), num_shorts);
	}

	/** Alternative version of: {@link #stb_vorbis_get_frame_short_interleaved get_frame_short_interleaved} */
	public static int stb_vorbis_get_frame_short_interleaved(long f, int num_c, ShortBuffer buffer) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(f);
		return nstb_vorbis_get_frame_short_interleaved(f, num_c, memAddress(buffer), buffer.remaining());
	}

	// --- [ stb_vorbis_get_samples_float ] ---

	/** JNI method for {@link #stb_vorbis_get_samples_float get_samples_float} */
	@JavadocExclude
	public static native int nstb_vorbis_get_samples_float(long f, int channels, long buffer, int num_samples);

	/**
	 * Gets {@code num_samples} samples, not necessarily on a frame boundary -- this requires buffering so you have to supply the buffers. DOES NOT APPLY THE
	 * COERCION RULES.
	 *
	 * @param f           an ogg vorbis file decoder
	 * @param channels    the number of channels to decode
	 * @param buffer      the output buffer, an array of pointers with length {@code channels}, each pointing to a float array with length {@code num_samples}
	 * @param num_samples the number of samples to decode
	 *
	 * @return the number of samples stored per channel; it may be less than requested at the end of the file. If there are no more samples in the file, returns 0.
	 */
	public static int stb_vorbis_get_samples_float(long f, int channels, ByteBuffer buffer, int num_samples) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(f);
			checkBuffer(buffer, channels << POINTER_SHIFT);
		}
		return nstb_vorbis_get_samples_float(f, channels, memAddress(buffer), num_samples);
	}

	/** Alternative version of: {@link #stb_vorbis_get_samples_float get_samples_float} */
	public static int stb_vorbis_get_samples_float(long f, PointerBuffer buffer, int num_samples) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(f);
		return nstb_vorbis_get_samples_float(f, buffer.remaining(), memAddress(buffer), num_samples);
	}

	// --- [ stb_vorbis_get_samples_float_interleaved ] ---

	/** JNI method for {@link #stb_vorbis_get_samples_float_interleaved get_samples_float_interleaved} */
	@JavadocExclude
	public static native int nstb_vorbis_get_samples_float_interleaved(long f, int channels, long buffer, int num_floats);

	/**
	 * Interleaved version of {@link #stb_vorbis_get_samples_float get_samples_float}.
	 *
	 * @param f          an ogg vorbis file decoder
	 * @param channels   the number of channels
	 * @param buffer     the output buffer
	 * @param num_floats the size of {@code buffer}
	 *
	 * @return the number of samples stored per channel; it may be less than requested at the end of the file. If there are no more samples in the file, returns 0.
	 */
	public static int stb_vorbis_get_samples_float_interleaved(long f, int channels, ByteBuffer buffer, int num_floats) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(f);
			checkBuffer(buffer, num_floats << 2);
		}
		return nstb_vorbis_get_samples_float_interleaved(f, channels, memAddress(buffer), num_floats);
	}

	/** Alternative version of: {@link #stb_vorbis_get_samples_float_interleaved get_samples_float_interleaved} */
	public static int stb_vorbis_get_samples_float_interleaved(long f, int channels, FloatBuffer buffer) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(f);
		return nstb_vorbis_get_samples_float_interleaved(f, channels, memAddress(buffer), buffer.remaining());
	}

	// --- [ stb_vorbis_get_samples_short ] ---

	/** JNI method for {@link #stb_vorbis_get_samples_short get_samples_short} */
	@JavadocExclude
	public static native int nstb_vorbis_get_samples_short(long f, int channels, long buffer, int num_samples);

	/**
	 * Gets {@code num_samples} samples, not necessarily on a frame boundary -- this requires buffering so you have to supply the buffers. Applies the
	 * coercion rules above to produce {@code channels} channels.
	 *
	 * @param f           an ogg vorbis file decoder
	 * @param channels    the number of channels
	 * @param buffer      the output buffer, an array of pointers with length {@code channels}, each pointing to a short array with length {@code num_samples}
	 * @param num_samples the number of samples
	 *
	 * @return the number of samples stored per channel; it may be less than requested at the end of the file. If there are no more samples in the file, returns 0.
	 */
	public static int stb_vorbis_get_samples_short(long f, int channels, ByteBuffer buffer, int num_samples) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(f);
			checkBuffer(buffer, channels << POINTER_SHIFT);
		}
		return nstb_vorbis_get_samples_short(f, channels, memAddress(buffer), num_samples);
	}

	/** Alternative version of: {@link #stb_vorbis_get_samples_short get_samples_short} */
	public static int stb_vorbis_get_samples_short(long f, PointerBuffer buffer, int num_samples) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(f);
		return nstb_vorbis_get_samples_short(f, buffer.remaining(), memAddress(buffer), num_samples);
	}

	// --- [ stb_vorbis_get_samples_short_interleaved ] ---

	/** JNI method for {@link #stb_vorbis_get_samples_short_interleaved get_samples_short_interleaved} */
	@JavadocExclude
	public static native int nstb_vorbis_get_samples_short_interleaved(long f, int channels, long buffer, int num_shorts);

	/**
	 * Interleaved version of {@link #stb_vorbis_get_samples_short get_samples_short}.
	 *
	 * @param f          an ogg vorbis file decoder
	 * @param channels   the number of channels
	 * @param buffer     the output buffer
	 * @param num_shorts the size of {@code buffer}
	 *
	 * @return the number of samples stored per channel; it may be less than requested at the end of the file. If there are no more samples in the file, returns 0.
	 */
	public static int stb_vorbis_get_samples_short_interleaved(long f, int channels, ByteBuffer buffer, int num_shorts) {
		if ( LWJGLUtil.CHECKS ) {
			checkPointer(f);
			checkBuffer(buffer, num_shorts << 1);
		}
		return nstb_vorbis_get_samples_short_interleaved(f, channels, memAddress(buffer), num_shorts);
	}

	/** Alternative version of: {@link #stb_vorbis_get_samples_short_interleaved get_samples_short_interleaved} */
	public static int stb_vorbis_get_samples_short_interleaved(long f, int channels, ShortBuffer buffer) {
		if ( LWJGLUtil.CHECKS )
			checkPointer(f);
		return nstb_vorbis_get_samples_short_interleaved(f, channels, memAddress(buffer), buffer.remaining());
	}

}