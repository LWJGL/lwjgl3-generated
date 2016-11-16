/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to stb_dxt.h from the <a href="https://github.com/nothings/stb">stb library</a>.
 * 
 * <p>DXT1/DXT5 compressor.</p>
 */
public class STBDXT {

	/**  */
	public static final int STB_DXT_NORMAL = 0x0;

	/** Use dithering. Dubious win, never use for normal maps and the like! */
	public static final int STB_DXT_DITHER = 0x1;

	/** High quality mode, does two refinement steps instead of 1. ~30-40% slower. */
	public static final int STB_DXT_HIGHQUAL = 0x2;

	static { LibSTB.initialize(); }

	protected STBDXT() {
		throw new UnsupportedOperationException();
	}

	// --- [ stb_compress_dxt_block ] ---

	/** Unsafe version of: {@link #stb_compress_dxt_block compress_dxt_block} */
	public static native void nstb_compress_dxt_block(long dest, long src, int alpha, int mode);

	/**
	 * Call this function for every block (you must pad). The source should be a 4x4 block of RGBA data in row-major order; A is ignored if you specify
	 * {@code alpha=0}; you can turn on dithering and "high quality" using {@code mode}.
	 *
	 * @param dest  a buffer in which to store the compressed block
	 * @param src   the block to compress
	 * @param alpha 1 to compress the alpha channel, 0 to ignore it
	 * @param mode  the compression mode. One of:<br><table><tr><td>{@link #STB_DXT_NORMAL DXT_NORMAL}</td><td>{@link #STB_DXT_DITHER DXT_DITHER}</td><td>{@link #STB_DXT_HIGHQUAL DXT_HIGHQUAL}</td></tr></table>
	 */
	public static void stb_compress_dxt_block(ByteBuffer dest, ByteBuffer src, boolean alpha, int mode) {
		if ( CHECKS )
			check(src, 64);
		nstb_compress_dxt_block(memAddress(dest), memAddress(src), alpha ? 1 : 0, mode);
	}

}