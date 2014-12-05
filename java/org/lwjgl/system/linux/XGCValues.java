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
public final class XGCValues implements Pointer {

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

	private final ByteBuffer struct;

	public XGCValues() {
		this(malloc());
	}

	public XGCValues(ByteBuffer struct) {
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

	public void setFunction(int function) { function(struct, function); }
	public void setPlaneMask(long plane_mask) { plane_mask(struct, plane_mask); }
	public void setForeground(long foreground) { foreground(struct, foreground); }
	public void setBackground(long background) { background(struct, background); }
	public void setLineWidth(int line_width) { line_width(struct, line_width); }
	public void setLineStyle(int line_style) { line_style(struct, line_style); }
	public void setCapStyle(int cap_style) { cap_style(struct, cap_style); }
	public void setJoinStyle(int join_style) { join_style(struct, join_style); }
	public void setFillStyle(int fill_style) { fill_style(struct, fill_style); }
	public void setFillRule(int fill_rule) { fill_rule(struct, fill_rule); }
	public void setArcMode(int arc_mode) { arc_mode(struct, arc_mode); }
	public void setTile(long tile) { tile(struct, tile); }
	public void setStipple(long stipple) { stipple(struct, stipple); }
	public void setTsXOrigin(int ts_x_origin) { ts_x_origin(struct, ts_x_origin); }
	public void setTsYOrigin(int ts_y_origin) { ts_y_origin(struct, ts_y_origin); }
	public void setFont(long font) { font(struct, font); }
	public void setSubwindowMode(int subwindow_mode) { subwindow_mode(struct, subwindow_mode); }
	public void setGraphicsExposures(int graphics_exposures) { graphics_exposures(struct, graphics_exposures); }
	public void setClipXOrigin(int clip_x_origin) { clip_x_origin(struct, clip_x_origin); }
	public void setClipYOrigin(int clip_y_origin) { clip_y_origin(struct, clip_y_origin); }
	public void setClipMask(long clip_mask) { clip_mask(struct, clip_mask); }
	public void setDashOffset(int dash_offset) { dash_offset(struct, dash_offset); }
	public void setDashes(int dashes) { dashes(struct, dashes); }

	public int getFunction() { return function(struct); }
	public long getPlaneMask() { return plane_mask(struct); }
	public long getForeground() { return foreground(struct); }
	public long getBackground() { return background(struct); }
	public int getLineWidth() { return line_width(struct); }
	public int getLineStyle() { return line_style(struct); }
	public int getCapStyle() { return cap_style(struct); }
	public int getJoinStyle() { return join_style(struct); }
	public int getFillStyle() { return fill_style(struct); }
	public int getFillRule() { return fill_rule(struct); }
	public int getArcMode() { return arc_mode(struct); }
	public long getTile() { return tile(struct); }
	public long getStipple() { return stipple(struct); }
	public int getTsXOrigin() { return ts_x_origin(struct); }
	public int getTsYOrigin() { return ts_y_origin(struct); }
	public long getFont() { return font(struct); }
	public int getSubwindowMode() { return subwindow_mode(struct); }
	public int getGraphicsExposures() { return graphics_exposures(struct); }
	public int getClipXOrigin() { return clip_x_origin(struct); }
	public int getClipYOrigin() { return clip_y_origin(struct); }
	public long getClipMask() { return clip_mask(struct); }
	public int getDashOffset() { return dash_offset(struct); }
	public int getDashes() { return dashes(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
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

		function(xgcvalues, function);
		plane_mask(xgcvalues, plane_mask);
		foreground(xgcvalues, foreground);
		background(xgcvalues, background);
		line_width(xgcvalues, line_width);
		line_style(xgcvalues, line_style);
		cap_style(xgcvalues, cap_style);
		join_style(xgcvalues, join_style);
		fill_style(xgcvalues, fill_style);
		fill_rule(xgcvalues, fill_rule);
		arc_mode(xgcvalues, arc_mode);
		tile(xgcvalues, tile);
		stipple(xgcvalues, stipple);
		ts_x_origin(xgcvalues, ts_x_origin);
		ts_y_origin(xgcvalues, ts_y_origin);
		font(xgcvalues, font);
		subwindow_mode(xgcvalues, subwindow_mode);
		graphics_exposures(xgcvalues, graphics_exposures);
		clip_x_origin(xgcvalues, clip_x_origin);
		clip_y_origin(xgcvalues, clip_y_origin);
		clip_mask(xgcvalues, clip_mask);
		dash_offset(xgcvalues, dash_offset);
		dashes(xgcvalues, dashes);

		return xgcvalues;
	}

	public static void function(ByteBuffer xgcvalues, int function) { xgcvalues.putInt(xgcvalues.position() + FUNCTION, function); }
	public static void plane_mask(ByteBuffer xgcvalues, long plane_mask) { PointerBuffer.put(xgcvalues, xgcvalues.position() + PLANE_MASK, plane_mask); }
	public static void foreground(ByteBuffer xgcvalues, long foreground) { PointerBuffer.put(xgcvalues, xgcvalues.position() + FOREGROUND, foreground); }
	public static void background(ByteBuffer xgcvalues, long background) { PointerBuffer.put(xgcvalues, xgcvalues.position() + BACKGROUND, background); }
	public static void line_width(ByteBuffer xgcvalues, int line_width) { xgcvalues.putInt(xgcvalues.position() + LINE_WIDTH, line_width); }
	public static void line_style(ByteBuffer xgcvalues, int line_style) { xgcvalues.putInt(xgcvalues.position() + LINE_STYLE, line_style); }
	public static void cap_style(ByteBuffer xgcvalues, int cap_style) { xgcvalues.putInt(xgcvalues.position() + CAP_STYLE, cap_style); }
	public static void join_style(ByteBuffer xgcvalues, int join_style) { xgcvalues.putInt(xgcvalues.position() + JOIN_STYLE, join_style); }
	public static void fill_style(ByteBuffer xgcvalues, int fill_style) { xgcvalues.putInt(xgcvalues.position() + FILL_STYLE, fill_style); }
	public static void fill_rule(ByteBuffer xgcvalues, int fill_rule) { xgcvalues.putInt(xgcvalues.position() + FILL_RULE, fill_rule); }
	public static void arc_mode(ByteBuffer xgcvalues, int arc_mode) { xgcvalues.putInt(xgcvalues.position() + ARC_MODE, arc_mode); }
	public static void tile(ByteBuffer xgcvalues, long tile) { PointerBuffer.put(xgcvalues, xgcvalues.position() + TILE, tile); }
	public static void stipple(ByteBuffer xgcvalues, long stipple) { PointerBuffer.put(xgcvalues, xgcvalues.position() + STIPPLE, stipple); }
	public static void ts_x_origin(ByteBuffer xgcvalues, int ts_x_origin) { xgcvalues.putInt(xgcvalues.position() + TS_X_ORIGIN, ts_x_origin); }
	public static void ts_y_origin(ByteBuffer xgcvalues, int ts_y_origin) { xgcvalues.putInt(xgcvalues.position() + TS_Y_ORIGIN, ts_y_origin); }
	public static void font(ByteBuffer xgcvalues, long font) { PointerBuffer.put(xgcvalues, xgcvalues.position() + FONT, font); }
	public static void subwindow_mode(ByteBuffer xgcvalues, int subwindow_mode) { xgcvalues.putInt(xgcvalues.position() + SUBWINDOW_MODE, subwindow_mode); }
	public static void graphics_exposures(ByteBuffer xgcvalues, int graphics_exposures) { xgcvalues.putInt(xgcvalues.position() + GRAPHICS_EXPOSURES, graphics_exposures); }
	public static void clip_x_origin(ByteBuffer xgcvalues, int clip_x_origin) { xgcvalues.putInt(xgcvalues.position() + CLIP_X_ORIGIN, clip_x_origin); }
	public static void clip_y_origin(ByteBuffer xgcvalues, int clip_y_origin) { xgcvalues.putInt(xgcvalues.position() + CLIP_Y_ORIGIN, clip_y_origin); }
	public static void clip_mask(ByteBuffer xgcvalues, long clip_mask) { PointerBuffer.put(xgcvalues, xgcvalues.position() + CLIP_MASK, clip_mask); }
	public static void dash_offset(ByteBuffer xgcvalues, int dash_offset) { xgcvalues.putInt(xgcvalues.position() + DASH_OFFSET, dash_offset); }
	public static void dashes(ByteBuffer xgcvalues, int dashes) { xgcvalues.put(xgcvalues.position() + DASHES, (byte)dashes); }

	public static int function(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + FUNCTION); }
	public static long plane_mask(ByteBuffer xgcvalues) { return PointerBuffer.get(xgcvalues, xgcvalues.position() + PLANE_MASK); }
	public static long foreground(ByteBuffer xgcvalues) { return PointerBuffer.get(xgcvalues, xgcvalues.position() + FOREGROUND); }
	public static long background(ByteBuffer xgcvalues) { return PointerBuffer.get(xgcvalues, xgcvalues.position() + BACKGROUND); }
	public static int line_width(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + LINE_WIDTH); }
	public static int line_style(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + LINE_STYLE); }
	public static int cap_style(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + CAP_STYLE); }
	public static int join_style(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + JOIN_STYLE); }
	public static int fill_style(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + FILL_STYLE); }
	public static int fill_rule(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + FILL_RULE); }
	public static int arc_mode(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + ARC_MODE); }
	public static long tile(ByteBuffer xgcvalues) { return PointerBuffer.get(xgcvalues, xgcvalues.position() + TILE); }
	public static long stipple(ByteBuffer xgcvalues) { return PointerBuffer.get(xgcvalues, xgcvalues.position() + STIPPLE); }
	public static int ts_x_origin(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + TS_X_ORIGIN); }
	public static int ts_y_origin(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + TS_Y_ORIGIN); }
	public static long font(ByteBuffer xgcvalues) { return PointerBuffer.get(xgcvalues, xgcvalues.position() + FONT); }
	public static int subwindow_mode(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + SUBWINDOW_MODE); }
	public static int graphics_exposures(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + GRAPHICS_EXPOSURES); }
	public static int clip_x_origin(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + CLIP_X_ORIGIN); }
	public static int clip_y_origin(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + CLIP_Y_ORIGIN); }
	public static long clip_mask(ByteBuffer xgcvalues) { return PointerBuffer.get(xgcvalues, xgcvalues.position() + CLIP_MASK); }
	public static int dash_offset(ByteBuffer xgcvalues) { return xgcvalues.getInt(xgcvalues.position() + DASH_OFFSET); }
	public static int dashes(ByteBuffer xgcvalues) { return xgcvalues.get(xgcvalues.position() + DASHES); }

}