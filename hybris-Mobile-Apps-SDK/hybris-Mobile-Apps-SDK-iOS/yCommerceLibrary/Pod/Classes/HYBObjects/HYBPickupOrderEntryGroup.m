//
// HYBPickupOrderEntryGroup.m
// [y] hybris Platform
//
// Copyright (c) 2000-2016 hybris AG
// All rights reserved.
//
// This software is the confidential and proprietary information of hybris
// ("Confidential Information"). You shall not disclose such Confidential
// Information and shall use it only in accordance with the terms of the
// license agreement you entered into with hybris.
//
// Warning:This file was auto-generated by OCC2Ojbc.
//

#import "HYBPickupOrderEntryGroup.h"
#import "NSValueTransformer+MTLPredefinedTransformerAdditions.h"

#import "HYBPointOfService.h"


@implementation HYBPickupOrderEntryGroup

+ (instancetype)pickupOrderEntryGroupWithParams:(NSDictionary*)params {

NSError *error = nil;
HYBPickupOrderEntryGroup *object = [MTLJSONAdapter modelOfClass:[HYBPickupOrderEntryGroup class] fromJSONDictionary:params error:&error];

if (error) {
    NSLog(@"Couldn't convert JSON to model HYBPickupOrderEntryGroup");
    return nil;
}

return object;
}

+ (NSDictionary *)JSONKeyPathsByPropertyKey {
   return @{
@"deliveryPointOfService" : @"deliveryPointOfService",
@"distance" : @"distance"
};
}




+ (NSValueTransformer *)deliveryPointOfServiceJSONTransformer {
return [NSValueTransformer mtl_JSONDictionaryTransformerWithModelClass:[HYBPointOfService class]];
}



@end