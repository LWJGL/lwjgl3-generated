/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4242 4244 4701 4702 4711 4738 4996))
#endif
#define STB_TRUETYPE_IMPLEMENTATION
#define STBTT_assert
#include "stb_rect_pack.h"
#include "stb_truetype.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1BakeFontBitmap(JNIEnv *__env, jclass clazz, jlong dataAddress, jint offset, jfloat pixel_height, jlong pixelsAddress, jint pw, jint ph, jint first_char, jint num_chars, jlong chardataAddress) {
	const unsigned char *data = (const unsigned char *)(intptr_t)dataAddress;
	unsigned char *pixels = (unsigned char *)(intptr_t)pixelsAddress;
	stbtt_bakedchar *chardata = (stbtt_bakedchar *)(intptr_t)chardataAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbtt_BakeFontBitmap(data, offset, pixel_height, pixels, pw, ph, first_char, num_chars, chardata);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetBakedQuad(JNIEnv *__env, jclass clazz, jlong chardataAddress, jint pw, jint ph, jint char_index, jlong xposAddress, jlong yposAddress, jlong qAddress, jint opengl_fillrule) {
	stbtt_bakedchar *chardata = (stbtt_bakedchar *)(intptr_t)chardataAddress;
	float *xpos = (float *)(intptr_t)xposAddress;
	float *ypos = (float *)(intptr_t)yposAddress;
	stbtt_aligned_quad *q = (stbtt_aligned_quad *)(intptr_t)qAddress;
	UNUSED_PARAMS(__env, clazz)
	stbtt_GetBakedQuad(chardata, pw, ph, char_index, xpos, ypos, q, opengl_fillrule);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1PackBegin(JNIEnv *__env, jclass clazz, jlong spcAddress, jlong pixelsAddress, jint width, jint height, jint stride_in_bytes, jint padding, jlong alloc_contextAddress) {
	stbtt_pack_context *spc = (stbtt_pack_context *)(intptr_t)spcAddress;
	unsigned char *pixels = (unsigned char *)(intptr_t)pixelsAddress;
	void *alloc_context = (void *)(intptr_t)alloc_contextAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbtt_PackBegin(spc, pixels, width, height, stride_in_bytes, padding, alloc_context);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1PackEnd(JNIEnv *__env, jclass clazz, jlong spcAddress) {
	stbtt_pack_context *spc = (stbtt_pack_context *)(intptr_t)spcAddress;
	UNUSED_PARAMS(__env, clazz)
	stbtt_PackEnd(spc);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_STBTT_1POINT_1SIZE(JNIEnv *__env, jclass clazz, jint font_size) {
	UNUSED_PARAMS(__env, clazz)
	return (jint)STBTT_POINT_SIZE(font_size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1PackFontRange(JNIEnv *__env, jclass clazz, jlong spcAddress, jlong fontdataAddress, jint font_index, jfloat font_size, jint first_unicode_char_in_range, jint num_chars_in_range, jlong chardata_for_rangeAddress) {
	stbtt_pack_context *spc = (stbtt_pack_context *)(intptr_t)spcAddress;
	unsigned char *fontdata = (unsigned char *)(intptr_t)fontdataAddress;
	stbtt_packedchar *chardata_for_range = (stbtt_packedchar *)(intptr_t)chardata_for_rangeAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbtt_PackFontRange(spc, fontdata, font_index, font_size, first_unicode_char_in_range, num_chars_in_range, chardata_for_range);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1PackFontRanges(JNIEnv *__env, jclass clazz, jlong spcAddress, jlong fontdataAddress, jint font_index, jlong rangesAddress, jint num_ranges) {
	stbtt_pack_context *spc = (stbtt_pack_context *)(intptr_t)spcAddress;
	unsigned char *fontdata = (unsigned char *)(intptr_t)fontdataAddress;
	stbtt_pack_range *ranges = (stbtt_pack_range *)(intptr_t)rangesAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbtt_PackFontRanges(spc, fontdata, font_index, ranges, num_ranges);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1PackSetOversampling(JNIEnv *__env, jclass clazz, jlong spcAddress, jint h_oversample, jint v_oversample) {
	stbtt_pack_context *spc = (stbtt_pack_context *)(intptr_t)spcAddress;
	UNUSED_PARAMS(__env, clazz)
	stbtt_PackSetOversampling(spc, h_oversample, v_oversample);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetPackedQuad(JNIEnv *__env, jclass clazz, jlong chardataAddress, jint pw, jint ph, jint char_index, jlong xposAddress, jlong yposAddress, jlong qAddress, jint align_to_integer) {
	stbtt_packedchar *chardata = (stbtt_packedchar *)(intptr_t)chardataAddress;
	float *xpos = (float *)(intptr_t)xposAddress;
	float *ypos = (float *)(intptr_t)yposAddress;
	stbtt_aligned_quad *q = (stbtt_aligned_quad *)(intptr_t)qAddress;
	UNUSED_PARAMS(__env, clazz)
	stbtt_GetPackedQuad(chardata, pw, ph, char_index, xpos, ypos, q, align_to_integer);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1PackFontRangesGatherRects(JNIEnv *__env, jclass clazz, jlong spcAddress, jlong infoAddress, jlong rangesAddress, jint num_ranges, jlong rectsAddress) {
	stbtt_pack_context *spc = (stbtt_pack_context *)(intptr_t)spcAddress;
	stbtt_fontinfo *info = (stbtt_fontinfo *)(intptr_t)infoAddress;
	stbtt_pack_range *ranges = (stbtt_pack_range *)(intptr_t)rangesAddress;
	stbrp_rect *rects = (stbrp_rect *)(intptr_t)rectsAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbtt_PackFontRangesGatherRects(spc, info, ranges, num_ranges, rects);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1PackFontRangesPackRects(JNIEnv *__env, jclass clazz, jlong spcAddress, jlong rectsAddress, jint num_rects) {
	stbtt_pack_context *spc = (stbtt_pack_context *)(intptr_t)spcAddress;
	stbrp_rect *rects = (stbrp_rect *)(intptr_t)rectsAddress;
	UNUSED_PARAMS(__env, clazz)
	stbtt_PackFontRangesPackRects(spc, rects, num_rects);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1PackFontRangesRenderIntoRects(JNIEnv *__env, jclass clazz, jlong spcAddress, jlong infoAddress, jlong rangesAddress, jint num_ranges, jlong rectsAddress) {
	stbtt_pack_context *spc = (stbtt_pack_context *)(intptr_t)spcAddress;
	stbtt_fontinfo *info = (stbtt_fontinfo *)(intptr_t)infoAddress;
	stbtt_pack_range *ranges = (stbtt_pack_range *)(intptr_t)rangesAddress;
	stbrp_rect *rects = (stbrp_rect *)(intptr_t)rectsAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbtt_PackFontRangesRenderIntoRects(spc, info, ranges, num_ranges, rects);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetFontOffsetForIndex(JNIEnv *__env, jclass clazz, jlong dataAddress, jint index) {
	const unsigned char *data = (const unsigned char *)(intptr_t)dataAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbtt_GetFontOffsetForIndex(data, index);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1InitFont(JNIEnv *__env, jclass clazz, jlong infoAddress, jlong dataAddress, jint offset) {
	stbtt_fontinfo *info = (stbtt_fontinfo *)(intptr_t)infoAddress;
	const unsigned char *data = (const unsigned char *)(intptr_t)dataAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbtt_InitFont(info, data, offset);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1FindGlyphIndex(JNIEnv *__env, jclass clazz, jlong infoAddress, jint unicode_codepoint) {
	const stbtt_fontinfo *info = (const stbtt_fontinfo *)(intptr_t)infoAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbtt_FindGlyphIndex(info, unicode_codepoint);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1ScaleForPixelHeight(JNIEnv *__env, jclass clazz, jlong infoAddress, jfloat pixels) {
	const stbtt_fontinfo *info = (const stbtt_fontinfo *)(intptr_t)infoAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jfloat)stbtt_ScaleForPixelHeight(info, pixels);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1ScaleForMappingEmToPixels(JNIEnv *__env, jclass clazz, jlong infoAddress, jfloat pixels) {
	const stbtt_fontinfo *info = (const stbtt_fontinfo *)(intptr_t)infoAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jfloat)stbtt_ScaleForMappingEmToPixels(info, pixels);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetFontVMetrics(JNIEnv *__env, jclass clazz, jlong infoAddress, jlong ascentAddress, jlong descentAddress, jlong lineGapAddress) {
	const stbtt_fontinfo *info = (const stbtt_fontinfo *)(intptr_t)infoAddress;
	int *ascent = (int *)(intptr_t)ascentAddress;
	int *descent = (int *)(intptr_t)descentAddress;
	int *lineGap = (int *)(intptr_t)lineGapAddress;
	UNUSED_PARAMS(__env, clazz)
	stbtt_GetFontVMetrics(info, ascent, descent, lineGap);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetFontBoundingBox(JNIEnv *__env, jclass clazz, jlong infoAddress, jlong x0Address, jlong y0Address, jlong x1Address, jlong y1Address) {
	const stbtt_fontinfo *info = (const stbtt_fontinfo *)(intptr_t)infoAddress;
	int *x0 = (int *)(intptr_t)x0Address;
	int *y0 = (int *)(intptr_t)y0Address;
	int *x1 = (int *)(intptr_t)x1Address;
	int *y1 = (int *)(intptr_t)y1Address;
	UNUSED_PARAMS(__env, clazz)
	stbtt_GetFontBoundingBox(info, x0, y0, x1, y1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointHMetrics(JNIEnv *__env, jclass clazz, jlong infoAddress, jint codepoint, jlong advanceWidthAddress, jlong leftSideBearingAddress) {
	const stbtt_fontinfo *info = (const stbtt_fontinfo *)(intptr_t)infoAddress;
	int *advanceWidth = (int *)(intptr_t)advanceWidthAddress;
	int *leftSideBearing = (int *)(intptr_t)leftSideBearingAddress;
	UNUSED_PARAMS(__env, clazz)
	stbtt_GetCodepointHMetrics(info, codepoint, advanceWidth, leftSideBearing);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointKernAdvance(JNIEnv *__env, jclass clazz, jlong infoAddress, jint ch1, jint ch2) {
	const stbtt_fontinfo *info = (const stbtt_fontinfo *)(intptr_t)infoAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbtt_GetCodepointKernAdvance(info, ch1, ch2);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointBox(JNIEnv *__env, jclass clazz, jlong infoAddress, jint codepoint, jlong x0Address, jlong y0Address, jlong x1Address, jlong y1Address) {
	const stbtt_fontinfo *info = (const stbtt_fontinfo *)(intptr_t)infoAddress;
	int *x0 = (int *)(intptr_t)x0Address;
	int *y0 = (int *)(intptr_t)y0Address;
	int *x1 = (int *)(intptr_t)x1Address;
	int *y1 = (int *)(intptr_t)y1Address;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbtt_GetCodepointBox(info, codepoint, x0, y0, x1, y1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphHMetrics(JNIEnv *__env, jclass clazz, jlong infoAddress, jint glyph_index, jlong advanceWidthAddress, jlong leftSideBearingAddress) {
	const stbtt_fontinfo *info = (const stbtt_fontinfo *)(intptr_t)infoAddress;
	int *advanceWidth = (int *)(intptr_t)advanceWidthAddress;
	int *leftSideBearing = (int *)(intptr_t)leftSideBearingAddress;
	UNUSED_PARAMS(__env, clazz)
	stbtt_GetGlyphHMetrics(info, glyph_index, advanceWidth, leftSideBearing);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphKernAdvance(JNIEnv *__env, jclass clazz, jlong infoAddress, jint glyph1, jint glyph2) {
	const stbtt_fontinfo *info = (const stbtt_fontinfo *)(intptr_t)infoAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbtt_GetGlyphKernAdvance(info, glyph1, glyph2);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphBox(JNIEnv *__env, jclass clazz, jlong infoAddress, jint glyph_index, jlong x0Address, jlong y0Address, jlong x1Address, jlong y1Address) {
	const stbtt_fontinfo *info = (const stbtt_fontinfo *)(intptr_t)infoAddress;
	int *x0 = (int *)(intptr_t)x0Address;
	int *y0 = (int *)(intptr_t)y0Address;
	int *x1 = (int *)(intptr_t)x1Address;
	int *y1 = (int *)(intptr_t)y1Address;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbtt_GetGlyphBox(info, glyph_index, x0, y0, x1, y1);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1IsGlyphEmpty(JNIEnv *__env, jclass clazz, jlong infoAddress, jint glyph_index) {
	const stbtt_fontinfo *info = (const stbtt_fontinfo *)(intptr_t)infoAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbtt_IsGlyphEmpty(info, glyph_index);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointShape(JNIEnv *__env, jclass clazz, jlong infoAddress, jint unicode_codepoint, jlong verticesAddress) {
	const stbtt_fontinfo *info = (const stbtt_fontinfo *)(intptr_t)infoAddress;
	stbtt_vertex **vertices = (stbtt_vertex **)(intptr_t)verticesAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbtt_GetCodepointShape(info, unicode_codepoint, vertices);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphShape(JNIEnv *__env, jclass clazz, jlong infoAddress, jint glyph_index, jlong verticesAddress) {
	const stbtt_fontinfo *info = (const stbtt_fontinfo *)(intptr_t)infoAddress;
	stbtt_vertex **vertices = (stbtt_vertex **)(intptr_t)verticesAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbtt_GetGlyphShape(info, glyph_index, vertices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1FreeShape(JNIEnv *__env, jclass clazz, jlong infoAddress, jlong verticesAddress) {
	const stbtt_fontinfo *info = (const stbtt_fontinfo *)(intptr_t)infoAddress;
	stbtt_vertex *vertices = (stbtt_vertex *)(intptr_t)verticesAddress;
	UNUSED_PARAMS(__env, clazz)
	stbtt_FreeShape(info, vertices);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1FreeBitmap(JNIEnv *__env, jclass clazz, jlong bitmapAddress, jlong userdataAddress) {
	unsigned char *bitmap = (unsigned char *)(intptr_t)bitmapAddress;
	void *userdata = (void *)(intptr_t)userdataAddress;
	UNUSED_PARAMS(__env, clazz)
	stbtt_FreeBitmap(bitmap, userdata);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointBitmap(JNIEnv *__env, jclass clazz, jlong infoAddress, jfloat scale_x, jfloat scale_y, jint codepoint, jlong widthAddress, jlong heightAddress, jlong xoffAddress, jlong yoffAddress) {
	const stbtt_fontinfo *info = (const stbtt_fontinfo *)(intptr_t)infoAddress;
	int *width = (int *)(intptr_t)widthAddress;
	int *height = (int *)(intptr_t)heightAddress;
	int *xoff = (int *)(intptr_t)xoffAddress;
	int *yoff = (int *)(intptr_t)yoffAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)stbtt_GetCodepointBitmap(info, scale_x, scale_y, codepoint, width, height, xoff, yoff);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointBitmapSubpixel(JNIEnv *__env, jclass clazz, jlong infoAddress, jfloat scale_x, jfloat scale_y, jfloat shift_x, jfloat shift_y, jint codepoint, jlong widthAddress, jlong heightAddress, jlong xoffAddress, jlong yoffAddress) {
	const stbtt_fontinfo *info = (const stbtt_fontinfo *)(intptr_t)infoAddress;
	int *width = (int *)(intptr_t)widthAddress;
	int *height = (int *)(intptr_t)heightAddress;
	int *xoff = (int *)(intptr_t)xoffAddress;
	int *yoff = (int *)(intptr_t)yoffAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)stbtt_GetCodepointBitmapSubpixel(info, scale_x, scale_y, shift_x, shift_y, codepoint, width, height, xoff, yoff);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1MakeCodepointBitmap(JNIEnv *__env, jclass clazz, jlong infoAddress, jlong outputAddress, jint out_w, jint out_h, jint out_stride, jfloat scale_x, jfloat scale_y, jint codepoint) {
	const stbtt_fontinfo *info = (const stbtt_fontinfo *)(intptr_t)infoAddress;
	unsigned char *output = (unsigned char *)(intptr_t)outputAddress;
	UNUSED_PARAMS(__env, clazz)
	stbtt_MakeCodepointBitmap(info, output, out_w, out_h, out_stride, scale_x, scale_y, codepoint);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1MakeCodepointBitmapSubpixel(JNIEnv *__env, jclass clazz, jlong infoAddress, jlong outputAddress, jint out_w, jint out_h, jint out_stride, jfloat scale_x, jfloat scale_y, jfloat shift_x, jfloat shift_y, jint codepoint) {
	const stbtt_fontinfo *info = (const stbtt_fontinfo *)(intptr_t)infoAddress;
	unsigned char *output = (unsigned char *)(intptr_t)outputAddress;
	UNUSED_PARAMS(__env, clazz)
	stbtt_MakeCodepointBitmapSubpixel(info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, codepoint);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointBitmapBox(JNIEnv *__env, jclass clazz, jlong fontAddress, jint codepoint, jfloat scale_x, jfloat scale_y, jlong ix0Address, jlong iy0Address, jlong ix1Address, jlong iy1Address) {
	const stbtt_fontinfo *font = (const stbtt_fontinfo *)(intptr_t)fontAddress;
	int *ix0 = (int *)(intptr_t)ix0Address;
	int *iy0 = (int *)(intptr_t)iy0Address;
	int *ix1 = (int *)(intptr_t)ix1Address;
	int *iy1 = (int *)(intptr_t)iy1Address;
	UNUSED_PARAMS(__env, clazz)
	stbtt_GetCodepointBitmapBox(font, codepoint, scale_x, scale_y, ix0, iy0, ix1, iy1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetCodepointBitmapBoxSubpixel(JNIEnv *__env, jclass clazz, jlong fontAddress, jint codepoint, jfloat scale_x, jfloat scale_y, jfloat shift_x, jfloat shift_y, jlong ix0Address, jlong iy0Address, jlong ix1Address, jlong iy1Address) {
	const stbtt_fontinfo *font = (const stbtt_fontinfo *)(intptr_t)fontAddress;
	int *ix0 = (int *)(intptr_t)ix0Address;
	int *iy0 = (int *)(intptr_t)iy0Address;
	int *ix1 = (int *)(intptr_t)ix1Address;
	int *iy1 = (int *)(intptr_t)iy1Address;
	UNUSED_PARAMS(__env, clazz)
	stbtt_GetCodepointBitmapBoxSubpixel(font, codepoint, scale_x, scale_y, shift_x, shift_y, ix0, iy0, ix1, iy1);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphBitmap(JNIEnv *__env, jclass clazz, jlong infoAddress, jfloat scale_x, jfloat scale_y, jint glyph, jlong widthAddress, jlong heightAddress, jlong xoffAddress, jlong yoffAddress) {
	const stbtt_fontinfo *info = (const stbtt_fontinfo *)(intptr_t)infoAddress;
	int *width = (int *)(intptr_t)widthAddress;
	int *height = (int *)(intptr_t)heightAddress;
	int *xoff = (int *)(intptr_t)xoffAddress;
	int *yoff = (int *)(intptr_t)yoffAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)stbtt_GetGlyphBitmap(info, scale_x, scale_y, glyph, width, height, xoff, yoff);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphBitmapSubpixel(JNIEnv *__env, jclass clazz, jlong infoAddress, jfloat scale_x, jfloat scale_y, jfloat shift_x, jfloat shift_y, jint glyph, jlong widthAddress, jlong heightAddress, jlong xoffAddress, jlong yoffAddress) {
	const stbtt_fontinfo *info = (const stbtt_fontinfo *)(intptr_t)infoAddress;
	int *width = (int *)(intptr_t)widthAddress;
	int *height = (int *)(intptr_t)heightAddress;
	int *xoff = (int *)(intptr_t)xoffAddress;
	int *yoff = (int *)(intptr_t)yoffAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)stbtt_GetGlyphBitmapSubpixel(info, scale_x, scale_y, shift_x, shift_y, glyph, width, height, xoff, yoff);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1MakeGlyphBitmap(JNIEnv *__env, jclass clazz, jlong infoAddress, jlong outputAddress, jint out_w, jint out_h, jint out_stride, jfloat scale_x, jfloat scale_y, jint glyph) {
	const stbtt_fontinfo *info = (const stbtt_fontinfo *)(intptr_t)infoAddress;
	unsigned char *output = (unsigned char *)(intptr_t)outputAddress;
	UNUSED_PARAMS(__env, clazz)
	stbtt_MakeGlyphBitmap(info, output, out_w, out_h, out_stride, scale_x, scale_y, glyph);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1MakeGlyphBitmapSubpixel(JNIEnv *__env, jclass clazz, jlong infoAddress, jlong outputAddress, jint out_w, jint out_h, jint out_stride, jfloat scale_x, jfloat scale_y, jfloat shift_x, jfloat shift_y, jint glyph) {
	const stbtt_fontinfo *info = (const stbtt_fontinfo *)(intptr_t)infoAddress;
	unsigned char *output = (unsigned char *)(intptr_t)outputAddress;
	UNUSED_PARAMS(__env, clazz)
	stbtt_MakeGlyphBitmapSubpixel(info, output, out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, glyph);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphBitmapBox(JNIEnv *__env, jclass clazz, jlong fontAddress, jint glyph, jfloat scale_x, jfloat scale_y, jlong ix0Address, jlong iy0Address, jlong ix1Address, jlong iy1Address) {
	const stbtt_fontinfo *font = (const stbtt_fontinfo *)(intptr_t)fontAddress;
	int *ix0 = (int *)(intptr_t)ix0Address;
	int *iy0 = (int *)(intptr_t)iy0Address;
	int *ix1 = (int *)(intptr_t)ix1Address;
	int *iy1 = (int *)(intptr_t)iy1Address;
	UNUSED_PARAMS(__env, clazz)
	stbtt_GetGlyphBitmapBox(font, glyph, scale_x, scale_y, ix0, iy0, ix1, iy1);
}

JNIEXPORT void JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetGlyphBitmapBoxSubpixel(JNIEnv *__env, jclass clazz, jlong fontAddress, jint glyph, jfloat scale_x, jfloat scale_y, jfloat shift_x, jfloat shift_y, jlong ix0Address, jlong iy0Address, jlong ix1Address, jlong iy1Address) {
	const stbtt_fontinfo *font = (const stbtt_fontinfo *)(intptr_t)fontAddress;
	int *ix0 = (int *)(intptr_t)ix0Address;
	int *iy0 = (int *)(intptr_t)iy0Address;
	int *ix1 = (int *)(intptr_t)ix1Address;
	int *iy1 = (int *)(intptr_t)iy1Address;
	UNUSED_PARAMS(__env, clazz)
	stbtt_GetGlyphBitmapBoxSubpixel(font, glyph, scale_x, scale_y, shift_x, shift_y, ix0, iy0, ix1, iy1);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1FindMatchingFont(JNIEnv *__env, jclass clazz, jlong fontdataAddress, jlong nameAddress, jint flags) {
	const unsigned char *fontdata = (const unsigned char *)(intptr_t)fontdataAddress;
	const char *name = (const char *)(intptr_t)nameAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbtt_FindMatchingFont(fontdata, name, flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1CompareUTF8toUTF16_1bigendian(JNIEnv *__env, jclass clazz, jlong s1Address, jint len1, jlong s2Address, jint len2) {
	const char *s1 = (const char *)(intptr_t)s1Address;
	const char *s2 = (const char *)(intptr_t)s2Address;
	UNUSED_PARAMS(__env, clazz)
	return (jint)stbtt_CompareUTF8toUTF16_bigendian(s1, len1, s2, len2);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_stb_STBTruetype_nstbtt_1GetFontNameString(JNIEnv *__env, jclass clazz, jlong fontAddress, jlong lengthAddress, jint platformID, jint encodingID, jint languageID, jint nameID) {
	const stbtt_fontinfo *font = (const stbtt_fontinfo *)(intptr_t)fontAddress;
	int *length = (int *)(intptr_t)lengthAddress;
	UNUSED_PARAMS(__env, clazz)
	return (jlong)(intptr_t)stbtt_GetFontNameString(font, length, platformID, encodingID, languageID, nameID);
}

EXTERN_C_EXIT
