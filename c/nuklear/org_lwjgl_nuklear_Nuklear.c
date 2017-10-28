/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#ifdef LWJGL_LINUX
    #pragma GCC diagnostic ignored "-Wunused-function"
    #pragma GCC diagnostic ignored "-Wunused-but-set-variable"
#endif
#include "common_tools.h"
DISABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
    __pragma(warning(disable : 4738))
#endif
#define NK_PRIVATE
#define NK_INCLUDE_FIXED_TYPES
#define NK_INCLUDE_STANDARD_IO
#define NK_INCLUDE_VERTEX_BUFFER_OUTPUT
#define NK_INCLUDE_COMMAND_USERDATA
#ifdef LWJGL_WINDOWS
    #define NK_BUTTON_TRIGGER_ON_RELEASE
#endif
#define NK_ZERO_COMMAND_MEMORY
#define NK_ASSERT(expr)
#define NK_IMPLEMENTATION
#define NK_MEMSET memset
#define NK_MEMCPY memcpy
#define NK_SQRT sqrt
#define NK_SIN sinf
#define NK_COS cosf
#include <math.h>
#include <string.h>
#include "nuklear.h"
typedef float(*nk_value_getter)(void* user, int index);
typedef void(*nk_item_getter)(void*, int, const char**);
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1init_1fixed(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong memoryAddress, jlong size, jlong fontAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    void *memory = (void *)(intptr_t)memoryAddress;
    const struct nk_user_font *font = (const struct nk_user_font *)(intptr_t)fontAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_init_fixed(ctx, memory, (nk_size)size, font);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1init(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong allocatorAddress, jlong fontAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_allocator *allocator = (struct nk_allocator *)(intptr_t)allocatorAddress;
    const struct nk_user_font *font = (const struct nk_user_font *)(intptr_t)fontAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_init(ctx, allocator, font);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1init_1custom(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong cmdsAddress, jlong poolAddress, jlong fontAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_buffer *cmds = (struct nk_buffer *)(intptr_t)cmdsAddress;
    struct nk_buffer *pool = (struct nk_buffer *)(intptr_t)poolAddress;
    const struct nk_user_font *font = (const struct nk_user_font *)(intptr_t)fontAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_init_custom(ctx, cmds, pool, font);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1clear(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_clear(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1free(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_free(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1set_1user_1data(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong handleAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_handle *handle = (nk_handle *)(intptr_t)handleAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_set_user_data(ctx, *handle);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong titleAddress, jlong boundsAddress, jint flags) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *title = (const char *)(intptr_t)titleAddress;
    struct nk_rect *bounds = (struct nk_rect *)(intptr_t)boundsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_begin(ctx, title, *bounds, flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1begin_1titled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jlong titleAddress, jlong boundsAddress, jint flags) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *name = (const char *)(intptr_t)nameAddress;
    const char *title = (const char *)(intptr_t)titleAddress;
    struct nk_rect *bounds = (struct nk_rect *)(intptr_t)boundsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_begin_titled(ctx, name, title, *bounds, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_end(ctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1find(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *name = (const char *)(intptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)nk_window_find(ctx, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1bounds(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    const struct nk_context *ctx = (const struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_rect*)(intptr_t)__result) = nk_window_get_bounds(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1position(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    const struct nk_context *ctx = (const struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(intptr_t)__result) = nk_window_get_position(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1size(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    const struct nk_context *ctx = (const struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(intptr_t)__result) = nk_window_get_size(ctx);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1width(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    const struct nk_context *ctx = (const struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)nk_window_get_width(ctx);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1height(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    const struct nk_context *ctx = (const struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)nk_window_get_height(ctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1panel(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)nk_window_get_panel(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1content_1region(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_rect*)(intptr_t)__result) = nk_window_get_content_region(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1content_1region_1min(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(intptr_t)__result) = nk_window_get_content_region_min(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1content_1region_1max(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(intptr_t)__result) = nk_window_get_content_region_max(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1content_1region_1size(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(intptr_t)__result) = nk_window_get_content_region_size(ctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1get_1canvas(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)nk_window_get_canvas(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1has_1focus(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    const struct nk_context *ctx = (const struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_window_has_focus(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1collapsed(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *name = (const char *)(intptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_window_is_collapsed(ctx, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1closed(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *name = (const char *)(intptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_window_is_closed(ctx, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1hidden(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *name = (const char *)(intptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_window_is_hidden(ctx, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1active(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *name = (const char *)(intptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_window_is_active(ctx, name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1hovered(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_window_is_hovered(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1is_1any_1hovered(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_window_is_any_hovered(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1item_1is_1any_1active(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_item_is_any_active(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1set_1bounds(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jlong boundsAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *name = (const char *)(intptr_t)nameAddress;
    struct nk_rect *bounds = (struct nk_rect *)(intptr_t)boundsAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_window_set_bounds(ctx, name, *bounds);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1set_1position(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jlong positionAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *name = (const char *)(intptr_t)nameAddress;
    struct nk_vec2 *position = (struct nk_vec2 *)(intptr_t)positionAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_window_set_position(ctx, name, *position);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1set_1size(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *name = (const char *)(intptr_t)nameAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_window_set_size(ctx, name, *size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1set_1focus(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *name = (const char *)(intptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_window_set_focus(ctx, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1close(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *name = (const char *)(intptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_window_close(ctx, name);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1collapse(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jint c) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *name = (const char *)(intptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_window_collapse(ctx, name, c);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1collapse_1if(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jint c, jint cond) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *name = (const char *)(intptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_window_collapse_if(ctx, name, c, cond);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1show(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jint s) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *name = (const char *)(intptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_window_show(ctx, name, s);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1window_1show_1if(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jint s, jint cond) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *name = (const char *)(intptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_window_show_if(ctx, name, s, cond);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1set_1min_1row_1height(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat height) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_set_min_row_height(ctx, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1reset_1min_1row_1height(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_reset_min_row_height(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1widget_1bounds(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_rect*)(intptr_t)__result) = nk_layout_widget_bounds(ctx);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1ratio_1from_1pixel(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat pixel_width) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)nk_layout_ratio_from_pixel(ctx, pixel_width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1dynamic(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat height, jint cols) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_row_dynamic(ctx, height, cols);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1static(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat height, jint item_width, jint cols) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_row_static(ctx, height, item_width, cols);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint fmt, jfloat row_height, jint cols) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_row_begin(ctx, fmt, row_height, cols);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1push(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_row_push(ctx, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_row_end(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row__JIFIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint fmt, jfloat height, jint cols, jlong ratioAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const float *ratio = (const float *)(intptr_t)ratioAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_row(ctx, fmt, height, cols, ratio);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1template_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat height) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_row_template_begin(ctx, height);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1template_1push_1dynamic(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_row_template_push_dynamic(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1template_1push_1variable(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat min_width) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_row_template_push_variable(ctx, min_width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1template_1push_1static(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat width) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_row_template_push_static(ctx, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row_1template_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_row_template_end(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint fmt, jfloat height, jint widget_count) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_space_begin(ctx, fmt, height, widget_count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1push(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong rectAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_space_push(ctx, *rect);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_layout_space_end(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1bounds(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_rect*)(intptr_t)__result) = nk_layout_space_bounds(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1to_1screen(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong retAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_vec2 *ret = (struct nk_vec2 *)(intptr_t)retAddress;
    UNUSED_PARAMS(__env, clazz)
    *ret = nk_layout_space_to_screen(ctx, *ret);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1to_1local(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong retAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_vec2 *ret = (struct nk_vec2 *)(intptr_t)retAddress;
    UNUSED_PARAMS(__env, clazz)
    *ret = nk_layout_space_to_local(ctx, *ret);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1rect_1to_1screen(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong retAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_rect *ret = (struct nk_rect *)(intptr_t)retAddress;
    UNUSED_PARAMS(__env, clazz)
    *ret = nk_layout_space_rect_to_screen(ctx, *ret);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1space_1rect_1to_1local(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong retAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_rect *ret = (struct nk_rect *)(intptr_t)retAddress;
    UNUSED_PARAMS(__env, clazz)
    *ret = nk_layout_space_rect_to_local(ctx, *ret);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1group_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong titleAddress, jint flags) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *title = (const char *)(intptr_t)titleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_group_begin(ctx, title, flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1group_1scrolled_1offset_1begin__JJJJI(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong x_offsetAddress, jlong y_offsetAddress, jlong titleAddress, jint flags) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_uint *x_offset = (nk_uint *)(intptr_t)x_offsetAddress;
    nk_uint *y_offset = (nk_uint *)(intptr_t)y_offsetAddress;
    const char *title = (const char *)(intptr_t)titleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_group_scrolled_offset_begin(ctx, x_offset, y_offset, title, flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1group_1scrolled_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong scrollAddress, jlong titleAddress, jint flags) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_scroll *scroll = (struct nk_scroll *)(intptr_t)scrollAddress;
    const char *title = (const char *)(intptr_t)titleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_group_scrolled_begin(ctx, scroll, title, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1group_1scrolled_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_group_scrolled_end(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1group_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_group_end(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1list_1view_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong viewAddress, jlong titleAddress, jint flags, jint row_height, jint row_count) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_list_view *view = (struct nk_list_view *)(intptr_t)viewAddress;
    const char *title = (const char *)(intptr_t)titleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_list_view_begin(ctx, view, title, flags, row_height, row_count);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1list_1view_1end(JNIEnv *__env, jclass clazz, jlong viewAddress) {
    struct nk_list_view *view = (struct nk_list_view *)(intptr_t)viewAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_list_view_end(view);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1push_1hashed(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong titleAddress, jint initial_state, jlong hashAddress, jint len, jint seed) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *title = (const char *)(intptr_t)titleAddress;
    const char *hash = (const char *)(intptr_t)hashAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_tree_push_hashed(ctx, type, title, initial_state, hash, len, seed);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1image_1push_1hashed(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong imgAddress, jlong titleAddress, jint initial_state, jlong hashAddress, jint len, jint seed) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    const char *title = (const char *)(intptr_t)titleAddress;
    const char *hash = (const char *)(intptr_t)hashAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_tree_image_push_hashed(ctx, type, *img, title, initial_state, hash, len, seed);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1pop(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_tree_pop(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1state_1push__JIJJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong titleAddress, jlong stateAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *title = (const char *)(intptr_t)titleAddress;
    enum nk_collapse_states *state = (enum nk_collapse_states *)(intptr_t)stateAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_tree_state_push(ctx, type, title, state);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1state_1image_1push__JIJJJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong imageAddress, jlong titleAddress, jlong stateAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *image = (struct nk_image *)(intptr_t)imageAddress;
    const char *title = (const char *)(intptr_t)titleAddress;
    enum nk_collapse_states *state = (enum nk_collapse_states *)(intptr_t)stateAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_tree_state_image_push(ctx, type, *image, title, state);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1state_1pop(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_tree_state_pop(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_text(ctx, str, len, alignment);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1text_1colored(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jint alignment, jlong colorAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_text_colored(ctx, str, len, alignment, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1text_1wrap(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_text_wrap(ctx, str, len);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1text_1wrap_1colored(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jlong colorAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_text_wrap_colored(ctx, str, len, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint align) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_label(ctx, str, align);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1label_1colored(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint align, jlong colorAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_label_colored(ctx, str, align, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1label_1wrap(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_label_wrap(ctx, str);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1label_1colored_1wrap(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jlong colorAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_label_colored_wrap(ctx, str, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1image(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_image(ctx, *img);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1set_1behavior(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint behavior) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_button_set_behavior(ctx, behavior);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1push_1behavior(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint behavior) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_button_push_behavior(ctx, behavior);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1pop_1behavior(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_button_pop_behavior(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong titleAddress, jint len) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *title = (const char *)(intptr_t)titleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_button_text(ctx, title, len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong titleAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *title = (const char *)(intptr_t)titleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_button_label(ctx, title);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1color(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong colorAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_button_color(ctx, *color);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_button_symbol(ctx, symbol);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1image(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_button_image(ctx, *img);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong textAddress, jint text_alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_button_symbol_label(ctx, symbol, text, text_alignment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong textAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_button_symbol_text(ctx, symbol, text, len, alignment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1image_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong textAddress, jint text_alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_button_image_label(ctx, *img, text, text_alignment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1image_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong textAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_button_image_text(ctx, *img, text, len, alignment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1text_1styled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong styleAddress, jlong titleAddress, jint len) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const struct nk_style_button *style = (const struct nk_style_button *)(intptr_t)styleAddress;
    const char *title = (const char *)(intptr_t)titleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_button_text_styled(ctx, style, title, len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1label_1styled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong styleAddress, jlong titleAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const struct nk_style_button *style = (const struct nk_style_button *)(intptr_t)styleAddress;
    const char *title = (const char *)(intptr_t)titleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_button_label_styled(ctx, style, title);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol_1styled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong styleAddress, jint symbol) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const struct nk_style_button *style = (const struct nk_style_button *)(intptr_t)styleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_button_symbol_styled(ctx, style, symbol);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1image_1styled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong styleAddress, jlong imgAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const struct nk_style_button *style = (const struct nk_style_button *)(intptr_t)styleAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_button_image_styled(ctx, style, *img);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol_1text_1styled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong styleAddress, jint symbol, jlong titleAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const struct nk_style_button *style = (const struct nk_style_button *)(intptr_t)styleAddress;
    const char *title = (const char *)(intptr_t)titleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_button_symbol_text_styled(ctx, style, symbol, title, len, alignment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1symbol_1label_1styled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong styleAddress, jint symbol, jlong titleAddress, jint text_alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const struct nk_style_button *style = (const struct nk_style_button *)(intptr_t)styleAddress;
    const char *title = (const char *)(intptr_t)titleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_button_symbol_label_styled(ctx, style, symbol, title, text_alignment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1image_1label_1styled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong styleAddress, jlong imgAddress, jlong titleAddress, jint text_alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const struct nk_style_button *style = (const struct nk_style_button *)(intptr_t)styleAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    const char *title = (const char *)(intptr_t)titleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_button_image_label_styled(ctx, style, *img, title, text_alignment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1button_1image_1text_1styled(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong styleAddress, jlong imgAddress, jlong titleAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const struct nk_style_button *style = (const struct nk_style_button *)(intptr_t)styleAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    const char *title = (const char *)(intptr_t)titleAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_button_image_text_styled(ctx, style, *img, title, len, alignment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1check_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint active) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_check_label(ctx, str, active);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1check_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jint active) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_check_text(ctx, str, len, active);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1check_1flags_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint flags, jint value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_check_flags_label(ctx, str, flags, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1check_1flags_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jint flags, jint value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_check_flags_text(ctx, str, len, flags, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1label__JJJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jlong activeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    int *active = (int *)(intptr_t)activeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_checkbox_label(ctx, str, active);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1text__JJIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jlong activeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    int *active = (int *)(intptr_t)activeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_checkbox_text(ctx, str, len, active);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1flags_1label__JJJI(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jlong flagsAddress, jint value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    unsigned int *flags = (unsigned int *)(intptr_t)flagsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_checkbox_flags_label(ctx, str, flags, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1flags_1text__JJIJI(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jlong flagsAddress, jint value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    unsigned int *flags = (unsigned int *)(intptr_t)flagsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_checkbox_flags_text(ctx, str, len, flags, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1radio_1label__JJJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jlong activeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    int *active = (int *)(intptr_t)activeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_radio_label(ctx, str, active);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1radio_1text__JJIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jlong activeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    int *active = (int *)(intptr_t)activeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_radio_text(ctx, str, len, active);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1option_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint active) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_option_label(ctx, str, active);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1option_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jint active) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_option_text(ctx, str, len, active);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1label__JJIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint align, jlong valueAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    int *value = (int *)(intptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_selectable_label(ctx, str, align, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1text__JJIIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jint align, jlong valueAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    int *value = (int *)(intptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_selectable_text(ctx, str, len, align, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1image_1label__JJJIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong strAddress, jint align, jlong valueAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    int *value = (int *)(intptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_selectable_image_label(ctx, *img, str, align, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1image_1text__JJJIIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong strAddress, jint len, jint align, jlong valueAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    int *value = (int *)(intptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_selectable_image_text(ctx, *img, str, len, align, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1select_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint align, jint value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_select_label(ctx, str, align, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1select_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jint align, jint value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_select_text(ctx, str, len, align, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1select_1image_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong strAddress, jint align, jint value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_select_image_label(ctx, *img, str, align, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1select_1image_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong strAddress, jint len, jint align, jint value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_select_image_text(ctx, *img, str, len, align, value);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1slide_1float(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat min, jfloat val, jfloat max, jfloat step) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)nk_slide_float(ctx, min, val, max, step);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1slide_1int(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint min, jint val, jint max, jint step) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_slide_int(ctx, min, val, max, step);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1slider_1float__JFJFF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat min, jlong valAddress, jfloat max, jfloat step) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    float *val = (float *)(intptr_t)valAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_slider_float(ctx, min, val, max, step);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1slider_1int__JIJII(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint min, jlong valAddress, jint max, jint step) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    int *val = (int *)(intptr_t)valAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_slider_int(ctx, min, val, max, step);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1progress(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong curAddress, jlong max, jint modifyable) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_size *cur = (nk_size *)(intptr_t)curAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_progress(ctx, cur, (nk_size)max, modifyable);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1prog(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong cur, jlong max, jint modifyable) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)nk_prog(ctx, (nk_size)cur, (nk_size)max, modifyable);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1picker(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong colorAddress, jint fmt) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    *color = nk_color_picker(ctx, *color, fmt);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1pick(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong colorAddress, jint fmt) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_color_pick(ctx, color, fmt);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1property_1int__JJIJIIF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jint min, jlong valAddress, jint max, jint step, jfloat inc_per_pixel) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *name = (const char *)(intptr_t)nameAddress;
    int *val = (int *)(intptr_t)valAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_property_int(ctx, name, min, val, max, step, inc_per_pixel);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1property_1float__JJFJFFF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jfloat min, jlong valAddress, jfloat max, jfloat step, jfloat inc_per_pixel) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *name = (const char *)(intptr_t)nameAddress;
    float *val = (float *)(intptr_t)valAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_property_float(ctx, name, min, val, max, step, inc_per_pixel);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1property_1double__JJDJDDF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jdouble min, jlong valAddress, jdouble max, jdouble step, jfloat inc_per_pixel) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *name = (const char *)(intptr_t)nameAddress;
    double *val = (double *)(intptr_t)valAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_property_double(ctx, name, min, val, max, step, inc_per_pixel);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1propertyi(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jint min, jint val, jint max, jint step, jfloat inc_per_pixel) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *name = (const char *)(intptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_propertyi(ctx, name, min, val, max, step, inc_per_pixel);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1propertyf(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jfloat min, jfloat val, jfloat max, jfloat step, jfloat inc_per_pixel) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *name = (const char *)(intptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)nk_propertyf(ctx, name, min, val, max, step, inc_per_pixel);
}

JNIEXPORT jdouble JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1propertyd(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jdouble min, jdouble val, jdouble max, jdouble step, jfloat inc_per_pixel) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *name = (const char *)(intptr_t)nameAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jdouble)nk_propertyd(ctx, name, min, val, max, step, inc_per_pixel);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1edit_1focus(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint flags) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_edit_focus(ctx, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1edit_1unfocus(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_edit_unfocus(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1edit_1string__JIJJIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint flags, jlong memoryAddress, jlong lenAddress, jint max, jlong filterAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char *memory = (char *)(intptr_t)memoryAddress;
    int *len = (int *)(intptr_t)lenAddress;
    nk_plugin_filter filter = (nk_plugin_filter)(intptr_t)filterAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_edit_string(ctx, flags, memory, len, max, filter);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1edit_1buffer(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint flags, jlong editAddress, jlong filterAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_text_edit *edit = (struct nk_text_edit *)(intptr_t)editAddress;
    nk_plugin_filter filter = (nk_plugin_filter)(intptr_t)filterAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_edit_buffer(ctx, flags, edit, filter);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1edit_1string_1zero_1terminated(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint flags, jlong bufferAddress, jint max, jlong filterAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char *buffer = (char *)(intptr_t)bufferAddress;
    nk_plugin_filter filter = (nk_plugin_filter)(intptr_t)filterAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_edit_string_zero_terminated(ctx, flags, buffer, max, filter);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1chart_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jint num, jfloat min, jfloat max) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_chart_begin(ctx, type, num, min, max);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1chart_1begin_1colored(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong colorAddress, jlong activeAddress, jint num, jfloat min, jfloat max) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    struct nk_color *active = (struct nk_color *)(intptr_t)activeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_chart_begin_colored(ctx, type, *color, *active, num, min, max);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1chart_1add_1slot(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jint count, jfloat min_value, jfloat max_value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_chart_add_slot(ctx, type, count, min_value, max_value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1chart_1add_1slot_1colored(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong colorAddress, jlong activeAddress, jint count, jfloat min_value, jfloat max_value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    struct nk_color *active = (struct nk_color *)(intptr_t)activeAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_chart_add_slot_colored(ctx, type, *color, *active, count, min_value, max_value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1chart_1push(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_chart_push(ctx, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1chart_1push_1slot(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat value, jint slot) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_chart_push_slot(ctx, value, slot);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1chart_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_chart_end(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1plot__JIJII(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong valuesAddress, jint count, jint offset) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const float *values = (const float *)(intptr_t)valuesAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_plot(ctx, type, values, count, offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1plot_1function(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong userdataAddress, jlong value_getterAddress, jint count, jint offset) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    void *userdata = (void *)(intptr_t)userdataAddress;
    nk_value_getter value_getter = (nk_value_getter)(intptr_t)value_getterAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_plot_function(ctx, type, userdata, value_getter, count, offset);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1popup_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong titleAddress, jint flags, jlong rectAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *title = (const char *)(intptr_t)titleAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_popup_begin(ctx, type, title, flags, *rect);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1popup_1close(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_popup_close(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1popup_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_popup_end(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong itemsAddress, jint count, jint selected, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char **items = (const char **)(intptr_t)itemsAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_combo(ctx, items, count, selected, item_height, *size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1separator(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong items_separated_by_separatorAddress, jint separator, jint selected, jint count, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *items_separated_by_separator = (const char *)(intptr_t)items_separated_by_separatorAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_combo_separator(ctx, items_separated_by_separator, separator, selected, count, item_height, *size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1string(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong items_separated_by_zerosAddress, jint selected, jint count, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *items_separated_by_zeros = (const char *)(intptr_t)items_separated_by_zerosAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_combo_string(ctx, items_separated_by_zeros, selected, count, item_height, *size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1callback(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong item_getterAddress, jlong userdataAddress, jint selected, jint count, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_item_getter item_getter = (nk_item_getter)(intptr_t)item_getterAddress;
    void *userdata = (void *)(intptr_t)userdataAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_combo_callback(ctx, item_getter, userdata, selected, count, item_height, *size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combobox__JJIJIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong itemsAddress, jint count, jlong selectedAddress, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char **items = (const char **)(intptr_t)itemsAddress;
    int *selected = (int *)(intptr_t)selectedAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_combobox(ctx, items, count, selected, item_height, *size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combobox_1string__JJJIIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong items_separated_by_zerosAddress, jlong selectedAddress, jint count, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *items_separated_by_zeros = (const char *)(intptr_t)items_separated_by_zerosAddress;
    int *selected = (int *)(intptr_t)selectedAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_combobox_string(ctx, items_separated_by_zeros, selected, count, item_height, *size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combobox_1separator__JJIJIIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong items_separated_by_separatorAddress, jint separator, jlong selectedAddress, jint count, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *items_separated_by_separator = (const char *)(intptr_t)items_separated_by_separatorAddress;
    int *selected = (int *)(intptr_t)selectedAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_combobox_separator(ctx, items_separated_by_separator, separator, selected, count, item_height, *size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combobox_1callback__JJJJIIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong item_getterAddress, jlong userdataAddress, jlong selectedAddress, jint count, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_item_getter item_getter = (nk_item_getter)(intptr_t)item_getterAddress;
    void *userdata = (void *)(intptr_t)userdataAddress;
    int *selected = (int *)(intptr_t)selectedAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_combobox_callback(ctx, item_getter, userdata, selected, count, item_height, *size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong selectedAddress, jint len, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *selected = (const char *)(intptr_t)selectedAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_combo_begin_text(ctx, selected, len, *size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong selectedAddress, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *selected = (const char *)(intptr_t)selectedAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_combo_begin_label(ctx, selected, *size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1color(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong colorAddress, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_combo_begin_color(ctx, *color, *size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1symbol(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_combo_begin_symbol(ctx, symbol, *size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1symbol_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong selectedAddress, jint symbol, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *selected = (const char *)(intptr_t)selectedAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_combo_begin_symbol_label(ctx, selected, symbol, *size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1symbol_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong selectedAddress, jint len, jint symbol, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *selected = (const char *)(intptr_t)selectedAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_combo_begin_symbol_text(ctx, selected, len, symbol, *size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1image(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_combo_begin_image(ctx, *img, *size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1image_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong selectedAddress, jlong imgAddress, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *selected = (const char *)(intptr_t)selectedAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_combo_begin_image_label(ctx, selected, *img, *size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1begin_1image_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong selectedAddress, jint len, jlong imgAddress, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *selected = (const char *)(intptr_t)selectedAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_combo_begin_image_text(ctx, selected, len, *img, *size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_combo_item_label(ctx, text, alignment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_combo_item_text(ctx, text, len, alignment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1image_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong textAddress, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_combo_item_image_label(ctx, *img, text, alignment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1image_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong textAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_combo_item_image_text(ctx, *img, text, len, alignment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1symbol_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong textAddress, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_combo_item_symbol_label(ctx, symbol, text, alignment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1item_1symbol_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong textAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_combo_item_symbol_text(ctx, symbol, text, len, alignment);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1close(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_combo_close(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combo_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_combo_end(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint flags, jlong sizeAddress, jlong trigger_boundsAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    struct nk_rect *trigger_bounds = (struct nk_rect *)(intptr_t)trigger_boundsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_contextual_begin(ctx, flags, *size, *trigger_bounds);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint len, jint align) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_contextual_item_text(ctx, text, len, align);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint align) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_contextual_item_label(ctx, text, align);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1image_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong textAddress, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_contextual_item_image_label(ctx, *img, text, alignment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1image_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong textAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_contextual_item_image_text(ctx, *img, text, len, alignment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1symbol_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong textAddress, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_contextual_item_symbol_label(ctx, symbol, text, alignment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1item_1symbol_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong textAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_contextual_item_symbol_text(ctx, symbol, text, len, alignment);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1close(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_contextual_close(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1contextual_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_contextual_end(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tooltip(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_tooltip(ctx, text);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tooltip_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat width) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_tooltip_begin(ctx, width);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tooltip_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_tooltip_end(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menubar_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_menubar_begin(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menubar_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_menubar_end(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint len, jint align, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_menu_begin_text(ctx, text, len, align, *size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint align, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_menu_begin_label(ctx, text, align, *size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1image(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jlong imgAddress, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_menu_begin_image(ctx, text, *img, *size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1image_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint len, jint align, jlong imgAddress, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_menu_begin_image_text(ctx, text, len, align, *img, *size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1image_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint align, jlong imgAddress, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_menu_begin_image_label(ctx, text, align, *img, *size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1symbol(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint symbol, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_menu_begin_symbol(ctx, text, symbol, *size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1symbol_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint len, jint align, jint symbol, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_menu_begin_symbol_text(ctx, text, len, align, symbol, *size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1begin_1symbol_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint align, jint symbol, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_menu_begin_symbol_label(ctx, text, align, symbol, *size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint len, jint align) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_menu_item_text(ctx, text, len, align);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong textAddress, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_menu_item_label(ctx, text, alignment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1image_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong textAddress, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_menu_item_image_label(ctx, *img, text, alignment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1image_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong textAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_menu_item_image_text(ctx, *img, text, len, alignment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1symbol_1text(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong textAddress, jint len, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_menu_item_symbol_text(ctx, symbol, text, len, alignment);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1item_1symbol_1label(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint symbol, jlong textAddress, jint alignment) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_menu_item_symbol_label(ctx, symbol, text, alignment);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1close(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_menu_close(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1menu_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_menu_end(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1convert(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong cmdsAddress, jlong verticesAddress, jlong elementsAddress, jlong configAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_buffer *cmds = (struct nk_buffer *)(intptr_t)cmdsAddress;
    struct nk_buffer *vertices = (struct nk_buffer *)(intptr_t)verticesAddress;
    struct nk_buffer *elements = (struct nk_buffer *)(intptr_t)elementsAddress;
    const struct nk_convert_config *config = (const struct nk_convert_config *)(intptr_t)configAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_convert(ctx, cmds, vertices, elements, config);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_input_begin(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1motion(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint x, jint y) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_input_motion(ctx, x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1key(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint key, jint down) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_input_key(ctx, key, down);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1button(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint id, jint x, jint y, jint down) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_input_button(ctx, id, x, y, down);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1scroll(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong valAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_vec2 *val = (struct nk_vec2 *)(intptr_t)valAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_input_scroll(ctx, *val);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1char(JNIEnv *__env, jclass clazz, jlong ctxAddress, jbyte c) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_input_char(ctx, c);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1glyph(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong glyphAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char *glyph = (char *)(intptr_t)glyphAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_input_glyph(ctx, glyph);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1unicode(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint unicode) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_input_unicode(ctx, unicode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_input_end(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1default(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_style_default(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1from_1table(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong tableAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const struct nk_color *table = (const struct nk_color *)(intptr_t)tableAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_style_from_table(ctx, table);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1load_1cursor(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint style, jlong cursorAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_cursor *cursor = (struct nk_cursor *)(intptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_style_load_cursor(ctx, style, cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1load_1all_1cursors(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong cursorsAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_cursor *cursors = (struct nk_cursor *)(intptr_t)cursorsAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_style_load_all_cursors(ctx, cursors);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1get_1color_1by_1name(JNIEnv *__env, jclass clazz, jint c) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)nk_style_get_color_by_name(c);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1set_1font(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong fontAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const struct nk_user_font *font = (const struct nk_user_font *)(intptr_t)fontAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_style_set_font(ctx, font);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1set_1cursor(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint style) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_style_set_cursor(ctx, style);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1show_1cursor(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_style_show_cursor(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1hide_1cursor(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_style_hide_cursor(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1font(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong fontAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const struct nk_user_font *font = (const struct nk_user_font *)(intptr_t)fontAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_style_push_font(ctx, font);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1float__JJF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong addressAddress, jfloat value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    float *address = (float *)(intptr_t)addressAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_style_push_float(ctx, address, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1vec2(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong addressAddress, jlong valueAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_vec2 *address = (struct nk_vec2 *)(intptr_t)addressAddress;
    struct nk_vec2 *value = (struct nk_vec2 *)(intptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_style_push_vec2(ctx, address, *value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1style_1item(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong addressAddress, jlong valueAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_style_item *address = (struct nk_style_item *)(intptr_t)addressAddress;
    struct nk_style_item *value = (struct nk_style_item *)(intptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_style_push_style_item(ctx, address, *value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1flags__JJI(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong addressAddress, jint value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_flags *address = (nk_flags *)(intptr_t)addressAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_style_push_flags(ctx, address, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1color(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong addressAddress, jlong valueAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_color *address = (struct nk_color *)(intptr_t)addressAddress;
    struct nk_color *value = (struct nk_color *)(intptr_t)valueAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_style_push_color(ctx, address, *value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1font(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_style_pop_font(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1float(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_style_pop_float(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1vec2(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_style_pop_vec2(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1style_1item(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_style_pop_style_item(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1flags(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_style_pop_flags(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1pop_1color(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_style_pop_color(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget_1bounds(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_rect*)(intptr_t)__result) = nk_widget_bounds(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget_1position(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(intptr_t)__result) = nk_widget_position(ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget_1size(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong __result) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(intptr_t)__result) = nk_widget_size(ctx);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget_1width(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)nk_widget_width(ctx);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget_1height(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)nk_widget_height(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget_1is_1hovered(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_widget_is_hovered(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget_1is_1mouse_1clicked(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint btn) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_widget_is_mouse_clicked(ctx, btn);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget_1has_1mouse_1click_1down(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint btn, jint down) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_widget_has_mouse_click_down(ctx, btn, down);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1spacing(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint cols) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_spacing(ctx, cols);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget(JNIEnv *__env, jclass clazz, jlong boundsAddress, jlong ctxAddress) {
    struct nk_rect *bounds = (struct nk_rect *)(intptr_t)boundsAddress;
    const struct nk_context *ctx = (const struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_widget(bounds, ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1widget_1fitting(JNIEnv *__env, jclass clazz, jlong boundsAddress, jlong ctxAddress, jlong item_paddingAddress) {
    struct nk_rect *bounds = (struct nk_rect *)(intptr_t)boundsAddress;
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_vec2 *item_padding = (struct nk_vec2 *)(intptr_t)item_paddingAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_widget_fitting(bounds, ctx, *item_padding);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgb(JNIEnv *__env, jclass clazz, jint r, jint g, jint b, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_rgb(r, g, b);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1iv__JJ(JNIEnv *__env, jclass clazz, jlong rgbAddress, jlong __result) {
    const int *rgb = (const int *)(intptr_t)rgbAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_rgb_iv(rgb);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1bv(JNIEnv *__env, jclass clazz, jlong rgbAddress, jlong __result) {
    const nk_byte *rgb = (const nk_byte *)(intptr_t)rgbAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_rgb_bv(rgb);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1f(JNIEnv *__env, jclass clazz, jfloat r, jfloat g, jfloat b, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_rgb_f(r, g, b);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1fv__JJ(JNIEnv *__env, jclass clazz, jlong rgbAddress, jlong __result) {
    const float *rgb = (const float *)(intptr_t)rgbAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_rgb_fv(rgb);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1hex(JNIEnv *__env, jclass clazz, jlong rgbAddress, jlong __result) {
    const char *rgb = (const char *)(intptr_t)rgbAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_rgb_hex(rgb);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgba(JNIEnv *__env, jclass clazz, jint r, jint g, jint b, jint a, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_rgba(r, g, b, a);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1u32(JNIEnv *__env, jclass clazz, jint in, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_rgba_u32(in);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1iv__JJ(JNIEnv *__env, jclass clazz, jlong rgbaAddress, jlong __result) {
    const int *rgba = (const int *)(intptr_t)rgbaAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_rgba_iv(rgba);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1bv(JNIEnv *__env, jclass clazz, jlong rgbaAddress, jlong __result) {
    const nk_byte *rgba = (const nk_byte *)(intptr_t)rgbaAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_rgba_bv(rgba);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1f(JNIEnv *__env, jclass clazz, jfloat r, jfloat g, jfloat b, jfloat a, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_rgba_f(r, g, b, a);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1fv__JJ(JNIEnv *__env, jclass clazz, jlong rgbaAddress, jlong __result) {
    const float *rgba = (const float *)(intptr_t)rgbaAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_rgba_fv(rgba);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1hex(JNIEnv *__env, jclass clazz, jlong rgbaAddress, jlong __result) {
    const char *rgba = (const char *)(intptr_t)rgbaAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_rgba_hex(rgba);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsv(JNIEnv *__env, jclass clazz, jint h, jint s, jint v, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_hsv(h, s, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1iv__JJ(JNIEnv *__env, jclass clazz, jlong hsvAddress, jlong __result) {
    const int *hsv = (const int *)(intptr_t)hsvAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_hsv_iv(hsv);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1bv(JNIEnv *__env, jclass clazz, jlong hsvAddress, jlong __result) {
    const nk_byte *hsv = (const nk_byte *)(intptr_t)hsvAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_hsv_bv(hsv);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1f(JNIEnv *__env, jclass clazz, jfloat h, jfloat s, jfloat v, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_hsv_f(h, s, v);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1fv__JJ(JNIEnv *__env, jclass clazz, jlong hsvAddress, jlong __result) {
    const float *hsv = (const float *)(intptr_t)hsvAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_hsv_fv(hsv);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsva(JNIEnv *__env, jclass clazz, jint h, jint s, jint v, jint a, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_hsva(h, s, v, a);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1iv__JJ(JNIEnv *__env, jclass clazz, jlong hsvaAddress, jlong __result) {
    const int *hsva = (const int *)(intptr_t)hsvaAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_hsva_iv(hsva);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1bv(JNIEnv *__env, jclass clazz, jlong hsvaAddress, jlong __result) {
    const nk_byte *hsva = (const nk_byte *)(intptr_t)hsvaAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_hsva_bv(hsva);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1f(JNIEnv *__env, jclass clazz, jfloat h, jfloat s, jfloat v, jfloat a, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_hsva_f(h, s, v, a);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1fv__JJ(JNIEnv *__env, jclass clazz, jlong hsvaAddress, jlong __result) {
    const float *hsva = (const float *)(intptr_t)hsvaAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_hsva_fv(hsva);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1f__JJJJJ(JNIEnv *__env, jclass clazz, jlong rAddress, jlong gAddress, jlong bAddress, jlong aAddress, jlong colorAddress) {
    float *r = (float *)(intptr_t)rAddress;
    float *g = (float *)(intptr_t)gAddress;
    float *b = (float *)(intptr_t)bAddress;
    float *a = (float *)(intptr_t)aAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_f(r, g, b, a, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1fv__JJ(JNIEnv *__env, jclass clazz, jlong rgba_outAddress, jlong colorAddress) {
    float *rgba_out = (float *)(intptr_t)rgba_outAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_fv(rgba_out, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1d__JJJJJ(JNIEnv *__env, jclass clazz, jlong rAddress, jlong gAddress, jlong bAddress, jlong aAddress, jlong colorAddress) {
    double *r = (double *)(intptr_t)rAddress;
    double *g = (double *)(intptr_t)gAddress;
    double *b = (double *)(intptr_t)bAddress;
    double *a = (double *)(intptr_t)aAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_d(r, g, b, a, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1dv__JJ(JNIEnv *__env, jclass clazz, jlong rgba_outAddress, jlong colorAddress) {
    double *rgba_out = (double *)(intptr_t)rgba_outAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_dv(rgba_out, *color);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1u32(JNIEnv *__env, jclass clazz, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_color_u32(*color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hex_1rgba(JNIEnv *__env, jclass clazz, jlong outputAddress, jlong colorAddress) {
    char *output = (char *)(intptr_t)outputAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_hex_rgba(output, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hex_1rgb(JNIEnv *__env, jclass clazz, jlong outputAddress, jlong colorAddress) {
    char *output = (char *)(intptr_t)outputAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_hex_rgb(output, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1i__JJJJ(JNIEnv *__env, jclass clazz, jlong out_hAddress, jlong out_sAddress, jlong out_vAddress, jlong colorAddress) {
    int *out_h = (int *)(intptr_t)out_hAddress;
    int *out_s = (int *)(intptr_t)out_sAddress;
    int *out_v = (int *)(intptr_t)out_vAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsv_i(out_h, out_s, out_v, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1b(JNIEnv *__env, jclass clazz, jlong out_hAddress, jlong out_sAddress, jlong out_vAddress, jlong colorAddress) {
    nk_byte *out_h = (nk_byte *)(intptr_t)out_hAddress;
    nk_byte *out_s = (nk_byte *)(intptr_t)out_sAddress;
    nk_byte *out_v = (nk_byte *)(intptr_t)out_vAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsv_b(out_h, out_s, out_v, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1iv__JJ(JNIEnv *__env, jclass clazz, jlong hsv_outAddress, jlong colorAddress) {
    int *hsv_out = (int *)(intptr_t)hsv_outAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsv_iv(hsv_out, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1bv(JNIEnv *__env, jclass clazz, jlong hsv_outAddress, jlong colorAddress) {
    nk_byte *hsv_out = (nk_byte *)(intptr_t)hsv_outAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsv_bv(hsv_out, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1f__JJJJ(JNIEnv *__env, jclass clazz, jlong out_hAddress, jlong out_sAddress, jlong out_vAddress, jlong colorAddress) {
    float *out_h = (float *)(intptr_t)out_hAddress;
    float *out_s = (float *)(intptr_t)out_sAddress;
    float *out_v = (float *)(intptr_t)out_vAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsv_f(out_h, out_s, out_v, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1fv__JJ(JNIEnv *__env, jclass clazz, jlong hsv_outAddress, jlong colorAddress) {
    float *hsv_out = (float *)(intptr_t)hsv_outAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsv_fv(hsv_out, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1i__JJJJJ(JNIEnv *__env, jclass clazz, jlong hAddress, jlong sAddress, jlong vAddress, jlong aAddress, jlong colorAddress) {
    int *h = (int *)(intptr_t)hAddress;
    int *s = (int *)(intptr_t)sAddress;
    int *v = (int *)(intptr_t)vAddress;
    int *a = (int *)(intptr_t)aAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsva_i(h, s, v, a, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1b(JNIEnv *__env, jclass clazz, jlong hAddress, jlong sAddress, jlong vAddress, jlong aAddress, jlong colorAddress) {
    nk_byte *h = (nk_byte *)(intptr_t)hAddress;
    nk_byte *s = (nk_byte *)(intptr_t)sAddress;
    nk_byte *v = (nk_byte *)(intptr_t)vAddress;
    nk_byte *a = (nk_byte *)(intptr_t)aAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsva_b(h, s, v, a, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1iv__JJ(JNIEnv *__env, jclass clazz, jlong hsva_outAddress, jlong colorAddress) {
    int *hsva_out = (int *)(intptr_t)hsva_outAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsva_iv(hsva_out, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1bv(JNIEnv *__env, jclass clazz, jlong hsva_outAddress, jlong colorAddress) {
    nk_byte *hsva_out = (nk_byte *)(intptr_t)hsva_outAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsva_bv(hsva_out, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1f__JJJJJ(JNIEnv *__env, jclass clazz, jlong out_hAddress, jlong out_sAddress, jlong out_vAddress, jlong out_aAddress, jlong colorAddress) {
    float *out_h = (float *)(intptr_t)out_hAddress;
    float *out_s = (float *)(intptr_t)out_sAddress;
    float *out_v = (float *)(intptr_t)out_vAddress;
    float *out_a = (float *)(intptr_t)out_aAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsva_f(out_h, out_s, out_v, out_a, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1fv__JJ(JNIEnv *__env, jclass clazz, jlong hsva_outAddress, jlong colorAddress) {
    float *hsva_out = (float *)(intptr_t)hsva_outAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsva_fv(hsva_out, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1handle_1ptr(JNIEnv *__env, jclass clazz, jlong ptrAddress, jlong __result) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    *((nk_handle*)(intptr_t)__result) = nk_handle_ptr(ptr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1handle_1id(JNIEnv *__env, jclass clazz, jint id, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((nk_handle*)(intptr_t)__result) = nk_handle_id(id);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1image_1handle(JNIEnv *__env, jclass clazz, jlong handleAddress, jlong __result) {
    nk_handle *handle = (nk_handle *)(intptr_t)handleAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_image*)(intptr_t)__result) = nk_image_handle(*handle);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1image_1ptr(JNIEnv *__env, jclass clazz, jlong ptrAddress, jlong __result) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_image*)(intptr_t)__result) = nk_image_ptr(ptr);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1image_1id(JNIEnv *__env, jclass clazz, jint id, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_image*)(intptr_t)__result) = nk_image_id(id);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1image_1is_1subimage(JNIEnv *__env, jclass clazz, jlong imgAddress) {
    const struct nk_image *img = (const struct nk_image *)(intptr_t)imgAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_image_is_subimage(img);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1subimage_1ptr(JNIEnv *__env, jclass clazz, jlong ptrAddress, jshort w, jshort h, jlong sub_regionAddress, jlong __result) {
    void *ptr = (void *)(intptr_t)ptrAddress;
    struct nk_rect *sub_region = (struct nk_rect *)(intptr_t)sub_regionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_image*)(intptr_t)__result) = nk_subimage_ptr(ptr, w, h, *sub_region);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1subimage_1id(JNIEnv *__env, jclass clazz, jint id, jshort w, jshort h, jlong sub_regionAddress, jlong __result) {
    struct nk_rect *sub_region = (struct nk_rect *)(intptr_t)sub_regionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_image*)(intptr_t)__result) = nk_subimage_id(id, w, h, *sub_region);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1subimage_1handle(JNIEnv *__env, jclass clazz, jlong handleAddress, jshort w, jshort h, jlong sub_regionAddress, jlong __result) {
    nk_handle *handle = (nk_handle *)(intptr_t)handleAddress;
    struct nk_rect *sub_region = (struct nk_rect *)(intptr_t)sub_regionAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_image*)(intptr_t)__result) = nk_subimage_handle(*handle, w, h, *sub_region);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1murmur_1hash(JNIEnv *__env, jclass clazz, jlong keyAddress, jint len, jint seed) {
    const void *key = (const void *)(intptr_t)keyAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_murmur_hash(key, len, seed);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1triangle_1from_1direction(JNIEnv *__env, jclass clazz, jlong resultAddress, jlong rAddress, jfloat pad_x, jfloat pad_y, jint direction) {
    struct nk_vec2 *result = (struct nk_vec2 *)(intptr_t)resultAddress;
    struct nk_rect *r = (struct nk_rect *)(intptr_t)rAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_triangle_from_direction(result, *r, pad_x, pad_y, direction);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1vec2(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(intptr_t)__result) = nk_vec2(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1vec2i(JNIEnv *__env, jclass clazz, jint x, jint y, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(intptr_t)__result) = nk_vec2i(x, y);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1vec2v__JJ(JNIEnv *__env, jclass clazz, jlong xyAddress, jlong __result) {
    const float *xy = (const float *)(intptr_t)xyAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(intptr_t)__result) = nk_vec2v(xy);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1vec2iv__JJ(JNIEnv *__env, jclass clazz, jlong xyAddress, jlong __result) {
    const int *xy = (const int *)(intptr_t)xyAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(intptr_t)__result) = nk_vec2iv(xy);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1get_1null_1rect(JNIEnv *__env, jclass clazz, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_rect*)(intptr_t)__result) = nk_get_null_rect();
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rect(JNIEnv *__env, jclass clazz, jfloat x, jfloat y, jfloat w, jfloat h, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_rect*)(intptr_t)__result) = nk_rect(x, y, w, h);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1recti(JNIEnv *__env, jclass clazz, jint x, jint y, jint w, jint h, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_rect*)(intptr_t)__result) = nk_recti(x, y, w, h);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1recta(JNIEnv *__env, jclass clazz, jlong posAddress, jlong sizeAddress, jlong __result) {
    struct nk_vec2 *pos = (struct nk_vec2 *)(intptr_t)posAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_rect*)(intptr_t)__result) = nk_recta(*pos, *size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rectv__JJ(JNIEnv *__env, jclass clazz, jlong xywhAddress, jlong __result) {
    const float *xywh = (const float *)(intptr_t)xywhAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_rect*)(intptr_t)__result) = nk_rectv(xywh);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rectiv__JJ(JNIEnv *__env, jclass clazz, jlong xywhAddress, jlong __result) {
    const int *xywh = (const int *)(intptr_t)xywhAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_rect*)(intptr_t)__result) = nk_rectiv(xywh);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rect_1pos(JNIEnv *__env, jclass clazz, jlong rAddress, jlong __result) {
    struct nk_rect *r = (struct nk_rect *)(intptr_t)rAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(intptr_t)__result) = nk_rect_pos(*r);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rect_1size(JNIEnv *__env, jclass clazz, jlong rAddress, jlong __result) {
    struct nk_rect *r = (struct nk_rect *)(intptr_t)rAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(intptr_t)__result) = nk_rect_size(*r);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1strlen(JNIEnv *__env, jclass clazz, jlong strAddress) {
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_strlen(str);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stricmp(JNIEnv *__env, jclass clazz, jlong s1Address, jlong s2Address) {
    const char *s1 = (const char *)(intptr_t)s1Address;
    const char *s2 = (const char *)(intptr_t)s2Address;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_stricmp(s1, s2);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stricmpn(JNIEnv *__env, jclass clazz, jlong s1Address, jlong s2Address, jint n) {
    const char *s1 = (const char *)(intptr_t)s1Address;
    const char *s2 = (const char *)(intptr_t)s2Address;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_stricmpn(s1, s2, n);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1strtoi(JNIEnv *__env, jclass clazz, jlong strAddress, jlong endptrAddress) {
    const char *str = (const char *)(intptr_t)strAddress;
    const char **endptr = (const char **)(intptr_t)endptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_strtoi(str, endptr);
}

JNIEXPORT jfloat JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1strtof(JNIEnv *__env, jclass clazz, jlong strAddress, jlong endptrAddress) {
    const char *str = (const char *)(intptr_t)strAddress;
    const char **endptr = (const char **)(intptr_t)endptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jfloat)nk_strtof(str, endptr);
}

JNIEXPORT jdouble JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1strtod(JNIEnv *__env, jclass clazz, jlong strAddress, jlong endptrAddress) {
    const char *str = (const char *)(intptr_t)strAddress;
    const char **endptr = (const char **)(intptr_t)endptrAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jdouble)nk_strtod(str, endptr);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1strfilter(JNIEnv *__env, jclass clazz, jlong strAddress, jlong regexpAddress) {
    const char *str = (const char *)(intptr_t)strAddress;
    const char *regexp = (const char *)(intptr_t)regexpAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_strfilter(str, regexp);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1strmatch_1fuzzy_1string__JJJ(JNIEnv *__env, jclass clazz, jlong strAddress, jlong patternAddress, jlong out_scoreAddress) {
    const char *str = (const char *)(intptr_t)strAddress;
    const char *pattern = (const char *)(intptr_t)patternAddress;
    int *out_score = (int *)(intptr_t)out_scoreAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_strmatch_fuzzy_string(str, pattern, out_score);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1strmatch_1fuzzy_1text__JIJJ(JNIEnv *__env, jclass clazz, jlong txtAddress, jint txt_len, jlong patternAddress, jlong out_scoreAddress) {
    const char *txt = (const char *)(intptr_t)txtAddress;
    const char *pattern = (const char *)(intptr_t)patternAddress;
    int *out_score = (int *)(intptr_t)out_scoreAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_strmatch_fuzzy_text(txt, txt_len, pattern, out_score);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1utf_1decode__JJI(JNIEnv *__env, jclass clazz, jlong cAddress, jlong uAddress, jint clen) {
    const char *c = (const char *)(intptr_t)cAddress;
    nk_rune *u = (nk_rune *)(intptr_t)uAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_utf_decode(c, u, clen);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1utf_1encode(JNIEnv *__env, jclass clazz, jint u, jlong cAddress, jint clen) {
    char *c = (char *)(intptr_t)cAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_utf_encode(u, c, clen);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1utf_1len(JNIEnv *__env, jclass clazz, jlong strAddress, jint byte_len) {
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_utf_len(str, byte_len);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1utf_1at__JIIJJ(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint length, jint index, jlong unicodeAddress, jlong lenAddress) {
    const char *buffer = (const char *)(intptr_t)bufferAddress;
    nk_rune *unicode = (nk_rune *)(intptr_t)unicodeAddress;
    int *len = (int *)(intptr_t)lenAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)nk_utf_at(buffer, length, index, unicode, len);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1init(JNIEnv *__env, jclass clazz, jlong bufferAddress, jlong allocatorAddress, jlong size) {
    struct nk_buffer *buffer = (struct nk_buffer *)(intptr_t)bufferAddress;
    const struct nk_allocator *allocator = (const struct nk_allocator *)(intptr_t)allocatorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_buffer_init(buffer, allocator, (nk_size)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1init_1fixed(JNIEnv *__env, jclass clazz, jlong bufferAddress, jlong memoryAddress, jlong size) {
    struct nk_buffer *buffer = (struct nk_buffer *)(intptr_t)bufferAddress;
    void *memory = (void *)(intptr_t)memoryAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_buffer_init_fixed(buffer, memory, (nk_size)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1info(JNIEnv *__env, jclass clazz, jlong statusAddress, jlong bufferAddress) {
    struct nk_memory_status *status = (struct nk_memory_status *)(intptr_t)statusAddress;
    struct nk_buffer *buffer = (struct nk_buffer *)(intptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_buffer_info(status, buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1push(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint type, jlong memoryAddress, jlong size, jlong align) {
    struct nk_buffer *buffer = (struct nk_buffer *)(intptr_t)bufferAddress;
    const void *memory = (const void *)(intptr_t)memoryAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_buffer_push(buffer, type, memory, (nk_size)size, (nk_size)align);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1mark(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint type) {
    struct nk_buffer *buffer = (struct nk_buffer *)(intptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_buffer_mark(buffer, type);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1reset(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint type) {
    struct nk_buffer *buffer = (struct nk_buffer *)(intptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_buffer_reset(buffer, type);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1clear(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    struct nk_buffer *buffer = (struct nk_buffer *)(intptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_buffer_clear(buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1free(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    struct nk_buffer *buffer = (struct nk_buffer *)(intptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_buffer_free(buffer);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1memory(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    struct nk_buffer *buffer = (struct nk_buffer *)(intptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)nk_buffer_memory(buffer);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1memory_1const(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    const struct nk_buffer *buffer = (const struct nk_buffer *)(intptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)nk_buffer_memory_const(buffer);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1buffer_1total(JNIEnv *__env, jclass clazz, jlong bufferAddress) {
    struct nk_buffer *buffer = (struct nk_buffer *)(intptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)nk_buffer_total(buffer);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1init(JNIEnv *__env, jclass clazz, jlong strAddress, jlong allocatorAddress, jlong size) {
    struct nk_str *str = (struct nk_str *)(intptr_t)strAddress;
    const struct nk_allocator *allocator = (const struct nk_allocator *)(intptr_t)allocatorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_str_init(str, allocator, (nk_size)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1init_1fixed(JNIEnv *__env, jclass clazz, jlong strAddress, jlong memoryAddress, jlong size) {
    struct nk_str *str = (struct nk_str *)(intptr_t)strAddress;
    void *memory = (void *)(intptr_t)memoryAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_str_init_fixed(str, memory, (nk_size)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1clear(JNIEnv *__env, jclass clazz, jlong strAddress) {
    struct nk_str *str = (struct nk_str *)(intptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_str_clear(str);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1free(JNIEnv *__env, jclass clazz, jlong strAddress) {
    struct nk_str *str = (struct nk_str *)(intptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_str_free(str);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1text_1char(JNIEnv *__env, jclass clazz, jlong sAddress, jlong strAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_append_text_char(s, str, len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1str_1char(JNIEnv *__env, jclass clazz, jlong sAddress, jlong strAddress) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_append_str_char(s, str);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1text_1utf8(JNIEnv *__env, jclass clazz, jlong sAddress, jlong strAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_append_text_utf8(s, str, len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1str_1utf8(JNIEnv *__env, jclass clazz, jlong sAddress, jlong strAddress) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_append_str_utf8(s, str);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1text_1runes__JJI(JNIEnv *__env, jclass clazz, jlong sAddress, jlong runesAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    const nk_rune *runes = (const nk_rune *)(intptr_t)runesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_append_text_runes(s, runes, len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1str_1runes__JJ(JNIEnv *__env, jclass clazz, jlong sAddress, jlong runesAddress) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    const nk_rune *runes = (const nk_rune *)(intptr_t)runesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_append_str_runes(s, runes);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1at_1char(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong strAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_insert_at_char(s, pos, str, len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1at_1rune(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong strAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_insert_at_rune(s, pos, str, len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1text_1char(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong strAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_insert_text_char(s, pos, str, len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1str_1char(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong strAddress) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_insert_str_char(s, pos, str);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1text_1utf8(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong strAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_insert_text_utf8(s, pos, str, len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1str_1utf8(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong strAddress) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_insert_str_utf8(s, pos, str);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1text_1runes__JIJI(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong runesAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    const nk_rune *runes = (const nk_rune *)(intptr_t)runesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_insert_text_runes(s, pos, runes, len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1str_1runes__JIJ(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong runesAddress) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    const nk_rune *runes = (const nk_rune *)(intptr_t)runesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_insert_str_runes(s, pos, runes);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1remove_1chars(JNIEnv *__env, jclass clazz, jlong sAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_str_remove_chars(s, len);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1remove_1runes(JNIEnv *__env, jclass clazz, jlong strAddress, jint len) {
    struct nk_str *str = (struct nk_str *)(intptr_t)strAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_str_remove_runes(str, len);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1delete_1chars(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jint len) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_str_delete_chars(s, pos, len);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1delete_1runes(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jint len) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_str_delete_runes(s, pos, len);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1char(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)nk_str_at_char(s, pos);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1rune__JIJJ(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong unicodeAddress, jlong lenAddress) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    nk_rune *unicode = (nk_rune *)(intptr_t)unicodeAddress;
    int *len = (int *)(intptr_t)lenAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)nk_str_at_rune(s, pos, unicode, len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1rune_1at(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos) {
    const struct nk_str *s = (const struct nk_str *)(intptr_t)sAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_rune_at(s, pos);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1char_1const(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos) {
    const struct nk_str *s = (const struct nk_str *)(intptr_t)sAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)nk_str_at_char_const(s, pos);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1const__JIJJ(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jlong unicodeAddress, jlong lenAddress) {
    const struct nk_str *s = (const struct nk_str *)(intptr_t)sAddress;
    nk_rune *unicode = (nk_rune *)(intptr_t)unicodeAddress;
    int *len = (int *)(intptr_t)lenAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)nk_str_at_const(s, pos, unicode, len);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1get(JNIEnv *__env, jclass clazz, jlong sAddress) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)nk_str_get(s);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1get_1const(JNIEnv *__env, jclass clazz, jlong sAddress) {
    const struct nk_str *s = (const struct nk_str *)(intptr_t)sAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)nk_str_get_const(s);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1len(JNIEnv *__env, jclass clazz, jlong sAddress) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_len(s);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1len_1char(JNIEnv *__env, jclass clazz, jlong sAddress) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_str_len_char(s);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1filter_1default(JNIEnv *__env, jclass clazz, jlong editAddress, jint unicode) {
    const struct nk_text_edit *edit = (const struct nk_text_edit *)(intptr_t)editAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_filter_default(edit, unicode);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1filter_1ascii(JNIEnv *__env, jclass clazz, jlong editAddress, jint unicode) {
    const struct nk_text_edit *edit = (const struct nk_text_edit *)(intptr_t)editAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_filter_ascii(edit, unicode);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1filter_1float(JNIEnv *__env, jclass clazz, jlong editAddress, jint unicode) {
    const struct nk_text_edit *edit = (const struct nk_text_edit *)(intptr_t)editAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_filter_float(edit, unicode);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1filter_1decimal(JNIEnv *__env, jclass clazz, jlong editAddress, jint unicode) {
    const struct nk_text_edit *edit = (const struct nk_text_edit *)(intptr_t)editAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_filter_decimal(edit, unicode);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1filter_1hex(JNIEnv *__env, jclass clazz, jlong editAddress, jint unicode) {
    const struct nk_text_edit *edit = (const struct nk_text_edit *)(intptr_t)editAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_filter_hex(edit, unicode);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1filter_1oct(JNIEnv *__env, jclass clazz, jlong editAddress, jint unicode) {
    const struct nk_text_edit *edit = (const struct nk_text_edit *)(intptr_t)editAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_filter_oct(edit, unicode);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1filter_1binary(JNIEnv *__env, jclass clazz, jlong editAddress, jint unicode) {
    const struct nk_text_edit *edit = (const struct nk_text_edit *)(intptr_t)editAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_filter_binary(edit, unicode);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1init(JNIEnv *__env, jclass clazz, jlong boxAddress, jlong allocatorAddress, jlong size) {
    struct nk_text_edit *box = (struct nk_text_edit *)(intptr_t)boxAddress;
    struct nk_allocator *allocator = (struct nk_allocator *)(intptr_t)allocatorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_textedit_init(box, allocator, (nk_size)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1init_1fixed(JNIEnv *__env, jclass clazz, jlong boxAddress, jlong memoryAddress, jlong size) {
    struct nk_text_edit *box = (struct nk_text_edit *)(intptr_t)boxAddress;
    void *memory = (void *)(intptr_t)memoryAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_textedit_init_fixed(box, memory, (nk_size)size);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1free(JNIEnv *__env, jclass clazz, jlong boxAddress) {
    struct nk_text_edit *box = (struct nk_text_edit *)(intptr_t)boxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_textedit_free(box);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1text(JNIEnv *__env, jclass clazz, jlong boxAddress, jlong textAddress, jint total_len) {
    struct nk_text_edit *box = (struct nk_text_edit *)(intptr_t)boxAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_textedit_text(box, text, total_len);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1delete(JNIEnv *__env, jclass clazz, jlong boxAddress, jint where, jint len) {
    struct nk_text_edit *box = (struct nk_text_edit *)(intptr_t)boxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_textedit_delete(box, where, len);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1delete_1selection(JNIEnv *__env, jclass clazz, jlong boxAddress) {
    struct nk_text_edit *box = (struct nk_text_edit *)(intptr_t)boxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_textedit_delete_selection(box);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1select_1all(JNIEnv *__env, jclass clazz, jlong boxAddress) {
    struct nk_text_edit *box = (struct nk_text_edit *)(intptr_t)boxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_textedit_select_all(box);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1cut(JNIEnv *__env, jclass clazz, jlong boxAddress) {
    struct nk_text_edit *box = (struct nk_text_edit *)(intptr_t)boxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_textedit_cut(box);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1paste(JNIEnv *__env, jclass clazz, jlong boxAddress, jlong ctextAddress, jint len) {
    struct nk_text_edit *box = (struct nk_text_edit *)(intptr_t)boxAddress;
    const char *ctext = (const char *)(intptr_t)ctextAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_textedit_paste(box, ctext, len);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1undo(JNIEnv *__env, jclass clazz, jlong boxAddress) {
    struct nk_text_edit *box = (struct nk_text_edit *)(intptr_t)boxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_textedit_undo(box);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1textedit_1redo(JNIEnv *__env, jclass clazz, jlong boxAddress) {
    struct nk_text_edit *box = (struct nk_text_edit *)(intptr_t)boxAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_textedit_redo(box);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1line(JNIEnv *__env, jclass clazz, jlong bAddress, jfloat x0, jfloat y0, jfloat x1, jfloat y1, jfloat line_thickness, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_stroke_line(b, x0, y0, x1, y1, line_thickness, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1curve(JNIEnv *__env, jclass clazz, jlong bAddress, jfloat ax, jfloat ay, jfloat ctrl0x, jfloat ctrl0y, jfloat ctrl1x, jfloat ctrl1y, jfloat bx, jfloat by, jfloat line_thickness, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_stroke_curve(b, ax, ay, ctrl0x, ctrl0y, ctrl1x, ctrl1y, bx, by, line_thickness, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1rect(JNIEnv *__env, jclass clazz, jlong bAddress, jlong rectAddress, jfloat rounding, jfloat line_thickness, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_stroke_rect(b, *rect, rounding, line_thickness, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1circle(JNIEnv *__env, jclass clazz, jlong bAddress, jlong rectAddress, jfloat line_thickness, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_stroke_circle(b, *rect, line_thickness, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1arc(JNIEnv *__env, jclass clazz, jlong bAddress, jfloat cx, jfloat cy, jfloat radius, jfloat a_min, jfloat a_max, jfloat line_thickness, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_stroke_arc(b, cx, cy, radius, a_min, a_max, line_thickness, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1triangle(JNIEnv *__env, jclass clazz, jlong bAddress, jfloat x0, jfloat y0, jfloat x1, jfloat y1, jfloat x2, jfloat y2, jfloat line_thichness, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_stroke_triangle(b, x0, y0, x1, y1, x2, y2, line_thichness, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1polyline__JJIFJ(JNIEnv *__env, jclass clazz, jlong bAddress, jlong pointsAddress, jint point_count, jfloat line_thickness, jlong colAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    float *points = (float *)(intptr_t)pointsAddress;
    struct nk_color *col = (struct nk_color *)(intptr_t)colAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_stroke_polyline(b, points, point_count, line_thickness, *col);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1polygon__JJIFJ(JNIEnv *__env, jclass clazz, jlong bAddress, jlong pointsAddress, jint point_count, jfloat line_thickness, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    float *points = (float *)(intptr_t)pointsAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_stroke_polygon(b, points, point_count, line_thickness, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1fill_1rect(JNIEnv *__env, jclass clazz, jlong bAddress, jlong rectAddress, jfloat rounding, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_fill_rect(b, *rect, rounding, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1fill_1rect_1multi_1color(JNIEnv *__env, jclass clazz, jlong bAddress, jlong rectAddress, jlong leftAddress, jlong topAddress, jlong rightAddress, jlong bottomAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    struct nk_color *left = (struct nk_color *)(intptr_t)leftAddress;
    struct nk_color *top = (struct nk_color *)(intptr_t)topAddress;
    struct nk_color *right = (struct nk_color *)(intptr_t)rightAddress;
    struct nk_color *bottom = (struct nk_color *)(intptr_t)bottomAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_fill_rect_multi_color(b, *rect, *left, *top, *right, *bottom);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1fill_1circle(JNIEnv *__env, jclass clazz, jlong bAddress, jlong rectAddress, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_fill_circle(b, *rect, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1fill_1arc(JNIEnv *__env, jclass clazz, jlong bAddress, jfloat cx, jfloat cy, jfloat radius, jfloat a_min, jfloat a_max, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_fill_arc(b, cx, cy, radius, a_min, a_max, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1fill_1triangle(JNIEnv *__env, jclass clazz, jlong bAddress, jfloat x0, jfloat y0, jfloat x1, jfloat y1, jfloat x2, jfloat y2, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_fill_triangle(b, x0, y0, x1, y1, x2, y2, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1fill_1polygon__JJIJ(JNIEnv *__env, jclass clazz, jlong bAddress, jlong pointsAddress, jint point_count, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    float *points = (float *)(intptr_t)pointsAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_fill_polygon(b, points, point_count, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1image(JNIEnv *__env, jclass clazz, jlong bAddress, jlong rectAddress, jlong imgAddress, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    const struct nk_image *img = (const struct nk_image *)(intptr_t)imgAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_image(b, *rect, img, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1text(JNIEnv *__env, jclass clazz, jlong bAddress, jlong rectAddress, jlong stringAddress, jint length, jlong fontAddress, jlong bgAddress, jlong fgAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    const char *string = (const char *)(intptr_t)stringAddress;
    const struct nk_user_font *font = (const struct nk_user_font *)(intptr_t)fontAddress;
    struct nk_color *bg = (struct nk_color *)(intptr_t)bgAddress;
    struct nk_color *fg = (struct nk_color *)(intptr_t)fgAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_text(b, *rect, string, length, font, *bg, *fg);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1push_1scissor(JNIEnv *__env, jclass clazz, jlong bAddress, jlong rectAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_push_scissor(b, *rect);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1push_1custom(JNIEnv *__env, jclass clazz, jlong bAddress, jlong rectAddress, jlong callbackAddress, jlong usrAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    nk_command_custom_callback callback = (nk_command_custom_callback)(intptr_t)callbackAddress;
    nk_handle *usr = (nk_handle *)(intptr_t)usrAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_push_custom(b, *rect, callback, *usr);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1_1next(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong cmdAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const struct nk_command *cmd = (const struct nk_command *)(intptr_t)cmdAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)nk__next(ctx, cmd);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)nk__begin(ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1has_1mouse_1click(JNIEnv *__env, jclass clazz, jlong iAddress, jint id) {
    const struct nk_input *i = (const struct nk_input *)(intptr_t)iAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_input_has_mouse_click(i, id);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1has_1mouse_1click_1in_1rect(JNIEnv *__env, jclass clazz, jlong iAddress, jint id, jlong rectAddress) {
    const struct nk_input *i = (const struct nk_input *)(intptr_t)iAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_input_has_mouse_click_in_rect(i, id, *rect);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1has_1mouse_1click_1down_1in_1rect(JNIEnv *__env, jclass clazz, jlong iAddress, jint id, jlong rectAddress, jint down) {
    const struct nk_input *i = (const struct nk_input *)(intptr_t)iAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_input_has_mouse_click_down_in_rect(i, id, *rect, down);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1click_1in_1rect(JNIEnv *__env, jclass clazz, jlong iAddress, jint id, jlong rectAddress) {
    const struct nk_input *i = (const struct nk_input *)(intptr_t)iAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_input_is_mouse_click_in_rect(i, id, *rect);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1click_1down_1in_1rect(JNIEnv *__env, jclass clazz, jlong iAddress, jint id, jlong bAddress, jint down) {
    const struct nk_input *i = (const struct nk_input *)(intptr_t)iAddress;
    struct nk_rect *b = (struct nk_rect *)(intptr_t)bAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_input_is_mouse_click_down_in_rect(i, id, *b, down);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1any_1mouse_1click_1in_1rect(JNIEnv *__env, jclass clazz, jlong iAddress, jlong rectAddress) {
    const struct nk_input *i = (const struct nk_input *)(intptr_t)iAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_input_any_mouse_click_in_rect(i, *rect);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1prev_1hovering_1rect(JNIEnv *__env, jclass clazz, jlong iAddress, jlong rectAddress) {
    const struct nk_input *i = (const struct nk_input *)(intptr_t)iAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_input_is_mouse_prev_hovering_rect(i, *rect);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1hovering_1rect(JNIEnv *__env, jclass clazz, jlong iAddress, jlong rectAddress) {
    const struct nk_input *i = (const struct nk_input *)(intptr_t)iAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_input_is_mouse_hovering_rect(i, *rect);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1mouse_1clicked(JNIEnv *__env, jclass clazz, jlong iAddress, jint id, jlong rectAddress) {
    const struct nk_input *i = (const struct nk_input *)(intptr_t)iAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_input_mouse_clicked(i, id, *rect);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1down(JNIEnv *__env, jclass clazz, jlong iAddress, jint id) {
    const struct nk_input *i = (const struct nk_input *)(intptr_t)iAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_input_is_mouse_down(i, id);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1pressed(JNIEnv *__env, jclass clazz, jlong iAddress, jint id) {
    const struct nk_input *i = (const struct nk_input *)(intptr_t)iAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_input_is_mouse_pressed(i, id);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1mouse_1released(JNIEnv *__env, jclass clazz, jlong iAddress, jint id) {
    const struct nk_input *i = (const struct nk_input *)(intptr_t)iAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_input_is_mouse_released(i, id);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1key_1pressed(JNIEnv *__env, jclass clazz, jlong iAddress, jint key) {
    const struct nk_input *i = (const struct nk_input *)(intptr_t)iAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_input_is_key_pressed(i, key);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1key_1released(JNIEnv *__env, jclass clazz, jlong iAddress, jint key) {
    const struct nk_input *i = (const struct nk_input *)(intptr_t)iAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_input_is_key_released(i, key);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1input_1is_1key_1down(JNIEnv *__env, jclass clazz, jlong iAddress, jint key) {
    const struct nk_input *i = (const struct nk_input *)(intptr_t)iAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)nk_input_is_key_down(i, key);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1init(JNIEnv *__env, jclass clazz, jlong listAddress) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_init(list);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1setup(JNIEnv *__env, jclass clazz, jlong canvasAddress, jlong configAddress, jlong cmdsAddress, jlong verticesAddress, jlong elementsAddress, jint line_aa, jint shape_aa) {
    struct nk_draw_list *canvas = (struct nk_draw_list *)(intptr_t)canvasAddress;
    const struct nk_convert_config *config = (const struct nk_convert_config *)(intptr_t)configAddress;
    struct nk_buffer *cmds = (struct nk_buffer *)(intptr_t)cmdsAddress;
    struct nk_buffer *vertices = (struct nk_buffer *)(intptr_t)verticesAddress;
    struct nk_buffer *elements = (struct nk_buffer *)(intptr_t)elementsAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_setup(canvas, config, cmds, vertices, elements, line_aa, shape_aa);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1clear(JNIEnv *__env, jclass clazz, jlong listAddress) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_clear(list);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1_1draw_1list_1begin(JNIEnv *__env, jclass clazz, jlong listAddress, jlong bufferAddress) {
    const struct nk_draw_list *list = (const struct nk_draw_list *)(intptr_t)listAddress;
    const struct nk_buffer *buffer = (const struct nk_buffer *)(intptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)nk__draw_list_begin(list, buffer);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1_1draw_1list_1next(JNIEnv *__env, jclass clazz, jlong cmdAddress, jlong bufferAddress, jlong listAddress) {
    const struct nk_draw_command *cmd = (const struct nk_draw_command *)(intptr_t)cmdAddress;
    const struct nk_buffer *buffer = (const struct nk_buffer *)(intptr_t)bufferAddress;
    const struct nk_draw_list *list = (const struct nk_draw_list *)(intptr_t)listAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)nk__draw_list_next(cmd, buffer, list);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1_1draw_1begin(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong bufferAddress) {
    const struct nk_context *ctx = (const struct nk_context *)(intptr_t)ctxAddress;
    const struct nk_buffer *buffer = (const struct nk_buffer *)(intptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)nk__draw_begin(ctx, buffer);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1_1draw_1end(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong bufferAddress) {
    const struct nk_context *ctx = (const struct nk_context *)(intptr_t)ctxAddress;
    const struct nk_buffer *buffer = (const struct nk_buffer *)(intptr_t)bufferAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)nk__draw_end(ctx, buffer);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1_1draw_1next(JNIEnv *__env, jclass clazz, jlong cmdAddress, jlong bufferAddress, jlong ctxAddress) {
    const struct nk_draw_command *cmd = (const struct nk_draw_command *)(intptr_t)cmdAddress;
    const struct nk_buffer *buffer = (const struct nk_buffer *)(intptr_t)bufferAddress;
    const struct nk_context *ctx = (const struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(intptr_t)nk__draw_next(cmd, buffer, ctx);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1clear(JNIEnv *__env, jclass clazz, jlong listAddress) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_path_clear(list);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1line_1to(JNIEnv *__env, jclass clazz, jlong listAddress, jlong posAddress) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_vec2 *pos = (struct nk_vec2 *)(intptr_t)posAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_path_line_to(list, *pos);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1arc_1to_1fast(JNIEnv *__env, jclass clazz, jlong listAddress, jlong centerAddress, jfloat radius, jint a_min, jint a_max) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_vec2 *center = (struct nk_vec2 *)(intptr_t)centerAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_path_arc_to_fast(list, *center, radius, a_min, a_max);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1arc_1to(JNIEnv *__env, jclass clazz, jlong listAddress, jlong centerAddress, jfloat radius, jfloat a_min, jfloat a_max, jint segments) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_vec2 *center = (struct nk_vec2 *)(intptr_t)centerAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_path_arc_to(list, *center, radius, a_min, a_max, segments);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1rect_1to(JNIEnv *__env, jclass clazz, jlong listAddress, jlong aAddress, jlong bAddress, jfloat rounding) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_vec2 *a = (struct nk_vec2 *)(intptr_t)aAddress;
    struct nk_vec2 *b = (struct nk_vec2 *)(intptr_t)bAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_path_rect_to(list, *a, *b, rounding);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1curve_1to(JNIEnv *__env, jclass clazz, jlong listAddress, jlong p2Address, jlong p3Address, jlong p4Address, jint num_segments) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_vec2 *p2 = (struct nk_vec2 *)(intptr_t)p2Address;
    struct nk_vec2 *p3 = (struct nk_vec2 *)(intptr_t)p3Address;
    struct nk_vec2 *p4 = (struct nk_vec2 *)(intptr_t)p4Address;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_path_curve_to(list, *p2, *p3, *p4, num_segments);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1fill(JNIEnv *__env, jclass clazz, jlong listAddress, jlong colorAddress) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_path_fill(list, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1path_1stroke(JNIEnv *__env, jclass clazz, jlong listAddress, jlong colorAddress, jint closed, jfloat thickness) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_path_stroke(list, *color, closed, thickness);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1line(JNIEnv *__env, jclass clazz, jlong listAddress, jlong aAddress, jlong bAddress, jlong colorAddress, jfloat thickness) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_vec2 *a = (struct nk_vec2 *)(intptr_t)aAddress;
    struct nk_vec2 *b = (struct nk_vec2 *)(intptr_t)bAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_stroke_line(list, *a, *b, *color, thickness);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1rect(JNIEnv *__env, jclass clazz, jlong listAddress, jlong rectAddress, jlong colorAddress, jfloat rounding, jfloat thickness) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_stroke_rect(list, *rect, *color, rounding, thickness);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1triangle(JNIEnv *__env, jclass clazz, jlong listAddress, jlong aAddress, jlong bAddress, jlong cAddress, jlong colorAddress, jfloat thickness) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_vec2 *a = (struct nk_vec2 *)(intptr_t)aAddress;
    struct nk_vec2 *b = (struct nk_vec2 *)(intptr_t)bAddress;
    struct nk_vec2 *c = (struct nk_vec2 *)(intptr_t)cAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_stroke_triangle(list, *a, *b, *c, *color, thickness);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1circle(JNIEnv *__env, jclass clazz, jlong listAddress, jlong centerAddress, jfloat radius, jlong colorAddress, jint segs, jfloat thickness) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_vec2 *center = (struct nk_vec2 *)(intptr_t)centerAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_stroke_circle(list, *center, radius, *color, segs, thickness);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1curve(JNIEnv *__env, jclass clazz, jlong listAddress, jlong p0Address, jlong cp0Address, jlong cp1Address, jlong p1Address, jlong colorAddress, jint segments, jfloat thickness) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_vec2 *p0 = (struct nk_vec2 *)(intptr_t)p0Address;
    struct nk_vec2 *cp0 = (struct nk_vec2 *)(intptr_t)cp0Address;
    struct nk_vec2 *cp1 = (struct nk_vec2 *)(intptr_t)cp1Address;
    struct nk_vec2 *p1 = (struct nk_vec2 *)(intptr_t)p1Address;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_stroke_curve(list, *p0, *cp0, *cp1, *p1, *color, segments, thickness);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1stroke_1poly_1line(JNIEnv *__env, jclass clazz, jlong listAddress, jlong pntsAddress, jint cnt, jlong colorAddress, jint closed, jfloat thickness, jint aliasing) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    const struct nk_vec2 *pnts = (const struct nk_vec2 *)(intptr_t)pntsAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_stroke_poly_line(list, pnts, cnt, *color, closed, thickness, aliasing);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1fill_1rect(JNIEnv *__env, jclass clazz, jlong listAddress, jlong rectAddress, jlong colorAddress, jfloat rounding) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_fill_rect(list, *rect, *color, rounding);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1fill_1rect_1multi_1color(JNIEnv *__env, jclass clazz, jlong listAddress, jlong rectAddress, jlong leftAddress, jlong topAddress, jlong rightAddress, jlong bottomAddress) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    struct nk_color *left = (struct nk_color *)(intptr_t)leftAddress;
    struct nk_color *top = (struct nk_color *)(intptr_t)topAddress;
    struct nk_color *right = (struct nk_color *)(intptr_t)rightAddress;
    struct nk_color *bottom = (struct nk_color *)(intptr_t)bottomAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_fill_rect_multi_color(list, *rect, *left, *top, *right, *bottom);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1fill_1triangle(JNIEnv *__env, jclass clazz, jlong listAddress, jlong aAddress, jlong bAddress, jlong cAddress, jlong colorAddress) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_vec2 *a = (struct nk_vec2 *)(intptr_t)aAddress;
    struct nk_vec2 *b = (struct nk_vec2 *)(intptr_t)bAddress;
    struct nk_vec2 *c = (struct nk_vec2 *)(intptr_t)cAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_fill_triangle(list, *a, *b, *c, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1fill_1circle(JNIEnv *__env, jclass clazz, jlong listAddress, jlong centerAddress, jfloat radius, jlong colAddress, jint segs) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_vec2 *center = (struct nk_vec2 *)(intptr_t)centerAddress;
    struct nk_color *col = (struct nk_color *)(intptr_t)colAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_fill_circle(list, *center, radius, *col, segs);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1fill_1poly_1convex(JNIEnv *__env, jclass clazz, jlong listAddress, jlong pointsAddress, jint count, jlong colorAddress, jint aliasing) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    const struct nk_vec2 *points = (const struct nk_vec2 *)(intptr_t)pointsAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_fill_poly_convex(list, points, count, *color, aliasing);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1add_1image(JNIEnv *__env, jclass clazz, jlong listAddress, jlong textureAddress, jlong rectAddress, jlong colorAddress) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    struct nk_image *texture = (struct nk_image *)(intptr_t)textureAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_add_image(list, *texture, *rect, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1add_1text(JNIEnv *__env, jclass clazz, jlong listAddress, jlong fontAddress, jlong rectAddress, jlong textAddress, jint len, jfloat font_height, jlong colorAddress) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    const struct nk_user_font *font = (const struct nk_user_font *)(intptr_t)fontAddress;
    struct nk_rect *rect = (struct nk_rect *)(intptr_t)rectAddress;
    const char *text = (const char *)(intptr_t)textAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_add_text(list, font, *rect, text, len, font_height, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1draw_1list_1push_1userdata(JNIEnv *__env, jclass clazz, jlong listAddress, jlong userdataAddress) {
    struct nk_draw_list *list = (struct nk_draw_list *)(intptr_t)listAddress;
    nk_handle *userdata = (nk_handle *)(intptr_t)userdataAddress;
    UNUSED_PARAMS(__env, clazz)
    nk_draw_list_push_userdata(list, *userdata);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1item_1image(JNIEnv *__env, jclass clazz, jlong imgAddress, jlong __result) {
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_style_item*)(intptr_t)__result) = nk_style_item_image(*img);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1item_1color(JNIEnv *__env, jclass clazz, jlong colorAddress, jlong __result) {
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_style_item*)(intptr_t)__result) = nk_style_item_color(*color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1item_1hide(JNIEnv *__env, jclass clazz, jlong __result) {
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_style_item*)(intptr_t)__result) = nk_style_item_hide();
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row__JIFI_3F(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint fmt, jfloat height, jint cols, jfloatArray ratioAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    jfloat *ratio = (*__env)->GetPrimitiveArrayCritical(__env, ratioAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nk_layout_row(ctx, fmt, height, cols, (const float *)ratio);
    (*__env)->ReleasePrimitiveArrayCritical(__env, ratioAddress, ratio, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1layout_1row__JIFI_3F(jlong ctxAddress, jint fmt, jfloat height, jint cols, jint ratio__length, jfloat* ratio) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAM(ratio__length)
    nk_layout_row(ctx, fmt, height, cols, (const float *)ratio);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1group_1scrolled_1offset_1begin__J_3I_3IJI(JNIEnv *__env, jclass clazz, jlong ctxAddress, jintArray x_offsetAddress, jintArray y_offsetAddress, jlong titleAddress, jint flags) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *title = (const char *)(intptr_t)titleAddress;
    jint __result;
    jint *x_offset = (*__env)->GetPrimitiveArrayCritical(__env, x_offsetAddress, 0);
    jint *y_offset = (*__env)->GetPrimitiveArrayCritical(__env, y_offsetAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_group_scrolled_offset_begin(ctx, (nk_uint *)x_offset, (nk_uint *)y_offset, title, flags);
    (*__env)->ReleasePrimitiveArrayCritical(__env, y_offsetAddress, y_offset, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, x_offsetAddress, x_offset, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1group_1scrolled_1offset_1begin__J_3I_3IJI(jlong ctxAddress, jint x_offset__length, jint* x_offset, jint y_offset__length, jint* y_offset, jlong titleAddress, jint flags) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *title = (const char *)(intptr_t)titleAddress;
    UNUSED_PARAM(x_offset__length)
    UNUSED_PARAM(y_offset__length)
    return (jint)nk_group_scrolled_offset_begin(ctx, (nk_uint *)x_offset, (nk_uint *)y_offset, title, flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1state_1push__JIJ_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong titleAddress, jintArray stateAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *title = (const char *)(intptr_t)titleAddress;
    jint __result;
    jint *state = (*__env)->GetPrimitiveArrayCritical(__env, stateAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_tree_state_push(ctx, type, title, (enum nk_collapse_states *)state);
    (*__env)->ReleasePrimitiveArrayCritical(__env, stateAddress, state, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1tree_1state_1push__JIJ_3I(jlong ctxAddress, jint type, jlong titleAddress, jint state__length, jint* state) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *title = (const char *)(intptr_t)titleAddress;
    UNUSED_PARAM(state__length)
    return (jint)nk_tree_state_push(ctx, type, title, (enum nk_collapse_states *)state);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1tree_1state_1image_1push__JIJJ_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jlong imageAddress, jlong titleAddress, jintArray stateAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *image = (struct nk_image *)(intptr_t)imageAddress;
    const char *title = (const char *)(intptr_t)titleAddress;
    jint __result;
    jint *state = (*__env)->GetPrimitiveArrayCritical(__env, stateAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_tree_state_image_push(ctx, type, *image, title, (enum nk_collapse_states *)state);
    (*__env)->ReleasePrimitiveArrayCritical(__env, stateAddress, state, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1tree_1state_1image_1push__JIJJ_3I(jlong ctxAddress, jint type, jlong imageAddress, jlong titleAddress, jint state__length, jint* state) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *image = (struct nk_image *)(intptr_t)imageAddress;
    const char *title = (const char *)(intptr_t)titleAddress;
    UNUSED_PARAM(state__length)
    return (jint)nk_tree_state_image_push(ctx, type, *image, title, (enum nk_collapse_states *)state);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1label__JJ_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jintArray activeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    jint __result;
    jint *active = (*__env)->GetPrimitiveArrayCritical(__env, activeAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_checkbox_label(ctx, str, (int *)active);
    (*__env)->ReleasePrimitiveArrayCritical(__env, activeAddress, active, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1label__JJ_3I(jlong ctxAddress, jlong strAddress, jint active__length, jint* active) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAM(active__length)
    return (jint)nk_checkbox_label(ctx, str, (int *)active);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1text__JJI_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jintArray activeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    jint __result;
    jint *active = (*__env)->GetPrimitiveArrayCritical(__env, activeAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_checkbox_text(ctx, str, len, (int *)active);
    (*__env)->ReleasePrimitiveArrayCritical(__env, activeAddress, active, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1text__JJI_3I(jlong ctxAddress, jlong strAddress, jint len, jint active__length, jint* active) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAM(active__length)
    return (jint)nk_checkbox_text(ctx, str, len, (int *)active);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1flags_1label__JJ_3II(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jintArray flagsAddress, jint value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    jint __result;
    jint *flags = (*__env)->GetPrimitiveArrayCritical(__env, flagsAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_checkbox_flags_label(ctx, str, (unsigned int *)flags, value);
    (*__env)->ReleasePrimitiveArrayCritical(__env, flagsAddress, flags, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1flags_1label__JJ_3II(jlong ctxAddress, jlong strAddress, jint flags__length, jint* flags, jint value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAM(flags__length)
    return (jint)nk_checkbox_flags_label(ctx, str, (unsigned int *)flags, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1flags_1text__JJI_3II(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jintArray flagsAddress, jint value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    jint __result;
    jint *flags = (*__env)->GetPrimitiveArrayCritical(__env, flagsAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_checkbox_flags_text(ctx, str, len, (unsigned int *)flags, value);
    (*__env)->ReleasePrimitiveArrayCritical(__env, flagsAddress, flags, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1checkbox_1flags_1text__JJI_3II(jlong ctxAddress, jlong strAddress, jint len, jint flags__length, jint* flags, jint value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAM(flags__length)
    return (jint)nk_checkbox_flags_text(ctx, str, len, (unsigned int *)flags, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1radio_1label__JJ_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jintArray activeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    jint __result;
    jint *active = (*__env)->GetPrimitiveArrayCritical(__env, activeAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_radio_label(ctx, str, (int *)active);
    (*__env)->ReleasePrimitiveArrayCritical(__env, activeAddress, active, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1radio_1label__JJ_3I(jlong ctxAddress, jlong strAddress, jint active__length, jint* active) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAM(active__length)
    return (jint)nk_radio_label(ctx, str, (int *)active);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1radio_1text__JJI_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jintArray activeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    jint __result;
    jint *active = (*__env)->GetPrimitiveArrayCritical(__env, activeAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_radio_text(ctx, str, len, (int *)active);
    (*__env)->ReleasePrimitiveArrayCritical(__env, activeAddress, active, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1radio_1text__JJI_3I(jlong ctxAddress, jlong strAddress, jint len, jint active__length, jint* active) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAM(active__length)
    return (jint)nk_radio_text(ctx, str, len, (int *)active);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1label__JJI_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint align, jintArray valueAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    jint __result;
    jint *value = (*__env)->GetPrimitiveArrayCritical(__env, valueAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_selectable_label(ctx, str, align, (int *)value);
    (*__env)->ReleasePrimitiveArrayCritical(__env, valueAddress, value, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1label__JJI_3I(jlong ctxAddress, jlong strAddress, jint align, jint value__length, jint* value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAM(value__length)
    return (jint)nk_selectable_label(ctx, str, align, (int *)value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1text__JJII_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong strAddress, jint len, jint align, jintArray valueAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    jint __result;
    jint *value = (*__env)->GetPrimitiveArrayCritical(__env, valueAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_selectable_text(ctx, str, len, align, (int *)value);
    (*__env)->ReleasePrimitiveArrayCritical(__env, valueAddress, value, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1text__JJII_3I(jlong ctxAddress, jlong strAddress, jint len, jint align, jint value__length, jint* value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAM(value__length)
    return (jint)nk_selectable_text(ctx, str, len, align, (int *)value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1image_1label__JJJI_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong strAddress, jint align, jintArray valueAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    jint __result;
    jint *value = (*__env)->GetPrimitiveArrayCritical(__env, valueAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_selectable_image_label(ctx, *img, str, align, (int *)value);
    (*__env)->ReleasePrimitiveArrayCritical(__env, valueAddress, value, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1image_1label__JJJI_3I(jlong ctxAddress, jlong imgAddress, jlong strAddress, jint align, jint value__length, jint* value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAM(value__length)
    return (jint)nk_selectable_image_label(ctx, *img, str, align, (int *)value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1image_1text__JJJII_3I(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong imgAddress, jlong strAddress, jint len, jint align, jintArray valueAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    jint __result;
    jint *value = (*__env)->GetPrimitiveArrayCritical(__env, valueAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_selectable_image_text(ctx, *img, str, len, align, (int *)value);
    (*__env)->ReleasePrimitiveArrayCritical(__env, valueAddress, value, 0);
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1selectable_1image_1text__JJJII_3I(jlong ctxAddress, jlong imgAddress, jlong strAddress, jint len, jint align, jint value__length, jint* value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    struct nk_image *img = (struct nk_image *)(intptr_t)imgAddress;
    const char *str = (const char *)(intptr_t)strAddress;
    UNUSED_PARAM(value__length)
    return (jint)nk_selectable_image_text(ctx, *img, str, len, align, (int *)value);
}
#endif

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1slider_1float__JF_3FFF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloat min, jfloatArray valAddress, jfloat max, jfloat step) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    jint __result;
    jfloat *val = (*__env)->GetPrimitiveArrayCritical(__env, valAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_slider_float(ctx, min, (float *)val, max, step);
    (*__env)->ReleasePrimitiveArrayCritical(__env, valAddress, val, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1slider_1float__JF_3FFF(jlong ctxAddress, jfloat min, jint val__length, jfloat* val, jfloat max, jfloat step) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAM(val__length)
    return (jint)nk_slider_float(ctx, min, (float *)val, max, step);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1slider_1int__JI_3III(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint min, jintArray valAddress, jint max, jint step) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    jint __result;
    jint *val = (*__env)->GetPrimitiveArrayCritical(__env, valAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_slider_int(ctx, min, (int *)val, max, step);
    (*__env)->ReleasePrimitiveArrayCritical(__env, valAddress, val, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1slider_1int__JI_3III(jlong ctxAddress, jint min, jint val__length, jint* val, jint max, jint step) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAM(val__length)
    return (jint)nk_slider_int(ctx, min, (int *)val, max, step);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1property_1int__JJI_3IIIF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jint min, jintArray valAddress, jint max, jint step, jfloat inc_per_pixel) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *name = (const char *)(intptr_t)nameAddress;
    jint *val = (*__env)->GetPrimitiveArrayCritical(__env, valAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nk_property_int(ctx, name, min, (int *)val, max, step, inc_per_pixel);
    (*__env)->ReleasePrimitiveArrayCritical(__env, valAddress, val, 0);
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1property_1int__JJI_3IIIF(jlong ctxAddress, jlong nameAddress, jint min, jint val__length, jint* val, jint max, jint step, jfloat inc_per_pixel) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *name = (const char *)(intptr_t)nameAddress;
    UNUSED_PARAM(val__length)
    nk_property_int(ctx, name, min, (int *)val, max, step, inc_per_pixel);
}
#endif

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1property_1float__JJF_3FFFF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jfloat min, jfloatArray valAddress, jfloat max, jfloat step, jfloat inc_per_pixel) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *name = (const char *)(intptr_t)nameAddress;
    jfloat *val = (*__env)->GetPrimitiveArrayCritical(__env, valAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nk_property_float(ctx, name, min, (float *)val, max, step, inc_per_pixel);
    (*__env)->ReleasePrimitiveArrayCritical(__env, valAddress, val, 0);
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1property_1float__JJF_3FFFF(jlong ctxAddress, jlong nameAddress, jfloat min, jint val__length, jfloat* val, jfloat max, jfloat step, jfloat inc_per_pixel) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *name = (const char *)(intptr_t)nameAddress;
    UNUSED_PARAM(val__length)
    nk_property_float(ctx, name, min, (float *)val, max, step, inc_per_pixel);
}
#endif

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1property_1double__JJD_3DDDF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong nameAddress, jdouble min, jdoubleArray valAddress, jdouble max, jdouble step, jfloat inc_per_pixel) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *name = (const char *)(intptr_t)nameAddress;
    jdouble *val = (*__env)->GetPrimitiveArrayCritical(__env, valAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nk_property_double(ctx, name, min, (double *)val, max, step, inc_per_pixel);
    (*__env)->ReleasePrimitiveArrayCritical(__env, valAddress, val, 0);
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1property_1double__JJD_3DDDF(jlong ctxAddress, jlong nameAddress, jdouble min, jint val__length, jdouble* val, jdouble max, jdouble step, jfloat inc_per_pixel) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *name = (const char *)(intptr_t)nameAddress;
    UNUSED_PARAM(val__length)
    nk_property_double(ctx, name, min, (double *)val, max, step, inc_per_pixel);
}
#endif

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1edit_1string__JIJ_3IIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint flags, jlong memoryAddress, jintArray lenAddress, jint max, jlong filterAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char *memory = (char *)(intptr_t)memoryAddress;
    nk_plugin_filter filter = (nk_plugin_filter)(intptr_t)filterAddress;
    jint __result;
    jint *len = (*__env)->GetPrimitiveArrayCritical(__env, lenAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_edit_string(ctx, flags, memory, (int *)len, max, filter);
    (*__env)->ReleasePrimitiveArrayCritical(__env, lenAddress, len, 0);
    return __result;
}
#ifdef LWJGL_WINDOWS
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1edit_1string__JIJ_3IIJ(jlong ctxAddress, jint flags, jlong memoryAddress, jint len__length, jint* len, jint max, jlong filterAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    char *memory = (char *)(intptr_t)memoryAddress;
    nk_plugin_filter filter = (nk_plugin_filter)(intptr_t)filterAddress;
    UNUSED_PARAM(len__length)
    return (jint)nk_edit_string(ctx, flags, memory, (int *)len, max, filter);
}
#endif

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1plot__JI_3FII(JNIEnv *__env, jclass clazz, jlong ctxAddress, jint type, jfloatArray valuesAddress, jint count, jint offset) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    jfloat *values = (*__env)->GetPrimitiveArrayCritical(__env, valuesAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nk_plot(ctx, type, (const float *)values, count, offset);
    (*__env)->ReleasePrimitiveArrayCritical(__env, valuesAddress, values, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1plot__JI_3FII(jlong ctxAddress, jint type, jint values__length, jfloat* values, jint count, jint offset) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAM(values__length)
    nk_plot(ctx, type, (const float *)values, count, offset);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combobox__JJI_3IIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong itemsAddress, jint count, jintArray selectedAddress, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char **items = (const char **)(intptr_t)itemsAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    jint *selected = (*__env)->GetPrimitiveArrayCritical(__env, selectedAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nk_combobox(ctx, items, count, (int *)selected, item_height, *size);
    (*__env)->ReleasePrimitiveArrayCritical(__env, selectedAddress, selected, 0);
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combobox__JJI_3IIJ(jlong ctxAddress, jlong itemsAddress, jint count, jint selected__length, jint* selected, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char **items = (const char **)(intptr_t)itemsAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAM(selected__length)
    nk_combobox(ctx, items, count, (int *)selected, item_height, *size);
}
#endif

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combobox_1string__JJ_3IIIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong items_separated_by_zerosAddress, jintArray selectedAddress, jint count, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *items_separated_by_zeros = (const char *)(intptr_t)items_separated_by_zerosAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    jint *selected = (*__env)->GetPrimitiveArrayCritical(__env, selectedAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nk_combobox_string(ctx, items_separated_by_zeros, (int *)selected, count, item_height, *size);
    (*__env)->ReleasePrimitiveArrayCritical(__env, selectedAddress, selected, 0);
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combobox_1string__JJ_3IIIJ(jlong ctxAddress, jlong items_separated_by_zerosAddress, jint selected__length, jint* selected, jint count, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *items_separated_by_zeros = (const char *)(intptr_t)items_separated_by_zerosAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAM(selected__length)
    nk_combobox_string(ctx, items_separated_by_zeros, (int *)selected, count, item_height, *size);
}
#endif

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combobox_1separator__JJI_3IIIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong items_separated_by_separatorAddress, jint separator, jintArray selectedAddress, jint count, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *items_separated_by_separator = (const char *)(intptr_t)items_separated_by_separatorAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    jint *selected = (*__env)->GetPrimitiveArrayCritical(__env, selectedAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nk_combobox_separator(ctx, items_separated_by_separator, separator, (int *)selected, count, item_height, *size);
    (*__env)->ReleasePrimitiveArrayCritical(__env, selectedAddress, selected, 0);
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combobox_1separator__JJI_3IIIJ(jlong ctxAddress, jlong items_separated_by_separatorAddress, jint separator, jint selected__length, jint* selected, jint count, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    const char *items_separated_by_separator = (const char *)(intptr_t)items_separated_by_separatorAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAM(selected__length)
    nk_combobox_separator(ctx, items_separated_by_separator, separator, (int *)selected, count, item_height, *size);
}
#endif

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1combobox_1callback__JJJ_3IIIJ(JNIEnv *__env, jclass clazz, jlong ctxAddress, jlong item_getterAddress, jlong userdataAddress, jintArray selectedAddress, jint count, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_item_getter item_getter = (nk_item_getter)(intptr_t)item_getterAddress;
    void *userdata = (void *)(intptr_t)userdataAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    jint *selected = (*__env)->GetPrimitiveArrayCritical(__env, selectedAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nk_combobox_callback(ctx, item_getter, userdata, (int *)selected, count, item_height, *size);
    (*__env)->ReleasePrimitiveArrayCritical(__env, selectedAddress, selected, 0);
}
#ifdef LWJGL_WINDOWS
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1combobox_1callback__JJJ_3IIIJ(jlong ctxAddress, jlong item_getterAddress, jlong userdataAddress, jint selected__length, jint* selected, jint count, jint item_height, jlong sizeAddress) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    nk_item_getter item_getter = (nk_item_getter)(intptr_t)item_getterAddress;
    void *userdata = (void *)(intptr_t)userdataAddress;
    struct nk_vec2 *size = (struct nk_vec2 *)(intptr_t)sizeAddress;
    UNUSED_PARAM(selected__length)
    nk_combobox_callback(ctx, item_getter, userdata, (int *)selected, count, item_height, *size);
}
#endif

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1float__J_3FF(JNIEnv *__env, jclass clazz, jlong ctxAddress, jfloatArray addressAddress, jfloat value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    jint __result;
    jfloat *address = (*__env)->GetPrimitiveArrayCritical(__env, addressAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_style_push_float(ctx, (float *)address, value);
    (*__env)->ReleasePrimitiveArrayCritical(__env, addressAddress, address, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1float__J_3FF(jlong ctxAddress, jint address__length, jfloat* address, jfloat value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAM(address__length)
    return (jint)nk_style_push_float(ctx, (float *)address, value);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1flags__J_3II(JNIEnv *__env, jclass clazz, jlong ctxAddress, jintArray addressAddress, jint value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    jint __result;
    jint *address = (*__env)->GetPrimitiveArrayCritical(__env, addressAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_style_push_flags(ctx, (nk_flags *)address, value);
    (*__env)->ReleasePrimitiveArrayCritical(__env, addressAddress, address, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1style_1push_1flags__J_3II(jlong ctxAddress, jint address__length, jint* address, jint value) {
    struct nk_context *ctx = (struct nk_context *)(intptr_t)ctxAddress;
    UNUSED_PARAM(address__length)
    return (jint)nk_style_push_flags(ctx, (nk_flags *)address, value);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1iv___3IJ(JNIEnv *__env, jclass clazz, jintArray rgbAddress, jlong __result) {
    jint *rgb = (*__env)->GetPrimitiveArrayCritical(__env, rgbAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_rgb_iv((const int *)rgb);
    (*__env)->ReleasePrimitiveArrayCritical(__env, rgbAddress, rgb, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1iv___3IJ(jint rgb__length, jint* rgb, jlong __result) {
    UNUSED_PARAM(rgb__length)
    *((struct nk_color*)(intptr_t)__result) = nk_rgb_iv((const int *)rgb);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1fv___3FJ(JNIEnv *__env, jclass clazz, jfloatArray rgbAddress, jlong __result) {
    jfloat *rgb = (*__env)->GetPrimitiveArrayCritical(__env, rgbAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_rgb_fv((const float *)rgb);
    (*__env)->ReleasePrimitiveArrayCritical(__env, rgbAddress, rgb, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgb_1fv___3FJ(jint rgb__length, jfloat* rgb, jlong __result) {
    UNUSED_PARAM(rgb__length)
    *((struct nk_color*)(intptr_t)__result) = nk_rgb_fv((const float *)rgb);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1iv___3IJ(JNIEnv *__env, jclass clazz, jintArray rgbaAddress, jlong __result) {
    jint *rgba = (*__env)->GetPrimitiveArrayCritical(__env, rgbaAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_rgba_iv((const int *)rgba);
    (*__env)->ReleasePrimitiveArrayCritical(__env, rgbaAddress, rgba, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1iv___3IJ(jint rgba__length, jint* rgba, jlong __result) {
    UNUSED_PARAM(rgba__length)
    *((struct nk_color*)(intptr_t)__result) = nk_rgba_iv((const int *)rgba);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1fv___3FJ(JNIEnv *__env, jclass clazz, jfloatArray rgbaAddress, jlong __result) {
    jfloat *rgba = (*__env)->GetPrimitiveArrayCritical(__env, rgbaAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_rgba_fv((const float *)rgba);
    (*__env)->ReleasePrimitiveArrayCritical(__env, rgbaAddress, rgba, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rgba_1fv___3FJ(jint rgba__length, jfloat* rgba, jlong __result) {
    UNUSED_PARAM(rgba__length)
    *((struct nk_color*)(intptr_t)__result) = nk_rgba_fv((const float *)rgba);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1iv___3IJ(JNIEnv *__env, jclass clazz, jintArray hsvAddress, jlong __result) {
    jint *hsv = (*__env)->GetPrimitiveArrayCritical(__env, hsvAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_hsv_iv((const int *)hsv);
    (*__env)->ReleasePrimitiveArrayCritical(__env, hsvAddress, hsv, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1iv___3IJ(jint hsv__length, jint* hsv, jlong __result) {
    UNUSED_PARAM(hsv__length)
    *((struct nk_color*)(intptr_t)__result) = nk_hsv_iv((const int *)hsv);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1fv___3FJ(JNIEnv *__env, jclass clazz, jfloatArray hsvAddress, jlong __result) {
    jfloat *hsv = (*__env)->GetPrimitiveArrayCritical(__env, hsvAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_hsv_fv((const float *)hsv);
    (*__env)->ReleasePrimitiveArrayCritical(__env, hsvAddress, hsv, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsv_1fv___3FJ(jint hsv__length, jfloat* hsv, jlong __result) {
    UNUSED_PARAM(hsv__length)
    *((struct nk_color*)(intptr_t)__result) = nk_hsv_fv((const float *)hsv);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1iv___3IJ(JNIEnv *__env, jclass clazz, jintArray hsvaAddress, jlong __result) {
    jint *hsva = (*__env)->GetPrimitiveArrayCritical(__env, hsvaAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_hsva_iv((const int *)hsva);
    (*__env)->ReleasePrimitiveArrayCritical(__env, hsvaAddress, hsva, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1iv___3IJ(jint hsva__length, jint* hsva, jlong __result) {
    UNUSED_PARAM(hsva__length)
    *((struct nk_color*)(intptr_t)__result) = nk_hsva_iv((const int *)hsva);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1fv___3FJ(JNIEnv *__env, jclass clazz, jfloatArray hsvaAddress, jlong __result) {
    jfloat *hsva = (*__env)->GetPrimitiveArrayCritical(__env, hsvaAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_color*)(intptr_t)__result) = nk_hsva_fv((const float *)hsva);
    (*__env)->ReleasePrimitiveArrayCritical(__env, hsvaAddress, hsva, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1hsva_1fv___3FJ(jint hsva__length, jfloat* hsva, jlong __result) {
    UNUSED_PARAM(hsva__length)
    *((struct nk_color*)(intptr_t)__result) = nk_hsva_fv((const float *)hsva);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1f___3F_3F_3F_3FJ(JNIEnv *__env, jclass clazz, jfloatArray rAddress, jfloatArray gAddress, jfloatArray bAddress, jfloatArray aAddress, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    jfloat *r = (*__env)->GetPrimitiveArrayCritical(__env, rAddress, 0);
    jfloat *g = (*__env)->GetPrimitiveArrayCritical(__env, gAddress, 0);
    jfloat *b = (*__env)->GetPrimitiveArrayCritical(__env, bAddress, 0);
    jfloat *a = (*__env)->GetPrimitiveArrayCritical(__env, aAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nk_color_f((float *)r, (float *)g, (float *)b, (float *)a, *color);
    (*__env)->ReleasePrimitiveArrayCritical(__env, aAddress, a, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, bAddress, b, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, gAddress, g, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, rAddress, r, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1f___3F_3F_3F_3FJ(jint r__length, jfloat* r, jint g__length, jfloat* g, jint b__length, jfloat* b, jint a__length, jfloat* a, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAM(r__length)
    UNUSED_PARAM(g__length)
    UNUSED_PARAM(b__length)
    UNUSED_PARAM(a__length)
    nk_color_f((float *)r, (float *)g, (float *)b, (float *)a, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1fv___3FJ(JNIEnv *__env, jclass clazz, jfloatArray rgba_outAddress, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    jfloat *rgba_out = (*__env)->GetPrimitiveArrayCritical(__env, rgba_outAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nk_color_fv((float *)rgba_out, *color);
    (*__env)->ReleasePrimitiveArrayCritical(__env, rgba_outAddress, rgba_out, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1fv___3FJ(jint rgba_out__length, jfloat* rgba_out, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAM(rgba_out__length)
    nk_color_fv((float *)rgba_out, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1d___3D_3D_3D_3DJ(JNIEnv *__env, jclass clazz, jdoubleArray rAddress, jdoubleArray gAddress, jdoubleArray bAddress, jdoubleArray aAddress, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    jdouble *r = (*__env)->GetPrimitiveArrayCritical(__env, rAddress, 0);
    jdouble *g = (*__env)->GetPrimitiveArrayCritical(__env, gAddress, 0);
    jdouble *b = (*__env)->GetPrimitiveArrayCritical(__env, bAddress, 0);
    jdouble *a = (*__env)->GetPrimitiveArrayCritical(__env, aAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nk_color_d((double *)r, (double *)g, (double *)b, (double *)a, *color);
    (*__env)->ReleasePrimitiveArrayCritical(__env, aAddress, a, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, bAddress, b, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, gAddress, g, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, rAddress, r, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1d___3D_3D_3D_3DJ(jint r__length, jdouble* r, jint g__length, jdouble* g, jint b__length, jdouble* b, jint a__length, jdouble* a, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAM(r__length)
    UNUSED_PARAM(g__length)
    UNUSED_PARAM(b__length)
    UNUSED_PARAM(a__length)
    nk_color_d((double *)r, (double *)g, (double *)b, (double *)a, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1dv___3DJ(JNIEnv *__env, jclass clazz, jdoubleArray rgba_outAddress, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    jdouble *rgba_out = (*__env)->GetPrimitiveArrayCritical(__env, rgba_outAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nk_color_dv((double *)rgba_out, *color);
    (*__env)->ReleasePrimitiveArrayCritical(__env, rgba_outAddress, rgba_out, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1dv___3DJ(jint rgba_out__length, jdouble* rgba_out, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAM(rgba_out__length)
    nk_color_dv((double *)rgba_out, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1i___3I_3I_3IJ(JNIEnv *__env, jclass clazz, jintArray out_hAddress, jintArray out_sAddress, jintArray out_vAddress, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    jint *out_h = (*__env)->GetPrimitiveArrayCritical(__env, out_hAddress, 0);
    jint *out_s = (*__env)->GetPrimitiveArrayCritical(__env, out_sAddress, 0);
    jint *out_v = (*__env)->GetPrimitiveArrayCritical(__env, out_vAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsv_i((int *)out_h, (int *)out_s, (int *)out_v, *color);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_vAddress, out_v, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_sAddress, out_s, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_hAddress, out_h, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1i___3I_3I_3IJ(jint out_h__length, jint* out_h, jint out_s__length, jint* out_s, jint out_v__length, jint* out_v, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAM(out_h__length)
    UNUSED_PARAM(out_s__length)
    UNUSED_PARAM(out_v__length)
    nk_color_hsv_i((int *)out_h, (int *)out_s, (int *)out_v, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1iv___3IJ(JNIEnv *__env, jclass clazz, jintArray hsv_outAddress, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    jint *hsv_out = (*__env)->GetPrimitiveArrayCritical(__env, hsv_outAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsv_iv((int *)hsv_out, *color);
    (*__env)->ReleasePrimitiveArrayCritical(__env, hsv_outAddress, hsv_out, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1iv___3IJ(jint hsv_out__length, jint* hsv_out, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAM(hsv_out__length)
    nk_color_hsv_iv((int *)hsv_out, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1f___3F_3F_3FJ(JNIEnv *__env, jclass clazz, jfloatArray out_hAddress, jfloatArray out_sAddress, jfloatArray out_vAddress, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    jfloat *out_h = (*__env)->GetPrimitiveArrayCritical(__env, out_hAddress, 0);
    jfloat *out_s = (*__env)->GetPrimitiveArrayCritical(__env, out_sAddress, 0);
    jfloat *out_v = (*__env)->GetPrimitiveArrayCritical(__env, out_vAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsv_f((float *)out_h, (float *)out_s, (float *)out_v, *color);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_vAddress, out_v, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_sAddress, out_s, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_hAddress, out_h, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1f___3F_3F_3FJ(jint out_h__length, jfloat* out_h, jint out_s__length, jfloat* out_s, jint out_v__length, jfloat* out_v, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAM(out_h__length)
    UNUSED_PARAM(out_s__length)
    UNUSED_PARAM(out_v__length)
    nk_color_hsv_f((float *)out_h, (float *)out_s, (float *)out_v, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1fv___3FJ(JNIEnv *__env, jclass clazz, jfloatArray hsv_outAddress, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    jfloat *hsv_out = (*__env)->GetPrimitiveArrayCritical(__env, hsv_outAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsv_fv((float *)hsv_out, *color);
    (*__env)->ReleasePrimitiveArrayCritical(__env, hsv_outAddress, hsv_out, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsv_1fv___3FJ(jint hsv_out__length, jfloat* hsv_out, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAM(hsv_out__length)
    nk_color_hsv_fv((float *)hsv_out, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1i___3I_3I_3I_3IJ(JNIEnv *__env, jclass clazz, jintArray hAddress, jintArray sAddress, jintArray vAddress, jintArray aAddress, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    jint *h = (*__env)->GetPrimitiveArrayCritical(__env, hAddress, 0);
    jint *s = (*__env)->GetPrimitiveArrayCritical(__env, sAddress, 0);
    jint *v = (*__env)->GetPrimitiveArrayCritical(__env, vAddress, 0);
    jint *a = (*__env)->GetPrimitiveArrayCritical(__env, aAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsva_i((int *)h, (int *)s, (int *)v, (int *)a, *color);
    (*__env)->ReleasePrimitiveArrayCritical(__env, aAddress, a, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, vAddress, v, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, sAddress, s, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, hAddress, h, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1i___3I_3I_3I_3IJ(jint h__length, jint* h, jint s__length, jint* s, jint v__length, jint* v, jint a__length, jint* a, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAM(h__length)
    UNUSED_PARAM(s__length)
    UNUSED_PARAM(v__length)
    UNUSED_PARAM(a__length)
    nk_color_hsva_i((int *)h, (int *)s, (int *)v, (int *)a, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1iv___3IJ(JNIEnv *__env, jclass clazz, jintArray hsva_outAddress, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    jint *hsva_out = (*__env)->GetPrimitiveArrayCritical(__env, hsva_outAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsva_iv((int *)hsva_out, *color);
    (*__env)->ReleasePrimitiveArrayCritical(__env, hsva_outAddress, hsva_out, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1iv___3IJ(jint hsva_out__length, jint* hsva_out, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAM(hsva_out__length)
    nk_color_hsva_iv((int *)hsva_out, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1f___3F_3F_3F_3FJ(JNIEnv *__env, jclass clazz, jfloatArray out_hAddress, jfloatArray out_sAddress, jfloatArray out_vAddress, jfloatArray out_aAddress, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    jfloat *out_h = (*__env)->GetPrimitiveArrayCritical(__env, out_hAddress, 0);
    jfloat *out_s = (*__env)->GetPrimitiveArrayCritical(__env, out_sAddress, 0);
    jfloat *out_v = (*__env)->GetPrimitiveArrayCritical(__env, out_vAddress, 0);
    jfloat *out_a = (*__env)->GetPrimitiveArrayCritical(__env, out_aAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsva_f((float *)out_h, (float *)out_s, (float *)out_v, (float *)out_a, *color);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_aAddress, out_a, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_vAddress, out_v, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_sAddress, out_s, 0);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_hAddress, out_h, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1f___3F_3F_3F_3FJ(jint out_h__length, jfloat* out_h, jint out_s__length, jfloat* out_s, jint out_v__length, jfloat* out_v, jint out_a__length, jfloat* out_a, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAM(out_h__length)
    UNUSED_PARAM(out_s__length)
    UNUSED_PARAM(out_v__length)
    UNUSED_PARAM(out_a__length)
    nk_color_hsva_f((float *)out_h, (float *)out_s, (float *)out_v, (float *)out_a, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1fv___3FJ(JNIEnv *__env, jclass clazz, jfloatArray hsva_outAddress, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    jfloat *hsva_out = (*__env)->GetPrimitiveArrayCritical(__env, hsva_outAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nk_color_hsva_fv((float *)hsva_out, *color);
    (*__env)->ReleasePrimitiveArrayCritical(__env, hsva_outAddress, hsva_out, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1color_1hsva_1fv___3FJ(jint hsva_out__length, jfloat* hsva_out, jlong colorAddress) {
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAM(hsva_out__length)
    nk_color_hsva_fv((float *)hsva_out, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1vec2v___3FJ(JNIEnv *__env, jclass clazz, jfloatArray xyAddress, jlong __result) {
    jfloat *xy = (*__env)->GetPrimitiveArrayCritical(__env, xyAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(intptr_t)__result) = nk_vec2v((const float *)xy);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xyAddress, xy, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1vec2v___3FJ(jint xy__length, jfloat* xy, jlong __result) {
    UNUSED_PARAM(xy__length)
    *((struct nk_vec2*)(intptr_t)__result) = nk_vec2v((const float *)xy);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1vec2iv___3IJ(JNIEnv *__env, jclass clazz, jintArray xyAddress, jlong __result) {
    jint *xy = (*__env)->GetPrimitiveArrayCritical(__env, xyAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_vec2*)(intptr_t)__result) = nk_vec2iv((const int *)xy);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xyAddress, xy, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1vec2iv___3IJ(jint xy__length, jint* xy, jlong __result) {
    UNUSED_PARAM(xy__length)
    *((struct nk_vec2*)(intptr_t)__result) = nk_vec2iv((const int *)xy);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rectv___3FJ(JNIEnv *__env, jclass clazz, jfloatArray xywhAddress, jlong __result) {
    jfloat *xywh = (*__env)->GetPrimitiveArrayCritical(__env, xywhAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_rect*)(intptr_t)__result) = nk_rectv((const float *)xywh);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xywhAddress, xywh, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rectv___3FJ(jint xywh__length, jfloat* xywh, jlong __result) {
    UNUSED_PARAM(xywh__length)
    *((struct nk_rect*)(intptr_t)__result) = nk_rectv((const float *)xywh);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1rectiv___3IJ(JNIEnv *__env, jclass clazz, jintArray xywhAddress, jlong __result) {
    jint *xywh = (*__env)->GetPrimitiveArrayCritical(__env, xywhAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    *((struct nk_rect*)(intptr_t)__result) = nk_rectiv((const int *)xywh);
    (*__env)->ReleasePrimitiveArrayCritical(__env, xywhAddress, xywh, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1rectiv___3IJ(jint xywh__length, jint* xywh, jlong __result) {
    UNUSED_PARAM(xywh__length)
    *((struct nk_rect*)(intptr_t)__result) = nk_rectiv((const int *)xywh);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1strmatch_1fuzzy_1string__JJ_3I(JNIEnv *__env, jclass clazz, jlong strAddress, jlong patternAddress, jintArray out_scoreAddress) {
    const char *str = (const char *)(intptr_t)strAddress;
    const char *pattern = (const char *)(intptr_t)patternAddress;
    jint __result;
    jint *out_score = (*__env)->GetPrimitiveArrayCritical(__env, out_scoreAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_strmatch_fuzzy_string(str, pattern, (int *)out_score);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_scoreAddress, out_score, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1strmatch_1fuzzy_1string__JJ_3I(jlong strAddress, jlong patternAddress, jint out_score__length, jint* out_score) {
    const char *str = (const char *)(intptr_t)strAddress;
    const char *pattern = (const char *)(intptr_t)patternAddress;
    UNUSED_PARAM(out_score__length)
    return (jint)nk_strmatch_fuzzy_string(str, pattern, (int *)out_score);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1strmatch_1fuzzy_1text__JIJ_3I(JNIEnv *__env, jclass clazz, jlong txtAddress, jint txt_len, jlong patternAddress, jintArray out_scoreAddress) {
    const char *txt = (const char *)(intptr_t)txtAddress;
    const char *pattern = (const char *)(intptr_t)patternAddress;
    jint __result;
    jint *out_score = (*__env)->GetPrimitiveArrayCritical(__env, out_scoreAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_strmatch_fuzzy_text(txt, txt_len, pattern, (int *)out_score);
    (*__env)->ReleasePrimitiveArrayCritical(__env, out_scoreAddress, out_score, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1strmatch_1fuzzy_1text__JIJ_3I(jlong txtAddress, jint txt_len, jlong patternAddress, jint out_score__length, jint* out_score) {
    const char *txt = (const char *)(intptr_t)txtAddress;
    const char *pattern = (const char *)(intptr_t)patternAddress;
    UNUSED_PARAM(out_score__length)
    return (jint)nk_strmatch_fuzzy_text(txt, txt_len, pattern, (int *)out_score);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1utf_1decode__J_3II(JNIEnv *__env, jclass clazz, jlong cAddress, jintArray uAddress, jint clen) {
    const char *c = (const char *)(intptr_t)cAddress;
    jint __result;
    jint *u = (*__env)->GetPrimitiveArrayCritical(__env, uAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_utf_decode(c, (nk_rune *)u, clen);
    (*__env)->ReleasePrimitiveArrayCritical(__env, uAddress, u, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1utf_1decode__J_3II(jlong cAddress, jint u__length, jint* u, jint clen) {
    const char *c = (const char *)(intptr_t)cAddress;
    UNUSED_PARAM(u__length)
    return (jint)nk_utf_decode(c, (nk_rune *)u, clen);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1utf_1at__JII_3IJ(JNIEnv *__env, jclass clazz, jlong bufferAddress, jint length, jint index, jintArray unicodeAddress, jlong lenAddress) {
    const char *buffer = (const char *)(intptr_t)bufferAddress;
    int *len = (int *)(intptr_t)lenAddress;
    jlong __result;
    jint *unicode = (*__env)->GetPrimitiveArrayCritical(__env, unicodeAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)nk_utf_at(buffer, length, index, (nk_rune *)unicode, len);
    (*__env)->ReleasePrimitiveArrayCritical(__env, unicodeAddress, unicode, 0);
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1utf_1at__JII_3IJ(jlong bufferAddress, jint length, jint index, jint unicode__length, jint* unicode, jlong lenAddress) {
    const char *buffer = (const char *)(intptr_t)bufferAddress;
    int *len = (int *)(intptr_t)lenAddress;
    UNUSED_PARAM(unicode__length)
    return (jlong)(intptr_t)nk_utf_at(buffer, length, index, (nk_rune *)unicode, len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1text_1runes__J_3II(JNIEnv *__env, jclass clazz, jlong sAddress, jintArray runesAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    jint __result;
    jint *runes = (*__env)->GetPrimitiveArrayCritical(__env, runesAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_str_append_text_runes(s, (const nk_rune *)runes, len);
    (*__env)->ReleasePrimitiveArrayCritical(__env, runesAddress, runes, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1text_1runes__J_3II(jlong sAddress, jint runes__length, jint* runes, jint len) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    UNUSED_PARAM(runes__length)
    return (jint)nk_str_append_text_runes(s, (const nk_rune *)runes, len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1str_1runes__J_3I(JNIEnv *__env, jclass clazz, jlong sAddress, jintArray runesAddress) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    jint __result;
    jint *runes = (*__env)->GetPrimitiveArrayCritical(__env, runesAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_str_append_str_runes(s, (const nk_rune *)runes);
    (*__env)->ReleasePrimitiveArrayCritical(__env, runesAddress, runes, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1append_1str_1runes__J_3I(jlong sAddress, jint runes__length, jint* runes) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    UNUSED_PARAM(runes__length)
    return (jint)nk_str_append_str_runes(s, (const nk_rune *)runes);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1text_1runes__JI_3II(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jintArray runesAddress, jint len) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    jint __result;
    jint *runes = (*__env)->GetPrimitiveArrayCritical(__env, runesAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_str_insert_text_runes(s, pos, (const nk_rune *)runes, len);
    (*__env)->ReleasePrimitiveArrayCritical(__env, runesAddress, runes, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1text_1runes__JI_3II(jlong sAddress, jint pos, jint runes__length, jint* runes, jint len) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    UNUSED_PARAM(runes__length)
    return (jint)nk_str_insert_text_runes(s, pos, (const nk_rune *)runes, len);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1str_1runes__JI_3I(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jintArray runesAddress) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    jint __result;
    jint *runes = (*__env)->GetPrimitiveArrayCritical(__env, runesAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)nk_str_insert_str_runes(s, pos, (const nk_rune *)runes);
    (*__env)->ReleasePrimitiveArrayCritical(__env, runesAddress, runes, 0);
    return __result;
}
JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1insert_1str_1runes__JI_3I(jlong sAddress, jint pos, jint runes__length, jint* runes) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    UNUSED_PARAM(runes__length)
    return (jint)nk_str_insert_str_runes(s, pos, (const nk_rune *)runes);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1rune__JI_3IJ(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jintArray unicodeAddress, jlong lenAddress) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    int *len = (int *)(intptr_t)lenAddress;
    jlong __result;
    jint *unicode = (*__env)->GetPrimitiveArrayCritical(__env, unicodeAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)nk_str_at_rune(s, pos, (nk_rune *)unicode, len);
    (*__env)->ReleasePrimitiveArrayCritical(__env, unicodeAddress, unicode, 0);
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1rune__JI_3IJ(jlong sAddress, jint pos, jint unicode__length, jint* unicode, jlong lenAddress) {
    struct nk_str *s = (struct nk_str *)(intptr_t)sAddress;
    int *len = (int *)(intptr_t)lenAddress;
    UNUSED_PARAM(unicode__length)
    return (jlong)(intptr_t)nk_str_at_rune(s, pos, (nk_rune *)unicode, len);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1const__JI_3IJ(JNIEnv *__env, jclass clazz, jlong sAddress, jint pos, jintArray unicodeAddress, jlong lenAddress) {
    const struct nk_str *s = (const struct nk_str *)(intptr_t)sAddress;
    int *len = (int *)(intptr_t)lenAddress;
    jlong __result;
    jint *unicode = (*__env)->GetPrimitiveArrayCritical(__env, unicodeAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(intptr_t)nk_str_at_const(s, pos, (nk_rune *)unicode, len);
    (*__env)->ReleasePrimitiveArrayCritical(__env, unicodeAddress, unicode, 0);
    return __result;
}
JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1str_1at_1const__JI_3IJ(jlong sAddress, jint pos, jint unicode__length, jint* unicode, jlong lenAddress) {
    const struct nk_str *s = (const struct nk_str *)(intptr_t)sAddress;
    int *len = (int *)(intptr_t)lenAddress;
    UNUSED_PARAM(unicode__length)
    return (jlong)(intptr_t)nk_str_at_const(s, pos, (nk_rune *)unicode, len);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1polyline__J_3FIFJ(JNIEnv *__env, jclass clazz, jlong bAddress, jfloatArray pointsAddress, jint point_count, jfloat line_thickness, jlong colAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_color *col = (struct nk_color *)(intptr_t)colAddress;
    jfloat *points = (*__env)->GetPrimitiveArrayCritical(__env, pointsAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nk_stroke_polyline(b, (float *)points, point_count, line_thickness, *col);
    (*__env)->ReleasePrimitiveArrayCritical(__env, pointsAddress, points, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1polyline__J_3FIFJ(jlong bAddress, jint points__length, jfloat* points, jint point_count, jfloat line_thickness, jlong colAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_color *col = (struct nk_color *)(intptr_t)colAddress;
    UNUSED_PARAM(points__length)
    nk_stroke_polyline(b, (float *)points, point_count, line_thickness, *col);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1polygon__J_3FIFJ(JNIEnv *__env, jclass clazz, jlong bAddress, jfloatArray pointsAddress, jint point_count, jfloat line_thickness, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    jfloat *points = (*__env)->GetPrimitiveArrayCritical(__env, pointsAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nk_stroke_polygon(b, (float *)points, point_count, line_thickness, *color);
    (*__env)->ReleasePrimitiveArrayCritical(__env, pointsAddress, points, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1stroke_1polygon__J_3FIFJ(jlong bAddress, jint points__length, jfloat* points, jint point_count, jfloat line_thickness, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAM(points__length)
    nk_stroke_polygon(b, (float *)points, point_count, line_thickness, *color);
}

JNIEXPORT void JNICALL Java_org_lwjgl_nuklear_Nuklear_nnk_1fill_1polygon__J_3FIJ(JNIEnv *__env, jclass clazz, jlong bAddress, jfloatArray pointsAddress, jint point_count, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    jfloat *points = (*__env)->GetPrimitiveArrayCritical(__env, pointsAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    nk_fill_polygon(b, (float *)points, point_count, *color);
    (*__env)->ReleasePrimitiveArrayCritical(__env, pointsAddress, points, 0);
}
JNIEXPORT void JNICALL JavaCritical_org_lwjgl_nuklear_Nuklear_nnk_1fill_1polygon__J_3FIJ(jlong bAddress, jint points__length, jfloat* points, jint point_count, jlong colorAddress) {
    struct nk_command_buffer *b = (struct nk_command_buffer *)(intptr_t)bAddress;
    struct nk_color *color = (struct nk_color *)(intptr_t)colorAddress;
    UNUSED_PARAM(points__length)
    nk_fill_polygon(b, (float *)points, point_count, *color);
}

EXTERN_C_EXIT
