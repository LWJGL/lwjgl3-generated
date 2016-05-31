/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * NanoVG is a small antialiased vector graphics rendering library for OpenGL. It has lean API modeled after HTML5 canvas API. It is aimed to be a
 * practical and fun toolset for building scalable user interfaces and visualizations.
 * 
 * <h3>Color utils</h3>
 * 
 * <p>Colors in NanoVG are stored as unsigned ints in ABGR format.</p>
 * 
 * <h3>State Handling</h3>
 * 
 * <p>NanoVG contains state which represents how paths will be rendered. The state contains transform, fill and stroke styles, text and font styles, and
 * scissor clipping.</p>
 * 
 * <h3>Render styles</h3>
 * 
 * <p>Fill and stroke render style can be either a solid color or a paint which is a gradient or a pattern. Solid color is simply defined as a color value,
 * different kinds of paints can be created using {@link #nvgLinearGradient LinearGradient}, {@link #nvgBoxGradient BoxGradient}, {@link #nvgRadialGradient RadialGradient} and {@link #nvgImagePattern ImagePattern}.</p>
 * 
 * <p>Current render style can be saved and restored using {@link #nvgSave Save} and {@link #nvgRestore Restore}.</p>
 * 
 * <h3>Transforms</h3>
 * 
 * <p>The paths, gradients, patterns and scissor region are transformed by an transformation matrix at the time when they are passed to the API. The current
 * transformation matrix is a affine matrix:</p>
 * 
 * <pre><code>[sx kx tx]
[ky sy ty]
[ 0  0  1]</code></pre>
 * 
 * <p>Where: {@code sx,sy} define scaling, {@code kx,ky} skewing, and {@code tx,ty} translation. The last row is assumed to be {@code 0,0,1} and is not
 * stored.</p>
 * 
 * <p>Apart from {@link #nvgResetTransform ResetTransform}, each transformation function first creates specific transformation matrix and pre-multiplies the current transformation
 * by it.</p>
 * 
 * <p>Current coordinate system (transformation) can be saved and restored using {@link #nvgSave Save} and {@link #nvgRestore Restore}.</p>
 * 
 * <h3>Images</h3>
 * 
 * <p>NanoVG allows you to load jpg, png, psd, tga, pic and gif files to be used for rendering. In addition you can upload your own image. The image loading
 * is provided by {@code stb_image}.</p>
 * 
 * <h3>Paints</h3>
 * 
 * <p>NanoVG supports four types of paints: linear gradient, box gradient, radial gradient and image pattern. These can be used as paints for strokes and
 * fills.</p>
 * 
 * <h3>Scissoring</h3>
 * 
 * <p>Scissoring allows you to clip the rendering into a rectangle. This is useful for various user interface cases like rendering a text edit or a timeline.</p>
 * 
 * <h3>Paths</h3>
 * 
 * <p>Drawing a new shape starts with {@link #nvgBeginPath BeginPath}, it clears all the currently defined paths. Then you define one or more paths and sub-paths which describe
 * the shape. The are functions to draw common shapes like rectangles and circles, and lower level step-by-step functions, which allow to define a path
 * curve by curve.</p>
 * 
 * <p>NanoVG uses even-odd fill rule to draw the shapes. Solid shapes should have counter clockwise winding and holes should have counter clockwise order. To
 * specify winding of a path you can call {@link #nvgPathWinding PathWinding}. This is useful especially for the common shapes, which are drawn {@link #NVG_CCW CCW}.</p>
 * 
 * <p>Finally you can fill the path using current fill style by calling {@link #nvgFill Fill}, and stroke it with current stroke style by calling {@link #nvgStroke Stroke}.</p>
 * 
 * <p>The curve segments and sub-paths are transformed by the current transform.</p>
 * 
 * <h3>Text</h3>
 * 
 * <p>NanoVG allows you to load .ttf files and use the font to render text.</p>
 * 
 * <p>The appearance of the text can be defined by setting the current text style and by specifying the fill color. Common text and font settings such as
 * font size, letter spacing and text align are supported. Font blur allows you to create simple text effects such as drop shadows.</p>
 * 
 * <p>At render time the font face can be set based on the font handles or name.</p>
 * 
 * <p>Font measure functions return values in local space, the calculations are carried in the same resolution as the final rendering. This is done because
 * the text glyph positions are snapped to the nearest pixels sharp rendering.</p>
 * 
 * <p>The local space means that values are not rotated or scale as per the current transformation. For example if you set font size to 12, which would mean
 * that line height is 16, then regardless of the current scaling and rotation, the returned line height is always 16. Some measures may vary because of
 * the scaling since aforementioned pixel snapping.</p>
 * 
 * <p>While this may sound a little odd, the setup allows you to always render the same way regardless of scaling. I.e. following works regardless of scaling:</p>
 * 
 * <pre><code>const char* txt = "Text me up.";
nvgTextBounds(vg, x,y, txt, NULL, bounds);
nvgBeginPath(vg);
nvgRoundedRect(vg, bounds[0],bounds[1], bounds[2]-bounds[0], bounds[3]-bounds[1]);
nvgFill(vg);</code></pre>
 * 
 * <p>Note: currently only solid color fill is supported for text.</p>
 */
public class NanoVG {

	/** PI */
	public static final float NVG_PI = 3.1415927f;

	/** Winding for solid shapes */
	public static final int NVG_CCW = 0x1;

	/** Winding for holes */
	public static final int NVG_CW = 0x2;

	/** CCW */
	public static final int NVG_SOLID = 0x1;

	/** CW */
	public static final int NVG_HOLE = 0x2;

	/** Line caps and joins. */
	public static final int
		NVG_BUTT   = 0,
		NVG_ROUND  = 1,
		NVG_SQUARE = 2,
		NVG_BEVEL  = 3,
		NVG_MITER  = 4;

	/** Default, align text horizontally to left. */
	public static final int NVG_ALIGN_LEFT = 1<<0;

	/** Align text horizontally to center. */
	public static final int NVG_ALIGN_CENTER = 1<<1;

	/** Align text horizontally to right. */
	public static final int NVG_ALIGN_RIGHT = 1<<2;

	/** Align text vertically to top. */
	public static final int NVG_ALIGN_TOP = 1<<3;

	/** Align text vertically to middle. */
	public static final int NVG_ALIGN_MIDDLE = 1<<4;

	/** Align text vertically to bottom. */
	public static final int NVG_ALIGN_BOTTOM = 1<<5;

	/** Default, align text vertically to baseline. */
	public static final int NVG_ALIGN_BASELINE = 1<<6;

	/** Generate mipmaps during creation of the image. */
	public static final int NVG_IMAGE_GENERATE_MIPMAPS = 1<<0;

	/** Repeat image in X direction. */
	public static final int NVG_IMAGE_REPEATX = 1<<1;

	/** Repeat image in Y direction. */
	public static final int NVG_IMAGE_REPEATY = 1<<2;

	/** Flips (inverses) image in Y direction when rendered. */
	public static final int NVG_IMAGE_FLIPY = 1<<3;

	/** Image data has premultiplied alpha. */
	public static final int NVG_IMAGE_PREMULTIPLIED = 1<<4;

	static { Library.initialize(); }

	protected NanoVG() {
		throw new UnsupportedOperationException();
	}

	// --- [ nvgBeginFrame ] ---

	/**
	 * Begins drawing a new frame.
	 * 
	 * <p>Calls to nanovg drawing API should be wrapped in {@link #nvgBeginFrame BeginFrame} &amp; {@link #nvgEndFrame EndFrame}. {@link #nvgBeginFrame BeginFrame} defines the size of the window to render to in relation
	 * currently set viewport (i.e. {@code glViewport} on GL backends). Device pixel ration allows to control the rendering on Hi-DPI devices. For example,
	 * GLFW returns two dimension for an opened window: window size and frame buffer size. In that case you would set {@code windowWidth/Height} to the window
	 * size {@code devicePixelRatio} to: {@code frameBufferWidth / windowWidth}.</p>
	 *
	 * @param ctx              the NanoVG context
	 * @param windowWidth      the window width
	 * @param windowHeight     the window height
	 * @param devicePixelRatio the device pixel ratio
	 */
	public static native void nnvgBeginFrame(long ctx, int windowWidth, int windowHeight, float devicePixelRatio);

	/**
	 * Begins drawing a new frame.
	 * 
	 * <p>Calls to nanovg drawing API should be wrapped in {@link #nvgBeginFrame BeginFrame} &amp; {@link #nvgEndFrame EndFrame}. {@link #nvgBeginFrame BeginFrame} defines the size of the window to render to in relation
	 * currently set viewport (i.e. {@code glViewport} on GL backends). Device pixel ration allows to control the rendering on Hi-DPI devices. For example,
	 * GLFW returns two dimension for an opened window: window size and frame buffer size. In that case you would set {@code windowWidth/Height} to the window
	 * size {@code devicePixelRatio} to: {@code frameBufferWidth / windowWidth}.</p>
	 *
	 * @param ctx              the NanoVG context
	 * @param windowWidth      the window width
	 * @param windowHeight     the window height
	 * @param devicePixelRatio the device pixel ratio
	 */
	public static void nvgBeginFrame(long ctx, int windowWidth, int windowHeight, float devicePixelRatio) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgBeginFrame(ctx, windowWidth, windowHeight, devicePixelRatio);
	}

	// --- [ nvgCancelFrame ] ---

	/**
	 * Cancels drawing the current frame.
	 *
	 * @param ctx the NanoVG context
	 */
	public static native void nnvgCancelFrame(long ctx);

	/**
	 * Cancels drawing the current frame.
	 *
	 * @param ctx the NanoVG context
	 */
	public static void nvgCancelFrame(long ctx) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgCancelFrame(ctx);
	}

	// --- [ nvgEndFrame ] ---

	/**
	 * Ends drawing flushing remaining render state.
	 *
	 * @param ctx the NanoVG context
	 */
	public static native void nnvgEndFrame(long ctx);

	/**
	 * Ends drawing flushing remaining render state.
	 *
	 * @param ctx the NanoVG context
	 */
	public static void nvgEndFrame(long ctx) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgEndFrame(ctx);
	}

	// --- [ nvgRGB ] ---

	/**
	 * Returns a color value from red, green, blue values. Alpha will be set to 255 (1.0f).
	 *
	 * @param r the red value
	 * @param g the green value
	 * @param b the blue value
	 */
	public static native void nnvgRGB(byte r, byte g, byte b, long __result);

	/**
	 * Returns a color value from red, green, blue values. Alpha will be set to 255 (1.0f).
	 *
	 * @param r the red value
	 * @param g the green value
	 * @param b the blue value
	 */
	public static NVGColor nvgRGB(byte r, byte g, byte b, NVGColor __result) {
		nnvgRGB(r, g, b, __result.address());
		return __result;
	}

	// --- [ nvgRGBf ] ---

	/**
	 * Returns a color value from red, green, blue values. Alpha will be set to 1.0f.
	 *
	 * @param r the red value
	 * @param g the green value
	 * @param b the blue value
	 */
	public static native void nnvgRGBf(float r, float g, float b, long __result);

	/**
	 * Returns a color value from red, green, blue values. Alpha will be set to 1.0f.
	 *
	 * @param r the red value
	 * @param g the green value
	 * @param b the blue value
	 */
	public static NVGColor nvgRGBf(float r, float g, float b, NVGColor __result) {
		nnvgRGBf(r, g, b, __result.address());
		return __result;
	}

	// --- [ nvgRGBA ] ---

	/**
	 * Returns a color value from red, green, blue and alpha values.
	 *
	 * @param r the red value
	 * @param g the green value
	 * @param b the blue value
	 * @param a the alpha value
	 */
	public static native void nnvgRGBA(byte r, byte g, byte b, byte a, long __result);

	/**
	 * Returns a color value from red, green, blue and alpha values.
	 *
	 * @param r the red value
	 * @param g the green value
	 * @param b the blue value
	 * @param a the alpha value
	 */
	public static NVGColor nvgRGBA(byte r, byte g, byte b, byte a, NVGColor __result) {
		nnvgRGBA(r, g, b, a, __result.address());
		return __result;
	}

	// --- [ nvgRGBAf ] ---

	/**
	 * Returns a color value from red, green, blue and alpha values.
	 *
	 * @param r the red value
	 * @param g the green value
	 * @param b the blue value
	 * @param a the alpha value
	 */
	public static native void nnvgRGBAf(float r, float g, float b, float a, long __result);

	/**
	 * Returns a color value from red, green, blue and alpha values.
	 *
	 * @param r the red value
	 * @param g the green value
	 * @param b the blue value
	 * @param a the alpha value
	 */
	public static NVGColor nvgRGBAf(float r, float g, float b, float a, NVGColor __result) {
		nnvgRGBAf(r, g, b, a, __result.address());
		return __result;
	}

	// --- [ nvgLerpRGBA ] ---

	/**
	 * Linearly interpolates from color {@code c0} to {@code c1}, and returns resulting color value.
	 *
	 * @param c0 the first color
	 * @param c1 the second color
	 * @param u  the interpolation factor
	 */
	public static native void nnvgLerpRGBA(long c0, long c1, float u, long __result);

	/**
	 * Linearly interpolates from color {@code c0} to {@code c1}, and returns resulting color value.
	 *
	 * @param c0 the first color
	 * @param c1 the second color
	 * @param u  the interpolation factor
	 */
	public static NVGColor nvgLerpRGBA(NVGColor c0, NVGColor c1, float u, NVGColor __result) {
		nnvgLerpRGBA(c0.address(), c1.address(), u, __result.address());
		return __result;
	}

	// --- [ nvgTransRGBA ] ---

	/**
	 * Sets transparency of a color value.
	 *
	 * @param c0 the color
	 * @param a  the alpha value
	 */
	public static native void nnvgTransRGBA(long c0, byte a, long __result);

	/**
	 * Sets transparency of a color value.
	 *
	 * @param c0 the color
	 * @param a  the alpha value
	 */
	public static NVGColor nvgTransRGBA(NVGColor c0, byte a, NVGColor __result) {
		nnvgTransRGBA(c0.address(), a, __result.address());
		return __result;
	}

	// --- [ nvgTransRGBAf ] ---

	/**
	 * Sets transparency of a color value.
	 *
	 * @param c0 the color
	 * @param a  the alpha value
	 */
	public static native void nnvgTransRGBAf(long c0, float a, long __result);

	/**
	 * Sets transparency of a color value.
	 *
	 * @param c0 the color
	 * @param a  the alpha value
	 */
	public static NVGColor nvgTransRGBAf(NVGColor c0, float a, NVGColor __result) {
		nnvgTransRGBAf(c0.address(), a, __result.address());
		return __result;
	}

	// --- [ nvgHSL ] ---

	/**
	 * Returns color value specified by hue, saturation and lightness.
	 * 
	 * <p>HSL values are all in range {@code [0..1]}, alpha will be set to 255.</p>
	 *
	 * @param h the hue value
	 * @param s the saturation value
	 * @param l the lightness value
	 */
	public static native void nnvgHSL(float h, float s, float l, long __result);

	/**
	 * Returns color value specified by hue, saturation and lightness.
	 * 
	 * <p>HSL values are all in range {@code [0..1]}, alpha will be set to 255.</p>
	 *
	 * @param h the hue value
	 * @param s the saturation value
	 * @param l the lightness value
	 */
	public static NVGColor nvgHSL(float h, float s, float l, NVGColor __result) {
		nnvgHSL(h, s, l, __result.address());
		return __result;
	}

	// --- [ nvgHSLA ] ---

	/**
	 * Returns color value specified by hue, saturation and lightness and alpha.
	 * 
	 * <p>HSL values are all in range {@code [0..1]}, alpha in range {@code [0..255]}</p>
	 *
	 * @param h the hue value
	 * @param s the saturation value
	 * @param l the lightness value
	 * @param a the alpha value
	 */
	public static native void nnvgHSLA(float h, float s, float l, byte a, long __result);

	/**
	 * Returns color value specified by hue, saturation and lightness and alpha.
	 * 
	 * <p>HSL values are all in range {@code [0..1]}, alpha in range {@code [0..255]}</p>
	 *
	 * @param h the hue value
	 * @param s the saturation value
	 * @param l the lightness value
	 * @param a the alpha value
	 */
	public static NVGColor nvgHSLA(float h, float s, float l, byte a, NVGColor __result) {
		nnvgHSLA(h, s, l, a, __result.address());
		return __result;
	}

	// --- [ nvgSave ] ---

	/**
	 * Pushes and saves the current render state into a state stack. A matching {@link #nvgRestore Restore} must be used to restore the state.
	 *
	 * @param ctx the NanoVG context
	 */
	public static native void nnvgSave(long ctx);

	/**
	 * Pushes and saves the current render state into a state stack. A matching {@link #nvgRestore Restore} must be used to restore the state.
	 *
	 * @param ctx the NanoVG context
	 */
	public static void nvgSave(long ctx) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgSave(ctx);
	}

	// --- [ nvgRestore ] ---

	/**
	 * Pops and restores current render state.
	 *
	 * @param ctx the NanoVG context
	 */
	public static native void nnvgRestore(long ctx);

	/**
	 * Pops and restores current render state.
	 *
	 * @param ctx the NanoVG context
	 */
	public static void nvgRestore(long ctx) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgRestore(ctx);
	}

	// --- [ nvgReset ] ---

	/**
	 * Resets current render state to default values. Does not affect the render state stack.
	 *
	 * @param ctx the NanoVG context
	 */
	public static native void nnvgReset(long ctx);

	/**
	 * Resets current render state to default values. Does not affect the render state stack.
	 *
	 * @param ctx the NanoVG context
	 */
	public static void nvgReset(long ctx) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgReset(ctx);
	}

	// --- [ nvgStrokeColor ] ---

	/**
	 * Sets current stroke style to a solid color.
	 *
	 * @param ctx   the NanoVG context
	 * @param color the color to set
	 */
	public static native void nnvgStrokeColor(long ctx, long color);

	/**
	 * Sets current stroke style to a solid color.
	 *
	 * @param ctx   the NanoVG context
	 * @param color the color to set
	 */
	public static void nvgStrokeColor(long ctx, NVGColor color) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgStrokeColor(ctx, color.address());
	}

	// --- [ nvgStrokePaint ] ---

	/**
	 * Sets current stroke style to a paint, which can be a one of the gradients or a pattern.
	 *
	 * @param ctx   the NanoVG context
	 * @param paint the paint to set
	 */
	public static native void nnvgStrokePaint(long ctx, long paint);

	/**
	 * Sets current stroke style to a paint, which can be a one of the gradients or a pattern.
	 *
	 * @param ctx   the NanoVG context
	 * @param paint the paint to set
	 */
	public static void nvgStrokePaint(long ctx, NVGPaint paint) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgStrokePaint(ctx, paint.address());
	}

	// --- [ nvgFillColor ] ---

	/**
	 * Sets current fill style to a solid color.
	 *
	 * @param ctx   the NanoVG context
	 * @param color the color to set
	 */
	public static native void nnvgFillColor(long ctx, long color);

	/**
	 * Sets current fill style to a solid color.
	 *
	 * @param ctx   the NanoVG context
	 * @param color the color to set
	 */
	public static void nvgFillColor(long ctx, NVGColor color) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgFillColor(ctx, color.address());
	}

	// --- [ nvgFillPaint ] ---

	/**
	 * Sets current fill style to a paint, which can be a one of the gradients or a pattern.
	 *
	 * @param ctx   the NanoVG context
	 * @param paint the paint to set
	 */
	public static native void nnvgFillPaint(long ctx, long paint);

	/**
	 * Sets current fill style to a paint, which can be a one of the gradients or a pattern.
	 *
	 * @param ctx   the NanoVG context
	 * @param paint the paint to set
	 */
	public static void nvgFillPaint(long ctx, NVGPaint paint) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgFillPaint(ctx, paint.address());
	}

	// --- [ nvgMiterLimit ] ---

	/**
	 * Sets the miter limit of the stroke style. Miter limit controls when a sharp corner is beveled.
	 *
	 * @param ctx   the NanoVG context
	 * @param limit the miter limit to set
	 */
	public static native void nnvgMiterLimit(long ctx, float limit);

	/**
	 * Sets the miter limit of the stroke style. Miter limit controls when a sharp corner is beveled.
	 *
	 * @param ctx   the NanoVG context
	 * @param limit the miter limit to set
	 */
	public static void nvgMiterLimit(long ctx, float limit) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgMiterLimit(ctx, limit);
	}

	// --- [ nvgStrokeWidth ] ---

	/**
	 * Sets the stroke width of the stroke style.
	 *
	 * @param ctx  the NanoVG context
	 * @param size the stroke width to set
	 */
	public static native void nnvgStrokeWidth(long ctx, float size);

	/**
	 * Sets the stroke width of the stroke style.
	 *
	 * @param ctx  the NanoVG context
	 * @param size the stroke width to set
	 */
	public static void nvgStrokeWidth(long ctx, float size) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgStrokeWidth(ctx, size);
	}

	// --- [ nvgLineCap ] ---

	/**
	 * Sets how the end of the line (cap) is drawn.
	 * 
	 * <p>The default line cap is {@link #NVG_BUTT BUTT}.</p>
	 *
	 * @param ctx the NanoVG context
	 * @param cap the line cap to set. One of:<br><table><tr><td>{@link #NVG_BUTT BUTT}</td><td>{@link #NVG_ROUND ROUND}</td><td>{@link #NVG_SQUARE SQUARE}</td></tr></table>
	 */
	public static native void nnvgLineCap(long ctx, int cap);

	/**
	 * Sets how the end of the line (cap) is drawn.
	 * 
	 * <p>The default line cap is {@link #NVG_BUTT BUTT}.</p>
	 *
	 * @param ctx the NanoVG context
	 * @param cap the line cap to set. One of:<br><table><tr><td>{@link #NVG_BUTT BUTT}</td><td>{@link #NVG_ROUND ROUND}</td><td>{@link #NVG_SQUARE SQUARE}</td></tr></table>
	 */
	public static void nvgLineCap(long ctx, int cap) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgLineCap(ctx, cap);
	}

	// --- [ nvgLineJoin ] ---

	/**
	 * Sets how sharp path corners are drawn.
	 * 
	 * <p>The default line join is {@link #NVG_MITER MITER}.</p>
	 *
	 * @param ctx  the NanoVG context
	 * @param join the line join to set. One of:<br><table><tr><td>{@link #NVG_MITER MITER}</td><td>{@link #NVG_ROUND ROUND}</td><td>{@link #NVG_BEVEL BEVEL}</td></tr></table>
	 */
	public static native void nnvgLineJoin(long ctx, int join);

	/**
	 * Sets how sharp path corners are drawn.
	 * 
	 * <p>The default line join is {@link #NVG_MITER MITER}.</p>
	 *
	 * @param ctx  the NanoVG context
	 * @param join the line join to set. One of:<br><table><tr><td>{@link #NVG_MITER MITER}</td><td>{@link #NVG_ROUND ROUND}</td><td>{@link #NVG_BEVEL BEVEL}</td></tr></table>
	 */
	public static void nvgLineJoin(long ctx, int join) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgLineJoin(ctx, join);
	}

	// --- [ nvgGlobalAlpha ] ---

	/**
	 * Sets the transparency applied to all rendered shapes.
	 * 
	 * <p>Already transparent paths will get proportionally more transparent as well.</p>
	 *
	 * @param ctx   the NanoVG context
	 * @param alpha the alpha value to set
	 */
	public static native void nnvgGlobalAlpha(long ctx, float alpha);

	/**
	 * Sets the transparency applied to all rendered shapes.
	 * 
	 * <p>Already transparent paths will get proportionally more transparent as well.</p>
	 *
	 * @param ctx   the NanoVG context
	 * @param alpha the alpha value to set
	 */
	public static void nvgGlobalAlpha(long ctx, float alpha) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgGlobalAlpha(ctx, alpha);
	}

	// --- [ nvgResetTransform ] ---

	/**
	 * Resets current transform to an identity matrix.
	 *
	 * @param ctx the NanoVG context
	 */
	public static native void nnvgResetTransform(long ctx);

	/**
	 * Resets current transform to an identity matrix.
	 *
	 * @param ctx the NanoVG context
	 */
	public static void nvgResetTransform(long ctx) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgResetTransform(ctx);
	}

	// --- [ nvgTransform ] ---

	/**
	 * Premultiplies current coordinate system by specified matrix. The parameters are interpreted as matrix as follows:
	 * 
	 * <pre><code>[a c e]
[b d f]
[0 0 1]</code></pre>
	 *
	 * @param ctx the NanoVG context
	 * @param a   the a value
	 * @param b   the b value
	 * @param c   the c value
	 * @param d   the d value
	 * @param e   the e value
	 * @param f   the f value
	 */
	public static native void nnvgTransform(long ctx, float a, float b, float c, float d, float e, float f);

	/**
	 * Premultiplies current coordinate system by specified matrix. The parameters are interpreted as matrix as follows:
	 * 
	 * <pre><code>[a c e]
[b d f]
[0 0 1]</code></pre>
	 *
	 * @param ctx the NanoVG context
	 * @param a   the a value
	 * @param b   the b value
	 * @param c   the c value
	 * @param d   the d value
	 * @param e   the e value
	 * @param f   the f value
	 */
	public static void nvgTransform(long ctx, float a, float b, float c, float d, float e, float f) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgTransform(ctx, a, b, c, d, e, f);
	}

	// --- [ nvgTranslate ] ---

	/**
	 * Translates current coordinate system.
	 *
	 * @param ctx the NanoVG context
	 * @param x   the X axis translation amount
	 * @param y   the Y axis translation amount
	 */
	public static native void nnvgTranslate(long ctx, float x, float y);

	/**
	 * Translates current coordinate system.
	 *
	 * @param ctx the NanoVG context
	 * @param x   the X axis translation amount
	 * @param y   the Y axis translation amount
	 */
	public static void nvgTranslate(long ctx, float x, float y) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgTranslate(ctx, x, y);
	}

	// --- [ nvgRotate ] ---

	/**
	 * Rotates current coordinate system.
	 *
	 * @param ctx   the NanoVG context
	 * @param angle the rotation angle, in radians
	 */
	public static native void nnvgRotate(long ctx, float angle);

	/**
	 * Rotates current coordinate system.
	 *
	 * @param ctx   the NanoVG context
	 * @param angle the rotation angle, in radians
	 */
	public static void nvgRotate(long ctx, float angle) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgRotate(ctx, angle);
	}

	// --- [ nvgSkewX ] ---

	/**
	 * Skews the current coordinate system along X axis.
	 *
	 * @param ctx   the NanoVG context
	 * @param angle the skew angle, in radians
	 */
	public static native void nnvgSkewX(long ctx, float angle);

	/**
	 * Skews the current coordinate system along X axis.
	 *
	 * @param ctx   the NanoVG context
	 * @param angle the skew angle, in radians
	 */
	public static void nvgSkewX(long ctx, float angle) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgSkewX(ctx, angle);
	}

	// --- [ nvgSkewY ] ---

	/**
	 * Skews the current coordinate system along Y axis.
	 *
	 * @param ctx   the NanoVG context
	 * @param angle the skew angle, in radians
	 */
	public static native void nnvgSkewY(long ctx, float angle);

	/**
	 * Skews the current coordinate system along Y axis.
	 *
	 * @param ctx   the NanoVG context
	 * @param angle the skew angle, in radians
	 */
	public static void nvgSkewY(long ctx, float angle) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgSkewY(ctx, angle);
	}

	// --- [ nvgScale ] ---

	/**
	 * Scales the current coordinate system.
	 *
	 * @param ctx the NanoVG context
	 * @param x   the X axis scale factor
	 * @param y   the Y axis scale factor
	 */
	public static native void nnvgScale(long ctx, float x, float y);

	/**
	 * Scales the current coordinate system.
	 *
	 * @param ctx the NanoVG context
	 * @param x   the X axis scale factor
	 * @param y   the Y axis scale factor
	 */
	public static void nvgScale(long ctx, float x, float y) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgScale(ctx, x, y);
	}

	// --- [ nvgCurrentTransform ] ---

	/**
	 * Stores the top part (a-f) of the current transformation matrix in to the specified buffer.
	 * 
	 * <pre><code>[a c e]
[b d f]
[0 0 1]</code></pre>
	 * 
	 * <p>There should be space for 6 floats in the return buffer for the values {@code a-f}.</p>
	 *
	 * @param ctx   the NanoVG context
	 * @param xform the destination buffer
	 */
	public static native void nnvgCurrentTransform(long ctx, long xform);

	/**
	 * Stores the top part (a-f) of the current transformation matrix in to the specified buffer.
	 * 
	 * <pre><code>[a c e]
[b d f]
[0 0 1]</code></pre>
	 * 
	 * <p>There should be space for 6 floats in the return buffer for the values {@code a-f}.</p>
	 *
	 * @param ctx   the NanoVG context
	 * @param xform the destination buffer
	 */
	public static void nvgCurrentTransform(long ctx, FloatBuffer xform) {
		if ( CHECKS ) {
			checkPointer(ctx);
			checkBuffer(xform, 6);
		}
		nnvgCurrentTransform(ctx, memAddress(xform));
	}

	// --- [ nvgTransformIdentity ] ---

	/**
	 * Sets the transform to identity matrix.
	 *
	 * @param dst the destination buffer
	 */
	public static native void nnvgTransformIdentity(long dst);

	/**
	 * Sets the transform to identity matrix.
	 *
	 * @param dst the destination buffer
	 */
	public static void nvgTransformIdentity(FloatBuffer dst) {
		if ( CHECKS )
			checkBuffer(dst, 6);
		nnvgTransformIdentity(memAddress(dst));
	}

	// --- [ nvgTransformTranslate ] ---

	/**
	 * Sets the transform to translation matrix matrix.
	 *
	 * @param dst the destination buffer
	 * @param tx  the X axis translation amount
	 * @param ty  the Y axis translation amount
	 */
	public static native void nnvgTransformTranslate(long dst, float tx, float ty);

	/**
	 * Sets the transform to translation matrix matrix.
	 *
	 * @param dst the destination buffer
	 * @param tx  the X axis translation amount
	 * @param ty  the Y axis translation amount
	 */
	public static void nvgTransformTranslate(FloatBuffer dst, float tx, float ty) {
		if ( CHECKS )
			checkBuffer(dst, 6);
		nnvgTransformTranslate(memAddress(dst), tx, ty);
	}

	// --- [ nvgTransformScale ] ---

	/**
	 * Sets the transform to scale matrix.
	 *
	 * @param dst the destination buffer
	 * @param sx  the X axis scale factor
	 * @param sy  the Y axis scale factor
	 */
	public static native void nnvgTransformScale(long dst, float sx, float sy);

	/**
	 * Sets the transform to scale matrix.
	 *
	 * @param dst the destination buffer
	 * @param sx  the X axis scale factor
	 * @param sy  the Y axis scale factor
	 */
	public static void nvgTransformScale(FloatBuffer dst, float sx, float sy) {
		if ( CHECKS )
			checkBuffer(dst, 6);
		nnvgTransformScale(memAddress(dst), sx, sy);
	}

	// --- [ nvgTransformRotate ] ---

	/**
	 * Sets the transform to rotate matrix.
	 *
	 * @param dst the destination buffer
	 * @param a   the rotation angle, in radians
	 */
	public static native void nnvgTransformRotate(long dst, float a);

	/**
	 * Sets the transform to rotate matrix.
	 *
	 * @param dst the destination buffer
	 * @param a   the rotation angle, in radians
	 */
	public static void nvgTransformRotate(FloatBuffer dst, float a) {
		if ( CHECKS )
			checkBuffer(dst, 6);
		nnvgTransformRotate(memAddress(dst), a);
	}

	// --- [ nvgTransformSkewX ] ---

	/**
	 * Sets the transform to skew-x matrix.
	 *
	 * @param dst the destination buffer
	 * @param a   the skew angle, in radians
	 */
	public static native void nnvgTransformSkewX(long dst, float a);

	/**
	 * Sets the transform to skew-x matrix.
	 *
	 * @param dst the destination buffer
	 * @param a   the skew angle, in radians
	 */
	public static void nvgTransformSkewX(FloatBuffer dst, float a) {
		if ( CHECKS )
			checkBuffer(dst, 6);
		nnvgTransformSkewX(memAddress(dst), a);
	}

	// --- [ nvgTransformSkewY ] ---

	/**
	 * Sets the transform to skew-y matrix.
	 *
	 * @param dst the destination buffer
	 * @param a   the skew angle, in radians
	 */
	public static native void nnvgTransformSkewY(long dst, float a);

	/**
	 * Sets the transform to skew-y matrix.
	 *
	 * @param dst the destination buffer
	 * @param a   the skew angle, in radians
	 */
	public static void nvgTransformSkewY(FloatBuffer dst, float a) {
		if ( CHECKS )
			checkBuffer(dst, 6);
		nnvgTransformSkewY(memAddress(dst), a);
	}

	// --- [ nvgTransformMultiply ] ---

	/**
	 * Sets the transform to the result of multiplication of two transforms, of {@code A = A*B}.
	 *
	 * @param dst the destination buffer
	 * @param src the {@code B} transformation matrix
	 */
	public static native void nnvgTransformMultiply(long dst, long src);

	/**
	 * Sets the transform to the result of multiplication of two transforms, of {@code A = A*B}.
	 *
	 * @param dst the destination buffer
	 * @param src the {@code B} transformation matrix
	 */
	public static void nvgTransformMultiply(FloatBuffer dst, FloatBuffer src) {
		if ( CHECKS ) {
			checkBuffer(dst, 6);
			checkBuffer(src, 6);
		}
		nnvgTransformMultiply(memAddress(dst), memAddress(src));
	}

	// --- [ nvgTransformPremultiply ] ---

	/**
	 * Sets the transform to the result of multiplication of two transforms, of {@code A = B*A}.
	 *
	 * @param dst the destination buffer
	 * @param src the {@code B} transformation matrix
	 */
	public static native void nnvgTransformPremultiply(long dst, long src);

	/**
	 * Sets the transform to the result of multiplication of two transforms, of {@code A = B*A}.
	 *
	 * @param dst the destination buffer
	 * @param src the {@code B} transformation matrix
	 */
	public static void nvgTransformPremultiply(FloatBuffer dst, FloatBuffer src) {
		if ( CHECKS ) {
			checkBuffer(dst, 6);
			checkBuffer(src, 6);
		}
		nnvgTransformPremultiply(memAddress(dst), memAddress(src));
	}

	// --- [ nvgTransformInverse ] ---

	/**
	 * Sets the destination to inverse of specified transform.
	 *
	 * @param dst the destination buffer
	 * @param src the transformation matrix to inverse
	 *
	 * @return 1 if the inverse could be calculated, else 0
	 */
	public static native int nnvgTransformInverse(long dst, long src);

	/**
	 * Sets the destination to inverse of specified transform.
	 *
	 * @param dst the destination buffer
	 * @param src the transformation matrix to inverse
	 *
	 * @return 1 if the inverse could be calculated, else 0
	 */
	public static int nvgTransformInverse(FloatBuffer dst, FloatBuffer src) {
		if ( CHECKS ) {
			checkBuffer(dst, 6);
			checkBuffer(src, 6);
		}
		return nnvgTransformInverse(memAddress(dst), memAddress(src));
	}

	// --- [ nvgTransformPoint ] ---

	/**
	 * Transform a point by given transform.
	 *
	 * @param dstx  returns the transformed X axis coordinate
	 * @param dsty  returns the transformed Y axis coordinate
	 * @param xform the transformation matrix
	 * @param srcx  the point X axis coordinate
	 * @param srcy  the point Y axis coordinate
	 */
	public static native void nnvgTransformPoint(long dstx, long dsty, long xform, float srcx, float srcy);

	/**
	 * Transform a point by given transform.
	 *
	 * @param dstx  returns the transformed X axis coordinate
	 * @param dsty  returns the transformed Y axis coordinate
	 * @param xform the transformation matrix
	 * @param srcx  the point X axis coordinate
	 * @param srcy  the point Y axis coordinate
	 */
	public static void nvgTransformPoint(FloatBuffer dstx, FloatBuffer dsty, FloatBuffer xform, float srcx, float srcy) {
		if ( CHECKS ) {
			checkBuffer(dstx, 1);
			checkBuffer(dsty, 1);
			checkBuffer(xform, 6);
		}
		nnvgTransformPoint(memAddress(dstx), memAddress(dsty), memAddress(xform), srcx, srcy);
	}

	// --- [ nvgDegToRad ] ---

	/**
	 * Converts degrees to radians.
	 *
	 * @param deg the rotation value, in degrees
	 */
	public static native float nvgDegToRad(float deg);

	// --- [ nvgRadToDeg ] ---

	/**
	 * Converts radians to degrees.
	 *
	 * @param rad the rotation value, in radians
	 */
	public static native float nvgRadToDeg(float rad);

	// --- [ nvgCreateImage ] ---

	/**
	 * Creates image by loading it from the disk from specified file name.
	 *
	 * @param ctx        the NanoVG context
	 * @param filename   the image file name
	 * @param imageFlags the image flags. One of:<br><table><tr><td>{@link #NVG_IMAGE_GENERATE_MIPMAPS IMAGE_GENERATE_MIPMAPS}</td><td>{@link #NVG_IMAGE_REPEATX IMAGE_REPEATX}</td><td>{@link #NVG_IMAGE_REPEATY IMAGE_REPEATY}</td><td>{@link #NVG_IMAGE_FLIPY IMAGE_FLIPY}</td><td>{@link #NVG_IMAGE_PREMULTIPLIED IMAGE_PREMULTIPLIED}</td></tr></table>
	 *
	 * @return a handle to the image
	 */
	public static native int nnvgCreateImage(long ctx, long filename, int imageFlags);

	/**
	 * Creates image by loading it from the disk from specified file name.
	 *
	 * @param ctx        the NanoVG context
	 * @param filename   the image file name
	 * @param imageFlags the image flags. One of:<br><table><tr><td>{@link #NVG_IMAGE_GENERATE_MIPMAPS IMAGE_GENERATE_MIPMAPS}</td><td>{@link #NVG_IMAGE_REPEATX IMAGE_REPEATX}</td><td>{@link #NVG_IMAGE_REPEATY IMAGE_REPEATY}</td><td>{@link #NVG_IMAGE_FLIPY IMAGE_FLIPY}</td><td>{@link #NVG_IMAGE_PREMULTIPLIED IMAGE_PREMULTIPLIED}</td></tr></table>
	 *
	 * @return a handle to the image
	 */
	public static int nvgCreateImage(long ctx, ByteBuffer filename, int imageFlags) {
		if ( CHECKS ) {
			checkPointer(ctx);
			checkNT1(filename);
		}
		return nnvgCreateImage(ctx, memAddress(filename), imageFlags);
	}

	/**
	 * Creates image by loading it from the disk from specified file name.
	 *
	 * @param ctx        the NanoVG context
	 * @param filename   the image file name
	 * @param imageFlags the image flags. One of:<br><table><tr><td>{@link #NVG_IMAGE_GENERATE_MIPMAPS IMAGE_GENERATE_MIPMAPS}</td><td>{@link #NVG_IMAGE_REPEATX IMAGE_REPEATX}</td><td>{@link #NVG_IMAGE_REPEATY IMAGE_REPEATY}</td><td>{@link #NVG_IMAGE_FLIPY IMAGE_FLIPY}</td><td>{@link #NVG_IMAGE_PREMULTIPLIED IMAGE_PREMULTIPLIED}</td></tr></table>
	 *
	 * @return a handle to the image
	 */
	public static int nvgCreateImage(long ctx, CharSequence filename, int imageFlags) {
		if ( CHECKS )
			checkPointer(ctx);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer filenameEncoded = stack.ASCII(filename);
			return nnvgCreateImage(ctx, memAddress(filenameEncoded), imageFlags);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nvgCreateImageMem ] ---

	/**
	 * Creates image by loading it from the specified chunk of memory.
	 *
	 * @param ctx        the NanoVG context
	 * @param imageFlags the image flags. One of:<br><table><tr><td>{@link #NVG_IMAGE_GENERATE_MIPMAPS IMAGE_GENERATE_MIPMAPS}</td><td>{@link #NVG_IMAGE_REPEATX IMAGE_REPEATX}</td><td>{@link #NVG_IMAGE_REPEATY IMAGE_REPEATY}</td><td>{@link #NVG_IMAGE_FLIPY IMAGE_FLIPY}</td><td>{@link #NVG_IMAGE_PREMULTIPLIED IMAGE_PREMULTIPLIED}</td></tr></table>
	 * @param data       the image data
	 * @param ndata      the image data size, in bytes
	 *
	 * @return a handle to the image
	 */
	public static native int nnvgCreateImageMem(long ctx, int imageFlags, long data, int ndata);

	/**
	 * Creates image by loading it from the specified chunk of memory.
	 *
	 * @param ctx        the NanoVG context
	 * @param imageFlags the image flags. One of:<br><table><tr><td>{@link #NVG_IMAGE_GENERATE_MIPMAPS IMAGE_GENERATE_MIPMAPS}</td><td>{@link #NVG_IMAGE_REPEATX IMAGE_REPEATX}</td><td>{@link #NVG_IMAGE_REPEATY IMAGE_REPEATY}</td><td>{@link #NVG_IMAGE_FLIPY IMAGE_FLIPY}</td><td>{@link #NVG_IMAGE_PREMULTIPLIED IMAGE_PREMULTIPLIED}</td></tr></table>
	 * @param data       the image data
	 *
	 * @return a handle to the image
	 */
	public static int nvgCreateImageMem(long ctx, int imageFlags, ByteBuffer data) {
		if ( CHECKS )
			checkPointer(ctx);
		return nnvgCreateImageMem(ctx, imageFlags, memAddress(data), data.remaining());
	}

	// --- [ nvgCreateImageRGBA ] ---

	/**
	 * Creates image from specified image data.
	 *
	 * @param ctx        the NanoVG context
	 * @param w          the image width
	 * @param h          the image height
	 * @param imageFlags the image flags. One of:<br><table><tr><td>{@link #NVG_IMAGE_GENERATE_MIPMAPS IMAGE_GENERATE_MIPMAPS}</td><td>{@link #NVG_IMAGE_REPEATX IMAGE_REPEATX}</td><td>{@link #NVG_IMAGE_REPEATY IMAGE_REPEATY}</td><td>{@link #NVG_IMAGE_FLIPY IMAGE_FLIPY}</td><td>{@link #NVG_IMAGE_PREMULTIPLIED IMAGE_PREMULTIPLIED}</td></tr></table>
	 * @param data       the image data
	 */
	public static native int nnvgCreateImageRGBA(long ctx, int w, int h, int imageFlags, long data);

	/**
	 * Creates image from specified image data.
	 *
	 * @param ctx        the NanoVG context
	 * @param w          the image width
	 * @param h          the image height
	 * @param imageFlags the image flags. One of:<br><table><tr><td>{@link #NVG_IMAGE_GENERATE_MIPMAPS IMAGE_GENERATE_MIPMAPS}</td><td>{@link #NVG_IMAGE_REPEATX IMAGE_REPEATX}</td><td>{@link #NVG_IMAGE_REPEATY IMAGE_REPEATY}</td><td>{@link #NVG_IMAGE_FLIPY IMAGE_FLIPY}</td><td>{@link #NVG_IMAGE_PREMULTIPLIED IMAGE_PREMULTIPLIED}</td></tr></table>
	 * @param data       the image data
	 */
	public static int nvgCreateImageRGBA(long ctx, int w, int h, int imageFlags, ByteBuffer data) {
		if ( CHECKS ) {
			checkPointer(ctx);
			checkBuffer(data, w * h * 4);
		}
		return nnvgCreateImageRGBA(ctx, w, h, imageFlags, memAddress(data));
	}

	// --- [ nvgUpdateImage ] ---

	/**
	 * Updates image data specified by image handle.
	 *
	 * @param ctx   the NanoVG context
	 * @param image the image handle
	 * @param data  the image data
	 */
	public static native void nnvgUpdateImage(long ctx, int image, long data);

	/**
	 * Updates image data specified by image handle.
	 *
	 * @param ctx   the NanoVG context
	 * @param image the image handle
	 * @param data  the image data
	 */
	public static void nvgUpdateImage(long ctx, int image, ByteBuffer data) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgUpdateImage(ctx, image, memAddress(data));
	}

	// --- [ nvgImageSize ] ---

	/**
	 * Returns the dimensions of a created image.
	 *
	 * @param ctx   the NanoVG context
	 * @param image the image handle
	 * @param w     returns the image width
	 * @param h     returns the image height
	 */
	public static native void nnvgImageSize(long ctx, int image, long w, long h);

	/**
	 * Returns the dimensions of a created image.
	 *
	 * @param ctx   the NanoVG context
	 * @param image the image handle
	 * @param w     returns the image width
	 * @param h     returns the image height
	 */
	public static void nvgImageSize(long ctx, int image, IntBuffer w, IntBuffer h) {
		if ( CHECKS ) {
			checkPointer(ctx);
			checkBuffer(w, 1);
			checkBuffer(h, 1);
		}
		nnvgImageSize(ctx, image, memAddress(w), memAddress(h));
	}

	// --- [ nvgDeleteImage ] ---

	/**
	 * Deletes created image.
	 *
	 * @param ctx   the NanoVG context
	 * @param image the image handle to delete
	 */
	public static native void nnvgDeleteImage(long ctx, int image);

	/**
	 * Deletes created image.
	 *
	 * @param ctx   the NanoVG context
	 * @param image the image handle to delete
	 */
	public static void nvgDeleteImage(long ctx, int image) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgDeleteImage(ctx, image);
	}

	// --- [ nvgLinearGradient ] ---

	/**
	 * Creates and returns a linear gradient.
	 * 
	 * <p>The gradient is transformed by the current transform when it is passed to {@link #nvgFillPaint FillPaint} or {@link #nvgStrokePaint StrokePaint}.</p>
	 *
	 * @param ctx  the NanoVG context
	 * @param sx   the X axis start coordinate
	 * @param sy   the Y axis start coordinate
	 * @param ex   the X axis end coordinate
	 * @param ey   the Y axis end coordinate
	 * @param icol the start color
	 * @param ocol the end color
	 */
	public static native void nnvgLinearGradient(long ctx, float sx, float sy, float ex, float ey, long icol, long ocol, long __result);

	/**
	 * Creates and returns a linear gradient.
	 * 
	 * <p>The gradient is transformed by the current transform when it is passed to {@link #nvgFillPaint FillPaint} or {@link #nvgStrokePaint StrokePaint}.</p>
	 *
	 * @param ctx  the NanoVG context
	 * @param sx   the X axis start coordinate
	 * @param sy   the Y axis start coordinate
	 * @param ex   the X axis end coordinate
	 * @param ey   the Y axis end coordinate
	 * @param icol the start color
	 * @param ocol the end color
	 */
	public static NVGPaint nvgLinearGradient(long ctx, float sx, float sy, float ex, float ey, NVGColor icol, NVGColor ocol, NVGPaint __result) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgLinearGradient(ctx, sx, sy, ex, ey, icol.address(), ocol.address(), __result.address());
		return __result;
	}

	// --- [ nvgBoxGradient ] ---

	/**
	 * Creates and returns a box gradient. Box gradient is a feathered rounded rectangle, it is useful for rendering drop shadows or highlights for boxes.
	 * 
	 * <p>The gradient is transformed by the current transform when it is passed to {@link #nvgFillPaint FillPaint} or {@link #nvgStrokePaint StrokePaint}.</p>
	 *
	 * @param ctx  the NanoVG context
	 * @param x    the rectangle left coordinate
	 * @param y    the rectangle top coordinate
	 * @param w    the rectangle width
	 * @param h    the rectangle height
	 * @param r    the corner radius
	 * @param f    the feather value. Feather defines how blurry the border of the rectangle is.
	 * @param icol the inner color
	 * @param ocol the outer color
	 */
	public static native void nnvgBoxGradient(long ctx, float x, float y, float w, float h, float r, float f, long icol, long ocol, long __result);

	/**
	 * Creates and returns a box gradient. Box gradient is a feathered rounded rectangle, it is useful for rendering drop shadows or highlights for boxes.
	 * 
	 * <p>The gradient is transformed by the current transform when it is passed to {@link #nvgFillPaint FillPaint} or {@link #nvgStrokePaint StrokePaint}.</p>
	 *
	 * @param ctx  the NanoVG context
	 * @param x    the rectangle left coordinate
	 * @param y    the rectangle top coordinate
	 * @param w    the rectangle width
	 * @param h    the rectangle height
	 * @param r    the corner radius
	 * @param f    the feather value. Feather defines how blurry the border of the rectangle is.
	 * @param icol the inner color
	 * @param ocol the outer color
	 */
	public static NVGPaint nvgBoxGradient(long ctx, float x, float y, float w, float h, float r, float f, NVGColor icol, NVGColor ocol, NVGPaint __result) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgBoxGradient(ctx, x, y, w, h, r, f, icol.address(), ocol.address(), __result.address());
		return __result;
	}

	// --- [ nvgRadialGradient ] ---

	/**
	 * Creates and returns a radial gradient.
	 * 
	 * <p>The gradient is transformed by the current transform when it is passed to {@link #nvgFillPaint FillPaint} or {@link #nvgStrokePaint StrokePaint}.</p>
	 *
	 * @param ctx  the NanoVG context
	 * @param cx   the X axis center coordinate
	 * @param cy   the Y axis center coordinate
	 * @param inr  the inner radius
	 * @param outr the outer radius
	 * @param icol the start color
	 * @param ocol the end color
	 */
	public static native void nnvgRadialGradient(long ctx, float cx, float cy, float inr, float outr, long icol, long ocol, long __result);

	/**
	 * Creates and returns a radial gradient.
	 * 
	 * <p>The gradient is transformed by the current transform when it is passed to {@link #nvgFillPaint FillPaint} or {@link #nvgStrokePaint StrokePaint}.</p>
	 *
	 * @param ctx  the NanoVG context
	 * @param cx   the X axis center coordinate
	 * @param cy   the Y axis center coordinate
	 * @param inr  the inner radius
	 * @param outr the outer radius
	 * @param icol the start color
	 * @param ocol the end color
	 */
	public static NVGPaint nvgRadialGradient(long ctx, float cx, float cy, float inr, float outr, NVGColor icol, NVGColor ocol, NVGPaint __result) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgRadialGradient(ctx, cx, cy, inr, outr, icol.address(), ocol.address(), __result.address());
		return __result;
	}

	// --- [ nvgImagePattern ] ---

	/**
	 * Creates and returns an image patter.
	 * 
	 * <p>The gradient is transformed by the current transform when it is passed to {@link #nvgFillPaint FillPaint} or {@link #nvgStrokePaint StrokePaint}.</p>
	 *
	 * @param ctx   the NanoVG context
	 * @param ox    the image pattern left coordinate
	 * @param oy    the image pattern top coordinate
	 * @param ex    the image width
	 * @param ey    the image height
	 * @param angle the rotation angle around the top-left corner
	 * @param image the image to render
	 * @param alpha the alpha value
	 */
	public static native void nnvgImagePattern(long ctx, float ox, float oy, float ex, float ey, float angle, int image, float alpha, long __result);

	/**
	 * Creates and returns an image patter.
	 * 
	 * <p>The gradient is transformed by the current transform when it is passed to {@link #nvgFillPaint FillPaint} or {@link #nvgStrokePaint StrokePaint}.</p>
	 *
	 * @param ctx   the NanoVG context
	 * @param ox    the image pattern left coordinate
	 * @param oy    the image pattern top coordinate
	 * @param ex    the image width
	 * @param ey    the image height
	 * @param angle the rotation angle around the top-left corner
	 * @param image the image to render
	 * @param alpha the alpha value
	 */
	public static NVGPaint nvgImagePattern(long ctx, float ox, float oy, float ex, float ey, float angle, int image, float alpha, NVGPaint __result) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgImagePattern(ctx, ox, oy, ex, ey, angle, image, alpha, __result.address());
		return __result;
	}

	// --- [ nvgScissor ] ---

	/**
	 * Sets the current scissor rectangle.
	 * 
	 * <p>The scissor rectangle is transformed by the current transform.</p>
	 *
	 * @param ctx the NanoVG context
	 * @param x   the rectangle X axis coordinate
	 * @param y   the rectangle Y axis coordinate
	 * @param w   the rectangle width
	 * @param h   the rectangle height
	 */
	public static native void nnvgScissor(long ctx, float x, float y, float w, float h);

	/**
	 * Sets the current scissor rectangle.
	 * 
	 * <p>The scissor rectangle is transformed by the current transform.</p>
	 *
	 * @param ctx the NanoVG context
	 * @param x   the rectangle X axis coordinate
	 * @param y   the rectangle Y axis coordinate
	 * @param w   the rectangle width
	 * @param h   the rectangle height
	 */
	public static void nvgScissor(long ctx, float x, float y, float w, float h) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgScissor(ctx, x, y, w, h);
	}

	// --- [ nvgIntersectScissor ] ---

	/**
	 * Intersects current scissor rectangle with the specified rectangle.
	 * 
	 * <p>The scissor rectangle is transformed by the current transform.</p>
	 * 
	 * <p>Note: in case the rotation of previous scissor rect differs from the current one, the intersection will be done between the specified rectangle and the
	 * previous scissor rectangle transformed in the current transform space. The resulting shape is always rectangle.</p>
	 *
	 * @param ctx the NanoVG context
	 * @param x   the rectangle X axis coordinate
	 * @param y   the rectangle Y axis coordinate
	 * @param w   the rectangle width
	 * @param h   the rectangle height
	 */
	public static native void nnvgIntersectScissor(long ctx, float x, float y, float w, float h);

	/**
	 * Intersects current scissor rectangle with the specified rectangle.
	 * 
	 * <p>The scissor rectangle is transformed by the current transform.</p>
	 * 
	 * <p>Note: in case the rotation of previous scissor rect differs from the current one, the intersection will be done between the specified rectangle and the
	 * previous scissor rectangle transformed in the current transform space. The resulting shape is always rectangle.</p>
	 *
	 * @param ctx the NanoVG context
	 * @param x   the rectangle X axis coordinate
	 * @param y   the rectangle Y axis coordinate
	 * @param w   the rectangle width
	 * @param h   the rectangle height
	 */
	public static void nvgIntersectScissor(long ctx, float x, float y, float w, float h) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgIntersectScissor(ctx, x, y, w, h);
	}

	// --- [ nvgResetScissor ] ---

	/**
	 * Resets and disables scissoring.
	 *
	 * @param ctx the NanoVG context
	 */
	public static native void nnvgResetScissor(long ctx);

	/**
	 * Resets and disables scissoring.
	 *
	 * @param ctx the NanoVG context
	 */
	public static void nvgResetScissor(long ctx) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgResetScissor(ctx);
	}

	// --- [ nvgBeginPath ] ---

	/**
	 * Clears the current path and sub-paths.
	 *
	 * @param ctx the NanoVG context
	 */
	public static native void nnvgBeginPath(long ctx);

	/**
	 * Clears the current path and sub-paths.
	 *
	 * @param ctx the NanoVG context
	 */
	public static void nvgBeginPath(long ctx) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgBeginPath(ctx);
	}

	// --- [ nvgMoveTo ] ---

	/**
	 * Starts new sub-path with specified point as first point.
	 *
	 * @param ctx the NanoVG context
	 * @param x   the point X axis coordinate
	 * @param y   the point Y axis coordinate
	 */
	public static native void nnvgMoveTo(long ctx, float x, float y);

	/**
	 * Starts new sub-path with specified point as first point.
	 *
	 * @param ctx the NanoVG context
	 * @param x   the point X axis coordinate
	 * @param y   the point Y axis coordinate
	 */
	public static void nvgMoveTo(long ctx, float x, float y) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgMoveTo(ctx, x, y);
	}

	// --- [ nvgLineTo ] ---

	/**
	 * Adds line segment from the last point in the path to the specified point.
	 *
	 * @param ctx the NanoVG context
	 * @param x   the point X axis coordinate
	 * @param y   the point Y axis coordinate
	 */
	public static native void nnvgLineTo(long ctx, float x, float y);

	/**
	 * Adds line segment from the last point in the path to the specified point.
	 *
	 * @param ctx the NanoVG context
	 * @param x   the point X axis coordinate
	 * @param y   the point Y axis coordinate
	 */
	public static void nvgLineTo(long ctx, float x, float y) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgLineTo(ctx, x, y);
	}

	// --- [ nvgBezierTo ] ---

	/**
	 * Adds cubic bezier segment from last point in the path via two control points to the specified point.
	 *
	 * @param ctx the NanoVG context
	 * @param c1x the first control point X axis coordinate
	 * @param c1y the first control point Y axis coordinate
	 * @param c2x the second control point X axis coordinate
	 * @param c2y the second control point Y axis coordinate
	 * @param x   the point X axis coordinate
	 * @param y   the point Y axis coordinate
	 */
	public static native void nnvgBezierTo(long ctx, float c1x, float c1y, float c2x, float c2y, float x, float y);

	/**
	 * Adds cubic bezier segment from last point in the path via two control points to the specified point.
	 *
	 * @param ctx the NanoVG context
	 * @param c1x the first control point X axis coordinate
	 * @param c1y the first control point Y axis coordinate
	 * @param c2x the second control point X axis coordinate
	 * @param c2y the second control point Y axis coordinate
	 * @param x   the point X axis coordinate
	 * @param y   the point Y axis coordinate
	 */
	public static void nvgBezierTo(long ctx, float c1x, float c1y, float c2x, float c2y, float x, float y) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgBezierTo(ctx, c1x, c1y, c2x, c2y, x, y);
	}

	// --- [ nvgQuadTo ] ---

	/**
	 * Adds quadratic bezier segment from last point in the path via a control point to the specified point.
	 *
	 * @param ctx the NanoVG context
	 * @param cx  the control point X axis coordinate
	 * @param cy  the control point Y axis coordinate
	 * @param x   the point X axis coordinate
	 * @param y   the point Y axis coordinate
	 */
	public static native void nnvgQuadTo(long ctx, float cx, float cy, float x, float y);

	/**
	 * Adds quadratic bezier segment from last point in the path via a control point to the specified point.
	 *
	 * @param ctx the NanoVG context
	 * @param cx  the control point X axis coordinate
	 * @param cy  the control point Y axis coordinate
	 * @param x   the point X axis coordinate
	 * @param y   the point Y axis coordinate
	 */
	public static void nvgQuadTo(long ctx, float cx, float cy, float x, float y) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgQuadTo(ctx, cx, cy, x, y);
	}

	// --- [ nvgArcTo ] ---

	/**
	 * Adds an arc segment at the corner defined by the last path point, and two specified points.
	 *
	 * @param ctx    the NanoVG context
	 * @param x1     the first point X axis coordinate
	 * @param y1     the first point Y axis coordinate
	 * @param x2     the second point X axis coordinate
	 * @param y2     the second point Y axis coordinate
	 * @param radius the arc radius, in radians
	 */
	public static native void nnvgArcTo(long ctx, float x1, float y1, float x2, float y2, float radius);

	/**
	 * Adds an arc segment at the corner defined by the last path point, and two specified points.
	 *
	 * @param ctx    the NanoVG context
	 * @param x1     the first point X axis coordinate
	 * @param y1     the first point Y axis coordinate
	 * @param x2     the second point X axis coordinate
	 * @param y2     the second point Y axis coordinate
	 * @param radius the arc radius, in radians
	 */
	public static void nvgArcTo(long ctx, float x1, float y1, float x2, float y2, float radius) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgArcTo(ctx, x1, y1, x2, y2, radius);
	}

	// --- [ nvgClosePath ] ---

	/**
	 * Closes current sub-path with a line segment.
	 *
	 * @param ctx the NanoVG context
	 */
	public static native void nnvgClosePath(long ctx);

	/**
	 * Closes current sub-path with a line segment.
	 *
	 * @param ctx the NanoVG context
	 */
	public static void nvgClosePath(long ctx) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgClosePath(ctx);
	}

	// --- [ nvgPathWinding ] ---

	/**
	 * Sets the current sub-path winding.
	 *
	 * @param ctx the NanoVG context
	 * @param dir the sub-path winding. One of:<br><table><tr><td>{@link #NVG_CCW CCW}</td><td>{@link #NVG_CW CW}</td></tr></table>
	 */
	public static native void nnvgPathWinding(long ctx, int dir);

	/**
	 * Sets the current sub-path winding.
	 *
	 * @param ctx the NanoVG context
	 * @param dir the sub-path winding. One of:<br><table><tr><td>{@link #NVG_CCW CCW}</td><td>{@link #NVG_CW CW}</td></tr></table>
	 */
	public static void nvgPathWinding(long ctx, int dir) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgPathWinding(ctx, dir);
	}

	// --- [ nvgArc ] ---

	/**
	 * Creates new circle arc shaped sub-path.
	 *
	 * @param ctx the NanoVG context
	 * @param cx  the arc center X axis coordinate
	 * @param cy  the arc center Y axis coordinate
	 * @param r   the arc radius
	 * @param a0  the arc starting angle, in radians
	 * @param a1  the arc ending angle, in radians
	 * @param dir the arc direction. One of:<br><table><tr><td>{@link #NVG_CCW CCW}</td><td>{@link #NVG_CW CW}</td></tr></table>
	 */
	public static native void nnvgArc(long ctx, float cx, float cy, float r, float a0, float a1, int dir);

	/**
	 * Creates new circle arc shaped sub-path.
	 *
	 * @param ctx the NanoVG context
	 * @param cx  the arc center X axis coordinate
	 * @param cy  the arc center Y axis coordinate
	 * @param r   the arc radius
	 * @param a0  the arc starting angle, in radians
	 * @param a1  the arc ending angle, in radians
	 * @param dir the arc direction. One of:<br><table><tr><td>{@link #NVG_CCW CCW}</td><td>{@link #NVG_CW CW}</td></tr></table>
	 */
	public static void nvgArc(long ctx, float cx, float cy, float r, float a0, float a1, int dir) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgArc(ctx, cx, cy, r, a0, a1, dir);
	}

	// --- [ nvgRect ] ---

	/**
	 * Creates new rectangle shaped sub-path.
	 *
	 * @param ctx the NanoVG context
	 * @param x   the rectangle X axis coordinate
	 * @param y   the rectangle Y axis coordinate
	 * @param w   the rectangle width
	 * @param h   the rectangle height
	 */
	public static native void nnvgRect(long ctx, float x, float y, float w, float h);

	/**
	 * Creates new rectangle shaped sub-path.
	 *
	 * @param ctx the NanoVG context
	 * @param x   the rectangle X axis coordinate
	 * @param y   the rectangle Y axis coordinate
	 * @param w   the rectangle width
	 * @param h   the rectangle height
	 */
	public static void nvgRect(long ctx, float x, float y, float w, float h) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgRect(ctx, x, y, w, h);
	}

	// --- [ nvgRoundedRect ] ---

	/**
	 * Creates new rounded rectangle shaped sub-path.
	 *
	 * @param ctx the NanoVG context
	 * @param x   the rectangle X axis coordinate
	 * @param y   the rectangle Y axis coordinate
	 * @param w   the rectangle width
	 * @param h   the rectangle height
	 * @param r   the corner radius
	 */
	public static native void nnvgRoundedRect(long ctx, float x, float y, float w, float h, float r);

	/**
	 * Creates new rounded rectangle shaped sub-path.
	 *
	 * @param ctx the NanoVG context
	 * @param x   the rectangle X axis coordinate
	 * @param y   the rectangle Y axis coordinate
	 * @param w   the rectangle width
	 * @param h   the rectangle height
	 * @param r   the corner radius
	 */
	public static void nvgRoundedRect(long ctx, float x, float y, float w, float h, float r) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgRoundedRect(ctx, x, y, w, h, r);
	}

	// --- [ nvgEllipse ] ---

	/**
	 * Creates new ellipse shaped sub-path.
	 *
	 * @param ctx the NanoVG context
	 * @param cx  the ellipse center X axis coordinate
	 * @param cy  the ellipse center Y axis coordinate
	 * @param rx  the ellipse X axis radius
	 * @param ry  the ellipse Y axis radius
	 */
	public static native void nnvgEllipse(long ctx, float cx, float cy, float rx, float ry);

	/**
	 * Creates new ellipse shaped sub-path.
	 *
	 * @param ctx the NanoVG context
	 * @param cx  the ellipse center X axis coordinate
	 * @param cy  the ellipse center Y axis coordinate
	 * @param rx  the ellipse X axis radius
	 * @param ry  the ellipse Y axis radius
	 */
	public static void nvgEllipse(long ctx, float cx, float cy, float rx, float ry) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgEllipse(ctx, cx, cy, rx, ry);
	}

	// --- [ nvgCircle ] ---

	/**
	 * Creates new circle shaped sub-path.
	 *
	 * @param ctx the NanoVG context
	 * @param cx  the circle center X axis coordinate
	 * @param cy  the circle center Y axis coordinate
	 * @param r   the circle radius
	 */
	public static native void nnvgCircle(long ctx, float cx, float cy, float r);

	/**
	 * Creates new circle shaped sub-path.
	 *
	 * @param ctx the NanoVG context
	 * @param cx  the circle center X axis coordinate
	 * @param cy  the circle center Y axis coordinate
	 * @param r   the circle radius
	 */
	public static void nvgCircle(long ctx, float cx, float cy, float r) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgCircle(ctx, cx, cy, r);
	}

	// --- [ nvgFill ] ---

	/**
	 * Fills the current path with current fill style.
	 *
	 * @param ctx the NanoVG context
	 */
	public static native void nnvgFill(long ctx);

	/**
	 * Fills the current path with current fill style.
	 *
	 * @param ctx the NanoVG context
	 */
	public static void nvgFill(long ctx) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgFill(ctx);
	}

	// --- [ nvgStroke ] ---

	/**
	 * Fills the current path with current stroke style.
	 *
	 * @param ctx the NanoVG context
	 */
	public static native void nnvgStroke(long ctx);

	/**
	 * Fills the current path with current stroke style.
	 *
	 * @param ctx the NanoVG context
	 */
	public static void nvgStroke(long ctx) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgStroke(ctx);
	}

	// --- [ nvgCreateFont ] ---

	/**
	 * Creates font by loading it from the disk from specified file name.
	 *
	 * @param ctx      the NanoVG context
	 * @param name     the font name
	 * @param filename the font file name
	 *
	 * @return a handle to the font
	 */
	public static native int nnvgCreateFont(long ctx, long name, long filename);

	/**
	 * Creates font by loading it from the disk from specified file name.
	 *
	 * @param ctx      the NanoVG context
	 * @param name     the font name
	 * @param filename the font file name
	 *
	 * @return a handle to the font
	 */
	public static int nvgCreateFont(long ctx, ByteBuffer name, ByteBuffer filename) {
		if ( CHECKS ) {
			checkPointer(ctx);
			checkNT1(name);
			checkNT1(filename);
		}
		return nnvgCreateFont(ctx, memAddress(name), memAddress(filename));
	}

	/**
	 * Creates font by loading it from the disk from specified file name.
	 *
	 * @param ctx      the NanoVG context
	 * @param name     the font name
	 * @param filename the font file name
	 *
	 * @return a handle to the font
	 */
	public static int nvgCreateFont(long ctx, CharSequence name, CharSequence filename) {
		if ( CHECKS )
			checkPointer(ctx);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.ASCII(name);
			ByteBuffer filenameEncoded = stack.ASCII(filename);
			return nnvgCreateFont(ctx, memAddress(nameEncoded), memAddress(filenameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nvgCreateFontMem ] ---

	/**
	 * Creates font by loading it from the specified memory chunk.
	 * 
	 * <p>The memory chunk must remain valid for as long as the font is used by NanoVG.</p>
	 *
	 * @param ctx      the NanoVG context
	 * @param name     the font name
	 * @param data     the font data
	 * @param ndata    the font data size, in bytes
	 * @param freeData 1 if the font data should be freed automatically, 0 otherwise
	 */
	public static native int nnvgCreateFontMem(long ctx, long name, long data, int ndata, int freeData);

	/**
	 * Creates font by loading it from the specified memory chunk.
	 * 
	 * <p>The memory chunk must remain valid for as long as the font is used by NanoVG.</p>
	 *
	 * @param ctx      the NanoVG context
	 * @param name     the font name
	 * @param data     the font data
	 * @param freeData 1 if the font data should be freed automatically, 0 otherwise
	 */
	public static int nvgCreateFontMem(long ctx, ByteBuffer name, ByteBuffer data, int freeData) {
		if ( CHECKS ) {
			checkPointer(ctx);
			checkNT1(name);
		}
		return nnvgCreateFontMem(ctx, memAddress(name), memAddress(data), data.remaining(), freeData);
	}

	/**
	 * Creates font by loading it from the specified memory chunk.
	 * 
	 * <p>The memory chunk must remain valid for as long as the font is used by NanoVG.</p>
	 *
	 * @param ctx      the NanoVG context
	 * @param name     the font name
	 * @param data     the font data
	 * @param freeData 1 if the font data should be freed automatically, 0 otherwise
	 */
	public static int nvgCreateFontMem(long ctx, CharSequence name, ByteBuffer data, int freeData) {
		if ( CHECKS )
			checkPointer(ctx);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.ASCII(name);
			return nnvgCreateFontMem(ctx, memAddress(nameEncoded), memAddress(data), data.remaining(), freeData);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nvgFindFont ] ---

	/**
	 * Finds a loaded font of specified name, and returns handle to it, or -1 if the font is not found.
	 *
	 * @param ctx  the NanoVG context
	 * @param name the font name
	 */
	public static native int nnvgFindFont(long ctx, long name);

	/**
	 * Finds a loaded font of specified name, and returns handle to it, or -1 if the font is not found.
	 *
	 * @param ctx  the NanoVG context
	 * @param name the font name
	 */
	public static int nvgFindFont(long ctx, ByteBuffer name) {
		if ( CHECKS ) {
			checkPointer(ctx);
			checkNT1(name);
		}
		return nnvgFindFont(ctx, memAddress(name));
	}

	/**
	 * Finds a loaded font of specified name, and returns handle to it, or -1 if the font is not found.
	 *
	 * @param ctx  the NanoVG context
	 * @param name the font name
	 */
	public static int nvgFindFont(long ctx, CharSequence name) {
		if ( CHECKS )
			checkPointer(ctx);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer nameEncoded = stack.ASCII(name);
			return nnvgFindFont(ctx, memAddress(nameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nvgFontSize ] ---

	/**
	 * Sets the font size of current text style.
	 *
	 * @param ctx  the NanoVG context
	 * @param size the font size to set
	 */
	public static native void nnvgFontSize(long ctx, float size);

	/**
	 * Sets the font size of current text style.
	 *
	 * @param ctx  the NanoVG context
	 * @param size the font size to set
	 */
	public static void nvgFontSize(long ctx, float size) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgFontSize(ctx, size);
	}

	// --- [ nvgFontBlur ] ---

	/**
	 * Sets the blur of current text style.
	 *
	 * @param ctx  the NanoVG context
	 * @param blur the blur amount to set
	 */
	public static native void nnvgFontBlur(long ctx, float blur);

	/**
	 * Sets the blur of current text style.
	 *
	 * @param ctx  the NanoVG context
	 * @param blur the blur amount to set
	 */
	public static void nvgFontBlur(long ctx, float blur) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgFontBlur(ctx, blur);
	}

	// --- [ nvgTextLetterSpacing ] ---

	/**
	 * Sets the letter spacing of current text style.
	 *
	 * @param ctx     the NanoVG context
	 * @param spacing the letter spacing amount to set
	 */
	public static native void nnvgTextLetterSpacing(long ctx, float spacing);

	/**
	 * Sets the letter spacing of current text style.
	 *
	 * @param ctx     the NanoVG context
	 * @param spacing the letter spacing amount to set
	 */
	public static void nvgTextLetterSpacing(long ctx, float spacing) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgTextLetterSpacing(ctx, spacing);
	}

	// --- [ nvgTextLineHeight ] ---

	/**
	 * Sets the proportional line height of current text style. The line height is specified as multiple of font size.
	 *
	 * @param ctx        the NanoVG context
	 * @param lineHeight the line height to set
	 */
	public static native void nnvgTextLineHeight(long ctx, float lineHeight);

	/**
	 * Sets the proportional line height of current text style. The line height is specified as multiple of font size.
	 *
	 * @param ctx        the NanoVG context
	 * @param lineHeight the line height to set
	 */
	public static void nvgTextLineHeight(long ctx, float lineHeight) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgTextLineHeight(ctx, lineHeight);
	}

	// --- [ nvgTextAlign ] ---

	/**
	 * Sets the text align of current text style.
	 *
	 * @param ctx   the NanoVG context
	 * @param align the text align to set. One of:<br><table><tr><td>{@link #NVG_ALIGN_LEFT ALIGN_LEFT}</td><td>{@link #NVG_ALIGN_CENTER ALIGN_CENTER}</td><td>{@link #NVG_ALIGN_RIGHT ALIGN_RIGHT}</td><td>{@link #NVG_ALIGN_TOP ALIGN_TOP}</td><td>{@link #NVG_ALIGN_MIDDLE ALIGN_MIDDLE}</td><td>{@link #NVG_ALIGN_BOTTOM ALIGN_BOTTOM}</td><td>{@link #NVG_ALIGN_BASELINE ALIGN_BASELINE}</td></tr></table>
	 */
	public static native void nnvgTextAlign(long ctx, int align);

	/**
	 * Sets the text align of current text style.
	 *
	 * @param ctx   the NanoVG context
	 * @param align the text align to set. One of:<br><table><tr><td>{@link #NVG_ALIGN_LEFT ALIGN_LEFT}</td><td>{@link #NVG_ALIGN_CENTER ALIGN_CENTER}</td><td>{@link #NVG_ALIGN_RIGHT ALIGN_RIGHT}</td><td>{@link #NVG_ALIGN_TOP ALIGN_TOP}</td><td>{@link #NVG_ALIGN_MIDDLE ALIGN_MIDDLE}</td><td>{@link #NVG_ALIGN_BOTTOM ALIGN_BOTTOM}</td><td>{@link #NVG_ALIGN_BASELINE ALIGN_BASELINE}</td></tr></table>
	 */
	public static void nvgTextAlign(long ctx, int align) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgTextAlign(ctx, align);
	}

	// --- [ nvgFontFaceId ] ---

	/**
	 * Sets the font face based on specified id of current text style.
	 *
	 * @param ctx  the NanoVG context
	 * @param font the font id
	 */
	public static native void nnvgFontFaceId(long ctx, int font);

	/**
	 * Sets the font face based on specified id of current text style.
	 *
	 * @param ctx  the NanoVG context
	 * @param font the font id
	 */
	public static void nvgFontFaceId(long ctx, int font) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgFontFaceId(ctx, font);
	}

	// --- [ nvgFontFace ] ---

	/**
	 * Sets the font face based on specified name of current text style.
	 *
	 * @param ctx  the NanoVG context
	 * @param font the font name
	 */
	public static native void nnvgFontFace(long ctx, long font);

	/**
	 * Sets the font face based on specified name of current text style.
	 *
	 * @param ctx  the NanoVG context
	 * @param font the font name
	 */
	public static void nvgFontFace(long ctx, ByteBuffer font) {
		if ( CHECKS ) {
			checkPointer(ctx);
			checkNT1(font);
		}
		nnvgFontFace(ctx, memAddress(font));
	}

	/**
	 * Sets the font face based on specified name of current text style.
	 *
	 * @param ctx  the NanoVG context
	 * @param font the font name
	 */
	public static void nvgFontFace(long ctx, CharSequence font) {
		if ( CHECKS )
			checkPointer(ctx);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer fontEncoded = stack.ASCII(font);
			nnvgFontFace(ctx, memAddress(fontEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nvgText ] ---

	/**
	 * Draws text string at specified location. If {@code end} is specified only the sub-string up to the {@code end} is drawn.
	 *
	 * @param ctx    the NanoVG context
	 * @param x      the text X axis coordinate
	 * @param y      the text Y axis coordinate
	 * @param string the text string to draw
	 * @param end    a pointer to the end of the sub-string to draw, or {@code NULL}
	 */
	public static native float nnvgText(long ctx, float x, float y, long string, long end);

	/**
	 * Draws text string at specified location. If {@code end} is specified only the sub-string up to the {@code end} is drawn.
	 *
	 * @param ctx    the NanoVG context
	 * @param x      the text X axis coordinate
	 * @param y      the text Y axis coordinate
	 * @param string the text string to draw
	 * @param end    a pointer to the end of the sub-string to draw, or {@code NULL}
	 */
	public static float nvgText(long ctx, float x, float y, ByteBuffer string, long end) {
		if ( CHECKS ) {
			checkPointer(ctx);
			checkNT1(string);
		}
		return nnvgText(ctx, x, y, memAddress(string), end);
	}

	/**
	 * Draws text string at specified location. If {@code end} is specified only the sub-string up to the {@code end} is drawn.
	 *
	 * @param ctx    the NanoVG context
	 * @param x      the text X axis coordinate
	 * @param y      the text Y axis coordinate
	 * @param string the text string to draw
	 * @param end    a pointer to the end of the sub-string to draw, or {@code NULL}
	 */
	public static float nvgText(long ctx, float x, float y, CharSequence string, long end) {
		if ( CHECKS )
			checkPointer(ctx);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer stringEncoded = stack.UTF8(string);
			return nnvgText(ctx, x, y, memAddress(stringEncoded), end);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nvgTextBox ] ---

	/**
	 * Draws multi-line text string at specified location wrapped at the specified width. If {@code end} is specified only the sub-string up to the
	 * {@code end} is drawn.
	 * 
	 * <p>White space is stripped at the beginning of the rows, the text is split at word boundaries or when new-line characters are encountered. Words longer
	 * than the max width are slit at nearest character (i.e. no hyphenation).</p>
	 *
	 * @param ctx           the NanoVG context
	 * @param x             the text box X axis coordinate
	 * @param y             the text box Y axis coordinate
	 * @param breakRowWidth the maximum row width
	 * @param string        the text string to draw
	 * @param end           a pointer to the end of the sub-string to draw, or {@code NULL}
	 */
	public static native void nnvgTextBox(long ctx, float x, float y, float breakRowWidth, long string, long end);

	/**
	 * Draws multi-line text string at specified location wrapped at the specified width. If {@code end} is specified only the sub-string up to the
	 * {@code end} is drawn.
	 * 
	 * <p>White space is stripped at the beginning of the rows, the text is split at word boundaries or when new-line characters are encountered. Words longer
	 * than the max width are slit at nearest character (i.e. no hyphenation).</p>
	 *
	 * @param ctx           the NanoVG context
	 * @param x             the text box X axis coordinate
	 * @param y             the text box Y axis coordinate
	 * @param breakRowWidth the maximum row width
	 * @param string        the text string to draw
	 * @param end           a pointer to the end of the sub-string to draw, or {@code NULL}
	 */
	public static void nvgTextBox(long ctx, float x, float y, float breakRowWidth, ByteBuffer string, long end) {
		if ( CHECKS ) {
			checkPointer(ctx);
			checkNT1(string);
		}
		nnvgTextBox(ctx, x, y, breakRowWidth, memAddress(string), end);
	}

	/**
	 * Draws multi-line text string at specified location wrapped at the specified width. If {@code end} is specified only the sub-string up to the
	 * {@code end} is drawn.
	 * 
	 * <p>White space is stripped at the beginning of the rows, the text is split at word boundaries or when new-line characters are encountered. Words longer
	 * than the max width are slit at nearest character (i.e. no hyphenation).</p>
	 *
	 * @param ctx           the NanoVG context
	 * @param x             the text box X axis coordinate
	 * @param y             the text box Y axis coordinate
	 * @param breakRowWidth the maximum row width
	 * @param string        the text string to draw
	 * @param end           a pointer to the end of the sub-string to draw, or {@code NULL}
	 */
	public static void nvgTextBox(long ctx, float x, float y, float breakRowWidth, CharSequence string, long end) {
		if ( CHECKS )
			checkPointer(ctx);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer stringEncoded = stack.UTF8(string);
			nnvgTextBox(ctx, x, y, breakRowWidth, memAddress(stringEncoded), end);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nvgTextBounds ] ---

	/**
	 * Measures the specified text string.
	 * 
	 * <p>Parameter {@code bounds} should be a pointer to {@code float[4]}, if the bounding box of the text should be returned. The bounds value are
	 * {@code [xmin,ymin, xmax,ymax]}.</p>
	 * 
	 * <p>Measured values are returned in local coordinate space.</p>
	 *
	 * @param ctx    the NanoVG context
	 * @param x      the text X axis coordinate
	 * @param y      the text Y axis coordinate
	 * @param string the text string to measure
	 * @param end    a pointer to the end of the sub-string to measure, or {@code NULL}
	 * @param bounds returns the bounding box of the text
	 *
	 * @return the horizontal advance of the measured text (i.e. where the next character should drawn)
	 */
	public static native float nnvgTextBounds(long ctx, float x, float y, long string, long end, long bounds);

	/**
	 * Measures the specified text string.
	 * 
	 * <p>Parameter {@code bounds} should be a pointer to {@code float[4]}, if the bounding box of the text should be returned. The bounds value are
	 * {@code [xmin,ymin, xmax,ymax]}.</p>
	 * 
	 * <p>Measured values are returned in local coordinate space.</p>
	 *
	 * @param ctx    the NanoVG context
	 * @param x      the text X axis coordinate
	 * @param y      the text Y axis coordinate
	 * @param string the text string to measure
	 * @param end    a pointer to the end of the sub-string to measure, or {@code NULL}
	 * @param bounds returns the bounding box of the text
	 *
	 * @return the horizontal advance of the measured text (i.e. where the next character should drawn)
	 */
	public static float nvgTextBounds(long ctx, float x, float y, ByteBuffer string, long end, FloatBuffer bounds) {
		if ( CHECKS ) {
			checkPointer(ctx);
			checkNT1(string);
			if ( bounds != null ) checkBuffer(bounds, 4);
		}
		return nnvgTextBounds(ctx, x, y, memAddress(string), end, memAddressSafe(bounds));
	}

	/**
	 * Measures the specified text string.
	 * 
	 * <p>Parameter {@code bounds} should be a pointer to {@code float[4]}, if the bounding box of the text should be returned. The bounds value are
	 * {@code [xmin,ymin, xmax,ymax]}.</p>
	 * 
	 * <p>Measured values are returned in local coordinate space.</p>
	 *
	 * @param ctx    the NanoVG context
	 * @param x      the text X axis coordinate
	 * @param y      the text Y axis coordinate
	 * @param string the text string to measure
	 * @param end    a pointer to the end of the sub-string to measure, or {@code NULL}
	 * @param bounds returns the bounding box of the text
	 *
	 * @return the horizontal advance of the measured text (i.e. where the next character should drawn)
	 */
	public static float nvgTextBounds(long ctx, float x, float y, CharSequence string, long end, FloatBuffer bounds) {
		if ( CHECKS ) {
			checkPointer(ctx);
			if ( bounds != null ) checkBuffer(bounds, 4);
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer stringEncoded = stack.UTF8(string);
			return nnvgTextBounds(ctx, x, y, memAddress(stringEncoded), end, memAddressSafe(bounds));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nvgTextBoxBounds ] ---

	/**
	 * Measures the specified multi-text string.
	 * 
	 * <p>Parameter {@code bounds} should be a pointer to {@code float[4]}, if the bounding box of the text should be returned. The bounds value are
	 * {@code [xmin,ymin, xmax,ymax]}.</p>
	 * 
	 * <p>Measured values are returned in local coordinate space.</p>
	 *
	 * @param ctx           the NanoVG context
	 * @param x             the text box X axis coordinate
	 * @param y             the text box Y axis coordinate
	 * @param breakRowWidth the maximum row width
	 * @param string        the text string to measure
	 * @param end           a pointer to the end of the sub-string to measure, or {@code NULL}
	 * @param bounds        returns the bounding box of the text box
	 */
	public static native void nnvgTextBoxBounds(long ctx, float x, float y, float breakRowWidth, long string, long end, long bounds);

	/**
	 * Measures the specified multi-text string.
	 * 
	 * <p>Parameter {@code bounds} should be a pointer to {@code float[4]}, if the bounding box of the text should be returned. The bounds value are
	 * {@code [xmin,ymin, xmax,ymax]}.</p>
	 * 
	 * <p>Measured values are returned in local coordinate space.</p>
	 *
	 * @param ctx           the NanoVG context
	 * @param x             the text box X axis coordinate
	 * @param y             the text box Y axis coordinate
	 * @param breakRowWidth the maximum row width
	 * @param string        the text string to measure
	 * @param end           a pointer to the end of the sub-string to measure, or {@code NULL}
	 * @param bounds        returns the bounding box of the text box
	 */
	public static void nvgTextBoxBounds(long ctx, float x, float y, float breakRowWidth, ByteBuffer string, long end, FloatBuffer bounds) {
		if ( CHECKS ) {
			checkPointer(ctx);
			checkNT1(string);
			if ( bounds != null ) checkBuffer(bounds, 4);
		}
		nnvgTextBoxBounds(ctx, x, y, breakRowWidth, memAddress(string), end, memAddressSafe(bounds));
	}

	/**
	 * Measures the specified multi-text string.
	 * 
	 * <p>Parameter {@code bounds} should be a pointer to {@code float[4]}, if the bounding box of the text should be returned. The bounds value are
	 * {@code [xmin,ymin, xmax,ymax]}.</p>
	 * 
	 * <p>Measured values are returned in local coordinate space.</p>
	 *
	 * @param ctx           the NanoVG context
	 * @param x             the text box X axis coordinate
	 * @param y             the text box Y axis coordinate
	 * @param breakRowWidth the maximum row width
	 * @param string        the text string to measure
	 * @param end           a pointer to the end of the sub-string to measure, or {@code NULL}
	 * @param bounds        returns the bounding box of the text box
	 */
	public static void nvgTextBoxBounds(long ctx, float x, float y, float breakRowWidth, CharSequence string, long end, FloatBuffer bounds) {
		if ( CHECKS ) {
			checkPointer(ctx);
			if ( bounds != null ) checkBuffer(bounds, 4);
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer stringEncoded = stack.UTF8(string);
			nnvgTextBoxBounds(ctx, x, y, breakRowWidth, memAddress(stringEncoded), end, memAddressSafe(bounds));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nvgTextGlyphPositions ] ---

	/**
	 * Calculates the glyph x positions of the specified text. If {@code end} is specified only the sub-string will be used.
	 * 
	 * <p>Measured values are returned in local coordinate space.</p>
	 *
	 * @param ctx          the NanoVG context
	 * @param x            the text X axis coordinate
	 * @param y            the text Y axis coordinate
	 * @param string       the text string to measure
	 * @param end          a pointer to the end of the sub-string to measure, or {@code NULL}
	 * @param positions    returns the glyph x positions
	 * @param maxPositions the maximum number of glyph positions to return
	 */
	public static native int nnvgTextGlyphPositions(long ctx, float x, float y, long string, long end, long positions, int maxPositions);

	/**
	 * Calculates the glyph x positions of the specified text. If {@code end} is specified only the sub-string will be used.
	 * 
	 * <p>Measured values are returned in local coordinate space.</p>
	 *
	 * @param ctx       the NanoVG context
	 * @param x         the text X axis coordinate
	 * @param y         the text Y axis coordinate
	 * @param string    the text string to measure
	 * @param end       a pointer to the end of the sub-string to measure, or {@code NULL}
	 * @param positions returns the glyph x positions
	 */
	public static int nvgTextGlyphPositions(long ctx, float x, float y, ByteBuffer string, long end, NVGGlyphPosition.Buffer positions) {
		if ( CHECKS ) {
			checkPointer(ctx);
			checkNT1(string);
			NVGGlyphPosition.validate(positions.address(), positions.remaining());
		}
		return nnvgTextGlyphPositions(ctx, x, y, memAddress(string), end, positions.address(), positions.remaining());
	}

	/**
	 * Calculates the glyph x positions of the specified text. If {@code end} is specified only the sub-string will be used.
	 * 
	 * <p>Measured values are returned in local coordinate space.</p>
	 *
	 * @param ctx       the NanoVG context
	 * @param x         the text X axis coordinate
	 * @param y         the text Y axis coordinate
	 * @param string    the text string to measure
	 * @param end       a pointer to the end of the sub-string to measure, or {@code NULL}
	 * @param positions returns the glyph x positions
	 */
	public static int nvgTextGlyphPositions(long ctx, float x, float y, CharSequence string, long end, NVGGlyphPosition.Buffer positions) {
		if ( CHECKS ) {
			checkPointer(ctx);
			NVGGlyphPosition.validate(positions.address(), positions.remaining());
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer stringEncoded = stack.UTF8(string);
			return nnvgTextGlyphPositions(ctx, x, y, memAddress(stringEncoded), end, positions.address(), positions.remaining());
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ nvgTextMetrics ] ---

	/**
	 * Returns the vertical metrics based on the current text style.
	 * 
	 * <p>Measured values are returned in local coordinate space.</p>
	 *
	 * @param ctx       the NanoVG context
	 * @param ascender  the line ascend
	 * @param descender the line descend
	 * @param lineh     the line height
	 */
	public static native void nnvgTextMetrics(long ctx, long ascender, long descender, long lineh);

	/**
	 * Returns the vertical metrics based on the current text style.
	 * 
	 * <p>Measured values are returned in local coordinate space.</p>
	 *
	 * @param ctx       the NanoVG context
	 * @param ascender  the line ascend
	 * @param descender the line descend
	 * @param lineh     the line height
	 */
	public static void nvgTextMetrics(long ctx, FloatBuffer ascender, FloatBuffer descender, FloatBuffer lineh) {
		if ( CHECKS ) {
			checkPointer(ctx);
			if ( ascender != null ) checkBuffer(ascender, 1);
			if ( descender != null ) checkBuffer(descender, 1);
			if ( lineh != null ) checkBuffer(lineh, 1);
		}
		nnvgTextMetrics(ctx, memAddressSafe(ascender), memAddressSafe(descender), memAddressSafe(lineh));
	}

	// --- [ nvgTextBreakLines ] ---

	/**
	 * Breaks the specified text into lines. If {@code end} is specified only the sub-string will be used.
	 * 
	 * <p>White space is stripped at the beginning of the rows, the text is split at word boundaries or when new-line characters are encountered. Words longer
	 * than the max width are slit at nearest character (i.e. no hyphenation).</p>
	 *
	 * @param ctx           the NanoVG context
	 * @param string        the text string to measure
	 * @param end           a pointer to the end of the sub-string to measure, or {@code NULL}
	 * @param breakRowWidth the maximum row width
	 * @param rows          returns the text rows
	 * @param maxRows       the maximum number of text rows to return
	 */
	public static native int nnvgTextBreakLines(long ctx, long string, long end, float breakRowWidth, long rows, int maxRows);

	/**
	 * Breaks the specified text into lines. If {@code end} is specified only the sub-string will be used.
	 * 
	 * <p>White space is stripped at the beginning of the rows, the text is split at word boundaries or when new-line characters are encountered. Words longer
	 * than the max width are slit at nearest character (i.e. no hyphenation).</p>
	 *
	 * @param ctx           the NanoVG context
	 * @param string        the text string to measure
	 * @param end           a pointer to the end of the sub-string to measure, or {@code NULL}
	 * @param breakRowWidth the maximum row width
	 * @param rows          returns the text rows
	 */
	public static int nvgTextBreakLines(long ctx, ByteBuffer string, long end, float breakRowWidth, NVGTextRow.Buffer rows) {
		if ( CHECKS ) {
			checkPointer(ctx);
			checkNT1(string);
			NVGTextRow.validate(rows.address(), rows.remaining());
		}
		return nnvgTextBreakLines(ctx, memAddress(string), end, breakRowWidth, rows.address(), rows.remaining());
	}

	/**
	 * Breaks the specified text into lines. If {@code end} is specified only the sub-string will be used.
	 * 
	 * <p>White space is stripped at the beginning of the rows, the text is split at word boundaries or when new-line characters are encountered. Words longer
	 * than the max width are slit at nearest character (i.e. no hyphenation).</p>
	 *
	 * @param ctx           the NanoVG context
	 * @param string        the text string to measure
	 * @param end           a pointer to the end of the sub-string to measure, or {@code NULL}
	 * @param breakRowWidth the maximum row width
	 * @param rows          returns the text rows
	 */
	public static int nvgTextBreakLines(long ctx, CharSequence string, long end, float breakRowWidth, NVGTextRow.Buffer rows) {
		if ( CHECKS ) {
			checkPointer(ctx);
			NVGTextRow.validate(rows.address(), rows.remaining());
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer stringEncoded = stack.UTF8(string);
			return nnvgTextBreakLines(ctx, memAddress(stringEncoded), end, breakRowWidth, rows.address(), rows.remaining());
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #nvgCurrentTransform CurrentTransform} */
	public static native void nnvgCurrentTransform(long ctx, float[] xform);

	/** Array version of: {@link #nvgCurrentTransform CurrentTransform} */
	public static void nvgCurrentTransform(long ctx, float[] xform) {
		if ( CHECKS ) {
			checkPointer(ctx);
			checkBuffer(xform, 6);
		}
		nnvgCurrentTransform(ctx, xform);
	}

	/** Array version of: {@link #nvgTransformIdentity TransformIdentity} */
	public static native void nnvgTransformIdentity(float[] dst);

	/** Array version of: {@link #nvgTransformIdentity TransformIdentity} */
	public static void nvgTransformIdentity(float[] dst) {
		if ( CHECKS )
			checkBuffer(dst, 6);
		nnvgTransformIdentity(dst);
	}

	/** Array version of: {@link #nvgTransformTranslate TransformTranslate} */
	public static native void nnvgTransformTranslate(float[] dst, float tx, float ty);

	/** Array version of: {@link #nvgTransformTranslate TransformTranslate} */
	public static void nvgTransformTranslate(float[] dst, float tx, float ty) {
		if ( CHECKS )
			checkBuffer(dst, 6);
		nnvgTransformTranslate(dst, tx, ty);
	}

	/** Array version of: {@link #nvgTransformScale TransformScale} */
	public static native void nnvgTransformScale(float[] dst, float sx, float sy);

	/** Array version of: {@link #nvgTransformScale TransformScale} */
	public static void nvgTransformScale(float[] dst, float sx, float sy) {
		if ( CHECKS )
			checkBuffer(dst, 6);
		nnvgTransformScale(dst, sx, sy);
	}

	/** Array version of: {@link #nvgTransformRotate TransformRotate} */
	public static native void nnvgTransformRotate(float[] dst, float a);

	/** Array version of: {@link #nvgTransformRotate TransformRotate} */
	public static void nvgTransformRotate(float[] dst, float a) {
		if ( CHECKS )
			checkBuffer(dst, 6);
		nnvgTransformRotate(dst, a);
	}

	/** Array version of: {@link #nvgTransformSkewX TransformSkewX} */
	public static native void nnvgTransformSkewX(float[] dst, float a);

	/** Array version of: {@link #nvgTransformSkewX TransformSkewX} */
	public static void nvgTransformSkewX(float[] dst, float a) {
		if ( CHECKS )
			checkBuffer(dst, 6);
		nnvgTransformSkewX(dst, a);
	}

	/** Array version of: {@link #nvgTransformSkewY TransformSkewY} */
	public static native void nnvgTransformSkewY(float[] dst, float a);

	/** Array version of: {@link #nvgTransformSkewY TransformSkewY} */
	public static void nvgTransformSkewY(float[] dst, float a) {
		if ( CHECKS )
			checkBuffer(dst, 6);
		nnvgTransformSkewY(dst, a);
	}

	/** Array version of: {@link #nvgTransformMultiply TransformMultiply} */
	public static native void nnvgTransformMultiply(float[] dst, float[] src);

	/** Array version of: {@link #nvgTransformMultiply TransformMultiply} */
	public static void nvgTransformMultiply(float[] dst, float[] src) {
		if ( CHECKS ) {
			checkBuffer(dst, 6);
			checkBuffer(src, 6);
		}
		nnvgTransformMultiply(dst, src);
	}

	/** Array version of: {@link #nvgTransformPremultiply TransformPremultiply} */
	public static native void nnvgTransformPremultiply(float[] dst, float[] src);

	/** Array version of: {@link #nvgTransformPremultiply TransformPremultiply} */
	public static void nvgTransformPremultiply(float[] dst, float[] src) {
		if ( CHECKS ) {
			checkBuffer(dst, 6);
			checkBuffer(src, 6);
		}
		nnvgTransformPremultiply(dst, src);
	}

	/** Array version of: {@link #nvgTransformInverse TransformInverse} */
	public static native int nnvgTransformInverse(float[] dst, float[] src);

	/** Array version of: {@link #nvgTransformInverse TransformInverse} */
	public static int nvgTransformInverse(float[] dst, float[] src) {
		if ( CHECKS ) {
			checkBuffer(dst, 6);
			checkBuffer(src, 6);
		}
		return nnvgTransformInverse(dst, src);
	}

	/** Array version of: {@link #nvgTransformPoint TransformPoint} */
	public static native void nnvgTransformPoint(float[] dstx, float[] dsty, float[] xform, float srcx, float srcy);

	/** Array version of: {@link #nvgTransformPoint TransformPoint} */
	public static void nvgTransformPoint(float[] dstx, float[] dsty, float[] xform, float srcx, float srcy) {
		if ( CHECKS ) {
			checkBuffer(dstx, 1);
			checkBuffer(dsty, 1);
			checkBuffer(xform, 6);
		}
		nnvgTransformPoint(dstx, dsty, xform, srcx, srcy);
	}

	/** Array version of: {@link #nvgImageSize ImageSize} */
	public static native void nnvgImageSize(long ctx, int image, int[] w, int[] h);

	/** Array version of: {@link #nvgImageSize ImageSize} */
	public static void nvgImageSize(long ctx, int image, int[] w, int[] h) {
		if ( CHECKS ) {
			checkPointer(ctx);
			checkBuffer(w, 1);
			checkBuffer(h, 1);
		}
		nnvgImageSize(ctx, image, w, h);
	}

	/** Array version of: {@link #nvgTextBounds TextBounds} */
	public static native float nnvgTextBounds(long ctx, float x, float y, long string, long end, float[] bounds);

	/** Array version of: {@link #nvgTextBounds TextBounds} */
	public static float nvgTextBounds(long ctx, float x, float y, ByteBuffer string, long end, float[] bounds) {
		if ( CHECKS ) {
			checkPointer(ctx);
			checkNT1(string);
			if ( bounds != null ) checkBuffer(bounds, 4);
		}
		return nnvgTextBounds(ctx, x, y, memAddress(string), end, bounds);
	}

	/** Array version of: {@link #nvgTextBounds TextBounds} */
	public static float nvgTextBounds(long ctx, float x, float y, CharSequence string, long end, float[] bounds) {
		if ( CHECKS ) {
			checkPointer(ctx);
			if ( bounds != null ) checkBuffer(bounds, 4);
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer stringEncoded = stack.UTF8(string);
			return nnvgTextBounds(ctx, x, y, memAddress(stringEncoded), end, bounds);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #nvgTextBoxBounds TextBoxBounds} */
	public static native void nnvgTextBoxBounds(long ctx, float x, float y, float breakRowWidth, long string, long end, float[] bounds);

	/** Array version of: {@link #nvgTextBoxBounds TextBoxBounds} */
	public static void nvgTextBoxBounds(long ctx, float x, float y, float breakRowWidth, ByteBuffer string, long end, float[] bounds) {
		if ( CHECKS ) {
			checkPointer(ctx);
			checkNT1(string);
			if ( bounds != null ) checkBuffer(bounds, 4);
		}
		nnvgTextBoxBounds(ctx, x, y, breakRowWidth, memAddress(string), end, bounds);
	}

	/** Array version of: {@link #nvgTextBoxBounds TextBoxBounds} */
	public static void nvgTextBoxBounds(long ctx, float x, float y, float breakRowWidth, CharSequence string, long end, float[] bounds) {
		if ( CHECKS ) {
			checkPointer(ctx);
			if ( bounds != null ) checkBuffer(bounds, 4);
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer stringEncoded = stack.UTF8(string);
			nnvgTextBoxBounds(ctx, x, y, breakRowWidth, memAddress(stringEncoded), end, bounds);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #nvgTextMetrics TextMetrics} */
	public static native void nnvgTextMetrics(long ctx, float[] ascender, float[] descender, float[] lineh);

	/** Array version of: {@link #nvgTextMetrics TextMetrics} */
	public static void nvgTextMetrics(long ctx, float[] ascender, float[] descender, float[] lineh) {
		if ( CHECKS ) {
			checkPointer(ctx);
			if ( ascender != null ) checkBuffer(ascender, 1);
			if ( descender != null ) checkBuffer(descender, 1);
			if ( lineh != null ) checkBuffer(lineh, 1);
		}
		nnvgTextMetrics(ctx, ascender, descender, lineh);
	}

}