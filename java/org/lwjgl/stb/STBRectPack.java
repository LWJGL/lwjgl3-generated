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
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to stb_rect_pack.h from the <a href="https://github.com/nothings/stb">stb library</a>.
 * 
 * <p>Useful for e.g. packing rectangular textures into an atlas. Does not do rotation.</p>
 * 
 * <p>This library currently uses the Skyline Bottom-Left algorithm. Not necessarily the awesomest packing method, but better than the totally naive one in
 * stb_truetype (which is primarily what this is meant to replace).</p>
 */
public final class STBRectPack {

	/** Packing heuristics */
	public static final int
		STBRP_HEURISTIC_Skyline_default       = 0x0,
		STBRP_HEURISTIC_Skyline_BL_sortHeight = STBRP_HEURISTIC_Skyline_default,
		STBRP_HEURISTIC_Skyline_BF_sortHeight = 0x1;

	static { LWJGLUtil.initialize(); }

	private STBRectPack() {}

	// --- [ stbrp_pack_rects ] ---

	/** JNI method for {@link #stbrp_pack_rects pack_rects} */
	@JavadocExclude
	public static native void nstbrp_pack_rects(long context, long rects, int num_rects);

	/**
	 * Assigns packed locations to rectangles. The rectangles are of type {@link STBRPRect}, stored in the array {@code rects}, and there are {@code num_rects} many
	 * of them.
	 * 
	 * <p>Rectangles which are successfully packed have the {@code was_packed} flag set to a non-zero value and {@code x} and {@code y} store the minimum
	 * location on each axis (i.e. bottom-left in cartesian coordinates, top-left if you imagine y increasing downwards). Rectangles which do not fit have the
	 * {@code was_packed} flag set to 0.</p>
	 * 
	 * <p>You should not try to access the {@code rects} array from another thread while this function is running, as the function temporarily reorders the array
	 * while it executes.</p>
	 * 
	 * <p>To pack into another rectangle, you need to call {@link #stbrp_init_target init_target} again. To continue packing into the same rectangle, you can call this function again.
	 * Calling this multiple times with multiple rect arrays will probably produce worse packing results than calling it a single time with the full rectangle
	 * array, but the option is available.</p>
	 *
	 * @param context   an {@link STBRPContext} struct
	 * @param rects     an array of {@link STBRPRect} structs
	 * @param num_rects the number of structs in {@code rects}
	 */
	public static void stbrp_pack_rects(ByteBuffer context, ByteBuffer rects, int num_rects) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(context, STBRPContext.SIZEOF);
			checkBuffer(rects, num_rects * STBRPRect.SIZEOF);
		}
		nstbrp_pack_rects(memAddress(context), memAddress(rects), num_rects);
	}

	/** Alternative version of: {@link #stbrp_pack_rects pack_rects} */
	public static void stbrp_pack_rects(ByteBuffer context, ByteBuffer rects) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(context, STBRPContext.SIZEOF);
		nstbrp_pack_rects(memAddress(context), memAddress(rects), rects.remaining() / STBRPRect.SIZEOF);
	}

	// --- [ stbrp_init_target ] ---

	/** JNI method for {@link #stbrp_init_target init_target} */
	@JavadocExclude
	public static native void nstbrp_init_target(long context, int width, int height, long nodes, int num_nodes);

	/**
	 * Initialize a rectangle packer to: pack a rectangle that is {@code width} by {@code height} in dimensions using temporary storage provided by the array
	 * {@code nodes}, which is {@code num_nodes} long.
	 * 
	 * <p>You must call this function every time you start packing into a new target.</p>
	 * 
	 * <p>There is no "shutdown" function. The {@code nodes} memory must stay valid for the following {@link #stbrp_pack_rects pack_rects} call (or calls), but can be freed after the
	 * call (or calls) finish.</p>
	 * 
	 * <p>Note: to guarantee best results, either:
	 * <ol>
	 * <li>make sure {@code num_nodes &ge; width}</li>
	 * <li>or, call {@link #stbrp_setup_allow_out_of_mem setup_allow_out_of_mem} with {@code allow_out_of_mem = 1}</li>
	 * </ol>
	 * If you don't do either of the above things, widths will be quantized to multiples of small integers to guarantee the algorithm doesn't run out of
	 * temporary storage.</p>
	 * 
	 * <p>If you do #2, then the non-quantized algorithm will be used, but the algorithm may run out of temporary storage and be unable to pack some rectangles.</p>
	 *
	 * @param context   an {@link STBRPContext} struct
	 * @param width     the rectangle width
	 * @param height    the rectangle height
	 * @param nodes     an array of {@link STBRPNode} structs
	 * @param num_nodes the number of structs in {@code nodes}
	 */
	public static void stbrp_init_target(ByteBuffer context, int width, int height, ByteBuffer nodes, int num_nodes) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(context, STBRPContext.SIZEOF);
			checkBuffer(nodes, num_nodes * STBRPNode.SIZEOF);
		}
		nstbrp_init_target(memAddress(context), width, height, memAddress(nodes), num_nodes);
	}

	/** Alternative version of: {@link #stbrp_init_target init_target} */
	public static void stbrp_init_target(ByteBuffer context, int width, int height, ByteBuffer nodes) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(context, STBRPContext.SIZEOF);
		nstbrp_init_target(memAddress(context), width, height, memAddress(nodes), nodes.remaining() / STBRPNode.SIZEOF);
	}

	// --- [ stbrp_setup_allow_out_of_mem ] ---

	/** JNI method for {@link #stbrp_setup_allow_out_of_mem setup_allow_out_of_mem} */
	@JavadocExclude
	public static native void nstbrp_setup_allow_out_of_mem(long context, int allow_out_of_mem);

	/**
	 * Optionally call this function after init but before doing any packing to change the handling of the out-of-temp-memory scenario, described in
	 * {@link #stbrp_init_target init_target}. If you call init again, this will be reset to the default (false).
	 *
	 * @param context          an {@link STBRPContext} struct
	 * @param allow_out_of_mem 1 to allow running out of temporary storage
	 */
	public static void stbrp_setup_allow_out_of_mem(ByteBuffer context, int allow_out_of_mem) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(context, STBRPContext.SIZEOF);
		nstbrp_setup_allow_out_of_mem(memAddress(context), allow_out_of_mem);
	}

	// --- [ stbrp_setup_heuristic ] ---

	/** JNI method for {@link #stbrp_setup_heuristic setup_heuristic} */
	@JavadocExclude
	public static native void nstbrp_setup_heuristic(long context, int heuristic);

	/**
	 * Optionally select which packing heuristic the library should use. Different heuristics will produce better/worse results for different data sets. If
	 * you call init again, this will be reset to the default.
	 *
	 * @param context   an {@link STBRPContext} struct
	 * @param heuristic the packing heuristic
	 */
	public static void stbrp_setup_heuristic(ByteBuffer context, int heuristic) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(context, STBRPContext.SIZEOF);
		nstbrp_setup_heuristic(memAddress(context), heuristic);
	}

}