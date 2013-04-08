/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Data structure for setting graphics context. */
public final class XGCValues {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		FUNCTION,
		PLANE_MASK,
		FOREGROUND,
		BACKGROUND,
		LINE_WIDTH,
		LINE_STYLE,
		CAP_STYLE,
		JOIN_STYLE,
		FILL_STYLE,
		FILL_RULE,
		ARC_MODE,
		TILE,
		STIPPLE,
		TS_X_ORIGIN,
		TS_Y_ORIGIN,
		FONT,
		SUBWINDOW_MODE,
		GRAPHICS_EXPOSURES,
		CLIP_X_ORIGIN,
		CLIP_Y_ORIGIN,
		CLIP_MASK,
		DASH_OFFSET,
		DASHES;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(23);

		SIZEOF = offsets(memAddress(offsets));

		FUNCTION = offsets.get(0);
		PLANE_MASK = offsets.get(1);
		FOREGROUND = offsets.get(2);
		BACKGROUND = offsets.get(3);
		LINE_WIDTH = offsets.get(4);
		LINE_STYLE = offsets.get(5);
		CAP_STYLE = offsets.get(6);
		JOIN_STYLE = offsets.get(7);
		FILL_STYLE = offsets.get(8);
		FILL_RULE = offsets.get(9);
		ARC_MODE = offsets.get(10);
		TILE = offsets.get(11);
		STIPPLE = offsets.get(12);
		TS_X_ORIGIN = offsets.get(13);
		TS_Y_ORIGIN = offsets.get(14);
		FONT = offsets.get(15);
		SUBWINDOW_MODE = offsets.get(16);
		GRAPHICS_EXPOSURES = offsets.get(17);
		CLIP_X_ORIGIN = offsets.get(18);
		CLIP_Y_ORIGIN = offsets.get(19);
		CLIP_MASK = offsets.get(20);
		DASH_OFFSET = offsets.get(21);
		DASHES = offsets.get(22);
	}

	private XGCValues() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
	public static ByteBuffer malloc(
		int function,
		long plane_mask,
		long foreground,
		long background,
		int line_width,
		int line_style,
		int cap_style,
		int join_style,
		int fill_style,
		int fill_rule,
		int arc_mode,
		long tile,
		long stipple,
		int ts_x_origin,
		int ts_y_origin,
		long font,
		int subwindow_mode,
		int graphics_exposures,
		int clip_x_origin,
		int clip_y_origin,
		long clip_mask,
		int dash_offset,
		int dashes
	) {
		ByteBuffer xgcvalues = malloc();

		functionSet(xgcvalues, function);
		plane_maskSet(xgcvalues, plane_mask);
		foregroundSet(xgcvalues, foreground);
		backgroundSet(xgcvalues, background);
		line_widthSet(xgcvalues, line_width);
		line_styleSet(xgcvalues, line_style);
		cap_styleSet(xgcvalues, cap_style);
		join_styleSet(xgcvalues, join_style);
		fill_styleSet(xgcvalues, fill_style);
		fill_ruleSet(xgcvalues, fill_rule);
		arc_modeSet(xgcvalues, arc_mode);
		tileSet(xgcvalues, tile);
		stippleSet(xgcvalues, stipple);
		ts_x_originSet(xgcvalues, ts_x_origin);
		ts_y_originSet(xgcvalues, ts_y_origin);
		fontSet(xgcvalues, font);
		subwindow_modeSet(xgcvalues, subwindow_mode);
		graphics_exposuresSet(xgcvalues, graphics_exposures);
		clip_x_originSet(xgcvalues, clip_x_origin);
		clip_y_originSet(xgcvalues, clip_y_origin);
		clip_maskSet(xgcvalues, clip_mask);
		dash_offsetSet(xgcvalues, dash_offset);
		dashesSet(xgcvalues, dashes);

		return xgcvalues;
	}

	public static void functionSet(ByteBuffer xgcvalues, int function) { xgcvalues.putInt(xgcvalues.position() + FUNCTION, function); }
	public static void plane_maskSet(ByteBuffer xgcvalues, long plane_mask) { PointerBuffer.put(xgcvalues, xgcvalues.position() + PLANE_MASK, plane_mask); }
	public static void foregroundSet(ByteBuffer xgcvalues, long foreground) { PointerBuffer.put(xgcvalues, xgcvalues.position() + FOREGROUND, foreground); }
	public static void backgroundSet(ByteBuffer xgcvalues, long background) { PointerBuffer.put(xgcvalues, xgcvalues.position() + BACKGROUND, background); }
	public static void line_widthSet(ByteBuffer xgcvalues, int line_width) { xgcvalues.putInt(xgcvalues.position() + LINE_WIDTH, line_width); }
	public static void line_styleSet(ByteBuffer xgcvalues, int line_style) { xgcvalues.putInt(xgcvalues.position() + LINE_STYLE, line_style); }
	public static void cap_styleSet(ByteBuffer xgcvalues, int cap_style) { xgcvalues.putInt(xgcvalues.position() + CAP_STYLE, cap_style); }
	public static void join_styleSet(ByteBuffer xgcvalues, int join_style) { xgcvalues.putInt(xgcvalues.position() + JOIN_STYLE, join_style); }
	public static void fill_styleSet(ByteBuffer xgcvalues, int fill_style) { xgcvalues.putInt(xgcvalues.position() + FILL_STYLE, fill_style); }
	public static void fill_ruleSet(ByteBuffer xgcvalues, int fill_rule) { xgcvalues.putInt(xgcvalues.position() + FILL_RULE, fill_rule); }
	public static void arc_modeSet(ByteBuffer xgcvalues, int arc_mode) { xgcvalues.putInt(xgcvalues.position() + ARC_MODE, arc_mode); }
	public static void tileSet(ByteBuffer xgcvalues, long tile) { PointerBuffer.put(xgcvalues, xgcvalues.position() + TILE, tile); }
	public static void stippleSet(ByteBuffer xgcvalues, long stipple) { PointerBuffer.put(xgcvalues, xgcvalues.position() + STIPPLE, stipple); }
	public static void ts_x_originSet(ByteBuffer xgcvalues, int ts_x_origin) { xgcvalues.putInt(xgcvalues.position() + TS_X_ORIGIN, ts_x_origin); }
	public static void ts_y_originSet(ByteBuffer xgcvalues, int ts_y_origin) { xgcvalues.putInt(xgcvalues.position() + TS_Y_ORIGIN, ts_y_origin); }
	public static void fontSet(ByteBuffer xgcvalues, long font) { PointerBuffer.put(xgcvalues, xgcvalues.position() + FONT, font); }
	public static void subwindow_modeSet(ByteBuffer xgcvalues, int subwindow_mode) { xgcvalues.putInt(xgcvalues.position() + SUBWINDOW_MODE, subwindow_mode); }
	public static void graphics_exposuresSet(ByteBuffer xgcvalues, int graphics_exposures) { xgcvalues.putInt(xgcvalues.position() + GRAPHICS_EXPOSURES, graphics_exposures); }
	public static void clip_x_originSet(ByteBuffer xgcvalues, int clip_x_origin) { xgcvalues.putInt(xgcvalues.position() + CLIP_X_ORIGIN, clip_x_origin); }
	public static void clip_y_originSet(ByteBuffer xgcvalues, int clip_y_origin) { xgcvalues.putInt(xgcvalues.position() + CLIP_Y_ORIGIN, clip_y_origin); }
	public static void clip_maskSet(ByteBuffer xgcvalues, long clip_mask) { PointerBuffer.put(xgcvalues, xgcvalues.position() + CLIP_MASK, clip_mask); }
	public static void dash_offsetSet(ByteBuffer xgcvalues, int dash_offset) { xgcvalues.putInt(xgcvalues.position() + DASH_OFFSET, dash_offset); }
	public static void dashesSet(ByteBuffer xgcvalues, int dashes) { xgcvalues.put(xgcvalues.position() + DASHES, (byte)dashes); }

	public static int functionGet(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + FUNCTION); }
	public static long plane_maskGet(ByteBuffer xgcvalues) { return PointerBuffer.get(xgcvalues, xgcvalues.position() + PLANE_MASK); }
	public static long foregroundGet(ByteBuffer xgcvalues) { return PointerBuffer.get(xgcvalues, xgcvalues.position() + FOREGROUND); }
	public static long backgroundGet(ByteBuffer xgcvalues) { return PointerBuffer.get(xgcvalues, xgcvalues.position() + BACKGROUND); }
	public static int line_widthGet(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + LINE_WIDTH); }
	public static int line_styleGet(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + LINE_STYLE); }
	public static int cap_styleGet(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + CAP_STYLE); }
	public static int join_styleGet(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + JOIN_STYLE); }
	public static int fill_styleGet(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + FILL_STYLE); }
	public static int fill_ruleGet(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + FILL_RULE); }
	public static int arc_modeGet(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + ARC_MODE); }
	public static long tileGet(ByteBuffer xgcvalues) { return PointerBuffer.get(xgcvalues, xgcvalues.position() + TILE); }
	public static long stippleGet(ByteBuffer xgcvalues) { return PointerBuffer.get(xgcvalues, xgcvalues.position() + STIPPLE); }
	public static int ts_x_originGet(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + TS_X_ORIGIN); }
	public static int ts_y_originGet(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + TS_Y_ORIGIN); }
	public static long fontGet(ByteBuffer xgcvalues) { return PointerBuffer.get(xgcvalues, xgcvalues.position() + FONT); }
	public static int subwindow_modeGet(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + SUBWINDOW_MODE); }
	public static int graphics_exposuresGet(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + GRAPHICS_EXPOSURES); }
	public static int clip_x_originGet(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + CLIP_X_ORIGIN); }
	public static int clip_y_originGet(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + CLIP_Y_ORIGIN); }
	public static long clip_maskGet(ByteBuffer xgcvalues) { return PointerBuffer.get(xgcvalues, xgcvalues.position() + CLIP_MASK); }
	public static int dash_offsetGet(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + DASH_OFFSET); }
	public static int dashesGet(ByteBuffer xgcvalues) { return xgcvalues.get(xgcvalues.position() + DASHES); }

}