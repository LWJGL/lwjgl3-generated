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
 * Native bindings to stb_truetype.h from the <a href="https://github.com/nothings/stb">stb library</a>.
 * 
 * <p>This library processes TrueType files:
 * <ul>
 * <li>parse files</li>
 * <li>extract glyph metrics</li>
 * <li>extract glyph shapes</li>
 * <li>render glyphs to one-channel bitmaps with antialiasing (box filter)</li>
 * </ul></p>
 * 
 * <h3>ADDITIONAL DOCUMENTATION</h3>
 * Some important concepts to understand to use this library:
 * 
 * <p><b>Codepoint</b></p>
 * 
 * <p>Characters are defined by unicode codepoints, e.g. 65 is uppercase A, 231 is lowercase c with a cedilla, 0x7e30 is the hiragana for "ma".</p>
 * 
 * <p><b>Glyph</b></p>
 * 
 * <p>A visual character shape (every codepoint is rendered as some glyph)</p>
 * 
 * <p><b>Glyph index</b></p>
 * 
 * <p>A font-specific integer ID representing a glyph</p>
 * 
 * <p><b>Baseline</b></p>
 * 
 * <p>Glyph shapes are defined relative to a baseline, which is the bottom of uppercase characters. Characters extend both above and below the baseline.</p>
 * 
 * <p><b>Current Point</b></p>
 * 
 * <p>As you draw text to the screen, you keep track of a "current point" which is the origin of each character. The current point's vertical position is the
 * baseline. Even "baked fonts" use this model.</p>
 * 
 * <p><b>Vertical Font Metrics</b></p>
 * 
 * <p>The vertical qualities of the font, used to vertically position and space the characters. See docs for {@link #stbtt_GetFontVMetrics GetFontVMetrics}.</p>
 * 
 * <p><b>Font Size in Pixels or Points</b></p>
 * 
 * <p>The preferred interface for specifying font sizes in stb_truetype is to specify how tall the font's vertical extent should be in pixels. If that sounds
 * good enough, skip the next paragraph.</p>
 * 
 * <p>Most font APIs instead use "points", which are a common typographic measurement for describing font size, defined as 72 points per inch. stb_truetype
 * provides a point API for compatibility. However, true "per inch" conventions don't make much sense on computer displays since different monitors have
 * different number of pixels per inch. For example, Windows traditionally uses a convention that there are 96 pixels per inch, thus making 'inch'
 * measurements have nothing to do with inches, and thus effectively defining a point to be 1.333 pixels. Additionally, the TrueType font data provides an
 * explicit scale factor to scale a given font's glyphs to points, but the author has observed that this scale factor is often wrong for non-commercial
 * fonts, thus making fonts scaled in points according to the TrueType spec incoherently sized in practice.</p>
 * 
 * <h3>ADVANCED USAGE</h3>
 * 
 * <p>Quality:
 * <ul>
 * <li>Use the functions with Subpixel at the end to allow your characters to have subpixel positioning. Since the font is anti-aliased, not hinted, this
 * is very important for quality. (This is not possible with baked fonts.)</li>
 * <li>Kerning is now supported, and if you're supporting subpixel rendering then kerning is worth using to give your text a polished look.</li>
 * </ul>
 * Performance:
 * <ul>
 * <li>Convert Unicode codepoints to glyph indexes and operate on the glyphs; if you don't do this, stb_truetype is forced to do the conversion on every
 * call.</li>
 * <li>There are a lot of memory allocations. We should modify it to take a temp buffer and allocate from the temp buffer (without freeing), should help
 * performance a lot.</li>
 * </ul></p>
 * 
 * <h3>NOTES</h3>
 * 
 * <p>The system uses the raw data found in the .ttf file without changing it and without building auxiliary data structures. This is a bit inefficient on
 * little-endian systems (the data is big-endian), but assuming you're caching the bitmaps or glyph shapes this shouldn't be a big deal.</p>
 * 
 * <p>It appears to be very hard to programmatically determine what font a given file is in a general way. I provide an API for this, but I don't recommend
 * it.</p>
 * 
 * <h3>SAMPLE PROGRAMS</h3>
 * 
 * <p>Incomplete text-in-3d-api example, which draws quads properly aligned to be lossless:
 * <pre><code style="font-family: monospace">
 * unsigned char ttf_buffer[1<<20];
 * unsigned char temp_bitmap[512*512];
 * 
 * stbtt_bakedchar cdata[96]; // ASCII 32..126 is 95 glyphs
 * GLuint ftex;
 * 
 * void my_stbtt_initfont(void)
 * {
 *    fread(ttf_buffer, 1, 1<<20, fopen("c:/windows/fonts/times.ttf", "rb"));
 *    stbtt_BakeFontBitmap(ttf_buffer,0, 32.0, temp_bitmap,512,512, 32,96, cdata); // no guarantee this fits!
 *    // can free ttf_buffer at this point
 *    glGenTextures(1, &ftex);
 *    glBindTexture(GL_TEXTURE_2D, ftex);
 *    glTexImage2D(GL_TEXTURE_2D, 0, GL_ALPHA, 512,512, 0, GL_ALPHA, GL_UNSIGNED_BYTE, temp_bitmap);
 *    // can free temp_bitmap at this point
 *    glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR);
 * }
 * 
 * void my_stbtt_print(float x, float y, char *text)
 * {
 *    // assume orthographic projection with units = screen pixels, origin at top left
 *    glEnable(GL_TEXTURE_2D);
 *    glBindTexture(GL_TEXTURE_2D, ftex);
 *    glBegin(GL_QUADS);
 *    while (*text) {
 *       if (*text >= 32 && *text < 128) {
 *          stbtt_aligned_quad q;
 *          stbtt_GetBakedQuad(cdata, 512,512, *text-32, &x,&y,&q,1);//1=opengl & d3d10+,0=d3d9
 *          glTexCoord2f(q.s0,q.t1); glVertex2f(q.x0,q.y0);
 *          glTexCoord2f(q.s1,q.t1); glVertex2f(q.x1,q.y0);
 *          glTexCoord2f(q.s1,q.t0); glVertex2f(q.x1,q.y1);
 *          glTexCoord2f(q.s0,q.t0); glVertex2f(q.x0,q.y1);
 *       }
 *       ++text;
 *    }
 *    glEnd();
 * }</code></pre>
 * Complete program (this compiles): get a single bitmap, print as ASCII art:
 * <pre><code style="font-family: monospace">
 * char ttf_buffer[1<<25];
 * 
 * int main(int argc, char **argv)
 * {
 *    stbtt_fontinfo font;
 *    unsigned char *bitmap;
 *    int w,h,i,j,c = (argc > 1 ? atoi(argv[1]) : 'a'), s = (argc > 2 ? atoi(argv[2]) : 20);
 * 
 *    fread(ttf_buffer, 1, 1<<25, fopen(argc > 3 ? argv[3] : "c:/windows/fonts/arialbd.ttf", "rb"));
 * 
 *    stbtt_InitFont(&font, ttf_buffer, stbtt_GetFontOffsetForIndex(ttf_buffer,0));
 *    bitmap = stbtt_GetCodepointBitmap(&font, 0,stbtt_ScaleForPixelHeight(&font, s), c, &w, &h, 0,0);
 * 
 *    for (j=0; j < h; ++j) {
 *       for (i=0; i < w; ++i)
 *          putchar(" .:ioVM@"[bitmap[j*w+i]>>5]);
 *       putchar('\n');
 *    }
 *    return 0;
 * }</code></pre>
 * Complete program: print "Hello World!" banner, with bugs:
 * <pre><code style="font-family: monospace">
 * char buffer[24<<20];
 * unsigned char screen[20][79];
 * 
 * int main(int arg, char **argv)
 * {
 *    stbtt_fontinfo font;
 *    int i,j,ascent,baseline,ch=0;
 *    float scale, xpos=2; // leave a little padding in case the character extends left
 *    char *text = "Heljo World!";
 * 
 *    fread(buffer, 1, 1000000, fopen("c:/windows/fonts/arialbd.ttf", "rb"));
 *    stbtt_InitFont(&font, buffer, 0);
 * 
 *    scale = stbtt_ScaleForPixelHeight(&font, 15);
 *    stbtt_GetFontVMetrics(&font, &ascent,0,0);
 *    baseline = (int) (ascent*scale);
 * 
 *    while (text[ch]) {
 *       int advance,lsb,x0,y0,x1,y1;
 *       float x_shift = xpos - (float) floor(xpos);
 *       stbtt_GetCodepointHMetrics(&font, text[ch], &advance, &lsb);
 *       stbtt_GetCodepointBitmapBoxSubpixel(&font, text[ch], scale,scale,x_shift,0, &x0,&y0,&x1,&y1);
 *       stbtt_MakeCodepointBitmapSubpixel(&font, &screen[baseline + y0][(int) xpos + x0], x1-x0,y1-y0, 79, scale,scale,x_shift,0, text[ch]);
 *       // note that this stomps the old data, so where character boxes overlap (e.g. 'lj') it's wrong
 *       // because this API is really for baking character bitmaps into textures. if you want to render
 *       // a sequence of characters, you really need to render each bitmap to a temp buffer, then
 *       // "alpha blend" that into the working buffer
 *       xpos += (advance * scale);
 *       if (text[ch+1])
 *          xpos += scale*stbtt_GetCodepointKernAdvance(&font, text[ch],text[ch+1]);
 *       ++ch;
 *    }
 * 
 *    for (j=0; j < 20; ++j) {
 *       for (i=0; i < 78; ++i)
 *          putchar(" .:ioVM@"[screen[j][i]>>5]);
 *       putchar('\n');
 *    }
 * 
 *    return 0;
 * }</code></pre>
 * <h3>Finding the right font...</h3></p>
 * 
 * <p>You should really just solve this offline, keep your own tables of what font is what, and don't try to get it out of the .ttf file. That's because
 * getting it out of the .ttf file is really hard, because the names in the file can appear in many possible encodings, in many possible languages, and
 * e.g. if you need a case-insensitive comparison, the details of that depend on the encoding & language in a complex way (actually underspecified in
 * truetype, but also gigantic).</p>
 * 
 * <p>But you can use the provided functions in two possible ways:
 * <ul>
 * <li>{@link #stbtt_FindMatchingFont FindMatchingFont} will use *case-sensitive* comparisons on unicode-encoded names to try to find the font you want; you can run this before
 * calling {@link #stbtt_InitFont InitFont}</li>
 * <li>{@link #stbtt_GetFontNameString GetFontNameString} lets you get any of the various strings from the file yourself and do your own comparisons on them. You have to have called
 * {@link #stbtt_InitFont InitFont} first.</li>
 * </ul></p>
 */
public final class STBTruetype {

	/** Vertex type. */
	public static final byte
		STBTT_vmove  = 0x1,
		STBTT_vline  = 0x2,
		STBTT_vcurve = 0x3;

	/** Style flags, use in {@link #stbtt_FindMatchingFont FindMatchingFont}. */
	public static final int
		STBTT_MACSTYLE_DONTCARE   = 0x0,
		STBTT_MACSTYLE_BOLD       = 0x1,
		STBTT_MACSTYLE_ITALIC     = 0x2,
		STBTT_MACSTYLE_UNDERSCORE = 0x4,
		STBTT_MACSTYLE_NONE       = 0x8;

	/** Platform IDs. */
	public static final int
		STBTT_PLATFORM_ID_UNICODE   = 0x0,
		STBTT_PLATFORM_ID_MAC       = 0x1,
		STBTT_PLATFORM_ID_ISO       = 0x2,
		STBTT_PLATFORM_ID_MICROSOFT = 0x3;

	/** Encoding IDs for {@link #STBTT_PLATFORM_ID_UNICODE PLATFORM_ID_UNICODE}. */
	public static final int
		STBTT_UNICODE_EID_UNICODE_1_0      = 0x0,
		STBTT_UNICODE_EID_UNICODE_1_1      = 0x1,
		STBTT_UNICODE_EID_ISO_10646        = 0x2,
		STBTT_UNICODE_EID_UNICODE_2_0_BMP  = 0x3,
		STBTT_UNICODE_EID_UNICODE_2_0_FULL = 0x4;

	/** Encoding IDs for {@link #STBTT_PLATFORM_ID_MICROSOFT PLATFORM_ID_MICROSOFT}. */
	public static final int
		STBTT_MS_EID_SYMBOL       = 0x0,
		STBTT_MS_EID_UNICODE_BMP  = 0x1,
		STBTT_MS_EID_SHIFTJIS     = 0x2,
		STBTT_MS_EID_UNICODE_FULL = 0xA;

	/** Encoding IDs for {@link #STBTT_PLATFORM_ID_MAC PLATFORM_ID_MAC}. */
	public static final int
		STBTT_MAC_EID_ROMAN        = 0x0,
		STBTT_MAC_EID_JAPANESE     = 0x1,
		STBTT_MAC_EID_CHINESE_TRAD = 0x2,
		STBTT_MAC_EID_KOREAN       = 0x3,
		STBTT_MAC_EID_ARABIC       = 0x4,
		STBTT_MAC_EID_HEBREW       = 0x5,
		STBTT_MAC_EID_GREEK        = 0x6,
		STBTT_MAC_EID_RUSSIAN      = 0x7;

	/** Language ID for {@link #STBTT_PLATFORM_ID_MICROSOFT PLATFORM_ID_MICROSOFT}. */
	public static final int
		STBTT_MS_LANG_ENGLISH  = 0x409,
		STBTT_MS_LANG_CHINESE  = 0x804,
		STBTT_MS_LANG_DUTCH    = 0x413,
		STBTT_MS_LANG_FRENCH   = 0x40C,
		STBTT_MS_LANG_GERMAN   = 0x407,
		STBTT_MS_LANG_HEBREW   = 0x40D,
		STBTT_MS_LANG_ITALIAN  = 0x410,
		STBTT_MS_LANG_JAPANESE = 0x411,
		STBTT_MS_LANG_KOREAN   = 0x412,
		STBTT_MS_LANG_RUSSIAN  = 0x419,
		STBTT_MS_LANG_SPANISH  = 0x409,
		STBTT_MS_LANG_SWEDISH  = 0x41D;

	/** Language ID for {@link #STBTT_PLATFORM_ID_MAC PLATFORM_ID_MAC}. */
	public static final int
		STBTT_MAC_LANG_ENGLISH            = 0x0,
		STBTT_MAC_LANG_ARABIC             = 0xC,
		STBTT_MAC_LANG_DUTCH              = 0x4,
		STBTT_MAC_LANG_FRENCH             = 0x1,
		STBTT_MAC_LANG_GERMAN             = 0x2,
		STBTT_MAC_LANG_HEBREW             = 0xA,
		STBTT_MAC_LANG_ITALIAN            = 0x3,
		STBTT_MAC_LANG_JAPANESE           = 0xB,
		STBTT_MAC_LANG_KOREAN             = 0x17,
		STBTT_MAC_LANG_RUSSIAN            = 0x20,
		STBTT_MAC_LANG_SPANISH            = 0x6,
		STBTT_MAC_LANG_SWEDISH            = 0x5,
		STBTT_MAC_LANG_CHINESE_SIMPLIFIED = 0x21,
		STBTT_MAC_LANG_CHINESE_TRAD       = 0x13;

	static { LWJGLUtil.initialize(); }

	private STBTruetype() {}

	// --- [ stbtt_BakeFontBitmap ] ---

	/** JNI method for {@link #stbtt_BakeFontBitmap BakeFontBitmap} */
	@JavadocExclude
	public static native int nstbtt_BakeFontBitmap(long data, int offset, float pixel_height, long pixels, int pw, int ph, int first_char, int num_chars, long chardata);

	/**
	 * Bakes a font to a bitmap for use as texture.
	 * 
	 * <p>This uses a very simply packing, use with {@link #stbtt_GetBakedQuad GetBakedQuad}.</p>
	 *
	 * @param data         the font data
	 * @param offset       the font data offset, use 0 for plain .ttf files
	 * @param pixel_height the font height, in pixels
	 * @param pixels       a buffer in which to write the font bitmap
	 * @param pw           the bitmap width, in pixels
	 * @param ph           the bitmap height, in pixels
	 * @param first_char   the first character to bake
	 * @param num_chars    the number of characters to bake, starting at {@code first_char}
	 * @param chardata     an array of {@link STBTTBakedChar} structs, it's {@code num_chars} long
	 *
	 * @return if positive, the first unused row of the bitmap. If negative, returns the negative of the number of characters that fit. If 0, no characters fit and no
	 *         rows were used.
	 */
	public static int stbtt_BakeFontBitmap(ByteBuffer data, int offset, float pixel_height, ByteBuffer pixels, int pw, int ph, int first_char, int num_chars, ByteBuffer chardata) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(pixels, pw * ph);
			checkBuffer(chardata, num_chars * STBTTBakedChar.SIZEOF);
		}
		return nstbtt_BakeFontBitmap(memAddress(data), offset, pixel_height, memAddress(pixels), pw, ph, first_char, num_chars, memAddress(chardata));
	}

	/** Alternative version of: {@link #stbtt_BakeFontBitmap BakeFontBitmap} */
	public static int stbtt_BakeFontBitmap(ByteBuffer data, float pixel_height, ByteBuffer pixels, int pw, int ph, int first_char, ByteBuffer chardata) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(pixels, pw * ph);
		return nstbtt_BakeFontBitmap(memAddress(data), 0, pixel_height, memAddress(pixels), pw, ph, first_char, chardata.remaining() / STBTTBakedChar.SIZEOF, memAddress(chardata));
	}

	// --- [ stbtt_GetBakedQuad ] ---

	/** JNI method for {@link #stbtt_GetBakedQuad GetBakedQuad} */
	@JavadocExclude
	public static native void nstbtt_GetBakedQuad(long chardata, int pw, int ph, int char_index, long xpos, long ypos, long q, int opengl_fillrule);

	/**
	 * Computes quad to draw for a given char and advances the current position.
	 * 
	 * <p>The coordinate system used assumes y increases downwards. Characters will extend both above and below the current position; see discussion of
	 * "BASELINE" above.</p>
	 *
	 * @param chardata        an array of {@link STBTTBakedChar} structs
	 * @param pw              the bitmap width, in pixels
	 * @param ph              the bitmap height, in pixels
	 * @param char_index      the character index in the {@code chardata} array
	 * @param xpos            the current x position, in screen pixel space
	 * @param ypos            the current y position, in screen pixel space
	 * @param q               an {@link STBTTAlignedQuad} struct in which to return the quad to draw
	 * @param opengl_fillrule 1 if opengl fill rule; 0 if DX9 or earlier
	 */
	public static void stbtt_GetBakedQuad(ByteBuffer chardata, int pw, int ph, int char_index, ByteBuffer xpos, ByteBuffer ypos, ByteBuffer q, int opengl_fillrule) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(chardata, char_index + 1 * STBTTBakedChar.SIZEOF);
			checkBuffer(xpos, 1 << 2);
			checkBuffer(ypos, 1 << 2);
			checkBuffer(q, STBTTAlignedQuad.SIZEOF);
		}
		nstbtt_GetBakedQuad(memAddress(chardata), pw, ph, char_index, memAddress(xpos), memAddress(ypos), memAddress(q), opengl_fillrule);
	}

	/** Alternative version of: {@link #stbtt_GetBakedQuad GetBakedQuad} */
	public static void stbtt_GetBakedQuad(ByteBuffer chardata, int pw, int ph, int char_index, FloatBuffer xpos, FloatBuffer ypos, ByteBuffer q, int opengl_fillrule) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(chardata, char_index + 1 * STBTTBakedChar.SIZEOF);
			checkBuffer(xpos, 1);
			checkBuffer(ypos, 1);
			checkBuffer(q, STBTTAlignedQuad.SIZEOF);
		}
		nstbtt_GetBakedQuad(memAddress(chardata), pw, ph, char_index, memAddress(xpos), memAddress(ypos), memAddress(q), opengl_fillrule);
	}

	// --- [ stbtt_PackBegin ] ---

	/** JNI method for {@link #stbtt_PackBegin PackBegin} */
	@JavadocExclude
	public static native int nstbtt_PackBegin(long spc, long pixels, int width, int height, int stride_in_bytes, int padding, long alloc_context);

	/**
	 * Initializes a packing context stored in the passed-in {@code stbtt_pack_context}. Future calls using this context will pack characters into the bitmap
	 * passed in here: a 1-channel bitmap that is width x height.
	 *
	 * @param spc             an {@link STBTTPackContext} struct
	 * @param pixels          a buffer in which to store the bitmap data
	 * @param width           the bitmap width, in pixels
	 * @param height          the bitmap height, in pixels
	 * @param stride_in_bytes the distance from one row to the next (or 0 to mean they are packed tightly together)
	 * @param padding         the amount of padding to leave between each character (normally you want '1' for bitmaps you'll use as textures with bilinear filtering)
	 * @param alloc_context   a pointer to an allocation context
	 *
	 * @return 1 on success, 0 on failure
	 */
	public static int stbtt_PackBegin(ByteBuffer spc, ByteBuffer pixels, int width, int height, int stride_in_bytes, int padding, ByteBuffer alloc_context) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(spc, STBTTPackContext.SIZEOF);
			checkBuffer(pixels, width * height);
		}
		return nstbtt_PackBegin(memAddress(spc), memAddress(pixels), width, height, stride_in_bytes, padding, memAddressSafe(alloc_context));
	}

	/** Alternative version of: {@link #stbtt_PackBegin PackBegin} */
	public static int stbtt_PackBegin(ByteBuffer spc, ByteBuffer pixels, int width, int height, int stride_in_bytes, int padding) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(spc, STBTTPackContext.SIZEOF);
			checkBuffer(pixels, width * height);
		}
		return nstbtt_PackBegin(memAddress(spc), memAddress(pixels), width, height, stride_in_bytes, padding, 0L);
	}

	// --- [ stbtt_PackEnd ] ---

	/** JNI method for {@link #stbtt_PackEnd PackEnd} */
	@JavadocExclude
	public static native void nstbtt_PackEnd(long spc);

	/**
	 * Cleans up the packing context and frees all memory.
	 *
	 * @param spc an {@link STBTTPackContext} struct
	 */
	public static void stbtt_PackEnd(ByteBuffer spc) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(spc, STBTTPackContext.SIZEOF);
		nstbtt_PackEnd(memAddress(spc));
	}

	// --- [ STBTT_POINT_SIZE ] ---

	/**
	 * Converts the full height of a character from ascender to descender, as computed by {@link #stbtt_ScaleForPixelHeight ScaleForPixelHeight}, to a point size as computed by
	 * {@link #stbtt_ScaleForMappingEmToPixels ScaleForMappingEmToPixels}.
	 *
	 * @param font_size the full height of a character
	 *
	 * @return the point size of the character
	 */
	public static native int STBTT_POINT_SIZE(int font_size);

	// --- [ stbtt_PackFontRange ] ---

	/** JNI method for {@link #stbtt_PackFontRange PackFontRange} */
	@JavadocExclude
	public static native int nstbtt_PackFontRange(long spc, long fontdata, int font_index, float font_size, int first_unicode_char_in_range, int num_chars_in_range, long chardata_for_range);

	/**
	 * Creates character bitmaps from the {@code font_index}'th font found in fontdata (use {@code font_index=0} if you don't know what that is). It creates
	 * {@code num_chars_in_range} bitmaps for characters with unicode values starting at {@code first_unicode_char_in_range} and increasing. Data for how to
	 * render them is stored in {@code chardata_for_range}; pass these to {@link #stbtt_GetPackedQuad GetPackedQuad} to get back renderable quads.
	 *
	 * @param spc                         an {@link STBTTPackContext} struct
	 * @param fontdata                    the font data
	 * @param font_index                  the font index (use 0 if you don't know what that is
	 * @param font_size                   the full height of the character from ascender to descender, as computed by {@link #stbtt_ScaleForPixelHeight ScaleForPixelHeight}. To use a point size as computed by
	 *                                    {@link #stbtt_ScaleForMappingEmToPixels ScaleForMappingEmToPixels}, wrap the font size in {@link #STBTT_POINT_SIZE} and pass the result, i.e.:
	 *                                    <pre><code style="font-family: monospace">
	 *                                    ...,                  20 , ... // font max minus min y is 20 pixels tall
	 *                                    ..., STBTT_POINT_SIZE(20), ... // 'M' is 20 pixels tall</code></pre>
	 * @param first_unicode_char_in_range the first unicode code point in the range
	 * @param num_chars_in_range          the number of unicode code points in the range
	 * @param chardata_for_range          an array of {@link STBTTPackedchar} structs
	 *
	 * @return 1 on success, 0 on failure
	 */
	public static int stbtt_PackFontRange(ByteBuffer spc, ByteBuffer fontdata, int font_index, float font_size, int first_unicode_char_in_range, int num_chars_in_range, ByteBuffer chardata_for_range) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(spc, STBTTPackContext.SIZEOF);
			checkBuffer(chardata_for_range, num_chars_in_range * STBTTPackedchar.SIZEOF);
		}
		return nstbtt_PackFontRange(memAddress(spc), memAddress(fontdata), font_index, font_size, first_unicode_char_in_range, num_chars_in_range, memAddress(chardata_for_range));
	}

	/** Alternative version of: {@link #stbtt_PackFontRange PackFontRange} */
	public static int stbtt_PackFontRange(ByteBuffer spc, ByteBuffer fontdata, int font_index, float font_size, int first_unicode_char_in_range, ByteBuffer chardata_for_range) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(spc, STBTTPackContext.SIZEOF);
		return nstbtt_PackFontRange(memAddress(spc), memAddress(fontdata), font_index, font_size, first_unicode_char_in_range, chardata_for_range.remaining() / STBTTPackedchar.SIZEOF, memAddress(chardata_for_range));
	}

	// --- [ stbtt_PackFontRanges ] ---

	/** JNI method for {@link #stbtt_PackFontRanges PackFontRanges} */
	@JavadocExclude
	public static native int nstbtt_PackFontRanges(long spc, long fontdata, int font_index, long ranges, int num_ranges);

	/**
	 * Creates character bitmaps from multiple ranges of characters stored in ranges. This will usually create a better-packed bitmap than multiple calls to
	 * {@link #stbtt_PackFontRange PackFontRange}.
	 *
	 * @param spc        an {@link STBTTPackContext} struct
	 * @param fontdata   the font data
	 * @param font_index the font index (use 0 if you don't know what that is
	 * @param ranges     an array of {@link STBTTPackRange} structs
	 * @param num_ranges the number of {@link STBTTPackRange} structs in {@code ranges}
	 *
	 * @return 1 on success, 0 on failure
	 */
	public static int stbtt_PackFontRanges(ByteBuffer spc, ByteBuffer fontdata, int font_index, ByteBuffer ranges, int num_ranges) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(spc, STBTTPackContext.SIZEOF);
			checkBuffer(ranges, num_ranges * STBTTPackRange.SIZEOF);
		}
		return nstbtt_PackFontRanges(memAddress(spc), memAddress(fontdata), font_index, memAddress(ranges), num_ranges);
	}

	/** Alternative version of: {@link #stbtt_PackFontRanges PackFontRanges} */
	public static int stbtt_PackFontRanges(ByteBuffer spc, ByteBuffer fontdata, int font_index, ByteBuffer ranges) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(spc, STBTTPackContext.SIZEOF);
		return nstbtt_PackFontRanges(memAddress(spc), memAddress(fontdata), font_index, memAddress(ranges), ranges.remaining() / STBTTPackRange.SIZEOF);
	}

	// --- [ stbtt_PackSetOversampling ] ---

	/** JNI method for {@link #stbtt_PackSetOversampling PackSetOversampling} */
	@JavadocExclude
	public static native void nstbtt_PackSetOversampling(long spc, int h_oversample, int v_oversample);

	/**
	 * Oversampling a font increases the quality by allowing higher-quality subpixel positioning, and is especially valuable at smaller text sizes.
	 * 
	 * <p>This function sets the amount of oversampling for all following calls to {@link #stbtt_PackFontRange PackFontRange}. The default (no oversampling) is achieved by
	 * {@code h_oversample=1, v_oversample=1}. The total number of pixels required is {@code h_oversample*v_oversample} larger than the default; for example,
	 * 2x2 oversampling requires 4x the storage of 1x1. For best results, render oversampled textures with bilinear filtering. Look at the readme in
	 * <a href="https://github.com/nothings/stb/blob/master/tests/oversample/README.md">stb/tests/oversample</a> for information about oversampled fonts.</p>
	 *
	 * @param spc          an {@link STBTTPackContext} struct
	 * @param h_oversample the horizontal oversampling amount
	 * @param v_oversample the vertical oversampling amount
	 */
	public static void stbtt_PackSetOversampling(ByteBuffer spc, int h_oversample, int v_oversample) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(spc, STBTTPackContext.SIZEOF);
		nstbtt_PackSetOversampling(memAddress(spc), h_oversample, v_oversample);
	}

	// --- [ stbtt_GetPackedQuad ] ---

	/** JNI method for {@link #stbtt_GetPackedQuad GetPackedQuad} */
	@JavadocExclude
	public static native void nstbtt_GetPackedQuad(long chardata, int pw, int ph, int char_index, long xpos, long ypos, long q, int align_to_integer);

	/**
	 * Computes quad to draw for a given char and advances the current position.
	 * 
	 * <p>The coordinate system used assumes y increases downwards. Characters will extend both above and below the current position; see discussion of
	 * "BASELINE" above.</p>
	 *
	 * @param chardata         an array of {@link STBTTPackedchar} structs
	 * @param pw               the bitmap width, in pixels
	 * @param ph               the bitmap height, in pixels
	 * @param char_index       the character index in the {@code chardata} array
	 * @param xpos             the current x position, in screen pixel space
	 * @param ypos             the current y position, in screen pixel space
	 * @param q                an {@link STBTTAlignedQuad} struct in which to return the quad to draw
	 * @param align_to_integer 1 to align the quad to integer coordinates
	 */
	public static void stbtt_GetPackedQuad(ByteBuffer chardata, int pw, int ph, int char_index, ByteBuffer xpos, ByteBuffer ypos, ByteBuffer q, int align_to_integer) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(chardata, char_index + 1 * STBTTPackedchar.SIZEOF);
			checkBuffer(xpos, 1 << 2);
			checkBuffer(ypos, 1 << 2);
			checkBuffer(q, STBTTAlignedQuad.SIZEOF);
		}
		nstbtt_GetPackedQuad(memAddress(chardata), pw, ph, char_index, memAddress(xpos), memAddress(ypos), memAddress(q), align_to_integer);
	}

	/** Alternative version of: {@link #stbtt_GetPackedQuad GetPackedQuad} */
	public static void stbtt_GetPackedQuad(ByteBuffer chardata, int pw, int ph, int char_index, FloatBuffer xpos, FloatBuffer ypos, ByteBuffer q, int align_to_integer) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(chardata, char_index + 1 * STBTTPackedchar.SIZEOF);
			checkBuffer(xpos, 1);
			checkBuffer(ypos, 1);
			checkBuffer(q, STBTTAlignedQuad.SIZEOF);
		}
		nstbtt_GetPackedQuad(memAddress(chardata), pw, ph, char_index, memAddress(xpos), memAddress(ypos), memAddress(q), align_to_integer);
	}

	// --- [ stbtt_GetFontOffsetForIndex ] ---

	/** JNI method for {@link #stbtt_GetFontOffsetForIndex GetFontOffsetForIndex} */
	@JavadocExclude
	public static native int nstbtt_GetFontOffsetForIndex(long data, int index);

	/**
	 * Each .ttf/.ttc file may have more than one font. Each font has a sequential index number starting from 0. Call this function to get the font offset for
	 * a given index; it returns -1 if the index is out of range. A regular .ttf file will only define one font and it always be at offset 0, so it will
	 * return '0' for index 0, and -1 for all other indices. You can just skip this step if you know it's that kind of font.
	 *
	 * @param data  the font data
	 * @param index the font index
	 */
	public static int stbtt_GetFontOffsetForIndex(ByteBuffer data, int index) {
		return nstbtt_GetFontOffsetForIndex(memAddress(data), index);
	}

	// --- [ stbtt_InitFont ] ---

	/** JNI method for {@link #stbtt_InitFont InitFont} */
	@JavadocExclude
	public static native int nstbtt_InitFont(long info, long data, int offset);

	/**
	 * Given an offset into the file that defines a font, this function builds the necessary cached info for the rest of the system. You must allocate the
	 * {@link STBTTFontinfo} yourself, and stbtt_InitFont will fill it out. You don't need to do anything special to free it, because the contents are pure value
	 * data with no additional data structures.
	 *
	 * @param info   an {@link STBTTFontinfo} struct
	 * @param data   the font data
	 * @param offset the font data offset
	 *
	 * @return 1 on success, 0 on failure
	 */
	public static int stbtt_InitFont(ByteBuffer info, ByteBuffer data, int offset) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(info, STBTTFontinfo.SIZEOF);
		return nstbtt_InitFont(memAddress(info), memAddress(data), offset);
	}

	/** Alternative version of: {@link #stbtt_InitFont InitFont} */
	public static int stbtt_InitFont(ByteBuffer info, ByteBuffer data) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(info, STBTTFontinfo.SIZEOF);
		return nstbtt_InitFont(memAddress(info), memAddress(data), 0);
	}

	// --- [ stbtt_FindGlyphIndex ] ---

	/** JNI method for {@link #stbtt_FindGlyphIndex FindGlyphIndex} */
	@JavadocExclude
	public static native int nstbtt_FindGlyphIndex(long info, int unicode_codepoint);

	/**
	 * If you're going to perform multiple operations on the same character and you want a speed-up, call this function with the character you're going to
	 * process, then use glyph-based functions instead of the codepoint-based functions.
	 *
	 * @param info              an {@link STBTTFontinfo} struct
	 * @param unicode_codepoint the unicode code point
	 *
	 * @return the glyph index
	 */
	public static int stbtt_FindGlyphIndex(ByteBuffer info, int unicode_codepoint) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(info, STBTTFontinfo.SIZEOF);
		return nstbtt_FindGlyphIndex(memAddress(info), unicode_codepoint);
	}

	// --- [ stbtt_ScaleForPixelHeight ] ---

	/** JNI method for {@link #stbtt_ScaleForPixelHeight ScaleForPixelHeight} */
	@JavadocExclude
	public static native float nstbtt_ScaleForPixelHeight(long info, float pixels);

	/**
	 * Computes a scale factor to produce a font whose "height" is {@code pixels} tall. Height is measured as the distance from the highest ascender to the
	 * lowest descender; in other words, it's equivalent to calling {@link #stbtt_GetFontVMetrics GetFontVMetrics} and computing:
	 * <pre><code style="font-family: monospace">
	 * scale = pixels / (ascent - descent)</code></pre>
	 * so if you prefer to measure height by the ascent only, use a similar calculation.
	 *
	 * @param info   an {@link STBTTFontinfo} struct
	 * @param pixels the font height, in pixels
	 *
	 * @return the scale factor
	 */
	public static float stbtt_ScaleForPixelHeight(ByteBuffer info, float pixels) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(info, STBTTFontinfo.SIZEOF);
		return nstbtt_ScaleForPixelHeight(memAddress(info), pixels);
	}

	// --- [ stbtt_ScaleForMappingEmToPixels ] ---

	/** JNI method for {@link #stbtt_ScaleForMappingEmToPixels ScaleForMappingEmToPixels} */
	@JavadocExclude
	public static native float nstbtt_ScaleForMappingEmToPixels(long info, float pixels);

	/**
	 * Computes a scale factor to produce a font whose EM size is mapped to {@code pixels} tall. This is probably what traditional APIs compute, but I'm not
	 * positive.
	 *
	 * @param info   an {@link STBTTFontinfo} struct
	 * @param pixels the font height, in pixels
	 *
	 * @return the scale factor
	 */
	public static float stbtt_ScaleForMappingEmToPixels(ByteBuffer info, float pixels) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(info, STBTTFontinfo.SIZEOF);
		return nstbtt_ScaleForMappingEmToPixels(memAddress(info), pixels);
	}

	// --- [ stbtt_GetFontVMetrics ] ---

	/** JNI method for {@link #stbtt_GetFontVMetrics GetFontVMetrics} */
	@JavadocExclude
	public static native void nstbtt_GetFontVMetrics(long info, long ascent, long descent, long lineGap);

	/**
	 * Returns vertical metrics for the specified font. You should advance the vertical position by {@code *ascent - *descent + *lineGap}
	 * 
	 * <p>The returned values are expressed in unscaled coordinates, so you must multiply by the scale factor for a given size.</p>
	 *
	 * @param info    an {@link STBTTFontinfo} struct
	 * @param ascent  returns the coordinate above the baseline the font extends
	 * @param descent returns the coordinate below the baseline the font extends (i.e. it is typically negative)
	 * @param lineGap returns the spacing between one row's descent and the next row's ascent
	 */
	public static void stbtt_GetFontVMetrics(ByteBuffer info, ByteBuffer ascent, ByteBuffer descent, ByteBuffer lineGap) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(info, STBTTFontinfo.SIZEOF);
			checkBuffer(ascent, 1 << 2);
			checkBuffer(descent, 1 << 2);
			checkBuffer(lineGap, 1 << 2);
		}
		nstbtt_GetFontVMetrics(memAddress(info), memAddress(ascent), memAddress(descent), memAddress(lineGap));
	}

	/** Alternative version of: {@link #stbtt_GetFontVMetrics GetFontVMetrics} */
	public static void stbtt_GetFontVMetrics(ByteBuffer info, IntBuffer ascent, IntBuffer descent, IntBuffer lineGap) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(info, STBTTFontinfo.SIZEOF);
			checkBuffer(ascent, 1);
			checkBuffer(descent, 1);
			checkBuffer(lineGap, 1);
		}
		nstbtt_GetFontVMetrics(memAddress(info), memAddress(ascent), memAddress(descent), memAddress(lineGap));
	}

	// --- [ stbtt_GetFontBoundingBox ] ---

	/** JNI method for {@link #stbtt_GetFontBoundingBox GetFontBoundingBox} */
	@JavadocExclude
	public static native void nstbtt_GetFontBoundingBox(long info, long x0, long y0, long x1, long y1);

	/**
	 * Returns the bounding box around all possible characters.
	 *
	 * @param info an {@link STBTTFontinfo} struct
	 * @param x0   the left coordinate
	 * @param y0   the bottom coordinate
	 * @param x1   the right coordinate
	 * @param y1   the top coordinate
	 */
	public static void stbtt_GetFontBoundingBox(ByteBuffer info, ByteBuffer x0, ByteBuffer y0, ByteBuffer x1, ByteBuffer y1) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(info, STBTTFontinfo.SIZEOF);
			checkBuffer(x0, 1 << 2);
			checkBuffer(y0, 1 << 2);
			checkBuffer(x1, 1 << 2);
			checkBuffer(y1, 1 << 2);
		}
		nstbtt_GetFontBoundingBox(memAddress(info), memAddress(x0), memAddress(y0), memAddress(x1), memAddress(y1));
	}

	/** Alternative version of: {@link #stbtt_GetFontBoundingBox GetFontBoundingBox} */
	public static void stbtt_GetFontBoundingBox(ByteBuffer info, IntBuffer x0, IntBuffer y0, IntBuffer x1, IntBuffer y1) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(info, STBTTFontinfo.SIZEOF);
			checkBuffer(x0, 1);
			checkBuffer(y0, 1);
			checkBuffer(x1, 1);
			checkBuffer(y1, 1);
		}
		nstbtt_GetFontBoundingBox(memAddress(info), memAddress(x0), memAddress(y0), memAddress(x1), memAddress(y1));
	}

	// --- [ stbtt_GetCodepointHMetrics ] ---

	/** JNI method for {@link #stbtt_GetCodepointHMetrics GetCodepointHMetrics} */
	@JavadocExclude
	public static native void nstbtt_GetCodepointHMetrics(long info, int codepoint, long advanceWidth, long leftSideBearing);

	/**
	 * Returns horizontal metrics for the specified codepoint.
	 * 
	 * <p>The returned values are expressed in unscaled coordinates.</p>
	 *
	 * @param info            an {@link STBTTFontinfo} struct
	 * @param codepoint       the unicode codepoint
	 * @param advanceWidth    the offset from the current horizontal position to the next horizontal position
	 * @param leftSideBearing the offset from the current horizontal position to the left edge of the character
	 */
	public static void stbtt_GetCodepointHMetrics(ByteBuffer info, int codepoint, ByteBuffer advanceWidth, ByteBuffer leftSideBearing) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(info, STBTTFontinfo.SIZEOF);
			checkBuffer(advanceWidth, 1 << 2);
			checkBuffer(leftSideBearing, 1 << 2);
		}
		nstbtt_GetCodepointHMetrics(memAddress(info), codepoint, memAddress(advanceWidth), memAddress(leftSideBearing));
	}

	/** Alternative version of: {@link #stbtt_GetCodepointHMetrics GetCodepointHMetrics} */
	public static void stbtt_GetCodepointHMetrics(ByteBuffer info, int codepoint, IntBuffer advanceWidth, IntBuffer leftSideBearing) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(info, STBTTFontinfo.SIZEOF);
			checkBuffer(advanceWidth, 1);
			checkBuffer(leftSideBearing, 1);
		}
		nstbtt_GetCodepointHMetrics(memAddress(info), codepoint, memAddress(advanceWidth), memAddress(leftSideBearing));
	}

	// --- [ stbtt_GetCodepointKernAdvance ] ---

	/** JNI method for {@link #stbtt_GetCodepointKernAdvance GetCodepointKernAdvance} */
	@JavadocExclude
	public static native int nstbtt_GetCodepointKernAdvance(long info, int ch1, int ch2);

	/**
	 * Returns the additional amount to add to the {@code advance} value between {@code ch1} and {@code ch2}.
	 *
	 * @param info an {@link STBTTFontinfo} struct
	 * @param ch1  the first unicode codepoint
	 * @param ch2  the second unicode codepoint
	 */
	public static int stbtt_GetCodepointKernAdvance(ByteBuffer info, int ch1, int ch2) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(info, STBTTFontinfo.SIZEOF);
		return nstbtt_GetCodepointKernAdvance(memAddress(info), ch1, ch2);
	}

	// --- [ stbtt_GetCodepointBox ] ---

	/** JNI method for {@link #stbtt_GetCodepointBox GetCodepointBox} */
	@JavadocExclude
	public static native int nstbtt_GetCodepointBox(long info, int codepoint, long x0, long y0, long x1, long y1);

	/**
	 * Gets the bounding box of the visible part of the glyph, in unscaled coordinates.
	 *
	 * @param info      an {@link STBTTFontinfo} struct
	 * @param codepoint the unicode codepoint
	 * @param x0        returns the left coordinate
	 * @param y0        returns the bottom coordinate
	 * @param x1        returns the right coordinate
	 * @param y1        returns the top coordinate
	 */
	public static int stbtt_GetCodepointBox(ByteBuffer info, int codepoint, ByteBuffer x0, ByteBuffer y0, ByteBuffer x1, ByteBuffer y1) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(info, STBTTFontinfo.SIZEOF);
			checkBuffer(x0, 1 << 2);
			checkBuffer(y0, 1 << 2);
			checkBuffer(x1, 1 << 2);
			checkBuffer(y1, 1 << 2);
		}
		return nstbtt_GetCodepointBox(memAddress(info), codepoint, memAddress(x0), memAddress(y0), memAddress(x1), memAddress(y1));
	}

	/** Alternative version of: {@link #stbtt_GetCodepointBox GetCodepointBox} */
	public static int stbtt_GetCodepointBox(ByteBuffer info, int codepoint, IntBuffer x0, IntBuffer y0, IntBuffer x1, IntBuffer y1) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(info, STBTTFontinfo.SIZEOF);
			checkBuffer(x0, 1);
			checkBuffer(y0, 1);
			checkBuffer(x1, 1);
			checkBuffer(y1, 1);
		}
		return nstbtt_GetCodepointBox(memAddress(info), codepoint, memAddress(x0), memAddress(y0), memAddress(x1), memAddress(y1));
	}

	// --- [ stbtt_GetGlyphHMetrics ] ---

	/** JNI method for {@link #stbtt_GetGlyphHMetrics GetGlyphHMetrics} */
	@JavadocExclude
	public static native void nstbtt_GetGlyphHMetrics(long info, int glyph_index, long advanceWidth, long leftSideBearing);

	/**
	 * Glyph version of {@link #stbtt_GetCodepointHMetrics GetCodepointHMetrics}, for greater efficiency.
	 *
	 * @param info            an {@link STBTTFontinfo} struct
	 * @param glyph_index     the glyph index
	 * @param advanceWidth    the offset from the current horizontal position to the next horizontal position
	 * @param leftSideBearing the offset from the current horizontal position to the left edge of the character
	 */
	public static void stbtt_GetGlyphHMetrics(ByteBuffer info, int glyph_index, ByteBuffer advanceWidth, ByteBuffer leftSideBearing) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(info, STBTTFontinfo.SIZEOF);
			checkBuffer(advanceWidth, 1 << 2);
			checkBuffer(leftSideBearing, 1 << 2);
		}
		nstbtt_GetGlyphHMetrics(memAddress(info), glyph_index, memAddress(advanceWidth), memAddress(leftSideBearing));
	}

	/** Alternative version of: {@link #stbtt_GetGlyphHMetrics GetGlyphHMetrics} */
	public static void stbtt_GetGlyphHMetrics(ByteBuffer info, int glyph_index, IntBuffer advanceWidth, IntBuffer leftSideBearing) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(info, STBTTFontinfo.SIZEOF);
			checkBuffer(advanceWidth, 1);
			checkBuffer(leftSideBearing, 1);
		}
		nstbtt_GetGlyphHMetrics(memAddress(info), glyph_index, memAddress(advanceWidth), memAddress(leftSideBearing));
	}

	// --- [ stbtt_GetGlyphKernAdvance ] ---

	/** JNI method for {@link #stbtt_GetGlyphKernAdvance GetGlyphKernAdvance} */
	@JavadocExclude
	public static native int nstbtt_GetGlyphKernAdvance(long info, int glyph1, int glyph2);

	/**
	 * Glyph version of {@link #stbtt_GetCodepointKernAdvance GetCodepointKernAdvance}, for greater efficiency.
	 *
	 * @param info   an {@link STBTTFontinfo} struct
	 * @param glyph1 the first glyph index
	 * @param glyph2 the second glyph index
	 */
	public static int stbtt_GetGlyphKernAdvance(ByteBuffer info, int glyph1, int glyph2) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(info, STBTTFontinfo.SIZEOF);
		return nstbtt_GetGlyphKernAdvance(memAddress(info), glyph1, glyph2);
	}

	// --- [ stbtt_GetGlyphBox ] ---

	/** JNI method for {@link #stbtt_GetGlyphBox GetGlyphBox} */
	@JavadocExclude
	public static native int nstbtt_GetGlyphBox(long info, int glyph_index, long x0, long y0, long x1, long y1);

	/**
	 * Glyph version of {@link #stbtt_GetCodepointBox GetCodepointBox}, for greater efficiency.
	 *
	 * @param info        an {@link STBTTFontinfo} struct
	 * @param glyph_index the glyph index
	 * @param x0          returns the left coordinate
	 * @param y0          returns the bottom coordinate
	 * @param x1          returns the right coordinate
	 * @param y1          returns the top coordinate
	 */
	public static int stbtt_GetGlyphBox(ByteBuffer info, int glyph_index, ByteBuffer x0, ByteBuffer y0, ByteBuffer x1, ByteBuffer y1) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(info, STBTTFontinfo.SIZEOF);
			checkBuffer(x0, 1 << 2);
			checkBuffer(y0, 1 << 2);
			checkBuffer(x1, 1 << 2);
			checkBuffer(y1, 1 << 2);
		}
		return nstbtt_GetGlyphBox(memAddress(info), glyph_index, memAddress(x0), memAddress(y0), memAddress(x1), memAddress(y1));
	}

	/** Alternative version of: {@link #stbtt_GetGlyphBox GetGlyphBox} */
	public static int stbtt_GetGlyphBox(ByteBuffer info, int glyph_index, IntBuffer x0, IntBuffer y0, IntBuffer x1, IntBuffer y1) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(info, STBTTFontinfo.SIZEOF);
			checkBuffer(x0, 1);
			checkBuffer(y0, 1);
			checkBuffer(x1, 1);
			checkBuffer(y1, 1);
		}
		return nstbtt_GetGlyphBox(memAddress(info), glyph_index, memAddress(x0), memAddress(y0), memAddress(x1), memAddress(y1));
	}

	// --- [ stbtt_IsGlyphEmpty ] ---

	/** JNI method for {@link #stbtt_IsGlyphEmpty IsGlyphEmpty} */
	@JavadocExclude
	public static native int nstbtt_IsGlyphEmpty(long info, int glyph_index);

	/**
	 * Returns non-zero if nothing is drawn for this glyph.
	 *
	 * @param info        an {@link STBTTFontinfo} struct
	 * @param glyph_index the glyph index
	 */
	public static int stbtt_IsGlyphEmpty(ByteBuffer info, int glyph_index) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(info, STBTTFontinfo.SIZEOF);
		return nstbtt_IsGlyphEmpty(memAddress(info), glyph_index);
	}

	// --- [ stbtt_GetCodepointShape ] ---

	/** JNI method for {@link #stbtt_GetCodepointShape GetCodepointShape} */
	@JavadocExclude
	public static native int nstbtt_GetCodepointShape(long info, int unicode_codepoint, long vertices);

	/**
	 * Returns number of vertices and fills {@code *vertices} with the pointer to them
	 * 
	 * <p>The shape is a series of countours. Each one starts with a {@link #STBTT_vmove vmove}, then consists of a series of mixed {@link #STBTT_vline vline} and {@link #STBTT_vcurve vcurve} segments. A {@link #STBTT_vline vline} draws a
	 * line from previous endpoint to its {@code x,y}; a {@link #STBTT_vcurve vcurve} draws a quadratic bezier from previous endpoint to its {@code x,y}, using {@code cx,cy} as
	 * the bezier control point.</p>
	 * 
	 * <p>The {@link STBTTVertex} values are expressed in "unscaled" coordinates.</p>
	 *
	 * @param info              an {@link STBTTFontinfo} struct
	 * @param unicode_codepoint the unicode codepoint
	 * @param vertices          returns a pointer to an array of {@link STBTTVertex} structs
	 */
	public static int stbtt_GetCodepointShape(ByteBuffer info, int unicode_codepoint, ByteBuffer vertices) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(info, STBTTFontinfo.SIZEOF);
			checkBuffer(vertices, 1 << POINTER_SHIFT);
		}
		return nstbtt_GetCodepointShape(memAddress(info), unicode_codepoint, memAddress(vertices));
	}

	/** Alternative version of: {@link #stbtt_GetCodepointShape GetCodepointShape} */
	public static int stbtt_GetCodepointShape(ByteBuffer info, int unicode_codepoint, PointerBuffer vertices) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(info, STBTTFontinfo.SIZEOF);
			checkBuffer(vertices, 1);
		}
		return nstbtt_GetCodepointShape(memAddress(info), unicode_codepoint, memAddress(vertices));
	}

	// --- [ stbtt_GetGlyphShape ] ---

	/** JNI method for {@link #stbtt_GetGlyphShape GetGlyphShape} */
	@JavadocExclude
	public static native int nstbtt_GetGlyphShape(long info, int glyph_index, long vertices);

	/**
	 * Glyph version of {@link #stbtt_GetCodepointShape GetCodepointShape}, for greater efficiency.
	 *
	 * @param info        an {@link STBTTFontinfo} struct
	 * @param glyph_index the unicode codepoint
	 * @param vertices    returns a pointer to an array of {@link STBTTVertex} structs
	 */
	public static int stbtt_GetGlyphShape(ByteBuffer info, int glyph_index, ByteBuffer vertices) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(info, STBTTFontinfo.SIZEOF);
		return nstbtt_GetGlyphShape(memAddress(info), glyph_index, memAddress(vertices));
	}

	/** Alternative version of: {@link #stbtt_GetGlyphShape GetGlyphShape} */
	public static int stbtt_GetGlyphShape(ByteBuffer info, int glyph_index, PointerBuffer vertices) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(info, STBTTFontinfo.SIZEOF);
		return nstbtt_GetGlyphShape(memAddress(info), glyph_index, memAddress(vertices));
	}

	// --- [ stbtt_FreeShape ] ---

	/** JNI method for {@link #stbtt_FreeShape FreeShape} */
	@JavadocExclude
	public static native void nstbtt_FreeShape(long info, long vertices);

	/**
	 * Frees the data allocated by {@link #stbtt_GetCodepointShape GetCodepointShape} and {@link #stbtt_GetGlyphShape GetGlyphShape}.
	 *
	 * @param info     an {@link STBTTFontinfo} struct
	 * @param vertices the array of {@link STBTTVertex} structs to free
	 */
	public static void stbtt_FreeShape(ByteBuffer info, ByteBuffer vertices) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(info, STBTTFontinfo.SIZEOF);
			checkBuffer(vertices, STBTTVertex.SIZEOF);
		}
		nstbtt_FreeShape(memAddress(info), memAddress(vertices));
	}

	// --- [ stbtt_FreeBitmap ] ---

	/** JNI method for {@link #stbtt_FreeBitmap FreeBitmap} */
	@JavadocExclude
	public static native void nstbtt_FreeBitmap(long bitmap, long userdata);

	/**
	 * Frees a bitmap allocated by {@link #stbtt_GetCodepointBitmap GetCodepointBitmap}, {@link #stbtt_GetCodepointBitmapSubpixel GetCodepointBitmapSubpixel}, {@link #stbtt_GetGlyphBitmap GetGlyphBitmap} or {@link #stbtt_GetGlyphBitmapSubpixel GetGlyphBitmapSubpixel}.
	 *
	 * @param bitmap   the bitmap to free
	 * @param userdata a pointer to user data
	 */
	public static void stbtt_FreeBitmap(ByteBuffer bitmap, ByteBuffer userdata) {
		nstbtt_FreeBitmap(memAddress(bitmap), memAddress(userdata));
	}

	// --- [ stbtt_GetCodepointBitmap ] ---

	/** JNI method for {@link #stbtt_GetCodepointBitmap GetCodepointBitmap} */
	@JavadocExclude
	public static native long nstbtt_GetCodepointBitmap(long info, float scale_x, float scale_y, int codepoint, long width, long height, long xoff, long yoff);

	/**
	 * Allocates a large-enough single-channel 8bpp bitmap and renders the specified character/glyph at the specified scale into it, with antialiasing.
	 *
	 * @param info      an {@link STBTTFontinfo} struct
	 * @param scale_x   the horizontal scale
	 * @param scale_y   the vertical scale
	 * @param codepoint the unicode codepoint to render
	 * @param width     returns the bitmap width
	 * @param height    returns the bitmap height
	 * @param xoff      returns the horizontal offset in pixel space from the glyph origin to the left of the bitmap
	 * @param yoff      returns the vertical offset in pixel space from the glyph origin to the top of the bitmap
	 */
	public static ByteBuffer stbtt_GetCodepointBitmap(ByteBuffer info, float scale_x, float scale_y, int codepoint, ByteBuffer width, ByteBuffer height, ByteBuffer xoff, ByteBuffer yoff) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(info, STBTTFontinfo.SIZEOF);
			checkBuffer(width, 1 << 2);
			checkBuffer(height, 1 << 2);
			checkBuffer(xoff, 1 << 2);
			checkBuffer(yoff, 1 << 2);
		}
		long __result = nstbtt_GetCodepointBitmap(memAddress(info), scale_x, scale_y, codepoint, memAddress(width), memAddress(height), memAddress(xoff), memAddress(yoff));
		return memByteBuffer(__result, width.getInt(width.position()) * height.getInt(height.position()));
	}

	/** Alternative version of: {@link #stbtt_GetCodepointBitmap GetCodepointBitmap} */
	public static ByteBuffer stbtt_GetCodepointBitmap(ByteBuffer info, float scale_x, float scale_y, int codepoint, IntBuffer width, IntBuffer height, IntBuffer xoff, IntBuffer yoff) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(info, STBTTFontinfo.SIZEOF);
			checkBuffer(width, 1);
			checkBuffer(height, 1);
			checkBuffer(xoff, 1);
			checkBuffer(yoff, 1);
		}
		long __result = nstbtt_GetCodepointBitmap(memAddress(info), scale_x, scale_y, codepoint, memAddress(width), memAddress(height), memAddress(xoff), memAddress(yoff));
		return memByteBuffer(__result, width.get(width.position()) * height.get(height.position()));
	}

	// --- [ stbtt_GetCodepointBitmapSubpixel ] ---

	/** JNI method for {@link #stbtt_GetCodepointBitmapSubpixel GetCodepointBitmapSubpixel} */
	@JavadocExclude
	public static native long nstbtt_GetCodepointBitmapSubpixel(long info, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint, long width, long height, long xoff, long yoff);

	/**
	 * Same as {@link #stbtt_GetCodepointBitmap GetCodepointBitmap}, but you can specify a subpixel shift for the character.
	 *
	 * @param info      an {@link STBTTFontinfo} struct
	 * @param scale_x   the horizontal scale
	 * @param scale_y   the vertical scale
	 * @param shift_x   the horizontal subpixel shift
	 * @param shift_y   the vertical subpixel shift
	 * @param codepoint the unicode codepoint to render
	 * @param width     returns the bitmap width
	 * @param height    returns the bitmap height
	 * @param xoff      returns the horizontal offset in pixel space from the glyph origin to the left of the bitmap
	 * @param yoff      returns the vertical offset in pixel space from the glyph origin to the top of the bitmap
	 */
	public static ByteBuffer stbtt_GetCodepointBitmapSubpixel(ByteBuffer info, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint, ByteBuffer width, ByteBuffer height, ByteBuffer xoff, ByteBuffer yoff) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(info, STBTTFontinfo.SIZEOF);
			checkBuffer(width, 1 << 2);
			checkBuffer(height, 1 << 2);
			checkBuffer(xoff, 1 << 2);
			checkBuffer(yoff, 1 << 2);
		}
		long __result = nstbtt_GetCodepointBitmapSubpixel(memAddress(info), scale_x, scale_y, shift_x, shift_y, codepoint, memAddress(width), memAddress(height), memAddress(xoff), memAddress(yoff));
		return memByteBuffer(__result, width.getInt(width.position()) * height.getInt(height.position()));
	}

	/** Alternative version of: {@link #stbtt_GetCodepointBitmapSubpixel GetCodepointBitmapSubpixel} */
	public static ByteBuffer stbtt_GetCodepointBitmapSubpixel(ByteBuffer info, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint, IntBuffer width, IntBuffer height, IntBuffer xoff, IntBuffer yoff) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(info, STBTTFontinfo.SIZEOF);
			checkBuffer(width, 1);
			checkBuffer(height, 1);
			checkBuffer(xoff, 1);
			checkBuffer(yoff, 1);
		}
		long __result = nstbtt_GetCodepointBitmapSubpixel(memAddress(info), scale_x, scale_y, shift_x, shift_y, codepoint, memAddress(width), memAddress(height), memAddress(xoff), memAddress(yoff));
		return memByteBuffer(__result, width.get(width.position()) * height.get(height.position()));
	}

	// --- [ stbtt_MakeCodepointBitmap ] ---

	/** JNI method for {@link #stbtt_MakeCodepointBitmap MakeCodepointBitmap} */
	@JavadocExclude
	public static native void nstbtt_MakeCodepointBitmap(long info, long output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int codepoint);

	/**
	 * Same as {@link #stbtt_GetCodepointBitmap GetCodepointBitmap}, but you pass in storage for the bitmap in the form of {@code output}, with row spacing of {@code out_stride} bytes. The
	 * bitmap is clipped to {@code out_w/out_h} bytes. Call {@link #stbtt_GetCodepointBitmapBox GetCodepointBitmapBox} to get the width and height and positioning info for it first.
	 *
	 * @param info       an {@link STBTTFontinfo} struct
	 * @param output     the bitmap storage
	 * @param out_w      the bitmap width
	 * @param out_h      the bitmap height
	 * @param out_stride the row stride, in bytes
	 * @param scale_x    the horizontal scale
	 * @param scale_y    the vertical scale
	 * @param codepoint  the unicode codepoint to render
	 */
	public static void stbtt_MakeCodepointBitmap(ByteBuffer info, ByteBuffer output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int codepoint) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(info, STBTTFontinfo.SIZEOF);
			checkBuffer(output, out_w * out_h);
		}
		nstbtt_MakeCodepointBitmap(memAddress(info), memAddress(output), out_w, out_h, out_stride, scale_x, scale_y, codepoint);
	}

	// --- [ stbtt_MakeCodepointBitmapSubpixel ] ---

	/** JNI method for {@link #stbtt_MakeCodepointBitmapSubpixel MakeCodepointBitmapSubpixel} */
	@JavadocExclude
	public static native void nstbtt_MakeCodepointBitmapSubpixel(long info, long output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint);

	/**
	 * Same as {@link #stbtt_MakeCodepointBitmap MakeCodepointBitmap}, but you can specify a subpixel shift for the character.
	 *
	 * @param info       an {@link STBTTFontinfo} struct
	 * @param output     the bitmap storage
	 * @param out_w      the bitmap width
	 * @param out_h      the bitmap height
	 * @param out_stride the row stride, in bytes
	 * @param scale_x    the horizontal scale
	 * @param scale_y    the vertical scale
	 * @param shift_x    the horizontal subpixel shift
	 * @param shift_y    the vertical subpixel shift
	 * @param codepoint  the unicode codepoint to render
	 */
	public static void stbtt_MakeCodepointBitmapSubpixel(ByteBuffer info, ByteBuffer output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(info, STBTTFontinfo.SIZEOF);
			checkBuffer(output, out_w * out_h);
		}
		nstbtt_MakeCodepointBitmapSubpixel(memAddress(info), memAddress(output), out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, codepoint);
	}

	// --- [ stbtt_GetCodepointBitmapBox ] ---

	/** JNI method for {@link #stbtt_GetCodepointBitmapBox GetCodepointBitmapBox} */
	@JavadocExclude
	public static native void nstbtt_GetCodepointBitmapBox(long font, int codepoint, float scale_x, float scale_y, long ix0, long iy0, long ix1, long iy1);

	/**
	 * Get the bbox of the bitmap centered around the glyph origin; so the bitmap width is {@code ix1-ix0}, height is {@code iy1-iy0}, and location to place
	 * the bitmap top left is {@code (leftSideBearing*scale,iy0)}.
	 * 
	 * <p>Note that the bitmap uses y-increases-down, but the shape uses y-increases-up, so {@code CodepointBitmapBox} and {@code CodepointBox} are inverted.</p>
	 *
	 * @param font      an {@link STBTTFontinfo} struct
	 * @param codepoint the unicode codepoint
	 * @param scale_x   the horizontal scale
	 * @param scale_y   the vertical scale
	 * @param ix0       returns the left coordinate
	 * @param iy0       returns the bottom coordinate
	 * @param ix1       returns the right coordinate
	 * @param iy1       returns the top coordinate
	 */
	public static void stbtt_GetCodepointBitmapBox(ByteBuffer font, int codepoint, float scale_x, float scale_y, ByteBuffer ix0, ByteBuffer iy0, ByteBuffer ix1, ByteBuffer iy1) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(font, STBTTFontinfo.SIZEOF);
			checkBuffer(ix0, 1 << 2);
			checkBuffer(iy0, 1 << 2);
			checkBuffer(ix1, 1 << 2);
			checkBuffer(iy1, 1 << 2);
		}
		nstbtt_GetCodepointBitmapBox(memAddress(font), codepoint, scale_x, scale_y, memAddress(ix0), memAddress(iy0), memAddress(ix1), memAddress(iy1));
	}

	/** Alternative version of: {@link #stbtt_GetCodepointBitmapBox GetCodepointBitmapBox} */
	public static void stbtt_GetCodepointBitmapBox(ByteBuffer font, int codepoint, float scale_x, float scale_y, IntBuffer ix0, IntBuffer iy0, IntBuffer ix1, IntBuffer iy1) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(font, STBTTFontinfo.SIZEOF);
			checkBuffer(ix0, 1);
			checkBuffer(iy0, 1);
			checkBuffer(ix1, 1);
			checkBuffer(iy1, 1);
		}
		nstbtt_GetCodepointBitmapBox(memAddress(font), codepoint, scale_x, scale_y, memAddress(ix0), memAddress(iy0), memAddress(ix1), memAddress(iy1));
	}

	// --- [ stbtt_GetCodepointBitmapBoxSubpixel ] ---

	/** JNI method for {@link #stbtt_GetCodepointBitmapBoxSubpixel GetCodepointBitmapBoxSubpixel} */
	@JavadocExclude
	public static native void nstbtt_GetCodepointBitmapBoxSubpixel(long font, int codepoint, float scale_x, float scale_y, float shift_x, float shift_y, long ix0, long iy0, long ix1, long iy1);

	/**
	 * Same as {@link #stbtt_GetCodepointBitmapBox GetCodepointBitmapBox}, but you can specify a subpixel shift for the character.
	 *
	 * @param font      an {@link STBTTFontinfo} struct
	 * @param codepoint the unicode codepoint
	 * @param scale_x   the horizontal scale
	 * @param scale_y   the vertical scale
	 * @param shift_x   the horizontal subpixel shift
	 * @param shift_y   the vertical subpixel shift
	 * @param ix0       returns the left coordinate
	 * @param iy0       returns the bottom coordinate
	 * @param ix1       returns the right coordinate
	 * @param iy1       returns the top coordinate
	 */
	public static void stbtt_GetCodepointBitmapBoxSubpixel(ByteBuffer font, int codepoint, float scale_x, float scale_y, float shift_x, float shift_y, ByteBuffer ix0, ByteBuffer iy0, ByteBuffer ix1, ByteBuffer iy1) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(font, STBTTFontinfo.SIZEOF);
			checkBuffer(ix0, 1 << 2);
			checkBuffer(iy0, 1 << 2);
			checkBuffer(ix1, 1 << 2);
			checkBuffer(iy1, 1 << 2);
		}
		nstbtt_GetCodepointBitmapBoxSubpixel(memAddress(font), codepoint, scale_x, scale_y, shift_x, shift_y, memAddress(ix0), memAddress(iy0), memAddress(ix1), memAddress(iy1));
	}

	/** Alternative version of: {@link #stbtt_GetCodepointBitmapBoxSubpixel GetCodepointBitmapBoxSubpixel} */
	public static void stbtt_GetCodepointBitmapBoxSubpixel(ByteBuffer font, int codepoint, float scale_x, float scale_y, float shift_x, float shift_y, IntBuffer ix0, IntBuffer iy0, IntBuffer ix1, IntBuffer iy1) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(font, STBTTFontinfo.SIZEOF);
			checkBuffer(ix0, 1);
			checkBuffer(iy0, 1);
			checkBuffer(ix1, 1);
			checkBuffer(iy1, 1);
		}
		nstbtt_GetCodepointBitmapBoxSubpixel(memAddress(font), codepoint, scale_x, scale_y, shift_x, shift_y, memAddress(ix0), memAddress(iy0), memAddress(ix1), memAddress(iy1));
	}

	// --- [ stbtt_GetGlyphBitmap ] ---

	/** JNI method for {@link #stbtt_GetGlyphBitmap GetGlyphBitmap} */
	@JavadocExclude
	public static native long nstbtt_GetGlyphBitmap(long info, float scale_x, float scale_y, int glyph, long width, long height, long xoff, long yoff);

	/**
	 * Allocates a large-enough single-channel 8bpp bitmap and renders the specified character/glyph at the specified scale into it, with antialiasing.
	 *
	 * @param info    an {@link STBTTFontinfo} struct
	 * @param scale_x the horizontal scale
	 * @param scale_y the vertical scale
	 * @param glyph   the glyph index to render
	 * @param width   returns the bitmap width
	 * @param height  returns the bitmap height
	 * @param xoff    returns the horizontal offset in pixel space from the glyph origin to the left of the bitmap
	 * @param yoff    returns the vertical offset in pixel space from the glyph origin to the top of the bitmap
	 */
	public static ByteBuffer stbtt_GetGlyphBitmap(ByteBuffer info, float scale_x, float scale_y, int glyph, ByteBuffer width, ByteBuffer height, ByteBuffer xoff, ByteBuffer yoff) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(info, STBTTFontinfo.SIZEOF);
			checkBuffer(width, 1 << 2);
			checkBuffer(height, 1 << 2);
			checkBuffer(xoff, 1 << 2);
			checkBuffer(yoff, 1 << 2);
		}
		long __result = nstbtt_GetGlyphBitmap(memAddress(info), scale_x, scale_y, glyph, memAddress(width), memAddress(height), memAddress(xoff), memAddress(yoff));
		return memByteBuffer(__result, width.getInt(width.position()) * height.getInt(height.position()));
	}

	/** Alternative version of: {@link #stbtt_GetGlyphBitmap GetGlyphBitmap} */
	public static ByteBuffer stbtt_GetGlyphBitmap(ByteBuffer info, float scale_x, float scale_y, int glyph, IntBuffer width, IntBuffer height, IntBuffer xoff, IntBuffer yoff) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(info, STBTTFontinfo.SIZEOF);
			checkBuffer(width, 1);
			checkBuffer(height, 1);
			checkBuffer(xoff, 1);
			checkBuffer(yoff, 1);
		}
		long __result = nstbtt_GetGlyphBitmap(memAddress(info), scale_x, scale_y, glyph, memAddress(width), memAddress(height), memAddress(xoff), memAddress(yoff));
		return memByteBuffer(__result, width.get(width.position()) * height.get(height.position()));
	}

	// --- [ stbtt_GetGlyphBitmapSubpixel ] ---

	/** JNI method for {@link #stbtt_GetGlyphBitmapSubpixel GetGlyphBitmapSubpixel} */
	@JavadocExclude
	public static native long nstbtt_GetGlyphBitmapSubpixel(long info, float scale_x, float scale_y, float shift_x, float shift_y, int glyph, long width, long height, long xoff, long yoff);

	/**
	 * Same as {@link #stbtt_GetGlyphBitmap GetGlyphBitmap}, but you can specify a subpixel shift for the character.
	 *
	 * @param info    an {@link STBTTFontinfo} struct
	 * @param scale_x the horizontal scale
	 * @param scale_y the vertical scale
	 * @param shift_x the horizontal subpixel shift
	 * @param shift_y the vertical subpixel shift
	 * @param glyph   the glyph index to render
	 * @param width   returns the bitmap width
	 * @param height  returns the bitmap height
	 * @param xoff    returns the horizontal offset in pixel space from the glyph origin to the left of the bitmap
	 * @param yoff    returns the vertical offset in pixel space from the glyph origin to the top of the bitmap
	 */
	public static ByteBuffer stbtt_GetGlyphBitmapSubpixel(ByteBuffer info, float scale_x, float scale_y, float shift_x, float shift_y, int glyph, ByteBuffer width, ByteBuffer height, ByteBuffer xoff, ByteBuffer yoff) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(info, STBTTFontinfo.SIZEOF);
			checkBuffer(width, 1 << 2);
			checkBuffer(height, 1 << 2);
			checkBuffer(xoff, 1 << 2);
			checkBuffer(yoff, 1 << 2);
		}
		long __result = nstbtt_GetGlyphBitmapSubpixel(memAddress(info), scale_x, scale_y, shift_x, shift_y, glyph, memAddress(width), memAddress(height), memAddress(xoff), memAddress(yoff));
		return memByteBuffer(__result, width.getInt(width.position()) * height.getInt(height.position()));
	}

	/** Alternative version of: {@link #stbtt_GetGlyphBitmapSubpixel GetGlyphBitmapSubpixel} */
	public static ByteBuffer stbtt_GetGlyphBitmapSubpixel(ByteBuffer info, float scale_x, float scale_y, float shift_x, float shift_y, int glyph, IntBuffer width, IntBuffer height, IntBuffer xoff, IntBuffer yoff) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(info, STBTTFontinfo.SIZEOF);
			checkBuffer(width, 1);
			checkBuffer(height, 1);
			checkBuffer(xoff, 1);
			checkBuffer(yoff, 1);
		}
		long __result = nstbtt_GetGlyphBitmapSubpixel(memAddress(info), scale_x, scale_y, shift_x, shift_y, glyph, memAddress(width), memAddress(height), memAddress(xoff), memAddress(yoff));
		return memByteBuffer(__result, width.get(width.position()) * height.get(height.position()));
	}

	// --- [ stbtt_MakeGlyphBitmap ] ---

	/** JNI method for {@link #stbtt_MakeGlyphBitmap MakeGlyphBitmap} */
	@JavadocExclude
	public static native void nstbtt_MakeGlyphBitmap(long info, long output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int glyph);

	/**
	 * Same as {@link #stbtt_GetGlyphBitmap GetGlyphBitmap}, but you pass in storage for the bitmap in the form of {@code output}, with row spacing of {@code out_stride} bytes. The
	 * bitmap is clipped to {@code out_w/out_h} bytes. Call {@link #stbtt_GetGlyphBitmapBox GetGlyphBitmapBox} to get the width and height and positioning info for it first.
	 *
	 * @param info       an {@link STBTTFontinfo} struct
	 * @param output     the bitmap storage
	 * @param out_w      the bitmap width
	 * @param out_h      the bitmap height
	 * @param out_stride the row stride, in bytes
	 * @param scale_x    the horizontal scale
	 * @param scale_y    the vertical scale
	 * @param glyph      the glyph index to render
	 */
	public static void stbtt_MakeGlyphBitmap(ByteBuffer info, ByteBuffer output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int glyph) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(info, STBTTFontinfo.SIZEOF);
			checkBuffer(output, out_w * out_h);
		}
		nstbtt_MakeGlyphBitmap(memAddress(info), memAddress(output), out_w, out_h, out_stride, scale_x, scale_y, glyph);
	}

	// --- [ stbtt_MakeGlyphBitmapSubpixel ] ---

	/** JNI method for {@link #stbtt_MakeGlyphBitmapSubpixel MakeGlyphBitmapSubpixel} */
	@JavadocExclude
	public static native void nstbtt_MakeGlyphBitmapSubpixel(long info, long output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int glyph);

	/**
	 * Same as {@link #stbtt_MakeGlyphBitmap MakeGlyphBitmap}, but you can specify a subpixel shift for the character.
	 *
	 * @param info       an {@link STBTTFontinfo} struct
	 * @param output     the bitmap storage
	 * @param out_w      the bitmap width
	 * @param out_h      the bitmap height
	 * @param out_stride the row stride, in bytes
	 * @param scale_x    the horizontal scale
	 * @param scale_y    the vertical scale
	 * @param shift_x    the horizontal subpixel shift
	 * @param shift_y    the vertical subpixel shift
	 * @param glyph      the glyph index to render
	 */
	public static void stbtt_MakeGlyphBitmapSubpixel(ByteBuffer info, ByteBuffer output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int glyph) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(info, STBTTFontinfo.SIZEOF);
			checkBuffer(output, out_w * out_h);
		}
		nstbtt_MakeGlyphBitmapSubpixel(memAddress(info), memAddress(output), out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, glyph);
	}

	// --- [ stbtt_GetGlyphBitmapBox ] ---

	/** JNI method for {@link #stbtt_GetGlyphBitmapBox GetGlyphBitmapBox} */
	@JavadocExclude
	public static native void nstbtt_GetGlyphBitmapBox(long font, int glyph, float scale_x, float scale_y, long ix0, long iy0, long ix1, long iy1);

	/**
	 * Get the bbox of the bitmap centered around the glyph origin; so the bitmap width is {@code ix1-ix0}, height is {@code iy1-iy0}, and location to place
	 * the bitmap top left is {@code (leftSideBearing*scale,iy0)}.
	 * 
	 * <p>Note that the bitmap uses y-increases-down, but the shape uses y-increases-up, so {@code GlyphBitmapBox} and {@code GlyphBox} are inverted.</p>
	 *
	 * @param font    an {@link STBTTFontinfo} struct
	 * @param glyph   the glyph index
	 * @param scale_x the horizontal scale
	 * @param scale_y the vertical scale
	 * @param ix0     returns the left coordinate
	 * @param iy0     returns the bottom coordinate
	 * @param ix1     returns the right coordinate
	 * @param iy1     returns the top coordinate
	 */
	public static void stbtt_GetGlyphBitmapBox(ByteBuffer font, int glyph, float scale_x, float scale_y, ByteBuffer ix0, ByteBuffer iy0, ByteBuffer ix1, ByteBuffer iy1) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(font, STBTTFontinfo.SIZEOF);
			checkBuffer(ix0, 1 << 2);
			checkBuffer(iy0, 1 << 2);
			checkBuffer(ix1, 1 << 2);
			checkBuffer(iy1, 1 << 2);
		}
		nstbtt_GetGlyphBitmapBox(memAddress(font), glyph, scale_x, scale_y, memAddress(ix0), memAddress(iy0), memAddress(ix1), memAddress(iy1));
	}

	/** Alternative version of: {@link #stbtt_GetGlyphBitmapBox GetGlyphBitmapBox} */
	public static void stbtt_GetGlyphBitmapBox(ByteBuffer font, int glyph, float scale_x, float scale_y, IntBuffer ix0, IntBuffer iy0, IntBuffer ix1, IntBuffer iy1) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(font, STBTTFontinfo.SIZEOF);
			checkBuffer(ix0, 1);
			checkBuffer(iy0, 1);
			checkBuffer(ix1, 1);
			checkBuffer(iy1, 1);
		}
		nstbtt_GetGlyphBitmapBox(memAddress(font), glyph, scale_x, scale_y, memAddress(ix0), memAddress(iy0), memAddress(ix1), memAddress(iy1));
	}

	// --- [ stbtt_GetGlyphBitmapBoxSubpixel ] ---

	/** JNI method for {@link #stbtt_GetGlyphBitmapBoxSubpixel GetGlyphBitmapBoxSubpixel} */
	@JavadocExclude
	public static native void nstbtt_GetGlyphBitmapBoxSubpixel(long font, int glyph, float scale_x, float scale_y, float shift_x, float shift_y, long ix0, long iy0, long ix1, long iy1);

	/**
	 * Same as {@link #stbtt_GetGlyphBitmapBox GetGlyphBitmapBox}, but you can specify a subpixel shift for the character.
	 *
	 * @param font    an {@link STBTTFontinfo} struct
	 * @param glyph   the glyph index
	 * @param scale_x the horizontal scale
	 * @param scale_y the vertical scale
	 * @param shift_x the horizontal subpixel shift
	 * @param shift_y the vertical subpixel shift
	 * @param ix0     returns the left coordinate
	 * @param iy0     returns the bottom coordinate
	 * @param ix1     returns the right coordinate
	 * @param iy1     returns the top coordinate
	 */
	public static void stbtt_GetGlyphBitmapBoxSubpixel(ByteBuffer font, int glyph, float scale_x, float scale_y, float shift_x, float shift_y, ByteBuffer ix0, ByteBuffer iy0, ByteBuffer ix1, ByteBuffer iy1) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(font, STBTTFontinfo.SIZEOF);
			checkBuffer(ix0, 1 << 2);
			checkBuffer(iy0, 1 << 2);
			checkBuffer(ix1, 1 << 2);
			checkBuffer(iy1, 1 << 2);
		}
		nstbtt_GetGlyphBitmapBoxSubpixel(memAddress(font), glyph, scale_x, scale_y, shift_x, shift_y, memAddress(ix0), memAddress(iy0), memAddress(ix1), memAddress(iy1));
	}

	/** Alternative version of: {@link #stbtt_GetGlyphBitmapBoxSubpixel GetGlyphBitmapBoxSubpixel} */
	public static void stbtt_GetGlyphBitmapBoxSubpixel(ByteBuffer font, int glyph, float scale_x, float scale_y, float shift_x, float shift_y, IntBuffer ix0, IntBuffer iy0, IntBuffer ix1, IntBuffer iy1) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(font, STBTTFontinfo.SIZEOF);
			checkBuffer(ix0, 1);
			checkBuffer(iy0, 1);
			checkBuffer(ix1, 1);
			checkBuffer(iy1, 1);
		}
		nstbtt_GetGlyphBitmapBoxSubpixel(memAddress(font), glyph, scale_x, scale_y, shift_x, shift_y, memAddress(ix0), memAddress(iy0), memAddress(ix1), memAddress(iy1));
	}

	// --- [ stbtt_FindMatchingFont ] ---

	/** JNI method for {@link #stbtt_FindMatchingFont FindMatchingFont} */
	@JavadocExclude
	public static native int nstbtt_FindMatchingFont(long fontdata, long name, int flags);

	/**
	 * Returns the offset (not index) of the font that matches, or -1 if none.
	 * 
	 * <p>If you use STBTT_MACSTYLE_DONTCARE, use a font name like "Arial Bold". If you use any other flag, use a font name like "Arial"; this checks the
	 * {@code macStyle} header field; I don't know if fonts set this consistently.</p>
	 *
	 * @param fontdata the font data
	 * @param name     the font name
	 * @param flags    the style flags. One of:<br>{@link #STBTT_MACSTYLE_DONTCARE MACSTYLE_DONTCARE}, {@link #STBTT_MACSTYLE_BOLD MACSTYLE_BOLD}, {@link #STBTT_MACSTYLE_ITALIC MACSTYLE_ITALIC}, {@link #STBTT_MACSTYLE_UNDERSCORE MACSTYLE_UNDERSCORE}, {@link #STBTT_MACSTYLE_NONE MACSTYLE_NONE}
	 */
	public static int stbtt_FindMatchingFont(ByteBuffer fontdata, ByteBuffer name, int flags) {
		if ( LWJGLUtil.CHECKS )
			checkNT1(name);
		return nstbtt_FindMatchingFont(memAddress(fontdata), memAddress(name), flags);
	}

	/** CharSequence version of: {@link #stbtt_FindMatchingFont FindMatchingFont} */
	public static int stbtt_FindMatchingFont(ByteBuffer fontdata, CharSequence name, int flags) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		return nstbtt_FindMatchingFont(memAddress(fontdata), __buffer.address(nameEncoded), flags);
	}

	// --- [ stbtt_CompareUTF8toUTF16_bigendian ] ---

	/** JNI method for {@link #stbtt_CompareUTF8toUTF16_bigendian CompareUTF8toUTF16_bigendian} */
	@JavadocExclude
	public static native int nstbtt_CompareUTF8toUTF16_bigendian(long s1, int len1, long s2, int len2);

	/**
	 * Returns 1/0 whether the first string interpreted as utf8 is identical to the second string interpreted as big-endian utf16... useful for strings
	 * returned from {@link #stbtt_GetFontNameString GetFontNameString}.
	 *
	 * @param s1   the first string
	 * @param len1 the length of the first string, in bytes
	 * @param s2   the second string
	 * @param len2 the length of the second string, in bytes
	 */
	public static int stbtt_CompareUTF8toUTF16_bigendian(ByteBuffer s1, int len1, ByteBuffer s2, int len2) {
		if ( LWJGLUtil.CHECKS ) {
			checkBuffer(s1, len1);
			checkBuffer(s2, len2);
		}
		return nstbtt_CompareUTF8toUTF16_bigendian(memAddress(s1), len1, memAddress(s2), len2);
	}

	/** Alternative version of: {@link #stbtt_CompareUTF8toUTF16_bigendian CompareUTF8toUTF16_bigendian} */
	public static int stbtt_CompareUTF8toUTF16_bigendian(ByteBuffer s1, ByteBuffer s2) {
		return nstbtt_CompareUTF8toUTF16_bigendian(memAddress(s1), s1.remaining(), memAddress(s2), s2.remaining());
	}

	// --- [ stbtt_GetFontNameString ] ---

	/** JNI method for {@link #stbtt_GetFontNameString GetFontNameString} */
	@JavadocExclude
	public static native long nstbtt_GetFontNameString(long font, long length, int platformID, int encodingID, int languageID, int nameID);

	/**
	 * Returns the string (which may be big-endian double byte, e.g. for unicode) and puts the length in bytes in {@code *length}.
	 * 
	 * <p>See the truetype spec:
	 * <ul>
	 * <li><a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM06/Chap6name.html">TrueType Reference Manual - The 'name' table</a></li>
	 * <li><a href="http://www.microsoft.com/typography/otspec/name.htm">OpenType™ Specification - The Naming Table</a></li>
	 * </ul></p>
	 *
	 * @param font       an {@link STBTTFontinfo} struct
	 * @param platformID the platform ID. One of:<br>{@link #STBTT_PLATFORM_ID_UNICODE PLATFORM_ID_UNICODE}, {@link #STBTT_PLATFORM_ID_MAC PLATFORM_ID_MAC}, {@link #STBTT_PLATFORM_ID_ISO PLATFORM_ID_ISO}, {@link #STBTT_PLATFORM_ID_MICROSOFT PLATFORM_ID_MICROSOFT}
	 * @param encodingID the encoding ID. One of:<br>{@link #STBTT_UNICODE_EID_UNICODE_1_0 UNICODE_EID_UNICODE_1_0}, {@link #STBTT_UNICODE_EID_UNICODE_1_1 UNICODE_EID_UNICODE_1_1}, {@link #STBTT_UNICODE_EID_ISO_10646 UNICODE_EID_ISO_10646}, {@link #STBTT_UNICODE_EID_UNICODE_2_0_BMP UNICODE_EID_UNICODE_2_0_BMP}, {@link #STBTT_UNICODE_EID_UNICODE_2_0_FULL UNICODE_EID_UNICODE_2_0_FULL}, {@link #STBTT_MS_EID_SYMBOL MS_EID_SYMBOL}, {@link #STBTT_MS_EID_UNICODE_BMP MS_EID_UNICODE_BMP}, {@link #STBTT_MS_EID_SHIFTJIS MS_EID_SHIFTJIS}, {@link #STBTT_MS_EID_UNICODE_FULL MS_EID_UNICODE_FULL}, {@link #STBTT_MAC_EID_ROMAN MAC_EID_ROMAN}, {@link #STBTT_MAC_EID_JAPANESE MAC_EID_JAPANESE}, {@link #STBTT_MAC_EID_CHINESE_TRAD MAC_EID_CHINESE_TRAD}, {@link #STBTT_MAC_EID_KOREAN MAC_EID_KOREAN}, {@link #STBTT_MAC_EID_ARABIC MAC_EID_ARABIC}, {@link #STBTT_MAC_EID_HEBREW MAC_EID_HEBREW}, {@link #STBTT_MAC_EID_GREEK MAC_EID_GREEK}, {@link #STBTT_MAC_EID_RUSSIAN MAC_EID_RUSSIAN}
	 * @param languageID the language ID. One of:<br>{@link #STBTT_MS_LANG_ENGLISH MS_LANG_ENGLISH}, {@link #STBTT_MS_LANG_CHINESE MS_LANG_CHINESE}, {@link #STBTT_MS_LANG_DUTCH MS_LANG_DUTCH}, {@link #STBTT_MS_LANG_FRENCH MS_LANG_FRENCH}, {@link #STBTT_MS_LANG_GERMAN MS_LANG_GERMAN}, {@link #STBTT_MS_LANG_HEBREW MS_LANG_HEBREW}, {@link #STBTT_MS_LANG_ITALIAN MS_LANG_ITALIAN}, {@link #STBTT_MS_LANG_JAPANESE MS_LANG_JAPANESE}, {@link #STBTT_MS_LANG_KOREAN MS_LANG_KOREAN}, {@link #STBTT_MS_LANG_RUSSIAN MS_LANG_RUSSIAN}, {@link #STBTT_MS_LANG_SPANISH MS_LANG_SPANISH}, {@link #STBTT_MS_LANG_SWEDISH MS_LANG_SWEDISH}, {@link #STBTT_MAC_LANG_ENGLISH MAC_LANG_ENGLISH}, {@link #STBTT_MAC_LANG_ARABIC MAC_LANG_ARABIC}, {@link #STBTT_MAC_LANG_DUTCH MAC_LANG_DUTCH}, {@link #STBTT_MAC_LANG_FRENCH MAC_LANG_FRENCH}, {@link #STBTT_MAC_LANG_GERMAN MAC_LANG_GERMAN}, {@link #STBTT_MAC_LANG_HEBREW MAC_LANG_HEBREW}, {@link #STBTT_MAC_LANG_ITALIAN MAC_LANG_ITALIAN}, {@link #STBTT_MAC_LANG_JAPANESE MAC_LANG_JAPANESE}, {@link #STBTT_MAC_LANG_KOREAN MAC_LANG_KOREAN}, {@link #STBTT_MAC_LANG_RUSSIAN MAC_LANG_RUSSIAN}, {@link #STBTT_MAC_LANG_SPANISH MAC_LANG_SPANISH}, {@link #STBTT_MAC_LANG_SWEDISH MAC_LANG_SWEDISH}, {@link #STBTT_MAC_LANG_CHINESE_SIMPLIFIED MAC_LANG_CHINESE_SIMPLIFIED}, {@link #STBTT_MAC_LANG_CHINESE_TRAD MAC_LANG_CHINESE_TRAD}
	 * @param nameID     the name ID
	 */
	public static ByteBuffer stbtt_GetFontNameString(ByteBuffer font, int platformID, int encodingID, int languageID, int nameID) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(font, STBTTFontinfo.SIZEOF);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		long __result = nstbtt_GetFontNameString(memAddress(font), __buffer.address(length), platformID, encodingID, languageID, nameID);
		return memByteBuffer(__result, __buffer.intValue(length));
	}

}