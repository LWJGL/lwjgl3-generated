/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
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
 * <pre><code style="font-family: monospace">
 * [sx kx tx]
 * [ky sy ty]
 * [ 0  0  1]</code></pre>
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
 * <pre><code style="font-family: monospace">
 * const char* txt = "Text me up.";
 * nvgTextBounds(vg, x,y, txt, NULL, bounds);
 * nvgBeginPath(vg);
 * nvgRoundedRect(vg, bounds[0],bounds[1], bounds[2]-bounds[0], bounds[3]-bounds[1]);
 * nvgFill(vg);</code></pre>
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

	@JavadocExclude
	protected NanoVG() {
		throw new UnsupportedOperationException();
	}

	// --- [ nvgBeginFrame ] ---

	/** JNI method for {@link #nvgBeginFrame BeginFrame} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgCancelFrame CancelFrame} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgEndFrame EndFrame} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgRGB RGB} */
	@JavadocExclude
	public static native void nnvgRGB(byte r, byte g, byte b, long __result);

	/**
	 * Returns a color value from red, green, blue values. Alpha will be set to 255 (1.0f).
	 *
	 * @param r the red value
	 * @param g the green value
	 * @param b the blue value
	 */
	public static void nvgRGB(byte r, byte g, byte b, NVGColor __result) {
		nnvgRGB(r, g, b, __result.address());
	}

	// --- [ nvgRGBf ] ---

	/** JNI method for {@link #nvgRGBf RGBf} */
	@JavadocExclude
	public static native void nnvgRGBf(float r, float g, float b, long __result);

	/**
	 * Returns a color value from red, green, blue values. Alpha will be set to 1.0f.
	 *
	 * @param r the red value
	 * @param g the green value
	 * @param b the blue value
	 */
	public static void nvgRGBf(float r, float g, float b, NVGColor __result) {
		nnvgRGBf(r, g, b, __result.address());
	}

	// --- [ nvgRGBA ] ---

	/** JNI method for {@link #nvgRGBA RGBA} */
	@JavadocExclude
	public static native void nnvgRGBA(byte r, byte g, byte b, byte a, long __result);

	/**
	 * Returns a color value from red, green, blue and alpha values.
	 *
	 * @param r the red value
	 * @param g the green value
	 * @param b the blue value
	 * @param a the alpha value
	 */
	public static void nvgRGBA(byte r, byte g, byte b, byte a, NVGColor __result) {
		nnvgRGBA(r, g, b, a, __result.address());
	}

	// --- [ nvgRGBAf ] ---

	/** JNI method for {@link #nvgRGBAf RGBAf} */
	@JavadocExclude
	public static native void nnvgRGBAf(float r, float g, float b, float a, long __result);

	/**
	 * Returns a color value from red, green, blue and alpha values.
	 *
	 * @param r the red value
	 * @param g the green value
	 * @param b the blue value
	 * @param a the alpha value
	 */
	public static void nvgRGBAf(float r, float g, float b, float a, NVGColor __result) {
		nnvgRGBAf(r, g, b, a, __result.address());
	}

	// --- [ nvgLerpRGBA ] ---

	/** JNI method for {@link #nvgLerpRGBA LerpRGBA} */
	@JavadocExclude
	public static native void nnvgLerpRGBA(long c0, long c1, float u, long __result);

	/**
	 * Linearly interpolates from color {@code c0} to {@code c1}, and returns resulting color value.
	 *
	 * @param c0 the first color
	 * @param c1 the second color
	 * @param u  the interpolation factor
	 */
	public static void nvgLerpRGBA(NVGColor c0, NVGColor c1, float u, NVGColor __result) {
		nnvgLerpRGBA(c0.address(), c1.address(), u, __result.address());
	}

	// --- [ nvgTransRGBA ] ---

	/** JNI method for {@link #nvgTransRGBA TransRGBA} */
	@JavadocExclude
	public static native void nnvgTransRGBA(long c0, byte a, long __result);

	/**
	 * Sets transparency of a color value.
	 *
	 * @param c0 the color
	 * @param a  the alpha value
	 */
	public static void nvgTransRGBA(NVGColor c0, byte a, NVGColor __result) {
		nnvgTransRGBA(c0.address(), a, __result.address());
	}

	// --- [ nvgTransRGBAf ] ---

	/** JNI method for {@link #nvgTransRGBAf TransRGBAf} */
	@JavadocExclude
	public static native void nnvgTransRGBAf(long c0, float a, long __result);

	/**
	 * Sets transparency of a color value.
	 *
	 * @param c0 the color
	 * @param a  the alpha value
	 */
	public static void nvgTransRGBAf(NVGColor c0, float a, NVGColor __result) {
		nnvgTransRGBAf(c0.address(), a, __result.address());
	}

	// --- [ nvgHSL ] ---

	/** JNI method for {@link #nvgHSL HSL} */
	@JavadocExclude
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
	public static void nvgHSL(float h, float s, float l, NVGColor __result) {
		nnvgHSL(h, s, l, __result.address());
	}

	// --- [ nvgHSLA ] ---

	/** JNI method for {@link #nvgHSLA HSLA} */
	@JavadocExclude
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
	public static void nvgHSLA(float h, float s, float l, byte a, NVGColor __result) {
		nnvgHSLA(h, s, l, a, __result.address());
	}

	// --- [ nvgSave ] ---

	/** JNI method for {@link #nvgSave Save} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgRestore Restore} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgReset Reset} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgStrokeColor StrokeColor} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgStrokePaint StrokePaint} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgFillColor FillColor} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgFillPaint FillPaint} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgMiterLimit MiterLimit} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgStrokeWidth StrokeWidth} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgLineCap LineCap} */
	@JavadocExclude
	public static native void nnvgLineCap(long ctx, int cap);

	/**
	 * Sets how the end of the line (cap) is drawn.
	 * 
	 * <p>The default line cap is {@link #NVG_BUTT BUTT}.</p>
	 *
	 * @param ctx the NanoVG context
	 * @param cap the line cap to set. One of:<br>{@link #NVG_BUTT BUTT}, {@link #NVG_ROUND ROUND}, {@link #NVG_SQUARE SQUARE}
	 */
	public static void nvgLineCap(long ctx, int cap) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgLineCap(ctx, cap);
	}

	// --- [ nvgLineJoin ] ---

	/** JNI method for {@link #nvgLineJoin LineJoin} */
	@JavadocExclude
	public static native void nnvgLineJoin(long ctx, int join);

	/**
	 * Sets how sharp path corners are drawn.
	 * 
	 * <p>The default line join is {@link #NVG_MITER MITER}.</p>
	 *
	 * @param ctx  the NanoVG context
	 * @param join the line join to set. One of:<br>{@link #NVG_MITER MITER}, {@link #NVG_ROUND ROUND}, {@link #NVG_BEVEL BEVEL}
	 */
	public static void nvgLineJoin(long ctx, int join) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgLineJoin(ctx, join);
	}

	// --- [ nvgGlobalAlpha ] ---

	/** JNI method for {@link #nvgGlobalAlpha GlobalAlpha} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgResetTransform ResetTransform} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgTransform Transform} */
	@JavadocExclude
	public static native void nnvgTransform(long ctx, float a, float b, float c, float d, float e, float f);

	/**
	 * Premultiplies current coordinate system by specified matrix. The parameters are interpreted as matrix as follows:
	 * 
	 * <pre><code style="font-family: monospace">
	 * [a c e]
	 * [b d f]
	 * [0 0 1]</code></pre>
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

	/** JNI method for {@link #nvgTranslate Translate} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgRotate Rotate} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgSkewX SkewX} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgSkewY SkewY} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgScale Scale} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgCurrentTransform CurrentTransform} */
	@JavadocExclude
	public static native void nnvgCurrentTransform(long ctx, long xform);

	/**
	 * Stores the top part (a-f) of the current transformation matrix in to the specified buffer.
	 * 
	 * <pre><code style="font-family: monospace">
	 * [a c e]
	 * [b d f]
	 * [0 0 1]</code></pre>
	 * 
	 * <p>There should be space for 6 floats in the return buffer for the values {@code a-f}.</p>
	 *
	 * @param ctx   the NanoVG context
	 * @param xform the destination buffer
	 */
	public static void nvgCurrentTransform(long ctx, ByteBuffer xform) {
		if ( CHECKS ) {
			checkPointer(ctx);
			checkBuffer(xform, 6 << 2);
		}
		nnvgCurrentTransform(ctx, memAddress(xform));
	}

	/** Alternative version of: {@link #nvgCurrentTransform CurrentTransform} */
	public static void nvgCurrentTransform(long ctx, FloatBuffer xform) {
		if ( CHECKS ) {
			checkPointer(ctx);
			checkBuffer(xform, 6);
		}
		nnvgCurrentTransform(ctx, memAddress(xform));
	}

	// --- [ nvgTransformIdentity ] ---

	/** JNI method for {@link #nvgTransformIdentity TransformIdentity} */
	@JavadocExclude
	public static native void nnvgTransformIdentity(long dst);

	/**
	 * Sets the transform to identity matrix.
	 *
	 * @param dst the destination buffer
	 */
	public static void nvgTransformIdentity(ByteBuffer dst) {
		if ( CHECKS )
			checkBuffer(dst, 6 << 2);
		nnvgTransformIdentity(memAddress(dst));
	}

	/** Alternative version of: {@link #nvgTransformIdentity TransformIdentity} */
	public static void nvgTransformIdentity(FloatBuffer dst) {
		if ( CHECKS )
			checkBuffer(dst, 6);
		nnvgTransformIdentity(memAddress(dst));
	}

	// --- [ nvgTransformTranslate ] ---

	/** JNI method for {@link #nvgTransformTranslate TransformTranslate} */
	@JavadocExclude
	public static native void nnvgTransformTranslate(long dst, float tx, float ty);

	/**
	 * Sets the transform to translation matrix matrix.
	 *
	 * @param dst the destination buffer
	 * @param tx  the X axis translation amount
	 * @param ty  the Y axis translation amount
	 */
	public static void nvgTransformTranslate(ByteBuffer dst, float tx, float ty) {
		if ( CHECKS )
			checkBuffer(dst, 6 << 2);
		nnvgTransformTranslate(memAddress(dst), tx, ty);
	}

	/** Alternative version of: {@link #nvgTransformTranslate TransformTranslate} */
	public static void nvgTransformTranslate(FloatBuffer dst, float tx, float ty) {
		if ( CHECKS )
			checkBuffer(dst, 6);
		nnvgTransformTranslate(memAddress(dst), tx, ty);
	}

	// --- [ nvgTransformScale ] ---

	/** JNI method for {@link #nvgTransformScale TransformScale} */
	@JavadocExclude
	public static native void nnvgTransformScale(long dst, float sx, float sy);

	/**
	 * Sets the transform to scale matrix.
	 *
	 * @param dst the destination buffer
	 * @param sx  the X axis scale factor
	 * @param sy  the Y axis scale factor
	 */
	public static void nvgTransformScale(ByteBuffer dst, float sx, float sy) {
		if ( CHECKS )
			checkBuffer(dst, 6 << 2);
		nnvgTransformScale(memAddress(dst), sx, sy);
	}

	/** Alternative version of: {@link #nvgTransformScale TransformScale} */
	public static void nvgTransformScale(FloatBuffer dst, float sx, float sy) {
		if ( CHECKS )
			checkBuffer(dst, 6);
		nnvgTransformScale(memAddress(dst), sx, sy);
	}

	// --- [ nvgTransformRotate ] ---

	/** JNI method for {@link #nvgTransformRotate TransformRotate} */
	@JavadocExclude
	public static native void nnvgTransformRotate(long dst, float a);

	/**
	 * Sets the transform to rotate matrix.
	 *
	 * @param dst the destination buffer
	 * @param a   the rotation angle, in radians
	 */
	public static void nvgTransformRotate(ByteBuffer dst, float a) {
		if ( CHECKS )
			checkBuffer(dst, 6 << 2);
		nnvgTransformRotate(memAddress(dst), a);
	}

	/** Alternative version of: {@link #nvgTransformRotate TransformRotate} */
	public static void nvgTransformRotate(FloatBuffer dst, float a) {
		if ( CHECKS )
			checkBuffer(dst, 6);
		nnvgTransformRotate(memAddress(dst), a);
	}

	// --- [ nvgTransformSkewX ] ---

	/** JNI method for {@link #nvgTransformSkewX TransformSkewX} */
	@JavadocExclude
	public static native void nnvgTransformSkewX(long dst, float a);

	/**
	 * Sets the transform to skew-x matrix.
	 *
	 * @param dst the destination buffer
	 * @param a   the skew angle, in radians
	 */
	public static void nvgTransformSkewX(ByteBuffer dst, float a) {
		if ( CHECKS )
			checkBuffer(dst, 6 << 2);
		nnvgTransformSkewX(memAddress(dst), a);
	}

	/** Alternative version of: {@link #nvgTransformSkewX TransformSkewX} */
	public static void nvgTransformSkewX(FloatBuffer dst, float a) {
		if ( CHECKS )
			checkBuffer(dst, 6);
		nnvgTransformSkewX(memAddress(dst), a);
	}

	// --- [ nvgTransformSkewY ] ---

	/** JNI method for {@link #nvgTransformSkewY TransformSkewY} */
	@JavadocExclude
	public static native void nnvgTransformSkewY(long dst, float a);

	/**
	 * Sets the transform to skew-y matrix.
	 *
	 * @param dst the destination buffer
	 * @param a   the skew angle, in radians
	 */
	public static void nvgTransformSkewY(ByteBuffer dst, float a) {
		if ( CHECKS )
			checkBuffer(dst, 6 << 2);
		nnvgTransformSkewY(memAddress(dst), a);
	}

	/** Alternative version of: {@link #nvgTransformSkewY TransformSkewY} */
	public static void nvgTransformSkewY(FloatBuffer dst, float a) {
		if ( CHECKS )
			checkBuffer(dst, 6);
		nnvgTransformSkewY(memAddress(dst), a);
	}

	// --- [ nvgTransformMultiply ] ---

	/** JNI method for {@link #nvgTransformMultiply TransformMultiply} */
	@JavadocExclude
	public static native void nnvgTransformMultiply(long dst, long src);

	/**
	 * Sets the transform to the result of multiplication of two transforms, of {@code A = A*B}.
	 *
	 * @param dst the destination buffer
	 * @param src the {@code B} transformation matrix
	 */
	public static void nvgTransformMultiply(ByteBuffer dst, ByteBuffer src) {
		if ( CHECKS ) {
			checkBuffer(dst, 6 << 2);
			checkBuffer(src, 6 << 2);
		}
		nnvgTransformMultiply(memAddress(dst), memAddress(src));
	}

	/** Alternative version of: {@link #nvgTransformMultiply TransformMultiply} */
	public static void nvgTransformMultiply(FloatBuffer dst, FloatBuffer src) {
		if ( CHECKS ) {
			checkBuffer(dst, 6);
			checkBuffer(src, 6);
		}
		nnvgTransformMultiply(memAddress(dst), memAddress(src));
	}

	// --- [ nvgTransformPremultiply ] ---

	/** JNI method for {@link #nvgTransformPremultiply TransformPremultiply} */
	@JavadocExclude
	public static native void nnvgTransformPremultiply(long dst, long src);

	/**
	 * Sets the transform to the result of multiplication of two transforms, of {@code A = B*A}.
	 *
	 * @param dst the destination buffer
	 * @param src the {@code B} transformation matrix
	 */
	public static void nvgTransformPremultiply(ByteBuffer dst, ByteBuffer src) {
		if ( CHECKS ) {
			checkBuffer(dst, 6 << 2);
			checkBuffer(src, 6 << 2);
		}
		nnvgTransformPremultiply(memAddress(dst), memAddress(src));
	}

	/** Alternative version of: {@link #nvgTransformPremultiply TransformPremultiply} */
	public static void nvgTransformPremultiply(FloatBuffer dst, FloatBuffer src) {
		if ( CHECKS ) {
			checkBuffer(dst, 6);
			checkBuffer(src, 6);
		}
		nnvgTransformPremultiply(memAddress(dst), memAddress(src));
	}

	// --- [ nvgTransformInverse ] ---

	/** JNI method for {@link #nvgTransformInverse TransformInverse} */
	@JavadocExclude
	public static native int nnvgTransformInverse(long dst, long src);

	/**
	 * Sets the destination to inverse of specified transform.
	 *
	 * @param dst the destination buffer
	 * @param src the transformation matrix to inverse
	 *
	 * @return 1 if the inverse could be calculated, else 0
	 */
	public static int nvgTransformInverse(ByteBuffer dst, ByteBuffer src) {
		if ( CHECKS ) {
			checkBuffer(dst, 6 << 2);
			checkBuffer(src, 6 << 2);
		}
		return nnvgTransformInverse(memAddress(dst), memAddress(src));
	}

	/** Alternative version of: {@link #nvgTransformInverse TransformInverse} */
	public static int nvgTransformInverse(FloatBuffer dst, FloatBuffer src) {
		if ( CHECKS ) {
			checkBuffer(dst, 6);
			checkBuffer(src, 6);
		}
		return nnvgTransformInverse(memAddress(dst), memAddress(src));
	}

	// --- [ nvgTransformPoint ] ---

	/** JNI method for {@link #nvgTransformPoint TransformPoint} */
	@JavadocExclude
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
	public static void nvgTransformPoint(ByteBuffer dstx, ByteBuffer dsty, ByteBuffer xform, float srcx, float srcy) {
		if ( CHECKS ) {
			checkBuffer(dstx, 1 << 2);
			checkBuffer(dsty, 1 << 2);
			checkBuffer(xform, 6 << 2);
		}
		nnvgTransformPoint(memAddress(dstx), memAddress(dsty), memAddress(xform), srcx, srcy);
	}

	/** Alternative version of: {@link #nvgTransformPoint TransformPoint} */
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

	/** JNI method for {@link #nvgCreateImage CreateImage} */
	@JavadocExclude
	public static native int nnvgCreateImage(long ctx, long filename, int imageFlags);

	/**
	 * Creates image by loading it from the disk from specified file name.
	 *
	 * @param ctx        the NanoVG context
	 * @param filename   the image file name
	 * @param imageFlags the image flags. One of:<br>{@link #NVG_IMAGE_GENERATE_MIPMAPS IMAGE_GENERATE_MIPMAPS}, {@link #NVG_IMAGE_REPEATX IMAGE_REPEATX}, {@link #NVG_IMAGE_REPEATY IMAGE_REPEATY}, {@link #NVG_IMAGE_FLIPY IMAGE_FLIPY}, {@link #NVG_IMAGE_PREMULTIPLIED IMAGE_PREMULTIPLIED}
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

	/** CharSequence version of: {@link #nvgCreateImage CreateImage} */
	public static int nvgCreateImage(long ctx, CharSequence filename, int imageFlags) {
		if ( CHECKS )
			checkPointer(ctx);
		APIBuffer __buffer = apiBuffer();
		int filenameEncoded = __buffer.stringParamASCII(filename, true);
		return nnvgCreateImage(ctx, __buffer.address(filenameEncoded), imageFlags);
	}

	// --- [ nvgCreateImageMem ] ---

	/** JNI method for {@link #nvgCreateImageMem CreateImageMem} */
	@JavadocExclude
	public static native int nnvgCreateImageMem(long ctx, int imageFlags, long data, int ndata);

	/**
	 * Creates image by loading it from the specified chunk of memory.
	 *
	 * @param ctx        the NanoVG context
	 * @param imageFlags the image flags. One of:<br>{@link #NVG_IMAGE_GENERATE_MIPMAPS IMAGE_GENERATE_MIPMAPS}, {@link #NVG_IMAGE_REPEATX IMAGE_REPEATX}, {@link #NVG_IMAGE_REPEATY IMAGE_REPEATY}, {@link #NVG_IMAGE_FLIPY IMAGE_FLIPY}, {@link #NVG_IMAGE_PREMULTIPLIED IMAGE_PREMULTIPLIED}
	 * @param data       the image data
	 * @param ndata      the image data size, in bytes
	 *
	 * @return a handle to the image
	 */
	public static int nvgCreateImageMem(long ctx, int imageFlags, ByteBuffer data, int ndata) {
		if ( CHECKS ) {
			checkPointer(ctx);
			checkBuffer(data, ndata);
		}
		return nnvgCreateImageMem(ctx, imageFlags, memAddress(data), ndata);
	}

	/** Alternative version of: {@link #nvgCreateImageMem CreateImageMem} */
	public static int nvgCreateImageMem(long ctx, int imageFlags, ByteBuffer data) {
		if ( CHECKS )
			checkPointer(ctx);
		return nnvgCreateImageMem(ctx, imageFlags, memAddress(data), data.remaining());
	}

	// --- [ nvgCreateImageRGBA ] ---

	/** JNI method for {@link #nvgCreateImageRGBA CreateImageRGBA} */
	@JavadocExclude
	public static native int nnvgCreateImageRGBA(long ctx, int w, int h, int imageFlags, long data);

	/**
	 * Creates image from specified image data.
	 *
	 * @param ctx        the NanoVG context
	 * @param w          the image width
	 * @param h          the image height
	 * @param imageFlags the image flags. One of:<br>{@link #NVG_IMAGE_GENERATE_MIPMAPS IMAGE_GENERATE_MIPMAPS}, {@link #NVG_IMAGE_REPEATX IMAGE_REPEATX}, {@link #NVG_IMAGE_REPEATY IMAGE_REPEATY}, {@link #NVG_IMAGE_FLIPY IMAGE_FLIPY}, {@link #NVG_IMAGE_PREMULTIPLIED IMAGE_PREMULTIPLIED}
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

	/** JNI method for {@link #nvgUpdateImage UpdateImage} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgImageSize ImageSize} */
	@JavadocExclude
	public static native void nnvgImageSize(long ctx, int image, long w, long h);

	/**
	 * Returns the dimensions of a created image.
	 *
	 * @param ctx   the NanoVG context
	 * @param image the image handle
	 * @param w     returns the image width
	 * @param h     returns the image height
	 */
	public static void nvgImageSize(long ctx, int image, ByteBuffer w, ByteBuffer h) {
		if ( CHECKS ) {
			checkPointer(ctx);
			checkBuffer(w, 1 << 2);
			checkBuffer(h, 1 << 2);
		}
		nnvgImageSize(ctx, image, memAddress(w), memAddress(h));
	}

	/** Alternative version of: {@link #nvgImageSize ImageSize} */
	public static void nvgImageSize(long ctx, int image, IntBuffer w, IntBuffer h) {
		if ( CHECKS ) {
			checkPointer(ctx);
			checkBuffer(w, 1);
			checkBuffer(h, 1);
		}
		nnvgImageSize(ctx, image, memAddress(w), memAddress(h));
	}

	// --- [ nvgDeleteImage ] ---

	/** JNI method for {@link #nvgDeleteImage DeleteImage} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgLinearGradient LinearGradient} */
	@JavadocExclude
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
	public static void nvgLinearGradient(long ctx, float sx, float sy, float ex, float ey, NVGColor icol, NVGColor ocol, NVGPaint __result) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgLinearGradient(ctx, sx, sy, ex, ey, icol.address(), ocol.address(), __result.address());
	}

	// --- [ nvgBoxGradient ] ---

	/** JNI method for {@link #nvgBoxGradient BoxGradient} */
	@JavadocExclude
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
	public static void nvgBoxGradient(long ctx, float x, float y, float w, float h, float r, float f, NVGColor icol, NVGColor ocol, NVGPaint __result) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgBoxGradient(ctx, x, y, w, h, r, f, icol.address(), ocol.address(), __result.address());
	}

	// --- [ nvgRadialGradient ] ---

	/** JNI method for {@link #nvgRadialGradient RadialGradient} */
	@JavadocExclude
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
	public static void nvgRadialGradient(long ctx, float cx, float cy, float inr, float outr, NVGColor icol, NVGColor ocol, NVGPaint __result) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgRadialGradient(ctx, cx, cy, inr, outr, icol.address(), ocol.address(), __result.address());
	}

	// --- [ nvgImagePattern ] ---

	/** JNI method for {@link #nvgImagePattern ImagePattern} */
	@JavadocExclude
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
	public static void nvgImagePattern(long ctx, float ox, float oy, float ex, float ey, float angle, int image, float alpha, NVGPaint __result) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgImagePattern(ctx, ox, oy, ex, ey, angle, image, alpha, __result.address());
	}

	// --- [ nvgScissor ] ---

	/** JNI method for {@link #nvgScissor Scissor} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgIntersectScissor IntersectScissor} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgResetScissor ResetScissor} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgBeginPath BeginPath} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgMoveTo MoveTo} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgLineTo LineTo} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgBezierTo BezierTo} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgQuadTo QuadTo} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgArcTo ArcTo} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgClosePath ClosePath} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgPathWinding PathWinding} */
	@JavadocExclude
	public static native void nnvgPathWinding(long ctx, int dir);

	/**
	 * Sets the current sub-path winding.
	 *
	 * @param ctx the NanoVG context
	 * @param dir the sub-path winding. One of:<br>{@link #NVG_CCW CCW}, {@link #NVG_CW CW}
	 */
	public static void nvgPathWinding(long ctx, int dir) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgPathWinding(ctx, dir);
	}

	// --- [ nvgArc ] ---

	/** JNI method for {@link #nvgArc Arc} */
	@JavadocExclude
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
	 * @param dir the arc direction. One of:<br>{@link #NVG_CCW CCW}, {@link #NVG_CW CW}
	 */
	public static void nvgArc(long ctx, float cx, float cy, float r, float a0, float a1, int dir) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgArc(ctx, cx, cy, r, a0, a1, dir);
	}

	// --- [ nvgRect ] ---

	/** JNI method for {@link #nvgRect Rect} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgRoundedRect RoundedRect} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgEllipse Ellipse} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgCircle Circle} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgFill Fill} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgStroke Stroke} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgCreateFont CreateFont} */
	@JavadocExclude
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

	/** CharSequence version of: {@link #nvgCreateFont CreateFont} */
	public static int nvgCreateFont(long ctx, CharSequence name, CharSequence filename) {
		if ( CHECKS )
			checkPointer(ctx);
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		int filenameEncoded = __buffer.stringParamASCII(filename, true);
		return nnvgCreateFont(ctx, __buffer.address(nameEncoded), __buffer.address(filenameEncoded));
	}

	// --- [ nvgCreateFontMem ] ---

	/** JNI method for {@link #nvgCreateFontMem CreateFontMem} */
	@JavadocExclude
	public static native int nnvgCreateFontMem(long ctx, long name, long data, int ndata, int freeData);

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
	public static int nvgCreateFontMem(long ctx, ByteBuffer name, ByteBuffer data, int ndata, int freeData) {
		if ( CHECKS ) {
			checkPointer(ctx);
			checkNT1(name);
			checkBuffer(data, ndata);
		}
		return nnvgCreateFontMem(ctx, memAddress(name), memAddress(data), ndata, freeData);
	}

	/** Alternative version of: {@link #nvgCreateFontMem CreateFontMem} */
	public static int nvgCreateFontMem(long ctx, ByteBuffer name, ByteBuffer data, int freeData) {
		if ( CHECKS )
			checkPointer(ctx);
		return nnvgCreateFontMem(ctx, memAddress(name), memAddress(data), data.remaining(), freeData);
	}

	/** CharSequence version of: {@link #nvgCreateFontMem CreateFontMem} */
	public static int nvgCreateFontMem(long ctx, CharSequence name, ByteBuffer data, int freeData) {
		if ( CHECKS )
			checkPointer(ctx);
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		return nnvgCreateFontMem(ctx, __buffer.address(nameEncoded), memAddress(data), data.remaining(), freeData);
	}

	// --- [ nvgFindFont ] ---

	/** JNI method for {@link #nvgFindFont FindFont} */
	@JavadocExclude
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

	/** CharSequence version of: {@link #nvgFindFont FindFont} */
	public static int nvgFindFont(long ctx, CharSequence name) {
		if ( CHECKS )
			checkPointer(ctx);
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamASCII(name, true);
		return nnvgFindFont(ctx, __buffer.address(nameEncoded));
	}

	// --- [ nvgFontSize ] ---

	/** JNI method for {@link #nvgFontSize FontSize} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgFontBlur FontBlur} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgTextLetterSpacing TextLetterSpacing} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgTextLineHeight TextLineHeight} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgTextAlign TextAlign} */
	@JavadocExclude
	public static native void nnvgTextAlign(long ctx, int align);

	/**
	 * Sets the text align of current text style.
	 *
	 * @param ctx   the NanoVG context
	 * @param align the text align to set. One of:<br>{@link #NVG_ALIGN_LEFT ALIGN_LEFT}, {@link #NVG_ALIGN_CENTER ALIGN_CENTER}, {@link #NVG_ALIGN_RIGHT ALIGN_RIGHT}, {@link #NVG_ALIGN_TOP ALIGN_TOP}, {@link #NVG_ALIGN_MIDDLE ALIGN_MIDDLE}, {@link #NVG_ALIGN_BOTTOM ALIGN_BOTTOM}, {@link #NVG_ALIGN_BASELINE ALIGN_BASELINE}
	 */
	public static void nvgTextAlign(long ctx, int align) {
		if ( CHECKS )
			checkPointer(ctx);
		nnvgTextAlign(ctx, align);
	}

	// --- [ nvgFontFaceId ] ---

	/** JNI method for {@link #nvgFontFaceId FontFaceId} */
	@JavadocExclude
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

	/** JNI method for {@link #nvgFontFace FontFace} */
	@JavadocExclude
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

	/** CharSequence version of: {@link #nvgFontFace FontFace} */
	public static void nvgFontFace(long ctx, CharSequence font) {
		if ( CHECKS )
			checkPointer(ctx);
		APIBuffer __buffer = apiBuffer();
		int fontEncoded = __buffer.stringParamASCII(font, true);
		nnvgFontFace(ctx, __buffer.address(fontEncoded));
	}

	// --- [ nvgText ] ---

	/** JNI method for {@link #nvgText Text} */
	@JavadocExclude
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

	/** CharSequence version of: {@link #nvgText Text} */
	public static float nvgText(long ctx, float x, float y, CharSequence string, long end) {
		if ( CHECKS )
			checkPointer(ctx);
		APIBuffer __buffer = apiBuffer();
		int stringEncoded = __buffer.stringParamUTF8(string, true);
		return nnvgText(ctx, x, y, __buffer.address(stringEncoded), end);
	}

	// --- [ nvgTextBox ] ---

	/** JNI method for {@link #nvgTextBox TextBox} */
	@JavadocExclude
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

	/** CharSequence version of: {@link #nvgTextBox TextBox} */
	public static void nvgTextBox(long ctx, float x, float y, float breakRowWidth, CharSequence string, long end) {
		if ( CHECKS )
			checkPointer(ctx);
		APIBuffer __buffer = apiBuffer();
		int stringEncoded = __buffer.stringParamUTF8(string, true);
		nnvgTextBox(ctx, x, y, breakRowWidth, __buffer.address(stringEncoded), end);
	}

	// --- [ nvgTextBounds ] ---

	/** JNI method for {@link #nvgTextBounds TextBounds} */
	@JavadocExclude
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
	public static float nvgTextBounds(long ctx, float x, float y, ByteBuffer string, long end, ByteBuffer bounds) {
		if ( CHECKS ) {
			checkPointer(ctx);
			checkNT1(string);
			if ( bounds != null ) checkBuffer(bounds, 4 << 2);
		}
		return nnvgTextBounds(ctx, x, y, memAddress(string), end, memAddressSafe(bounds));
	}

	/** Alternative version of: {@link #nvgTextBounds TextBounds} */
	public static float nvgTextBounds(long ctx, float x, float y, ByteBuffer string, long end, FloatBuffer bounds) {
		if ( CHECKS ) {
			checkPointer(ctx);
			if ( bounds != null ) checkBuffer(bounds, 4);
		}
		return nnvgTextBounds(ctx, x, y, memAddress(string), end, memAddressSafe(bounds));
	}

	/** CharSequence version of: {@link #nvgTextBounds TextBounds} */
	public static float nvgTextBounds(long ctx, float x, float y, CharSequence string, long end, FloatBuffer bounds) {
		if ( CHECKS ) {
			checkPointer(ctx);
			if ( bounds != null ) checkBuffer(bounds, 4);
		}
		APIBuffer __buffer = apiBuffer();
		int stringEncoded = __buffer.stringParamUTF8(string, true);
		return nnvgTextBounds(ctx, x, y, __buffer.address(stringEncoded), end, memAddressSafe(bounds));
	}

	// --- [ nvgTextBoxBounds ] ---

	/** JNI method for {@link #nvgTextBoxBounds TextBoxBounds} */
	@JavadocExclude
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
	public static void nvgTextBoxBounds(long ctx, float x, float y, float breakRowWidth, ByteBuffer string, long end, ByteBuffer bounds) {
		if ( CHECKS ) {
			checkPointer(ctx);
			checkNT1(string);
			if ( bounds != null ) checkBuffer(bounds, 4 << 2);
		}
		nnvgTextBoxBounds(ctx, x, y, breakRowWidth, memAddress(string), end, memAddressSafe(bounds));
	}

	/** Alternative version of: {@link #nvgTextBoxBounds TextBoxBounds} */
	public static void nvgTextBoxBounds(long ctx, float x, float y, float breakRowWidth, ByteBuffer string, long end, FloatBuffer bounds) {
		if ( CHECKS ) {
			checkPointer(ctx);
			if ( bounds != null ) checkBuffer(bounds, 4);
		}
		nnvgTextBoxBounds(ctx, x, y, breakRowWidth, memAddress(string), end, memAddressSafe(bounds));
	}

	/** CharSequence version of: {@link #nvgTextBoxBounds TextBoxBounds} */
	public static void nvgTextBoxBounds(long ctx, float x, float y, float breakRowWidth, CharSequence string, long end, FloatBuffer bounds) {
		if ( CHECKS ) {
			checkPointer(ctx);
			if ( bounds != null ) checkBuffer(bounds, 4);
		}
		APIBuffer __buffer = apiBuffer();
		int stringEncoded = __buffer.stringParamUTF8(string, true);
		nnvgTextBoxBounds(ctx, x, y, breakRowWidth, __buffer.address(stringEncoded), end, memAddressSafe(bounds));
	}

	// --- [ nvgTextGlyphPositions ] ---

	/** JNI method for {@link #nvgTextGlyphPositions TextGlyphPositions} */
	@JavadocExclude
	public static native int nnvgTextGlyphPositions(long ctx, float x, float y, long string, long end, long positions, int maxPositions);

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
	public static int nvgTextGlyphPositions(long ctx, float x, float y, ByteBuffer string, long end, NVGGlyphPosition.Buffer positions, int maxPositions) {
		if ( CHECKS ) {
			checkPointer(ctx);
			checkNT1(string);
			checkBuffer(positions, maxPositions);
		}
		return nnvgTextGlyphPositions(ctx, x, y, memAddress(string), end, positions.address(), maxPositions);
	}

	/** Alternative version of: {@link #nvgTextGlyphPositions TextGlyphPositions} */
	public static int nvgTextGlyphPositions(long ctx, float x, float y, ByteBuffer string, long end, NVGGlyphPosition.Buffer positions) {
		if ( CHECKS )
			checkPointer(ctx);
		return nnvgTextGlyphPositions(ctx, x, y, memAddress(string), end, positions.address(), positions.remaining());
	}

	/** CharSequence version of: {@link #nvgTextGlyphPositions TextGlyphPositions} */
	public static int nvgTextGlyphPositions(long ctx, float x, float y, CharSequence string, long end, NVGGlyphPosition.Buffer positions) {
		if ( CHECKS )
			checkPointer(ctx);
		APIBuffer __buffer = apiBuffer();
		int stringEncoded = __buffer.stringParamUTF8(string, true);
		return nnvgTextGlyphPositions(ctx, x, y, __buffer.address(stringEncoded), end, positions.address(), positions.remaining());
	}

	// --- [ nvgTextMetrics ] ---

	/** JNI method for {@link #nvgTextMetrics TextMetrics} */
	@JavadocExclude
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
	public static void nvgTextMetrics(long ctx, ByteBuffer ascender, ByteBuffer descender, ByteBuffer lineh) {
		if ( CHECKS ) {
			checkPointer(ctx);
			if ( ascender != null ) checkBuffer(ascender, 1 << 2);
			if ( descender != null ) checkBuffer(descender, 1 << 2);
			if ( lineh != null ) checkBuffer(lineh, 1 << 2);
		}
		nnvgTextMetrics(ctx, memAddressSafe(ascender), memAddressSafe(descender), memAddressSafe(lineh));
	}

	/** Alternative version of: {@link #nvgTextMetrics TextMetrics} */
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

	/** JNI method for {@link #nvgTextBreakLines TextBreakLines} */
	@JavadocExclude
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
	 * @param maxRows       the maximum number of text rows to return
	 */
	public static int nvgTextBreakLines(long ctx, ByteBuffer string, long end, float breakRowWidth, NVGTextRow.Buffer rows, int maxRows) {
		if ( CHECKS ) {
			checkPointer(ctx);
			checkNT1(string);
			checkBuffer(rows, maxRows);
		}
		return nnvgTextBreakLines(ctx, memAddress(string), end, breakRowWidth, rows.address(), maxRows);
	}

	/** Alternative version of: {@link #nvgTextBreakLines TextBreakLines} */
	public static int nvgTextBreakLines(long ctx, ByteBuffer string, long end, float breakRowWidth, NVGTextRow.Buffer rows) {
		if ( CHECKS )
			checkPointer(ctx);
		return nnvgTextBreakLines(ctx, memAddress(string), end, breakRowWidth, rows.address(), rows.remaining());
	}

	/** CharSequence version of: {@link #nvgTextBreakLines TextBreakLines} */
	public static int nvgTextBreakLines(long ctx, CharSequence string, long end, float breakRowWidth, NVGTextRow.Buffer rows) {
		if ( CHECKS )
			checkPointer(ctx);
		APIBuffer __buffer = apiBuffer();
		int stringEncoded = __buffer.stringParamUTF8(string, true);
		return nnvgTextBreakLines(ctx, __buffer.address(stringEncoded), end, breakRowWidth, rows.address(), rows.remaining());
	}

}